
package proyecto;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author cesar31
 */
public class ProcesarPaquete extends java.awt.Dialog {

    Sistema sistema;
    PuntoControl paquete;
    private int difHoras;
    private Double costoTotal;
    private java.sql.Timestamp today;
    
    public ProcesarPaquete(java.awt.Frame parent, Sistema sistema, PuntoControl paquete) {
        super(parent, true);
        this.sistema = sistema;
        this.paquete = paquete;
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        idEnvioText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        idClienteText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        idRutaText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        paisText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        ciudadText = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ingresoText = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        salidaText = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        costoTotalText = new javax.swing.JTextField();
        procesarBoton = new javax.swing.JButton();
        cancelarBoton = new javax.swing.JButton();
        tiempoLabel = new javax.swing.JLabel();
        tiempoText = new javax.swing.JTextField();

        setMinimumSize(new java.awt.Dimension(400, 300));
        setTitle("Procesando Paquete");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        jLabel1.setText("Resumen de Envio");

        jLabel2.setText("idEnvio");
        jLabel2.setToolTipText("");

        idEnvioText.setEditable(false);

        jLabel3.setText("idCliente");

        idClienteText.setEditable(false);

        jLabel4.setText("idRuta");

        idRutaText.setEditable(false);

        jLabel5.setText("Destino");

        jLabel6.setText("Pais");

        paisText.setEditable(false);

        jLabel7.setText("Ciudad");

        ciudadText.setEditable(false);

        jLabel8.setText("Manejo de Tiempo");

        jLabel9.setText("Ingreso");

        ingresoText.setEditable(false);

        jLabel10.setText("Salida");

        salidaText.setEditable(false);

        jLabel11.setText("CostoTotal");

        costoTotalText.setEditable(false);

        procesarBoton.setText("Procesar");
        procesarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procesarBotonActionPerformed(evt);
            }
        });

        cancelarBoton.setText("Cancelar");
        cancelarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBotonActionPerformed(evt);
            }
        });

        tiempoLabel.setText("Tiempo");

        tiempoText.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(idEnvioText, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(idClienteText, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(idRutaText, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(paisText, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ciudadText, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel8))
                        .addContainerGap(30, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(procesarBoton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cancelarBoton)
                                .addGap(182, 182, 182))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tiempoLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tiempoText, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                    .addComponent(ingresoText))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(salidaText, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(costoTotalText)))))
                        .addGap(59, 59, 59))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(idEnvioText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(idClienteText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(idRutaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(paisText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(ciudadText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(ingresoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(salidaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(costoTotalText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tiempoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tiempoLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancelarBoton)
                    .addComponent(procesarBoton))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Closes the dialog
     */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog

    private void procesarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procesarBotonActionPerformed
        inicializarInformacion();
        com.proyecto.Procesar procesar = new com.proyecto.Procesar();
        procesar.procesarPaquete(paquete.getIdEnvio(), paquete.getIdRuta(), paquete.getIdCliente(), today, difHoras, costoTotal);
        
        com.proyecto.Mover mover = new com.proyecto.Mover();
        mover.mover();
        
        sistema.inicio.operador.getPuntoObservable().clear();
        String instruccion = "SELECT * FROM " + sistema.inicio.operador.nombre + " WHERE estado = 1";
        sistema.MostrarTabla(sistema.inicio.operador.nombre, instruccion);
        sistema.inicio.operador.getPuntoObservable().addAll(sistema.getPunto());
        
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_procesarBotonActionPerformed

    private void cancelarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBotonActionPerformed
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_cancelarBotonActionPerformed

    public void inicializarInformacion(){
        idEnvioText.setText(""+paquete.getIdEnvio());
        idClienteText.setText(""+paquete.getIdCliente());
        idRutaText.setText(""+paquete.getIdRuta());
        ingresoText.setText(""+paquete.getFechaIngreso() +" " + paquete.getHoraIngreso());
        paisText.setText(paquete.getPais());
        ciudadText.setText(paquete.getCiudad());
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        today = new java.sql.Timestamp(date.getTime());
        
        salidaText.setText(formato.format(date));
        
        java.sql.Timestamp i = paquete.getFecha();
        Calendar ingreso = Calendar.getInstance();
        ingreso.set(i.getYear(), i.getMonth(), i.getDate(), i.getHours(), i.getMinutes());
        int ingresoDay = ingreso.get(Calendar.DAY_OF_YEAR);
        int ingresoHora = ingreso.get(Calendar.HOUR_OF_DAY);

        Calendar salida = Calendar.getInstance();
        salida.set(date.getYear(), date.getMonth(), date.getDate(), date.getHours(), date.getMinutes());
        int salidaDay = salida.get(Calendar.DAY_OF_YEAR);
        int salidaHora = salida.get(Calendar.HOUR_OF_DAY);

        System.out.println("salidaHora: " + salidaHora);
        
        if(salidaDay == ingresoDay){
            if(ingresoHora == salidaHora){
                difHoras = salidaHora - ingresoHora + 1;
            }else{
                difHoras = salidaHora - ingresoHora;
            }
        }else{
            if(salidaHora > ingresoHora){
                difHoras = (salidaDay - ingresoDay)*24 + salidaHora - ingresoHora;
            }else if(salidaHora < ingresoHora){
                difHoras = (salidaDay - ingresoDay)*24 - ingresoHora + salidaHora;
            }else if(salidaHora == ingresoHora){
                difHoras = (salidaDay - ingresoDay)*24 + 1;
            }
            
        }
        
        tiempoText.setText("" + difHoras + " Horas");
        
        
        String queryEnv = "SELECT * FROM envios WHERE idEnvios = " + paquete.getIdEnvio();
        sistema.MostrarTabla("envios", queryEnv);
        String ubicacion = sistema.getEnvios().get(0).getUbicacion();
 
        System.out.println("ubicacion: " + ubicacion);
        String queryPuntos = "SELECT * FROM puntosDeControl WHERE codigo =" + "\"" + ubicacion + "\"";
        sistema.MostrarTabla("puntosDeControl", queryPuntos);
        Double tarifa = sistema.getPuntosDeControl().get(0).getTarifa();
        
        costoTotal = difHoras * tarifa;
        costoTotal = Math.round(costoTotal*10)/10d;
        costoTotalText.setText("" + costoTotal);
        
    }
            
            
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarBoton;
    private javax.swing.JTextField ciudadText;
    private javax.swing.JTextField costoTotalText;
    private javax.swing.JTextField idClienteText;
    private javax.swing.JTextField idEnvioText;
    private javax.swing.JTextField idRutaText;
    private javax.swing.JTextField ingresoText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField paisText;
    private javax.swing.JButton procesarBoton;
    private javax.swing.JTextField salidaText;
    private javax.swing.JLabel tiempoLabel;
    private javax.swing.JTextField tiempoText;
    // End of variables declaration//GEN-END:variables
}
