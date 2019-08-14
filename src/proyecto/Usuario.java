package proyecto;


/**
 *
 * @author cesar31
 */
public class Usuario{
    
    private String usuario;
    private String nombre;
    private String apellidos;
    private String tipoUsuario;

    public Usuario(String usuario, String nombre, String apellidos, String tipoUsuario) {
        this.usuario = usuario;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.tipoUsuario = tipoUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    
}
