
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author cesar31
 */
public class Main {
    
    public static void main(String[] args){
        //write your code here
        
        /**
        Conexion conectar = new Conexion();
        conectar.conectar();
        try {
            Statement declaracion = conectar.getConnection().createStatement();
            ResultSet resultado = declaracion.executeQuery("SELECT * FROM usuarios");
            int numeroFila = 1;
            while(resultado.next()){
                System.out.printf("Fila %d - %s - %s\n", numeroFila, resultado.getString("usuario"), resultado.getString("contraseña"));
                numeroFila++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        conectar.desconectar();
        * */
        
    }
    
}
