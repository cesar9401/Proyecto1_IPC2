
package proyecto;

import javax.swing.JOptionPane;

/**
 *
 * @author cesar31
 */
public class NuevoUsuarioDialog extends java.awt.Dialog {

    Sistema sistema;
    public NuevoUsuarioDialog(java.awt.Frame parent, Sistema sistema) {
        super(parent, true);
        this.sistema = sistema;
        initComponents();
    }
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nuevoUsuarioPanel = new javax.swing.JPanel();
        nombreLabel = new javax.swing.JLabel();
        nombreText = new javax.swing.JTextField();
        apellidosLabel = new javax.swing.JLabel();
        apellidosText = new javax.swing.JTextField();
        usuarioLabel = new javax.swing.JLabel();
        usuarioText = new javax.swing.JTextField();
        tipoLabel = new javax.swing.JLabel();
        tipoCombo = new javax.swing.JComboBox<>();
        passwordLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        confirmarLabel = new javax.swing.JLabel();
        confirmarField = new javax.swing.JPasswordField();
        confirmarBoton = new javax.swing.JButton();
        cancelarUsuario = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(535, 225));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        nombreLabel.setText("Nombre:");

        nombreText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreTextKeyTyped(evt);
            }
        });

        apellidosLabel.setText("Apellidos:");

        apellidosText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apellidosTextKeyTyped(evt);
            }
        });

        usuarioLabel.setText("Usuario:");

        usuarioText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                usuarioTextKeyTyped(evt);
            }
        });

        tipoLabel.setText("Tipo:");

        tipoCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Operador", "Recepcionista" }));

        passwordLabel.setText("Contraseña:");

        passwordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passwordFieldKeyTyped(evt);
            }
        });

        confirmarLabel.setText("Confirmar");

        confirmarField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                confirmarFieldKeyTyped(evt);
            }
        });

        confirmarBoton.setText("Confirmar");
        confirmarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarBotonActionPerformed(evt);
            }
        });

        cancelarUsuario.setText("Cancelar");
        cancelarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout nuevoUsuarioPanelLayout = new javax.swing.GroupLayout(nuevoUsuarioPanel);
        nuevoUsuarioPanel.setLayout(nuevoUsuarioPanelLayout);
        nuevoUsuarioPanelLayout.setHorizontalGroup(
            nuevoUsuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nuevoUsuarioPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(nuevoUsuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(nuevoUsuarioPanelLayout.createSequentialGroup()
                        .addComponent(nombreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombreText, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(nuevoUsuarioPanelLayout.createSequentialGroup()
                        .addComponent(usuarioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(usuarioText, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(nuevoUsuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(confirmarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(nuevoUsuarioPanelLayout.createSequentialGroup()
                            .addComponent(passwordLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(51, 51, 51)
                .addGroup(nuevoUsuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(nuevoUsuarioPanelLayout.createSequentialGroup()
                        .addComponent(confirmarLabel)
                        .addGap(18, 18, 18)
                        .addComponent(confirmarField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(nuevoUsuarioPanelLayout.createSequentialGroup()
                        .addGroup(nuevoUsuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(apellidosLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tipoLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(nuevoUsuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tipoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(apellidosText, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(cancelarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        nuevoUsuarioPanelLayout.setVerticalGroup(
            nuevoUsuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nuevoUsuarioPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(nuevoUsuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreLabel)
                    .addComponent(nombreText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellidosLabel)
                    .addComponent(apellidosText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(nuevoUsuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usuarioLabel)
                    .addComponent(usuarioText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipoLabel)
                    .addComponent(tipoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(nuevoUsuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(nuevoUsuarioPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(nuevoUsuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passwordLabel)
                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(nuevoUsuarioPanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(nuevoUsuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(confirmarLabel)
                            .addComponent(confirmarField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(nuevoUsuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(confirmarBoton)
                    .addComponent(cancelarUsuario))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nuevoUsuarioPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nuevoUsuarioPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void nombreTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreTextKeyTyped
        if(nombreText.getText().length() == 30){
            evt.consume();
        }
    }//GEN-LAST:event_nombreTextKeyTyped

    private void apellidosTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellidosTextKeyTyped
        if(apellidosText.getText().length() == 20){
            evt.consume();
        }
    }//GEN-LAST:event_apellidosTextKeyTyped

    private void usuarioTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usuarioTextKeyTyped
        if(usuarioText.getText().length() == 10){
            evt.consume();
        }
    }//GEN-LAST:event_usuarioTextKeyTyped

    private void passwordFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordFieldKeyTyped
        if(passwordField.getPassword().length == 10){
            evt.consume();
        }
    }//GEN-LAST:event_passwordFieldKeyTyped

    private void confirmarFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_confirmarFieldKeyTyped
        if(confirmarField.getPassword().length == 10){
            evt.consume();
        }
    }//GEN-LAST:event_confirmarFieldKeyTyped

    private void confirmarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarBotonActionPerformed
        boolean usuarioOcupado = false;
        boolean passwordEqual = false;
        String tipoUsuario;

        if(tipoCombo.getSelectedIndex() == 0){
            tipoUsuario = "Administrador";
        }else if(tipoCombo.getSelectedIndex() == 1){
            tipoUsuario = "Operador";
        }else{
            tipoUsuario = "Recepcionista";
        }

        if(!nombreText.getText().equals("") && !apellidosText.getText().equals("") && !usuarioText.getText().equals("") && !passwordField.getText().equals("") && !confirmarField.getText().equals("")){
            if(sistema.VerificarOcupado("usuarios", "usuario", usuarioText.getText(), usuarioOcupado)){
                JOptionPane.showMessageDialog(this, "Usuario no disponible, pruebe con otro", "Error", JOptionPane.ERROR_MESSAGE);
                usuarioOcupado = true;
                usuarioText.setText(null);
            }
            if(!passwordField.getText().equals(confirmarField.getText())){
                JOptionPane.showMessageDialog(this, "Las contraseñas deben coincidir", "Password is Wrong", JOptionPane.ERROR_MESSAGE);
                passwordField.setText(null);
                confirmarField.setText(null);
                passwordEqual = true;
            }
            if(!usuarioOcupado && !passwordEqual){
                String query = "INSERT INTO usuarios VALUES("
                + "\""+usuarioText.getText()+"\", "
                + "\""+passwordField.getText()+"\", "
                + "\""+tipoUsuario+"\", "
                + "\""+nombreText.getText()+"\", "
                + "\""+apellidosText.getText()+"\")";
                sistema.IngresarEliminarEnTabla(query);
                JOptionPane.showMessageDialog(this, "Usuario creado con exito", "Información", JOptionPane.INFORMATION_MESSAGE);
                this.setVisible(false);
                sistema.inicio.admin.getUsuariosObservable().clear();
                sistema.MostrarTabla("usuarios", "");
            }
        }else{
            JOptionPane.showMessageDialog(this, "Ingrese los datos que se le piden", "Error", JOptionPane.ERROR_MESSAGE );
        }
    }//GEN-LAST:event_confirmarBotonActionPerformed

    private void cancelarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarUsuarioActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_cancelarUsuarioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apellidosLabel;
    private javax.swing.JTextField apellidosText;
    private javax.swing.JButton cancelarUsuario;
    private javax.swing.JButton confirmarBoton;
    private javax.swing.JPasswordField confirmarField;
    private javax.swing.JLabel confirmarLabel;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JTextField nombreText;
    private javax.swing.JPanel nuevoUsuarioPanel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JComboBox<String> tipoCombo;
    private javax.swing.JLabel tipoLabel;
    private javax.swing.JLabel usuarioLabel;
    private javax.swing.JTextField usuarioText;
    // End of variables declaration//GEN-END:variables
}
