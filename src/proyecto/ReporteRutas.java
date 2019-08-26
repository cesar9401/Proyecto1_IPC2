
package proyecto;

import java.util.ArrayList;
import java.util.List;
import org.jdesktop.observablecollections.ObservableCollections;
import org.jdesktop.observablecollections.ObservableList;

/**
 *
 * @author cesar31
 */
public class ReporteRutas extends java.awt.Dialog {

    Sistema sistema;
    Ruta ruta;
    
    private ObservableList<PuntosDeControl> puntosObservable;
    private List<PuntosDeControl> listadoPuntos = new ArrayList<>();
    private ObservableList<Envios> enviosObservable;
    private List<Envios> listadoEnvios = new ArrayList<>();
    
    public ReporteRutas(java.awt.Frame parent, Sistema sistema, Ruta ruta) {
        super(parent, true);
        this.sistema = sistema;
        this.ruta = ruta;
        puntosObservable = ObservableCollections.observableList(listadoPuntos);
        enviosObservable = ObservableCollections.observableList(listadoEnvios);
        initComponents();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jPanel1 = new javax.swing.JPanel();
        rutaLabel = new javax.swing.JLabel();
        destinoLabel = new javax.swing.JLabel();
        paisLabel = new javax.swing.JLabel();
        ciudadLabel = new javax.swing.JLabel();
        precioLabel = new javax.swing.JLabel();
        puntosLabel = new javax.swing.JLabel();
        scrollPane1 = new javax.swing.JScrollPane();
        tablaPuntos = new javax.swing.JTable();
        puntosControlLabel = new javax.swing.JLabel();
        paquetesLabel = new javax.swing.JLabel();
        scrollPane = new javax.swing.JScrollPane();
        tablaEnvios = new javax.swing.JTable();
        idRutaLabel = new javax.swing.JLabel();
        paisDLabel = new javax.swing.JLabel();
        precioDestinoLabel = new javax.swing.JLabel();
        destinoDLabel = new javax.swing.JLabel();
        ciudadDestinoLabel = new javax.swing.JLabel();
        puntosCLabel = new javax.swing.JLabel();
        enRutaLabel = new javax.swing.JLabel();
        enRutaLabelInfo = new javax.swing.JLabel();
        rutaMonto = new javax.swing.JLabel();
        rutaCosto = new javax.swing.JLabel();
        montoRuta = new javax.swing.JLabel();
        costoRuta = new javax.swing.JLabel();
        rendimientoLabel = new javax.swing.JLabel();
        rendimientoInfo = new javax.swing.JLabel();
        noRutaLabel = new javax.swing.JLabel();
        Numero = new javax.swing.JLabel();
        montoLabel = new javax.swing.JLabel();
        costoLabel = new javax.swing.JLabel();
        rendimientoNoLabel = new javax.swing.JLabel();
        montoNoLabel = new javax.swing.JLabel();
        costoNoLabel = new javax.swing.JLabel();
        rendimientoNoLabelInfo = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(500, 500));
        setTitle("Reporte de Ruta");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        rutaLabel.setText("idRuta:");

        destinoLabel.setText("Destino: ");

        paisLabel.setText("Pais: ");

        ciudadLabel.setText("Ciudad:");

        precioLabel.setText("Precio de Destino:");

        puntosLabel.setText("Puntos de Control:");

