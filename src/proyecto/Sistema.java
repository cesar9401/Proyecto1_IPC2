package proyecto;


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
public class Sistema {
    
    VentanaInicioSesion inicio = new VentanaInicioSesion(this);
    Conexion conectar = new Conexion();
    
    public Sistema(){
                
    }
    
    /**
     * Metodo que verifica si alguno dato ya existe en alguna tabla de la base de datos
     * @param tabla
     * @param columna
     * @param dato
     * @param ocupado
     * @return 
     */
    public boolean VerificarOcupado(String tabla, String columna, String dato, boolean ocupado){
        conectar.conectar();
        ocupado = false;
        try{
            PreparedStatement declaracionPreparada = conectar.getConnection().prepareStatement("SELECT * FROM "+ tabla +" WHERE "+ columna+" = ?");
            declaracionPreparada.setString(1, dato);
            ResultSet resultado = declaracionPreparada.executeQuery();
            while(resultado.next()){
                ocupado = true;
            }
        }catch(SQLException ex){
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        conectar.desconectar();
        return ocupado;
    }

    /**
     * Metodo que se encarga de mostrar los datos de la tabla que se indique en el string nombreTabla
     * @param nombreTabla 
     */
    public void MostrarTabla(String nombreTabla){
        
        conectar.conectar();
        try{
            Statement declaracion = conectar.getConnection().createStatement();
            ResultSet r = declaracion.executeQuery("SELECT * FROM "+nombreTabla);
            while(r.next()){
                if(nombreTabla.equals("usuarios")){
                    Usuario usuario = new Usuario(r.getString("usuario"), r.getString("nombre"), r.getString("apellidos"), r.getString("tipoUsuario"));
                    inicio.admin.getUsuariosObservable().add(usuario);
                }
                
                if(nombreTabla.equals("rutas")){
                    Ruta ruta = new Ruta(r.getInt("idRutas"), r.getString("cod_D"), r.getString("name_D"), r.getDouble("precio"));
                    ruta.setPuntosC(r.getInt("puntosC"));
                    ruta.setPc1(r.getString("pc1"));
                    ruta.setPc2(r.getString("pc2"));
                    ruta.setPc3(r.getString("pc3"));
                    ruta.setPc4(r.getString("pc4"));
                    ruta.setPc5(r.getString("pc5"));
                    inicio.admin.getRutaObservable().add(ruta);
                }
                
                if(nombreTabla.equals("puntosDeControl")){
                    PuntosDeControl puntos = new PuntosDeControl(r.getString("codigo"), r.getString("nombreCiudad"), r.getDouble("tarifa"), r.getInt("tamañoBodega"));
                    inicio.admin.getPuntosObservable().add(puntos);
                }
            }

        }catch(SQLException ex){
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        conectar.desconectar();
    }
    
    /**
     * Metedo que se encarga de ingresar valores a la tabla que se le especifique mediante el string query
     * @param query 
     */  
    public void IngresarEliminarEnTabla(String query){
        conectar.conectar();
        try{
            Statement declaracion = conectar.getConnection().createStatement();
            declaracion.executeUpdate(query);
        }catch(SQLException ex){
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        conectar.desconectar();
    }
}
