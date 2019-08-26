
package com.proyecto;

/**
 *
 * @author cesar31
 */
public class Envio {
    
    private int idEnvios;
    private int id_Cliente;
    private boolean priorizar;
    private int id_Ruta;
    private String cod_D;
    private String pais_D;
    private String ciudad_D;
    private String ubicacion;

    public Envio(int idEnvios, int id_Cliente, boolean priorizar, int id_Ruta, String cod_D, String pais_D, String ciudad_D, String ubicacion) {
        this.idEnvios = idEnvios;
        this.id_Cliente = id_Cliente;
        this.priorizar = priorizar;
        this.id_Ruta = id_Ruta;
        this.cod_D = cod_D;
        this.pais_D = pais_D;
        this.ciudad_D = ciudad_D;
        this.ubicacion = ubicacion;
    }

    public int getIdEnvios() {
        return idEnvios;
    }

    public void setIdEnvios(int idEnvios) {
        this.idEnvios = idEnvios;
    }

    public int getId_Cliente() {
        return id_Cliente;
    }

    public void setId_Cliente(int id_Cliente) {
        this.id_Cliente = id_Cliente;
    }

    public boolean isPriorizar() {
        return priorizar;
    }

    public void setPriorizar(boolean priorizar) {
        this.priorizar = priorizar;
    }

    public int getId_Ruta() {
        return id_Ruta;
    }

    public void setId_Ruta(int id_Ruta) {
        this.id_Ruta = id_Ruta;
    }

    public String getCod_D() {
        return cod_D;
    }

    public void setCod_D(String cod_D) {
        this.cod_D = cod_D;
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

    @Override
    public String toString() {
        return "Envio{" + "idEnvios=" + idEnvios + ", id_Cliente=" + id_Cliente + ", priorizar=" + priorizar + ", id_Ruta=" + id_Ruta + ", cod_D=" + cod_D + ", pais_D=" + pais_D + ", ciudad_D=" + ciudad_D + ", ubicacion=" + ubicacion + '}';
    }
}
