package proyecto;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author cesar31
 */
public class VentanaInicioSesion extends javax.swing.JFrame {

    Sistema sistema;
    VentanaAdministrador admin;
    VentanaRecepcionista recepcionista;
    VentanaOperador operador;
    
    public VentanaInicioSesion(Sistema sistema) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.sistema = sistema;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inicioLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        usuarioText = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        iniciarBoton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio de Sesión");

        inicioLabel.setText("Iniciar Sesión");

        jLabel1.setText("Usuario");

        usuarioText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                usuarioTextKeyTyped(evt);
            }
        });

        passwordLabel.setText("Password");

        passwordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passwordFieldKeyTyped(evt);
            }
        });

        iniciarBoton.setText("Log In");
        iniciarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarBotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(iniciarBoton)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inicioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usuarioText, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(passwordField))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(inicioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usuarioText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(iniciarBoton)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iniciarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarBotonActionPerformed
        if(!usuarioText.getText().equals("") && !passwordField.getText().equals("")){
            String usuario = usuarioText.getText();
            String password = passwordField.getText();
            boolean conectado = false;
                
            sistema.conectar.conectar();
            try{
                Statement declaracion = sistema.conectar.getConnection().createStatement();
                ResultSet resultado = declaracion.executeQuery("SELECT * FROM usuarios");
                
                while(resultado.next()){
                    //System.out.printf("%s - %s\n", resultado.getString("usuario"), resultado.getString("contraseña"));
                    if(resultado.getString("usuario").equals(usuario) && resultado.getString("contraseña").equals(password)){
                        System.out.println("Bienvenido "+usuario);
                        usuarioText.setText("");
                        passwordField.setText("");
                        //JOptionPane.showMessageDialog(this, "Iniciando sesion...", "Welcome", JOptionPane.INFORMATION_MESSAGE);
                        conectado = true;
                        if(resultado.getString("tipoUsuario").equals("Administrador")){
                            admin = new VentanaAdministrador(sistema, usuario);
                            admin.setTitle("Administracion - "+resultado.getString("usuario"));
                            admin.setLocationRelativeTo(null);
                            admin.setVisible(true);
                        }
                        if(resultado.getString("tipoUsuario").equals("Operador")){
                            operador = new VentanaOperador(sistema, usuario);
                            operador.setTitle("Operador - "+resultado.getString("usuario"));
                            operador.setLocationRelativeTo(null);
                            operador.setVisible(true);
                        }
                        if(resultado.getString("tipoUsuario").equals("Recepcionista")){
                            recepcionista = new VentanaRecepcionista(sistema, usuario);
                            recepcionista.setTitle("Recepcionista - "+resultado.getString("usuario"));
                            recepcionista.setLocationRelativeTo(null);
                            recepcionista.setVisible(true);
                        }
                        this.setVisible(false);
                        break;
                    }
                }
                
                if (!conectado){
                    usuarioText.setText("");
                    passwordField.setText("");
                    JOptionPane.showMessageDialog(this, "Usuario y/o contraseña incorrectas", "Error", JOptionPane.ERROR_MESSAGE);
                }
                
            }catch(SQLException ex){
                
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        
            sistema.conectar.desconectar();
        }else{
            JOptionPane.showMessageDialog(this, "Ingrese su usuario y contraseña", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_iniciarBotonActionPerformed

    private void usuarioTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usuarioTextKeyTyped
        if(usuarioText.getText().length() == 10){
            evt.consume();
        }
    }//GEN-LAST:event_usuarioTextKeyTyped

    private void passwordFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordFieldKeyTyped
        if(passwordField.getText().length() == 10){
            evt.consume();
        }
    }//GEN-LAST:event_passwordFieldKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton iniciarBoton;
    private javax.swing.JLabel inicioLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField usuarioText;
    // End of variables declaration//GEN-END:variables
}