        org.jdesktop.beansbinding.ELProperty eLProperty = org.jdesktop.beansbinding.ELProperty.create("${puntosObservable}");
        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, eLProperty, tablaPuntos);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codigo}"));
        columnBinding.setColumnName("Codigo");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${pais}"));
        columnBinding.setColumnName("Pais");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nombreCiudad}"));
        columnBinding.setColumnName("Ciudad");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tamañoBodega}"));
        columnBinding.setColumnName("Tamaño");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tarifa}"));
        columnBinding.setColumnName("Tarifa");
        columnBinding.setColumnClass(Double.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${encargado}"));
        columnBinding.setColumnName("Encargado");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        scrollPane1.setViewportView(tablaPuntos);

        puntosControlLabel.setText("Puntos de Control: ");

        paquetesLabel.setText("Paquetes en Ruta:");

        eLProperty = org.jdesktop.beansbinding.ELProperty.create("${enviosObservable}");
        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, eLProperty, tablaEnvios);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idEnvios}"));
        columnBinding.setColumnName("Id Envios");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idCliete}"));
        columnBinding.setColumnName("Id Cliete");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cod_D}"));
        columnBinding.setColumnName("Destino");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${ubicacion}"));
        columnBinding.setColumnName("Ubicacion");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${montoTotal}"));
        columnBinding.setColumnName("Monto");
        columnBinding.setColumnClass(Double.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${costo}"));
        columnBinding.setColumnName("Costo");
        columnBinding.setColumnClass(Double.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        scrollPane.setViewportView(tablaEnvios);
        if (tablaEnvios.getColumnModel().getColumnCount() > 0) {
            tablaEnvios.getColumnModel().getColumn(0).setMinWidth(50);
            tablaEnvios.getColumnModel().getColumn(0).setPreferredWidth(50);
            tablaEnvios.getColumnModel().getColumn(1).setMinWidth(60);
            tablaEnvios.getColumnModel().getColumn(1).setPreferredWidth(60);
            tablaEnvios.getColumnModel().getColumn(3).setMinWidth(60);
            tablaEnvios.getColumnModel().getColumn(3).setPreferredWidth(60);
            tablaEnvios.getColumnModel().getColumn(4).setMinWidth(60);
            tablaEnvios.getColumnModel().getColumn(4).setPreferredWidth(60);
        }

        idRutaLabel.setFont(new java.awt.Font("C059", 1, 14)); // NOI18N
        idRutaLabel.setText("idRuta");

        paisDLabel.setFont(new java.awt.Font("C059", 1, 14)); // NOI18N
        paisDLabel.setText("Pais");

        precioDestinoLabel.setFont(new java.awt.Font("C059", 1, 14)); // NOI18N
        precioDestinoLabel.setText("Precio");

        destinoDLabel.setFont(new java.awt.Font("C059", 1, 14)); // NOI18N
        destinoDLabel.setText("Destino");

        ciudadDestinoLabel.setFont(new java.awt.Font("C059", 1, 14)); // NOI18N
        ciudadDestinoLabel.setText("Ciudad");
        ciudadDestinoLabel.setToolTipText("");

        puntosCLabel.setFont(new java.awt.Font("C059", 1, 14)); // NOI18N
        puntosCLabel.setText("Puntos");

        enRutaLabel.setText("Paquetes en Ruta: ");

        enRutaLabelInfo.setFont(new java.awt.Font("C059", 1, 14)); // NOI18N
        enRutaLabelInfo.setText("Numero");

        rutaMonto.setText("Monto Total: ");

        rutaCosto.setText("Costo Total:");

        montoRuta.setFont(new java.awt.Font("C059", 1, 14)); // NOI18N
        montoRuta.setText("Monto");

        costoRuta.setFont(new java.awt.Font("C059", 1, 14)); // NOI18N
        costoRuta.setText("Costo");

        rendimientoLabel.setText("Rendimiento: ");

        rendimientoInfo.setFont(new java.awt.Font("C059", 1, 14)); // NOI18N
        rendimientoInfo.setText("Rend");

        noRutaLabel.setText("Paquetes Fuera de Ruta: ");

        Numero.setFont(new java.awt.Font("C059", 1, 14)); // NOI18N
        Numero.setText("Numero");

        montoLabel.setText("Monto Total:");
        montoLabel.setToolTipText("");

        costoLabel.setText("Costo Total:");

        rendimientoNoLabel.setText("Rendimiento");

        montoNoLabel.setFont(new java.awt.Font("C059", 1, 14)); // NOI18N
        montoNoLabel.setText("Monto");

        costoNoLabel.setFont(new java.awt.Font("C059", 1, 14)); // NOI18N
        costoNoLabel.setText("Costo");

        rendimientoNoLabelInfo.setFont(new java.awt.Font("C059", 1, 14)); // NOI18N
        rendimientoNoLabelInfo.setText("Rendimiento");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rendimientoNoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rendimientoNoLabelInfo))
                    .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paquetesLabel)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(puntosControlLabel)
                        .addComponent(scrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(precioLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(precioDestinoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(49, 49, 49))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(paisLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(rutaLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(idRutaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                        .addComponent(paisDLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(puntosLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(puntosCLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(ciudadLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(destinoLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(destinoDLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                                        .addComponent(ciudadDestinoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(enRutaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enRutaLabelInfo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(rendimientoLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(rutaMonto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(montoRuta)
                                .addGap(32, 32, 32)
                                .addComponent(rutaCosto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(costoRuta))
                            .addComponent(rendimientoInfo)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(noRutaLabel)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(montoLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(montoNoLabel)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(costoLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(costoNoLabel))
                            .addComponent(Numero))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rutaLabel)
                    .addComponent(destinoLabel)
                    .addComponent(idRutaLabel)
                    .addComponent(destinoDLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(paisLabel)
                    .addComponent(paisDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ciudadLabel)
                    .addComponent(ciudadDestinoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precioLabel)
                    .addComponent(puntosLabel)
                    .addComponent(precioDestinoLabel)
                    .addComponent(puntosCLabel))
                .addGap(18, 18, 18)
                .addComponent(puntosControlLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(paquetesLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enRutaLabel)
                    .addComponent(enRutaLabelInfo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rutaMonto)
                    .addComponent(montoRuta)
                    .addComponent(rutaCosto)
                    .addComponent(costoRuta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rendimientoLabel)
                    .addComponent(rendimientoInfo))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noRutaLabel)
                    .addComponent(Numero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(montoLabel)
                    .addComponent(costoLabel)
                    .addComponent(montoNoLabel)
                    .addComponent(costoNoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rendimientoNoLabel)
                    .addComponent(rendimientoNoLabelInfo))
                .addContainerGap(52, Short.MAX_VALUE))
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

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Closes the dialog
     */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog

    public void inicializarComponentes(){
        rutaLabel.setText("idRuta: ");
        idRutaLabel.setText("" + ruta.getIdRutas());
        destinoLabel.setText("Destino: ");
        destinoDLabel.setText("" + ruta.getCod_D());
        paisLabel.setText("Pais: ");
        paisDLabel.setText(ruta.getPais());
        ciudadLabel.setText("Ciudad: ");
        ciudadDestinoLabel.setText(ruta.getCiudad());
        precioLabel.setText("Precio de Destino: ");
        precioDestinoLabel.setText("" + ruta.getPrecio());
        puntosLabel.setText("Puntos de Control: ");
        puntosCLabel.setText("" + ruta.getPuntosC());
        
        try{
            String query1 = "SELECT * FROM puntosDeControl WHERE codigo = " + "\"" + ruta.getPc1() + "\"";
            sistema.MostrarTabla("puntosDeControl", query1);
            puntosObservable.addAll(sistema.getPuntosDeControl());
            String query2 = "SELECT * FROM puntosDeControl WHERE codigo = " + "\"" + ruta.getPc2() + "\"";
            sistema.MostrarTabla("puntosDeControl", query2);
            puntosObservable.addAll(sistema.getPuntosDeControl());            
            String query3 = "SELECT * FROM puntosDeControl WHERE codigo = " + "\"" + ruta.getPc3() + "\"";
            sistema.MostrarTabla("puntosDeControl", query3);
            puntosObservable.addAll(sistema.getPuntosDeControl());
            String query4 = "SELECT * FROM puntosDeControl WHERE codigo = " + "\"" + ruta.getPc4() + "\"";
            sistema.MostrarTabla("puntosDeControl", query4);
            puntosObservable.addAll(sistema.getPuntosDeControl());
            String query5 = "SELECT * FROM puntosDeControl WHERE codigo = " + "\"" + ruta.getPc5() + "\"";
            sistema.MostrarTabla("puntosDeControl", query5);
            puntosObservable.addAll(sistema.getPuntosDeControl());            
        }catch(NullPointerException ex){}
        
        String query = "SELECT * FROM envios WHERE id_Ruta = " + ruta.getIdRutas() + " ORDER BY ubicacion";
        sistema.MostrarTabla("envios", query);
        enviosObservable.addAll(sistema.getEnvios());
        
        double costoRuta = 0, costoNoRuta = 0;
        double montoRuta = 0, montoNoRuta = 0;
        int numerosRuta = 0, numerosNoRuta = 0;
        for (int i=0; i<enviosObservable.size(); i++){
            if(!enviosObservable.get(i).getUbicacion().equals("Bod. Destino") && !enviosObservable.get(i).getUbicacion().equals("Entregado")){
                costoRuta += enviosObservable.get(i).getCosto();
                montoRuta += enviosObservable.get(i).getMontoTotal();
                numerosRuta++;
            }else{
                costoNoRuta += enviosObservable.get(i).getCosto();
                montoNoRuta += enviosObservable.get(i).getMontoTotal();
                numerosNoRuta ++;
            }
        }
        costoRuta = Math.round(costoRuta*10)/10d;
        montoRuta = Math.round(montoRuta*10)/10d;
        costoNoRuta = Math.round(costoNoRuta*10)/10d;
        montoNoRuta = Math.round(montoNoRuta*10)/10d;
        double rendimiento = montoRuta - costoRuta;
        rendimiento = Math.round(rendimiento*10)/10d;
        double rendimientoNo = montoNoRuta - costoNoRuta;
        rendimientoNo = Math.round(rendimientoNo*10)/10d;
        enRutaLabelInfo.setText("" + numerosRuta);
        this.montoRuta.setText("" + montoRuta);
        this.costoRuta.setText("" + costoRuta);
        rendimientoInfo.setText("" + rendimiento);
        Numero.setText("" + numerosNoRuta);
        montoNoLabel.setText("" + montoNoRuta);
        costoNoLabel.setText("" + costoNoRuta);
        rendimientoNoLabelInfo.setText("" + rendimientoNo);
        
        
        
        
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Numero;
    private javax.swing.JLabel ciudadDestinoLabel;
    private javax.swing.JLabel ciudadLabel;
    private javax.swing.JLabel costoLabel;
    private javax.swing.JLabel costoNoLabel;
    private javax.swing.JLabel costoRuta;
    private javax.swing.JLabel destinoDLabel;
    private javax.swing.JLabel destinoLabel;
    private javax.swing.JLabel enRutaLabel;
    private javax.swing.JLabel enRutaLabelInfo;
    private javax.swing.JLabel idRutaLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel montoLabel;
    private javax.swing.JLabel montoNoLabel;
    private javax.swing.JLabel montoRuta;
    private javax.swing.JLabel noRutaLabel;
    private javax.swing.JLabel paisDLabel;
    private javax.swing.JLabel paisLabel;
    private javax.swing.JLabel paquetesLabel;
    private javax.swing.JLabel precioDestinoLabel;
    private javax.swing.JLabel precioLabel;
    private javax.swing.JLabel puntosCLabel;
    private javax.swing.JLabel puntosControlLabel;
    private javax.swing.JLabel puntosLabel;
    private javax.swing.JLabel rendimientoInfo;
    private javax.swing.JLabel rendimientoLabel;
    private javax.swing.JLabel rendimientoNoLabel;
    private javax.swing.JLabel rendimientoNoLabelInfo;
    private javax.swing.JLabel rutaCosto;
    private javax.swing.JLabel rutaLabel;
    private javax.swing.JLabel rutaMonto;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JScrollPane scrollPane1;
    private javax.swing.JTable tablaEnvios;
    private javax.swing.JTable tablaPuntos;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    public ObservableList<PuntosDeControl> getPuntosObservable() {
        return puntosObservable;
    }

    public void setPuntosObservable(ObservableList<PuntosDeControl> puntosObservable) {
        this.puntosObservable = puntosObservable;
    }

    public ObservableList<Envios> getEnviosObservable() {
        return enviosObservable;
    }

    public void setEnviosObservable(ObservableList<Envios> enviosObservable) {
        this.enviosObservable = enviosObservable;
    }
}
