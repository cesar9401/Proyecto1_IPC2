package proyecto;


import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author cesar31
 */
public class Conexion {
    
    private Connection connection = null;
    private final String user = "cesar9401";
    private final String password = "Huevos94C";
    private final String url = "jdbc:mysql://localhost:3306/proyecto1_IPC2";
    
    public Connection conectar(){
        try{
            connection = (Connection) DriverManager.getConnection(url, user, password);
            //System.out.println("Conectado " + connection.getCatalog());
            
        }catch(SQLException ex){
            System.out.println("Fallo la conexion");
        }
        return connection;
    }
    
    public void desconectar(){
        try {
            connection.close();
            //System.out.println("Desconectado " + connection.getCatalog());
        } catch (SQLException ex) {
            System.out.println("No se pudo cerrar conexion");
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
    
}
