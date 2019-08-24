
package proyecto;

import java.sql.Date;

/**
 *
 * @author cesar31
 */
public class ConsultaInner {
    
    private int idEnvio;
    private int idCliente;
    private Date ingresoEnvio;
    private int idRuta;
    private String pais_D;
    private String ciudad_D;
    private String ubicacion;
    private String pais_P;
    private String ciudad_P;
    private Date ingresoPunto;
    private String horaPunto;

    public ConsultaInner(int idEnvio, int idCliente, Date ingresoEnvio, int idRuta, String pais_D, String ciudad_D) {
        this.idEnvio = idEnvio;
        this.idCliente = idCliente;
        this.ingresoEnvio = ingresoEnvio;
        this.idRuta = idRuta;
        this.pais_D = pais_D;
        this.ciudad_D = ciudad_D;
    }

    public ConsultaInner() {
    }

    public int getIdEnvio() {
        return idEnvio;
    }

    public void setIdEnvio(int idEnvio) {
        this.idEnvio = idEnvio;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Date getIngresoEnvio() {
        return ingresoEnvio;
    }

    public void setIngresoEnvio(Date ingresoEnvio) {
        this.ingresoEnvio = ingresoEnvio;
    }

    public int getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(int idRuta) {
        this.idRuta = idRuta;
    }

    public String getPais_D() {
        return pais_D;
    }

    public void setPais_D(String pais_D) {
        this.pais_D = pais_D;
    }

    public String getCiudad_D() {
        return ciudad_D;
    }

    public void setCiudad_D(String ciudad_D) {
        this.ciudad_D = ciudad_D;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getPais_P() {
        return pais_P;
    }

    public void setPais_P(String pais_P) {
        this.pais_P = pais_P;
    }

    public String getCiudad_P() {
        return ciudad_P;
    }

    public void setCiudad_P(String ciudad_P) {
        this.ciudad_P = ciudad_P;
    }

    public Date getIngresoPunto() {
        return ingresoPunto;
    }

    public void setIngresoPunto(Date ingresoPunto) {
        this.ingresoPunto = ingresoPunto;
    }

    public String getHoraPunto() {
        return horaPunto;
    }

    public void setHoraPunto(String horaPunto) {
        this.horaPunto = horaPunto;
    }

   
}
