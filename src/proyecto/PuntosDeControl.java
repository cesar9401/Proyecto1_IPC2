
package proyecto;

/**
 *
 * @author cesar31
 */
public class PuntosDeControl {
    
    private String codigo;
    private String pais;
    private String nombreCiudad;
    private double tarifa;
    private int tamañoBodega;
    private String encargado;

    public PuntosDeControl(String codigo, String pais, String nombreCiudad, double tarifa, int tamañoBodega, String encargado) {
        this.codigo = codigo;
        this.pais = pais;
        this.nombreCiudad = nombreCiudad;
        this.tarifa = tarifa;
        this.tamañoBodega = tamañoBodega;
        this.encargado = encargado;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
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

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }
}
