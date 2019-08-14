
package proyecto;

/**
 *
 * @author cesar31
 */
public class PuntosDeControl {
    
    private String codigo;
    private String nombreCiudad;
    private double tarifa;
    private int tamañoBodega;

    public PuntosDeControl(String codigo, String nombreCiudad, double tarifa, int tamañoBodega) {
        this.codigo = codigo;
        this.nombreCiudad = nombreCiudad;
        this.tarifa = tarifa;
        this.tamañoBodega = tamañoBodega;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public int getTamañoBodega() {
        return tamañoBodega;
    }

    public void setTamañoBodega(int tamañoBodega) {
        this.tamañoBodega = tamañoBodega;
    }
}
