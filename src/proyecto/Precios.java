
package proyecto;

/**
 *
 * @author cesar31
 */
public class Precios {
    
    private int idPrecio;
    private String tipoPago;
    private double precio;

    public Precios(int idPrecio, String tipoPago, double precio) {
        this.idPrecio = idPrecio;
        this.tipoPago = tipoPago;
        this.precio = precio;
    }

    public int getIdPrecio() {
        return idPrecio;
    }

    public void setIdPrecio(int idPrecio) {
        this.idPrecio = idPrecio;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
