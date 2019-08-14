/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import javax.swing.JOptionPane;

/**
 *
 * @author cesar31
 */
public class NuevoPuntoDialog extends java.awt.Dialog {

    Sistema sistema;
    public NuevoPuntoDialog(java.awt.Frame parent, Sistema sistema) {
        super(parent, true);
        this.sistema = sistema;
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

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

        javax.swing.GroupLayout nuevoPuntoPanelLayout = new javax.swing.GroupLayout(nuevoPuntoPanel);
        nuevoPuntoPanel.setLayout(nuevoPuntoPanelLayout);
        nuevoPuntoPanelLayout.setHorizontalGroup(
            nuevoPuntoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nuevoPuntoPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(nuevoPuntoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(confirmarPunto)
                    .addGroup(nuevoPuntoPanelLayout.createSequentialGroup()
                        .addGroup(nuevoPuntoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tarifaL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(codigoPuntoL, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(nuevoPuntoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tarifaText, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(codigoText))))
                .addGap(30, 30, 30)
                .addGroup(nuevoPuntoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(nuevoPuntoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(nuevoPuntoPanelLayout.createSequentialGroup()
                            .addComponent(ciudadL, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ciudadText, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(nuevoPuntoPanelLayout.createSequentialGroup()
                            .addComponent(tamañoL)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tamañoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(cancelarPunto))
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
                .addGroup(nuevoPuntoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmarPunto)
                    .addComponent(cancelarPunto))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nuevoPuntoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nuevoPuntoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        if(!codigoText.getText().equals("") && !ciudadText.getText().equals("") && !tarifaText.getText().equals("")){
            if(sistema.VerificarOcupado("puntosDeControl", "codigo", codigoText.getText(), codigoOcupado)){
                JOptionPane.showMessageDialog(this, "El codigo del punto de Control ya existe, pruebe con otro", "Error", JOptionPane.ERROR_MESSAGE);
                codigoOcupado = true;
                codigoText.setText(null);
            }else{
                String query = "INSERT INTO puntosDeControl VALUES("
                + "\""+codigoText.getText()+"\", "
                + "\""+ciudadText.getText()+"\", "
                + Double.parseDouble(tarifaText.getText())+", "
                + (tamañoCombo.getSelectedIndex() + 4)+")";
                sistema.IngresarEliminarEnTabla(query);
                JOptionPane.showMessageDialog(this, "Punto de control ingresado con exito", "Información", JOptionPane.INFORMATION_MESSAGE);
                this.setVisible(false);
                sistema.inicio.admin.getPuntosObservable().clear();
                sistema.MostrarTabla("puntosDeControl");
            }

        }else{
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_confirmarPuntoActionPerformed

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
    private javax.swing.JPanel nuevoPuntoPanel;
    private javax.swing.JComboBox<String> tamañoCombo;
    private javax.swing.JLabel tamañoL;
    private javax.swing.JLabel tarifaL;
    private javax.swing.JTextField tarifaText;
    // End of variables declaration//GEN-END:variables
}
