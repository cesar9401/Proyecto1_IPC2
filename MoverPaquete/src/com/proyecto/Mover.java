
package com.proyecto;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author cesar31
 */
public class Mover{
    
    private Connection connection = null;
    private final String user = "cesar9401";
    private final String password = "Huevos94C";
    private final String url = "jdbc:mysql://localhost:3306/proyecto1_IPC2";
    
    public Mover(){
    
    }
    
    public Connection conectar(){
        try{
            connection = (Connection) DriverManager.getConnection(url, user, password);
            System.out.println("Conectado " + connection.getCatalog());            
        }catch(SQLException ex){
            System.out.println("Fallo la conexion");
        }
        
        return connection;
    }
    
    public void desconectar(){
        try{
            connection.close();
            System.out.println("Desconectado " + connection.getCatalog());
        }catch(SQLException ex){
            System.out.println("No se pudo cerrar la conexion");
        }
    }
    
    public java.sql.Timestamp sqlTimestamp(){
        java.util.Date date = new java.util.Date();
        java.sql.Timestamp sqlTimestamp = new java.sql.Timestamp(date.getTime());
        System.out.println("sqlTimestamp mover: " + sqlTimestamp);
        
        return sqlTimestamp;
    }
        
    public void mover(){
        conectar();
        
        try{
            String query = "SELECT idRutas, Destino, pc1, tamañoBodega FROM puntosDeControl INNER JOIN rutas ON codigo = pc1";
            Statement declaracion = connection.createStatement();
            ResultSet r = declaracion.executeQuery(query);
            while(r.next()){
                int ruta = r.getInt("idRutas");
                String destino = r.getString("Destino");
                String punto = r.getString("pc1");
                int tamañoBodega = r.getInt("tamañoBodega");
                
                String tablaPunto = "";
                for (int i=0; i<punto.length(); i++){
                    if(punto.charAt(i) == '-'){
                        tablaPunto += "_";
                    }
                    else{
                        tablaPunto += punto.charAt(i);
                    }
                }
                
                boolean siguiente = false;
                do{
                    String queryEnvio = "SELECT * FROM envios WHERE cod_D = ? HAVING ubicacion = ? ORDER BY priorizar DESC";
                    PreparedStatement envio = connection.prepareStatement(queryEnvio);
                    envio.setString(1, destino);
                    envio.setString(2, "Bodega");
                    ResultSet e = envio.executeQuery();
                    
                    int contador = 0;
                    String queryPunto = "SELECT * FROM " + tablaPunto + " WHERE estado = 1";
                    Statement declararPunto = connection.createStatement();
                    ResultSet s = declararPunto.executeQuery(queryPunto);
                    while(s.next()){
                        contador++;
                    }
                    int dif = tamañoBodega - contador;
                    
                    String queryPunto2 = "SELECT idRegistro FROM " + tablaPunto;
                    Statement verificarReg = connection.createStatement();
                    ResultSet ver = verificarReg.executeQuery(queryPunto2);
                    int idReg = 1;
                    while(ver.next()){
                        int reg = ver.getInt("idRegistro");
                        if(reg >= idReg){
                            idReg = reg + 1;
                        }
                    }
                    
                    if(e.next() && dif >0){
                        try{
                            connection.setAutoCommit(false);
                            Envio tmp = new Envio(e.getInt("idEnvios"), e.getInt("id_Cliente"), e.getBoolean("priorizar"), e.getInt("id_Ruta"), e.getString("cod_D"), e.getString("paisD"), e.getString("ciudad_D"), e.getString("ubicacion"));
                            System.out.println(tmp.toString());
                        
                            //Write your code here
                            String queryTablePunto = "INSERT INTO "+tablaPunto+" VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                            PreparedStatement table = connection.prepareStatement(queryTablePunto);
                            table.setInt(1, idReg);
                            table.setInt(2, tmp.getIdEnvios());
                            table.setInt(3, tmp.getId_Cliente());
                            table.setInt(4, ruta);
                            table.setString(5, tmp.getPais_D());
                            table.setString(6, tmp.getCiudad_D());
                            table.setBoolean(7, true);
                            table.setTimestamp(8, sqlTimestamp());
                            table.setDate(9, null);
                            table.setDouble(10, 0);
                            table.executeUpdate();

                            String queryRuta = "UPDATE envios SET id_Ruta = ? WHERE idEnvios = ?";
                            PreparedStatement enviosRuta = connection.prepareStatement(queryRuta);
                            enviosRuta.setInt(1, ruta);
                            enviosRuta.setInt(2, tmp.getIdEnvios());
                            enviosRuta.executeUpdate();

                            String queryUbicacion = "UPDATE envios set ubicacion = ? WHERE idEnvios = ?";
                            PreparedStatement enviosUbicacion = connection.prepareStatement(queryUbicacion);
                            enviosUbicacion.setString(1, punto);
                            enviosUbicacion.setInt(2, tmp.getIdEnvios());
                            enviosUbicacion.executeUpdate();

                            connection.commit();
                            connection.setAutoCommit(true);
                            siguiente = true;
                            String mensaje = "El paquete con idEnvio: " + tmp.getIdEnvios() + " fue movido de bodega hacia: " + punto;
                            JOptionPane.showMessageDialog(null, mensaje, "Informacion", JOptionPane.INFORMATION_MESSAGE);
                        }catch(SQLException ex){
                            connection.rollback();
                        }
                    }else{
                        siguiente = false;
                    }
                    
                }while(siguiente);
            }

        }catch(SQLException ex1){
            System.out.println("Exception");
            Logger.getLogger(Mover.class.getName()).log(Level.SEVERE, null, ex1);
        }
        desconectar();
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}