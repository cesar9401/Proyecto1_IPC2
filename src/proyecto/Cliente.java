package proyecto;


/**
 *
 * @author cesar31
 */
public class Cliente {
    
    private int id_Cliente;
    private int nit;
    private String nombre;
    private int telefono;
    private String email;
    private String direccion;

    public Cliente(int id_Cliente, int nit, String nombre, int telefono, String email, String direccion) {
        this.id_Cliente = id_Cliente;
        this.nit = nit;
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
    }

    public int getId_Cliente() {
        return id_Cliente;
    }

    public void setId_Cliente(int id_Cliente) {
        this.id_Cliente = id_Cliente;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id_Cliente=" + id_Cliente + ", nit=" + nit + ", nombre=" + nombre + ", telefono=" + telefono + ", email=" + email + ", direccion=" + direccion + '}';
    }
}
