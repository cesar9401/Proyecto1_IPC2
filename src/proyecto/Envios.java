
package proyecto;

import java.sql.Date;

/**
 *
 * @author cesar31
 */
public class Envios {
    
    private int idEnvios;
    private int idCliete;
    private Double peso;
    private String categoria;
    private Date ingreso;
    private boolean priorizar;
    private int idRuta;
    private String cod_D;
    private String pais;
    private String ciudad;
    private boolean bodega;
    private boolean bodegaD;
    private boolean entregado;
    private Double montoPriorizar;
    private Double montoPeso;
    private Double montoDestino;
    private Double montoTotal;

    public Envios(int idEnvios, Double peso, String categoria, Date ingreso, boolean priorizar) {
        this.idEnvios = idEnvios;
        this.peso = peso;
        this.categoria = categoria;
        this.ingreso = ingreso;
        this.priorizar = priorizar;
    }

    public int getIdEnvios() {
        return idEnvios;
    }

    public void setIdEnvios(int idEnvios) {
        this.idEnvios = idEnvios;
    }

    public int getIdCliete() {
        return idCliete;
    }

    public void setIdCliete(int idCliete) {
        this.idCliete = idCliete;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Date getIngreso() {
        return ingreso;
    }

    public void setIngreso(Date ingreso) {
        this.ingreso = ingreso;
    }

    public boolean isPriorizar() {
        return priorizar;
    }

    public void setPriorizar(boolean priorizar) {
        this.priorizar = priorizar;
    }

    public int getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(int idRuta) {
        this.idRuta = idRuta;
    }

    public String getCod_D() {
        return cod_D;
    }

    public void setCod_D(String cod_D) {
        this.cod_D = cod_D;
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

    public boolean isBodega() {
        return bodega;
    }

    public void setBodega(boolean bodega) {
        this.bodega = bodega;
    }

    public boolean isBodegaD() {
        return bodegaD;
    }

    public void setBodegaD(boolean bodegaD) {
        this.bodegaD = bodegaD;
    }

    public boolean isEntregado() {
        return entregado;
    }

    public void setEntregado(boolean entregado) {
        this.entregado = entregado;
    }

    public Double getMontoPriorizar() {
        return montoPriorizar;
    }

    public void setMontoPriorizar(Double montoPriorizar) {
        this.montoPriorizar = montoPriorizar;
    }

    public Double getMontoPeso() {
        return montoPeso;
    }

    public void setMontoPeso(Double montoPeso) {
        this.montoPeso = montoPeso;
    }

    public Double getMontoDestino() {
        return montoDestino;
    }

    public void setMontoDestino(Double montoDestino) {
        this.montoDestino = montoDestino;
    }

    public Double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(Double montoTotal) {
        this.montoTotal = montoTotal;
    }

    @Override
    public String toString() {
        return "Envios{" + "idEnvios=" + idEnvios + ", idCliete=" + idCliete + ", peso=" + peso + ", categoria=" + categoria + ", ingreso=" + ingreso + ", priorizar=" + priorizar + ", idRuta=" + idRuta + ", cod_D=" + cod_D + ", pais=" + pais + ", ciudad=" + ciudad + ", bodega=" + bodega + ", bodegaD=" + bodegaD + ", entregado=" + entregado + ", montoPriorizar=" + montoPriorizar + ", montoPeso=" + montoPeso + ", montoDestino=" + montoDestino + ", montoTotal=" + montoTotal + '}';
    }

}