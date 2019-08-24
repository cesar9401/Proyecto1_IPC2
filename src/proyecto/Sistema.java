package proyecto;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cesar31
 */
public class Sistema {
    
    VentanaInicioSesion inicio = new VentanaInicioSesion(this);
    Conexion conectar = new Conexion();
    
    private ArrayList <Usuario> usuarios = new ArrayList<>();
    private ArrayList <Precios> precios = new ArrayList<>();
    private ArrayList <Cliente> clientes = new ArrayList<>();
    private ArrayList <PuntosDeControl> puntosDeControl = new ArrayList<>();
    private ArrayList <Envios> envios = new ArrayList<>();
    private ArrayList <Ruta> rutas = new ArrayList<>();
    private ArrayList <PuntoControl> punto = new ArrayList<>();
    private ArrayList <ConsultaInner> inner_tmp = new ArrayList<>();
    private int contadorEnvios = 0;
    private int contadorRutas = 0;
    
    public Sistema(){
        //MostrarTabla("HN_DC", "");
        //JOptionPane.showMessageDialog(inicio, "La hora es: " + punto.get(0).getHoraIngreso(), "hora", JOptionPane.INFORMATION_MESSAGE);
    }
    
    /**
     * Metodo que verifica si alguno dato ya existe en alguna tabla de la base de datos
     * @param tabla
     * @param columna
     * @param dato
     * @param ocupado
     * @return 
     */
    public boolean VerificarOcupado(String tabla, String columna, String dato, boolean ocupado){
        conectar.conectar();
        ocupado = false;
        try{
            PreparedStatement declaracionPreparada = conectar.getConnection().prepareStatement("SELECT * FROM "+ tabla +" WHERE "+ columna+" = ?");
            declaracionPreparada.setString(1, dato);
            ResultSet resultado = declaracionPreparada.executeQuery();
            while(resultado.next()){
                ocupado = true;
            }
        }catch(SQLException ex){
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        conectar.desconectar();
        return ocupado;
    }
    

    /**
     * Metodo que se encarga de mostrar los datos de la tabla que se indique en el string nombreTabla
     * @param nombreTabla 
     */
    public void MostrarTabla(String nombreTabla, String instruccion){
        usuarios.clear();
        precios.clear();
        clientes.clear();
        puntosDeControl.clear();
        rutas.clear();
        envios.clear();
        punto.clear();
        conectar.conectar();
        
        if(instruccion.equals("")){
            instruccion = "SELECT * FROM " + nombreTabla;
        }
            
        try{
            Statement declaracion = conectar.getConnection().createStatement();
            ResultSet r = declaracion.executeQuery(instruccion);
            while(r.next()){
                if(nombreTabla.equals("usuarios")){
                    Usuario usuario = new Usuario(r.getString("usuario"), r.getString("nombre"), r.getString("apellidos"), r.getString("tipoUsuario"));
                    usuarios.add(usuario);
                }
                else if(nombreTabla.equals("rutas")){
                    Ruta ruta = new Ruta(r.getInt("idRutas"), r.getString("Destino"), r.getString("pais") ,r.getString("ciudad"), r.getDouble("precio"));
                    ruta.setPuntosC(r.getInt("puntosC"));
                    ruta.setPc1(r.getString("pc1"));
                    ruta.setPc2(r.getString("pc2"));
                    ruta.setPc3(r.getString("pc3"));
                    ruta.setPc4(r.getString("pc4"));
                    ruta.setPc5(r.getString("pc5"));
                    if(r.getInt("idRutas") != 1){
                        rutas.add(ruta);
                    }
                    
                    if(r.getInt("idRutas")>contadorRutas){
                    contadorRutas = r.getInt("idRutas");
                    contadorRutas++;
                    }
                }
                else if(nombreTabla.equals("puntosDeControl")){
                    PuntosDeControl puntos = new PuntosDeControl(r.getString("codigo"), r.getString("pais_P") ,r.getString("ciudad_P"), r.getDouble("tarifa"), r.getInt("tamañoBodega"), r.getString("encargado"));
                    puntosDeControl.add(puntos);
                }
                else if(nombreTabla.equals("precios")){
                    Precios precio = new Precios(r.getInt("idPrecio"), r.getString("tipoDePago"), r.getDouble("precio"));
                    precios.add(precio);
                }
                else if(nombreTabla.equals("clientes")){
                    Cliente cliente = new Cliente(r.getInt("idCliente"), r.getInt("nit"), r.getString("nombre"), r.getInt("telefono"), r.getString("email"), r.getString("direccion"));
                    clientes.add(cliente);
                }
                else if(nombreTabla.equals("envios")){
                    Envios envio = new Envios(r.getInt("idEnvios"), r.getDouble("peso"), r.getString("categoria"), r.getDate("ingreso"), r.getBoolean("priorizar"));
                    envio.setIdCliete(r.getInt("id_Cliente"));
                    envio.setIdRuta(r.getInt("id_Ruta"));
                    envio.setCod_D(r.getString("cod_D"));
                    envio.setPais(r.getString("paisD"));
                    envio.setCiudad(r.getString("ciudad_D"));
                    envio.setUbicacion(r.getString("ubicacion"));
                    envio.setMontoPriorizar(r.getDouble("montoPriorizar"));
                    envio.setMontoPeso(r.getDouble("montoPeso"));
                    envio.setMontoDestino(r.getDouble("montoDestino"));
                    envio.setMontoTotal(r.getDouble("montoTotal"));
                    envios.add(envio);
                    contadorEnvios++;
                }
                
                else{
                    System.out.println("nombreTabla: " + nombreTabla);
                    PuntoControl puntoControl = new PuntoControl(r.getInt("idRegistro"), r.getInt("idEnvio"), r.getInt("idCliente"), r.getInt("idRuta"), r.getString("pais"), r.getString("ciudad"), r.getBoolean("estado"));
                    puntoControl.setFechaIngreso(r.getDate("fechaIngreso"));
                    puntoControl.setFechaSalida(r.getDate("fechaSalida"));
                    puntoControl.setCostoTotal(r.getDouble("costoTotal"));
                    String time = null; 
                    String timeF = null;
                    try{
                        time = r.getTime("fechaIngreso").toString();
                        timeF = r.getTime("fechaSalida").toString();
                    }catch(NullPointerException e){}
                    puntoControl.setHoraIngreso(time);
                    puntoControl.setHoraSalida(timeF);
                    punto.add(puntoControl);
                    System.out.println(puntoControl.toString());
                    
                }
            }

        }catch(SQLException ex){
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        conectar.desconectar();
    }
    
    /**
     * Metedo que se encarga de ingresar valores a la tabla que se le especifique mediante el string query
     * @param query 
     */  

    public void IngresarEliminarEnTabla(String query){
        conectar.conectar();
        try{
            Statement declaracion = conectar.getConnection().createStatement();
            declaracion.executeUpdate(query);
        }catch(SQLException ex){
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        conectar.desconectar();
    }
    
    public void ConsultaInner(String query, int dato){
        inner_tmp.clear();
        conectar.conectar();
        try{
            PreparedStatement declaracionPreparada = conectar.getConnection().prepareStatement(query);
            if(dato !=0){
                declaracionPreparada.setInt(1, dato);
            }
            ResultSet r = declaracionPreparada.executeQuery();
            while(r.next()){
                ConsultaInner inner = new ConsultaInner(r.getInt("idEnvios"), r.getInt("id_Cliente"), r.getDate("ingreso"), r.getInt("id_Ruta"), r.getString("paisD"), r.getString("ciudad_D"));
                inner.setUbicacion(r.getString("ubicacion"));
                inner.setPais_P(r.getString("pais_P"));
                inner.setCiudad_P(r.getString("ciudad_P"));
                inner.setIngresoPunto(r.getDate("fechaIngreso"));
                String hora = null;
                try{
                    hora = r.getTime("fechaIngreso").toString();
                }catch(NullPointerException e){}
                inner.setHoraPunto(hora);
                inner_tmp.add(inner);
                
            }
        }catch(SQLException ex){
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        conectar.desconectar();
    }
    

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public ArrayList<Precios> getPrecios() {
        return precios;
    }

    public void setPrecios(ArrayList<Precios> precios) {
        this.precios = precios;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<PuntosDeControl> getPuntosDeControl() {
        return puntosDeControl;
    }

    public void setPuntosDeControl(ArrayList<PuntosDeControl> puntosDeControl) {
        this.puntosDeControl = puntosDeControl;
    }

    public ArrayList<Envios> getEnvios() {
        return envios;
    }

    public void setEnvios(ArrayList<Envios> envios) {
        this.envios = envios;
    }

    public ArrayList<Ruta> getRutas() {
        return rutas;
    }

    public void setRutas(ArrayList<Ruta> rutas) {
        this.rutas = rutas;
    }

    public int getContadorEnvios() {
        return contadorEnvios;
    }

    public void setContadorEnvios(int contadorEnvios) {
        this.contadorEnvios = contadorEnvios;
    }

    public int getContadorRutas() {
        return contadorRutas;
    }

    public void setContadorRutas(int contadorRutas) {
        this.contadorRutas = contadorRutas;
    }

    public ArrayList<PuntoControl> getPunto() {
        return punto;
    }

    public void setPunto(ArrayList<PuntoControl> punto) {
        this.punto = punto;
    }

    public ArrayList<ConsultaInner> getInner_tmp() {
        return inner_tmp;
    }

    public void setInner_tmp(ArrayList<ConsultaInner> inner_tmp) {
        this.inner_tmp = inner_tmp;
    }
}
