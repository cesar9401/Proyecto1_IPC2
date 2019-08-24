
package proyecto;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author cesar31
 */
public class PuntoControl {

    private int idRegistro;
    private int idEnvio;
    private int idCliente;
    private int idRuta;
    private String pais;
    private String ciudad;
    private boolean estado;
    private Date fechaIngreso;
    private String horaIngreso;
    private Date fechaSalida;
    private String horaSalida;
    private Double costoTotal;
            
    public PuntoControl(int idRegistro, int idEnvio, int idCliente, int idRuta, String pais, String ciudad, boolean estado) {
        this.idRegistro = idRegistro;
        this.idEnvio = idEnvio;
        this.idCliente = idCliente;
        this.idRuta = idRuta;
        this.pais = pais;
        this.ciudad = ciudad;
        this.estado = estado;
    }

    public int getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(int idRegistro) {
        this.idRegistro = idRegistro;
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

    public int getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(int idRuta) {
        this.idRuta = idRuta;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getHoraIngreso() {
        return horaIngreso;
    }

    public void setHoraIngreso(String horaIngreso) {
        this.horaIngreso = horaIngreso;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public Double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(Double costoTotal) {
        this.costoTotal = costoTotal;
    }

    @Override
    public String toString() {
        return "PuntoControl{" + "idRegistro=" + idRegistro + ", idEnvio=" + idEnvio + ", idCliente=" + idCliente + ", idRuta=" + idRuta + ", pais=" + pais + ", ciudad=" + ciudad + ", estado=" + estado + ", fechaIngreso=" + fechaIngreso + ", horaIngreso=" + horaIngreso + ", fechaSalida=" + fechaSalida + ", horaSalida=" + horaSalida + ", costoTotal=" + costoTotal + '}';
    }
}
