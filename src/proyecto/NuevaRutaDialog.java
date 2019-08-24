
package proyecto;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.jdesktop.observablecollections.ObservableCollections;
import org.jdesktop.observablecollections.ObservableList;

/**
 *
 * @author cesar31
 */
public class NuevaRutaDialog extends java.awt.Dialog {

    Sistema sistema;
    private int contadorPuntos = 0;
    private ObservableList<PuntosDeControl> puntosObservable;
    private List<PuntosDeControl> listadoPuntos = new ArrayList<>();
    private ObservableList<PuntosDeControl> puntosRutaObservable;
    private List<PuntosDeControl> puntosRuta = new ArrayList<>();
    private PuntosDeControl puntoSeleccionado;
    private double precio = 0;
    
    public NuevaRutaDialog(java.awt.Frame parent, Sistema sistema) {
        super(parent, true);
        this.sistema = sistema;
        puntosObservable = ObservableCollections.observableList(listadoPuntos);
        puntosRutaObservable = ObservableCollections.observableList(puntosRuta);
        initComponents();
        sistema.setContadorRutas(0);
        sistema.MostrarTabla("rutas", "");
        sistema.setContadorRutas(sistema.getContadorRutas() + 1);
        rutaLabel.setText("Ruta # "+(sistema.getContadorRutas()));
        AgregarPuntoBoton.setEnabled(false);
        AceparBoton.setEnabled(false);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jPanel1 = new javax.swing.JPanel();
        rutaLabel = new javax.swing.JLabel();
        codigoL = new javax.swing.JLabel();
        codigoDT = new javax.swing.JTextField();
        nombreCiudadL = new javax.swing.JLabel();
        nombreCiudadT = new javax.swing.JTextField();
        precioL = new javax.swing.JLabel();
        precioText = new javax.swing.JTextField();
        VerificarRuta = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPuntosRuta = new javax.swing.JTable();
        AgregarPuntoBoton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        AceparBoton = new javax.swing.JButton();
        cancelarRuta = new javax.swing.JButton();
        paisLabel = new javax.swing.JLabel();
        paisText = new javax.swing.JTextField();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        rutaLabel.setText("Ruta #");

        codigoL.setText("Codigo de Destino");

        codigoDT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                codigoDTKeyTyped(evt);
            }
        });

        nombreCiudadL.setText("Nombre Ciudad");

        nombreCiudadT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreCiudadTKeyTyped(evt);
            }
        });

        precioL.setText("Precio Destino");

        precioText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                precioTextKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                precioTextKeyReleased(evt);
            }
        });

        VerificarRuta.setText("Verificar");
        VerificarRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerificarRutaActionPerformed(evt);
            }
        });

        org.jdesktop.beansbinding.ELProperty eLProperty = org.jdesktop.beansbinding.ELProperty.create("${puntosObservable}");
        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, eLProperty, tablaPuntosRuta);
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
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tarifa}"));
        columnBinding.setColumnName("Tarifa");
        columnBinding.setColumnClass(Double.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tamañoBodega}"));
        columnBinding.setColumnName("Tamaño Bodega");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${encargado}"));
        columnBinding.setColumnName("Encargado");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${puntoSeleccionado}"), tablaPuntosRuta, org.jdesktop.beansbinding.BeanProperty.create("selectedElement"));
        bindingGroup.addBinding(binding);

        jScrollPane1.setViewportView(tablaPuntosRuta);
        if (tablaPuntosRuta.getColumnModel().getColumnCount() > 0) {
            tablaPuntosRuta.getColumnModel().getColumn(0).setResizable(false);
            tablaPuntosRuta.getColumnModel().getColumn(1).setResizable(false);
            tablaPuntosRuta.getColumnModel().getColumn(2).setResizable(false);
            tablaPuntosRuta.getColumnModel().getColumn(3).setResizable(false);
            tablaPuntosRuta.getColumnModel().getColumn(4).setResizable(false);
            tablaPuntosRuta.getColumnModel().getColumn(5).setResizable(false);
        }

        AgregarPuntoBoton.setText("Agregar");
        AgregarPuntoBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarPuntoBotonActionPerformed(evt);
            }
        });

        eLProperty = org.jdesktop.beansbinding.ELProperty.create("${puntosRutaObservable}");
        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, eLProperty, jTable2);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codigo}"));
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
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tarifa}"));
        columnBinding.setColumnName("Tarifa");
        columnBinding.setColumnClass(Double.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tamañoBodega}"));
        columnBinding.setColumnName("Tamaño Bodega");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${encargado}"));
        columnBinding.setColumnName("Encargado");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
            jTable2.getColumnModel().getColumn(2).setResizable(false);
            jTable2.getColumnModel().getColumn(3).setResizable(false);
            jTable2.getColumnModel().getColumn(4).setResizable(false);
            jTable2.getColumnModel().getColumn(5).setResizable(false);
        }

        AceparBoton.setText("Aceptar");
        AceparBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceparBotonActionPerformed(evt);
            }
        });

        cancelarRuta.setText("Cancelar");
        cancelarRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarRutaActionPerformed(evt);
            }
        });

        paisLabel.setText("Pais");

        paisText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                paisTextKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(AceparBoton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelarRuta)
                        .addGap(217, 217, 217))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(rutaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(165, 165, 165))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(VerificarRuta)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(codigoL)
                            .addComponent(nombreCiudadL))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(codigoDT, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(102, 102, 102)
                                .addComponent(paisLabel))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(nombreCiudadT, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(precioL)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(precioText, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(paisText, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(AgregarPuntoBoton)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(rutaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(codigoL)
                        .addComponent(codigoDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(paisText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(paisLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreCiudadT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreCiudadL)
                    .addComponent(precioL)
                    .addComponent(precioText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(VerificarRuta)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AgregarPuntoBoton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AceparBoton)
                    .addComponent(cancelarRuta))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void VerificarRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerificarRutaActionPerformed

        if(!codigoDT.getText().equals("") && !paisText.getText().equals("") && !nombreCiudadT.getText().equals("") && !precioText.getText().equals("")){
            boolean codigoOcupado = false;
            if(!sistema.VerificarOcupado("rutas", "cod_D", codigoDT.getText(), codigoOcupado)){

                codigoDT.setEnabled(false);
                paisText.setEnabled(false);
                nombreCiudadT.setEnabled(false);
                precioText.setEnabled(false);
                VerificarRuta.setEnabled(false);
                sistema.MostrarTabla("puntosDeControl", "");
                puntosObservable.addAll(sistema.getPuntosDeControl());
                AgregarPuntoBoton.setEnabled(true);
            }else{
                JOptionPane.showMessageDialog(this, "Ya existe una ruta hacia la ciudad con el codigo que ingreso", "Campo Vacío", JOptionPane.ERROR_MESSAGE);
                codigoDT.setText(null);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Todos los campos deben de llenarse", "Campo Vacío", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_VerificarRutaActionPerformed

    private void AgregarPuntoBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarPuntoBotonActionPerformed
        if(puntoSeleccionado != null){
            puntosRutaObservable.add(puntoSeleccionado);
            puntosObservable.remove(tablaPuntosRuta.getSelectedRow());
            contadorPuntos++;
        }else{
            JOptionPane.showMessageDialog(this, "Selecciones algun punto de control", "Error", JOptionPane.ERROR_MESSAGE);
        }
        if(contadorPuntos == 1){
            AceparBoton.setEnabled(true);
        }
        if(contadorPuntos == 5){
            JOptionPane.showMessageDialog(this, "Se han agregado los 5 puntos de control necesarios", "Informacion", JOptionPane.INFORMATION_MESSAGE);
            AgregarPuntoBoton.setEnabled(false);
        }
    }//GEN-LAST:event_AgregarPuntoBotonActionPerformed

    private void AceparBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceparBotonActionPerformed
        String query = "INSERT INTO rutas VALUES("
                + sistema.getContadorRutas()+", "
                + "\""+codigoDT.getText()+"\", "
                + "\""+paisText.getText()+"\", "
                + "\""+nombreCiudadT.getText()+"\", "
                + precio+", "
                + contadorPuntos+", ";
        
        for (int i=0; i<contadorPuntos; i++) {
            if(i==4){
                query = query +"\""+puntosRutaObservable.get(i).getCodigo()+"\")";
            }else{
                query = query +"\""+puntosRutaObservable.get(i).getCodigo()+"\", ";
            }
        }
        
        int j = 5 - contadorPuntos;
        for (int i=0; i<j; i++) {
            if(i==(j-1)){
                query = query + null +")";
            }else{
                query = query + null+", ";
            }
        }
        System.out.println(query);
        sistema.IngresarEliminarEnTabla(query);
        JOptionPane.showMessageDialog(this, "Ruta ingresada con exito", "Información", JOptionPane.INFORMATION_MESSAGE);
        this.setVisible(false);
        sistema.inicio.admin.getRutaObservable().clear();
        sistema.MostrarTabla("rutas", "");
        sistema.inicio.admin.getRutaObservable().addAll(sistema.getRutas());
    }//GEN-LAST:event_AceparBotonActionPerformed

    private void cancelarRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarRutaActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_cancelarRutaActionPerformed

    private void codigoDTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigoDTKeyTyped
        if(codigoDT.getText().length() == 20){
            evt.consume();
        }
    }//GEN-LAST:event_codigoDTKeyTyped

    private void nombreCiudadTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreCiudadTKeyTyped
        if(nombreCiudadT.getText().length() == 20){
            evt.consume();
        }
    }//GEN-LAST:event_nombreCiudadTKeyTyped

    private void precioTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precioTextKeyTyped
        if(precioText.getText().length() == 11){
            evt.consume();
        }
    }//GEN-LAST:event_precioTextKeyTyped

    private void paisTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paisTextKeyTyped
        if(paisText.getText().length() == 20){
            evt.consume();
        }
    }//GEN-LAST:event_paisTextKeyTyped

    private void precioTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precioTextKeyReleased
        if(!precioText.getText().equals("")){
            try{
                precio = Double.parseDouble(precioText.getText());
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(this, "El formato ingresado no es valido", "Error", HEIGHT);
                precioText.setText(null);
            }
        }else{
            precio = 0;
        }
    }//GEN-LAST:event_precioTextKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AceparBoton;
    private javax.swing.JButton AgregarPuntoBoton;
    private javax.swing.JButton VerificarRuta;
    private javax.swing.JButton cancelarRuta;
    private javax.swing.JTextField codigoDT;
    private javax.swing.JLabel codigoL;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel nombreCiudadL;
    private javax.swing.JTextField nombreCiudadT;
    private javax.swing.JLabel paisLabel;
    private javax.swing.JTextField paisText;
    private javax.swing.JLabel precioL;
    private javax.swing.JTextField precioText;
    private javax.swing.JLabel rutaLabel;
    private javax.swing.JTable tablaPuntosRuta;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    public ObservableList<PuntosDeControl> getPuntosRutaObservable() {
        return puntosRutaObservable;
    }

    public void setPuntosRutaObservable(ObservableList<PuntosDeControl> puntosRutaObservable) {
        this.puntosRutaObservable = puntosRutaObservable;
    }
    
    public ObservableList<PuntosDeControl> getPuntosObservable() {
        return puntosObservable;
    }

    public void setPuntosObservable(ObservableList<PuntosDeControl> puntosObservable) {
        this.puntosObservable = puntosObservable;
    }

    public PuntosDeControl getPuntoSeleccionado() {
        return puntoSeleccionado;
    }

    public void setPuntoSeleccionado(PuntosDeControl puntoSeleccionado) {
        this.puntoSeleccionado = puntoSeleccionado;
    }
}
