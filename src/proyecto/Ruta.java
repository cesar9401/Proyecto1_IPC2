
package proyecto;

/**
 *
 * @author cesar31
 */
public class Ruta {
    
    private int idRutas;
    private String cod_D;
    private String pais;
    private String ciudad;
    private double precio;
    private int puntosC;
    private String pc1;
    private String pc2;
    private String pc3;
    private String pc4;
    private String pc5;

    public Ruta(int idRutas, String cod_D, String pais ,String ciudad, double precio) {
        this.idRutas = idRutas;
        this.cod_D = cod_D;
        this.pais = pais;
        this.ciudad = ciudad;
        this.precio = precio;
    }

    public int getIdRutas() {
        return idRutas;
    }

    public void setIdRutas(int idRutas) {
        this.idRutas = idRutas;
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getPuntosC() {
        return puntosC;
    }

    public void setPuntosC(int puntosC) {
        this.puntosC = puntosC;
    }

    public String getPc1() {
        return pc1;
    }

    public void setPc1(String pc1) {
        this.pc1 = pc1;
    }

    public String getPc2() {
        return pc2;
    }

    public void setPc2(String pc2) {
        this.pc2 = pc2;
    }

    public String getPc3() {
        return pc3;
    }

    public void setPc3(String pc3) {
        this.pc3 = pc3;
    }

    public String getPc4() {
        return pc4;
    }

    public void setPc4(String pc4) {
        this.pc4 = pc4;
    }

    public String getPc5() {
        return pc5;
    }

    public void setPc5(String pc5) {
        this.pc5 = pc5;
    }
}