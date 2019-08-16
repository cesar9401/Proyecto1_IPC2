/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class NuevoPuntoDialog extends java.awt.Dialog {

    Sistema sistema;
    private Usuario usuarioSeleccionado;
    private ObservableList<Usuario> usuariosObservableOp;
    private List<Usuario> listadoUsuarioOp = new ArrayList<>();
    
    public NuevoPuntoDialog(java.awt.Frame parent, Sistema sistema) {
        super(parent, true);
        this.sistema = sistema;
        usuariosObservableOp = ObservableCollections.observableList(listadoUsuarioOp);
        llenarListado();
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        nuevoPuntoPanel = new javax.swing.JPanel();
        codigoPuntoL = new javax.swing.JLabel();
        codigoText = new javax.swing.JTextField();
        ciudadL = new javax.swing.JLabel();
        ciudadText = new javax.swing.JTextField();
        tarifaL = new javax.swing.JLabel();
        tarifaText = new javax.swing.JTextField();
        tamañoL = new javax.swing.JLabel();
        tamañoCombo = new javax.swing.JComboBox<>();
        confirmarPunto = new javax.swing.JButton();
        cancelarPunto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(480, 310));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        nuevoPuntoPanel.setMinimumSize(new java.awt.Dimension(480, 310));

        codigoPuntoL.setText("Codigo:");

        codigoText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                codigoTextKeyTyped(evt);
            }
        });

        ciudadL.setText("Ciudad: ");

        ciudadText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ciudadTextKeyTyped(evt);
            }
        });

        tarifaL.setText("Tarifa:");

        tarifaText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tarifaTextKeyTyped(evt);
            }
        });

        tamañoL.setText("Tamaño de Bodega:");

        tamañoCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4", "5", "6", "7", "8", "9", "10" }));

        confirmarPunto.setText("Confirmar");
        confirmarPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarPuntoActionPerformed(evt);
            }
        });

        cancelarPunto.setText("Cancelar");
        cancelarPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarPuntoActionPerformed(evt);
            }
        });

        org.jdesktop.beansbinding.ELProperty eLProperty = org.jdesktop.beansbinding.ELProperty.create("${usuariosObservableOp}");
        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, eLProperty, jTable1);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${usuario}"));
        columnBinding.setColumnName("Usuario");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tipoUsuario}"));
        columnBinding.setColumnName("Puesto");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nombre}"));
        columnBinding.setColumnName("Nombre");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${apellidos}"));
        columnBinding.setColumnName("Apellidos");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${usuarioSeleccionado}"), jTable1, org.jdesktop.beansbinding.BeanProperty.create("selectedElement"));
        bindingGroup.addBinding(binding);

        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout nuevoPuntoPanelLayout = new javax.swing.GroupLayout(nuevoPuntoPanel);
        nuevoPuntoPanel.setLayout(nuevoPuntoPanelLayout);
        nuevoPuntoPanelLayout.setHorizontalGroup(
            nuevoPuntoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nuevoPuntoPanelLayout.createSequentialGroup()
                .addGroup(nuevoPuntoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(nuevoPuntoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(nuevoPuntoPanelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, nuevoPuntoPanelLayout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addGroup(nuevoPuntoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tarifaL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(codigoPuntoL, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(nuevoPuntoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tarifaText, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                .addComponent(codigoText))
                            .addGap(30, 30, 30)
                            .addGroup(nuevoPuntoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(nuevoPuntoPanelLayout.createSequentialGroup()
                                    .addComponent(ciudadL, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ciudadText, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(nuevoPuntoPanelLayout.createSequentialGroup()
                                    .addComponent(tamañoL)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tamañoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(nuevoPuntoPanelLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(confirmarPunto)
                        .addGap(18, 18, 18)
                        .addComponent(cancelarPunto)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        nuevoPuntoPanelLayout.setVerticalGroup(
            nuevoPuntoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nuevoPuntoPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(nuevoPuntoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ciudadL)
                    .addComponent(ciudadText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigoPuntoL))
                .addGap(18, 18, 18)
                .addGroup(nuevoPuntoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tarifaL)
                    .addComponent(tarifaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tamañoL)
                    .addComponent(tamañoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(nuevoPuntoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmarPunto)
                    .addComponent(cancelarPunto))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nuevoPuntoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nuevoPuntoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void codigoTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigoTextKeyTyped
        if(codigoText.getText().length() == 12){
            evt.consume();
        }
    }//GEN-LAST:event_codigoTextKeyTyped

    private void ciudadTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ciudadTextKeyTyped
        if(ciudadText.getText().length() == 40){
            evt.consume();
        }
    }//GEN-LAST:event_ciudadTextKeyTyped

    private void tarifaTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tarifaTextKeyTyped
        if(tarifaText.getText().length() == 10){
            evt.consume();
        }
    }//GEN-LAST:event_tarifaTextKeyTyped

    private void confirmarPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarPuntoActionPerformed
        boolean codigoOcupado = false;

        if(!codigoText.getText().equals("") && !ciudadText.getText().equals("")){
            if(sistema.VerificarOcupado("puntosDeControl", "codigo", codigoText.getText(), codigoOcupado)){
                JOptionPane.showMessageDialog(this, "El codigo del punto de Control ya existe, pruebe con otro", "Error", JOptionPane.ERROR_MESSAGE);
                codigoOcupado = true;
                codigoText.setText(null);
            }else{
                if(usuarioSeleccionado != null){
                    
                    double tarifa = 0;
                    if(tarifaText.getText().equals("")){
                        sistema.MostrarTabla("precios");
                        for (int i=0; i<sistema.inicio.admin.getPreciosObservable().size(); i++) {
                            if(sistema.inicio.admin.getPreciosObservable().get(i).getTipoPago().equals("TarifaOperacion")){
                                tarifa = sistema.inicio.admin.getPreciosObservable().get(i).getPrecio();
                            }
                        }
                    }else{
                        tarifa = Double.parseDouble(tarifaText.getText());
                    }
                    sistema.inicio.admin.getPreciosObservable().clear();
                    
                    String query = "INSERT INTO puntosDeControl VALUES("
                        + "\""+codigoText.getText()+"\", "
                        + "\""+ciudadText.getText()+"\", "
                        + tarifa +", "
                        + (tamañoCombo.getSelectedIndex() + 4)+", "
                        + "\""+ usuarioSeleccionado.getUsuario()+"\")";
                    sistema.IngresarEliminarEnTabla(query);
                
                    String query2 = "CREATE TABLE ";
                    for (int i=0; i<codigoText.getText().length(); i++) {
                        if(codigoText.getText().charAt(i) == '-'){
                            query2 = query2 + "_";
                        }else{
                            query2 = query2 + codigoText.getText().charAt(i);
                        }
                    }
                    
                    query2 = query2 + "("
                        + "idRegistro int auto_increment, "
                        + "idEnvio int, "
                        + "idCliente bigint, "
                        + "nombreCliente varchar(50), "
                        + "idRuta int, "
                        + "name_D varchar(40), "
                        + "estado boolean default false, "
                        + "fechaIngreso datetime, "
                        + "fechaSalida datetime, "
                        + "costoTotal decimal(10,2), "
                        + "PRIMARY KEY(idRegistro), "
                        + "FOREIGN KEY(idEnvio) REFERENCES envios(idEnvios) "
                        + "ON DELETE CASCADE ON UPDATE CASCADE)Engine=InnoDB";
                    System.out.println(query2);
                    sistema.IngresarEliminarEnTabla(query2);
                    
                    JOptionPane.showMessageDialog(this, "Punto de control ingresado con exito", "Información", JOptionPane.INFORMATION_MESSAGE);
                    this.setVisible(false);
                    sistema.inicio.admin.getPuntosObservable().clear();
                    sistema.MostrarTabla("puntosDeControl");
                    
                }else{
                    JOptionPane.showMessageDialog(this, "Seleccione al operario que se hara cargo del punto de Control " + codigoText.getText(), "Seleccione un Usuario", JOptionPane.ERROR_MESSAGE);
                }
            }

        }else{
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_confirmarPuntoActionPerformed

    public void llenarListado(){
        sistema.MostrarTabla("usuarios");
        for (int i=0; i<sistema.inicio.admin.getUsuariosObservable().size(); i++) {
            if(sistema.inicio.admin.getUsuariosObservable().get(i).getTipoUsuario().equals("Operador")){
                usuariosObservableOp.add(sistema.inicio.admin.getUsuariosObservable().get(i));
            }
        }
        sistema.inicio.admin.getUsuariosObservable().clear();
    }
    
    
    private void cancelarPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarPuntoActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_cancelarPuntoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarPunto;
    private javax.swing.JLabel ciudadL;
    private javax.swing.JTextField ciudadText;
    private javax.swing.JLabel codigoPuntoL;
    private javax.swing.JTextField codigoText;
    private javax.swing.JButton confirmarPunto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel nuevoPuntoPanel;
    private javax.swing.JComboBox<String> tamañoCombo;
    private javax.swing.JLabel tamañoL;
    private javax.swing.JLabel tarifaL;
    private javax.swing.JTextField tarifaText;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    public Usuario getUsuarioSeleccionado() {
        return usuarioSeleccionado;
    }

    public void setUsuarioSeleccionado(Usuario usuarioSeleccionado) {
        this.usuarioSeleccionado = usuarioSeleccionado;
    }

    public ObservableList<Usuario> getUsuariosObservableOp() {
        return usuariosObservableOp;
    }

    public void setUsuariosObservableOp(ObservableList<Usuario> usuariosObservableOp) {
        this.usuariosObservableOp = usuariosObservableOp;
    }
}
