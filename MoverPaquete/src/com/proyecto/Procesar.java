
package com.proyecto;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author cesar31
 */
public class Procesar {
    
    Mover move = new Mover();
    
    public Procesar(){
        
    }
    
    public void procesarPaquete(int idEnvio, int idRuta, int idCliente, java.sql.Timestamp today, int difHoras, Double costoTotal){
        ArrayList <String> puntosControl = new ArrayList();
        move.conectar();
        try{
            String queryEnvios = "SELECT ubicacion FROM envios WHERE idEnvios = ?";
            PreparedStatement envios = move.getConnection().prepareStatement(queryEnvios);
            envios.setInt(1, idEnvio);
            ResultSet e = envios.executeQuery();
            String ubicacion = "";
            while(e.next()){
                ubicacion = e.getString("ubicacion");
            }
            System.out.println("ubicacion: " + ubicacion);
            
            String queryRutas = "SELECT * FROM rutas WHERE idRutas = ?";
            PreparedStatement rutas = move.getConnection().prepareStatement(queryRutas);
            rutas.setInt(1, idRuta);
            ResultSet r = rutas.executeQuery();
            System.out.println("idRuta: " + idRuta);
            
            String pais = "";
            String ciudad = "";
            String destino = "";
            int contadorPuntos = 0;
            int posActual = 0;
            while(r.next()){
                destino = r.getString("Destino");
                pais = r.getString("pais");
                ciudad = r.getString("ciudad");
                contadorPuntos = r.getInt("puntosC");
                
                for (int i=0; i <contadorPuntos ; i++) {
                    int pos = i + 1;
                    String punto = "pc" + pos;
                    puntosControl.add(r.getString(punto));
                    if(puntosControl.get(i).equals(ubicacion)){
                        posActual = i;
                    }
                }            
            }
            

            
            if(posActual + 1 == contadorPuntos){
                try{
                    move.getConnection().setAutoCommit(false);
                
                    String queryPuntoControl1 = "UPDATE " + nombreTabla(puntosControl.get(posActual)) + " SET estado = ? WHERE idEnvio = ?";
                    PreparedStatement puntoTabla1 = move.getConnection().prepareStatement(queryPuntoControl1);
                    puntoTabla1.setBoolean(1, false);
                    puntoTabla1.setInt(2, idEnvio);
                    puntoTabla1.executeUpdate();

                    String queryPuntoControl2 = "UPDATE " + nombreTabla(puntosControl.get(posActual)) + " SET fechaSalida = ? WHERE idEnvio = ?";
                    PreparedStatement puntoTabla2 = move.getConnection().prepareStatement(queryPuntoControl2);
                    puntoTabla2.setTimestamp(1, today);
                    puntoTabla2.setInt(2, idEnvio);
                    puntoTabla2.executeUpdate();

                    String queryPuntoControl3 = "UPDATE " + nombreTabla(puntosControl.get(posActual)) + " SET costoTotal = costoTotal + ? WHERE idEnvio = ?";
                    PreparedStatement puntoTabla3 = move.getConnection().prepareStatement(queryPuntoControl3);
                    puntoTabla3.setDouble(1, costoTotal);
                    puntoTabla3.setInt(2, idEnvio);
                    puntoTabla3.executeUpdate();

                    String queryEnvios1 = "UPDATE envios SET ubicacion = ? WHERE idEnvios = ?";
                    PreparedStatement envios1 = move.getConnection().prepareStatement(queryEnvios1);
                    envios1.setString(1, "Bod. Destino");
                    envios1.setInt(2, idEnvio);
                    envios1.executeUpdate();

                    String queryEnvios2 = "UPDATE envios SET costo = costo + ? WHERE idEnvios = ?";
                    PreparedStatement envios2 = move.getConnection().prepareStatement(queryEnvios2);
                    envios2.setDouble(1, costoTotal);
                    envios2.setInt(2, idEnvio);
                    envios2.executeUpdate();

                    move.getConnection().commit();
                    move.getConnection().setAutoCommit(true);
                    String mensaje = "El paquete con idEnvio: " + idEnvio + " fue procesado hacia la bodega de " +  destino +", ha llegado a su destino.";
                    JOptionPane.showMessageDialog(null, mensaje, "Informacion", JOptionPane.INFORMATION_MESSAGE);
                    
                }catch(SQLException ex){
                    move.getConnection().rollback();
                }

                
            }else if(posActual + 1 < contadorPuntos){
                
                String queryNumeroEnvios = "SELECT * FROM " + nombreTabla(puntosControl.get(posActual + 1)) + " WHERE estado = 1";
                Statement espacio = move.getConnection().createStatement();
                ResultSet s = espacio.executeQuery(queryNumeroEnvios);
                int contador = 0;
                while(s.next()){
                    contador++;
                }
                
                String espacioPunto = "SELECT tamañoBodega FROM puntosDeControl WHERE codigo = ?";
                PreparedStatement tamaño = move.getConnection().prepareStatement(espacioPunto);
                tamaño.setString(1, puntosControl.get(posActual + 1));
                ResultSet t = tamaño.executeQuery();
                int tamañoBodega = 0;
                while(t.next()){
                    tamañoBodega = t.getInt("tamañoBodega");
                }
                int space = tamañoBodega - contador;
                
                String queryPunto2 = "SELECT idRegistro FROM " + nombreTabla(puntosControl.get(posActual + 1));
                Statement verificarReg = move.getConnection().createStatement();
                ResultSet ver = verificarReg.executeQuery(queryPunto2);
                int idReg = 1;
                while(ver.next()){
                    int reg = ver.getInt("idRegistro");
                    if(reg >= idReg){
                        idReg = reg + 1;
                    }
                }
                
                if(space>0){
                    try{
                        move.getConnection().setAutoCommit(false);
                    
                        String queryPuntoControl1 = "UPDATE " + nombreTabla(puntosControl.get(posActual)) + " SET estado = ? WHERE idEnvio = ?";
                        PreparedStatement puntoTabla1 = move.getConnection().prepareStatement(queryPuntoControl1);
                        puntoTabla1.setBoolean(1, false);
                        puntoTabla1.setInt(2, idEnvio);
                        puntoTabla1.executeUpdate();

                        String queryPuntoControl2 = "UPDATE " + nombreTabla(puntosControl.get(posActual)) + " SET fechaSalida = ? WHERE idEnvio = ?";
                        PreparedStatement puntoTabla2 = move.getConnection().prepareStatement(queryPuntoControl2);
                        puntoTabla2.setTimestamp(1, today);
                        puntoTabla2.setInt(2, idEnvio);
                        puntoTabla2.executeUpdate();

                        String queryPuntoControl3 = "UPDATE " + nombreTabla(puntosControl.get(posActual)) + " SET costoTotal = costoTotal + ? WHERE idEnvio = ?";
                        PreparedStatement puntoTabla3 = move.getConnection().prepareStatement(queryPuntoControl3);
                        puntoTabla3.setDouble(1, costoTotal);
                        puntoTabla3.setInt(2, idEnvio);
                        puntoTabla3.executeUpdate();

                        String queryTablePunto = "INSERT INTO " + nombreTabla(puntosControl.get(posActual + 1)) + " VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                        PreparedStatement table = move.getConnection().prepareStatement(queryTablePunto);
                        table.setInt(1, idReg);
                        table.setInt(2, idEnvio);
                        table.setInt(3, idCliente);
                        table.setInt(4, idRuta);
                        table.setString(5, pais);
                        table.setString(6, ciudad);
                        table.setBoolean(7, true);
                        table.setTimestamp(8, sqlTimestamp());
                        table.setDate(9, null);
                        table.setDouble(10, 0);
                        table.executeUpdate();

                        String queryEnvios1 = "UPDATE envios SET ubicacion = ? WHERE idEnvios = ?";
                        PreparedStatement envios1 = move.getConnection().prepareStatement(queryEnvios1);
                        envios1.setString(1, puntosControl.get(posActual+1));
                        envios1.setInt(2, idEnvio);
                        envios1.executeUpdate();

                        String queryEnvios2 = "UPDATE envios SET costo = costo + ? WHERE idEnvios = ?";
                        PreparedStatement envios2 = move.getConnection().prepareStatement(queryEnvios2);
                        envios2.setDouble(1, costoTotal);
                        envios2.setInt(2, idEnvio);
                        envios2.executeUpdate();

                        move.getConnection().commit();
                        move.getConnection().setAutoCommit(true);
                        String mensaje = "El paquete con idEnvio: " + idEnvio + " fue procesado hacia: " + puntosControl.get(posActual + 1) + " con exito.";
                        JOptionPane.showMessageDialog(null, mensaje, "Informacion", JOptionPane.INFORMATION_MESSAGE);
                    
                    }catch(SQLException ex){
                        move.getConnection().rollback();
                    }

                }else{
                    String mensaje = "El paquete con idEnvio: " + idEnvio + " no fue procesado hacia: " + puntosControl.get(posActual + 1) + ", por falta de espacio, intente mas tarde";
                    JOptionPane.showMessageDialog(null, mensaje, "Informacion", JOptionPane.INFORMATION_MESSAGE);
                }
                
            }
        }catch(SQLException ex1){
            System.out.println("Exception");
            Logger.getLogger(Procesar.class.getName()).log(Level.SEVERE, null, ex1);
        }
        move.desconectar();
        
        
    }
    
    public String nombreTabla(String punto){
        String nombreTabla = "";
        
        for (int i=0; i<punto.length(); i++){
            if(punto.charAt(i) == '-'){
                nombreTabla += "_";
            }else{
                nombreTabla += punto.charAt(i);
            }
        }
        return nombreTabla;
    }
    
    public java.sql.Timestamp sqlTimestamp(){
        Calendar today = Calendar.getInstance();
        //today.add(Calendar.DAY_OF_YEAR, 1);
        //today.add(Calendar.HOUR_OF_DAY, 1);
        java.sql.Timestamp sqlTimestamp = new java.sql.Timestamp(today.getTimeInMillis());
        System.out.println("sqlTimestamp procesar: " + sqlTimestamp);
        
        return sqlTimestamp;
    }
}
