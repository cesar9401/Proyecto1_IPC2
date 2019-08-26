
package proyecto;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author cesar31
 */
public class DatosCliente extends java.awt.Dialog {

    private Sistema sistema;
    private Envios envio;
    private Cliente cliente;
    private int nit = 0;
    private int telefono = 0;
    private int id = 0;
    
    public DatosCliente(java.awt.Frame parent, Sistema sistema, Envios envio) {
        super(parent, true);
        this.sistema = sistema;
        this.envio = envio;
        initComponents();
        sistema.MostrarTabla("clientes", "");
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        clienteLabel = new javax.swing.JLabel();
        idClienteText = new javax.swing.JTextField();
        nitLabel = new javax.swing.JLabel();
        nitClienteText = new javax.swing.JTextField();
        nombreLabel = new javax.swing.JLabel();
        nombreClienteText = new javax.swing.JTextField();
        telefonoLabel = new javax.swing.JLabel();
        telefonoClienteText = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        direccionLabel = new javax.swing.JLabel();
        emailClienteText = new javax.swing.JTextField();
        direccionClienteText = new javax.swing.JTextField();
        aceptarBoton = new javax.swing.JButton();
        cancelarBoton = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(470, 280));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        jPanel1.setPreferredSize(new java.awt.Dimension(470, 280));

        clienteLabel.setText("id Cliente");
        clienteLabel.setToolTipText("");

        idClienteText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idClienteTextKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                idClienteTextKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                idClienteTextKeyReleased(evt);
            }
        });

        nitLabel.setText("Nit");

        nitClienteText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nitClienteTextKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nitClienteTextKeyReleased(evt);
            }
        });

        nombreLabel.setText("Nombre");

        nombreClienteText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreClienteTextKeyTyped(evt);
            }
        });

        telefonoLabel.setText("Telefono");

        telefonoClienteText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telefonoClienteTextKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                telefonoClienteTextKeyReleased(evt);
            }
        });

        emailLabel.setText("Email");

        direccionLabel.setText("Dirección");

        emailClienteText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                emailClienteTextKeyTyped(evt);
            }
        });

        direccionClienteText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                direccionClienteTextKeyTyped(evt);
            }
        });

        aceptarBoton.setText("Aceptar");
        aceptarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarBotonActionPerformed(evt);
            }
        });

        cancelarBoton.setText("Cancelar");
        cancelarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(clienteLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idClienteText, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nitClienteText, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(emailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(telefonoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nombreLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nombreClienteText, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(telefonoClienteText, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(emailClienteText, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(direccionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(direccionClienteText, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(79, 79, 79))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(aceptarBoton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelarBoton)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clienteLabel)
                    .addComponent(idClienteText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nitLabel)
                    .addComponent(nitClienteText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefonoLabel)
                    .addComponent(telefonoClienteText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreLabel)
                    .addComponent(nombreClienteText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(emailClienteText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(direccionLabel)
                    .addComponent(direccionClienteText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aceptarBoton)
                    .addComponent(cancelarBoton))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void cancelarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBotonActionPerformed
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_cancelarBotonActionPerformed

    private void idClienteTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idClienteTextKeyTyped
        if(idClienteText.getText().length() == 11){
            evt.consume();
        }
    }//GEN-LAST:event_idClienteTextKeyTyped

    private void aceptarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarBotonActionPerformed
        if(id != 0 && !nombreClienteText.getText().equals("") && !direccionClienteText.getText().equals("")){
            if(cliente != null){
                sistema.conectar.conectar();
                try{
                    sistema.conectar.getConnection().setAutoCommit(false);
                    if(nit != cliente.getNit()){
                        cliente.setNit(nit);
                        String query1 = "UPDATE clientes SET nit = ? WHERE idCliente = ?";
                        PreparedStatement queryNit = sistema.conectar.getConnection().prepareStatement(query1);
                        queryNit.setInt(1, cliente.getNit());
                        queryNit.setInt(2, cliente.getId_Cliente());
                        queryNit.executeUpdate();
                        System.out.println(query1);
                    }
                    
                    if(telefono != cliente.getTelefono()){
                        cliente.setTelefono(telefono);
                        String query2 = "UPDATE clientes SET telefono = ? WHERE idCliente = ?";
                        PreparedStatement queryTelefono = sistema.conectar.getConnection().prepareStatement(query2);
                        queryTelefono.setInt(1, cliente.getTelefono());
                        queryTelefono.setInt(2, cliente.getId_Cliente());
                        queryTelefono.executeUpdate();
                        System.out.println(query2);
                    }
                    if(!nombreClienteText.getText().equals(cliente.getNombre())){
                        cliente.setNombre(nombreClienteText.getText());
                        String query3 = "UPDATE clientes SET nombre = ? WHERE idCliente = ?";
                        PreparedStatement queryNombre = sistema.conectar.getConnection().prepareStatement(query3);
                        queryNombre.setString(1, cliente.getNombre());
                        queryNombre.setInt(2, cliente.getId_Cliente());
                        queryNombre.executeUpdate();
                        System.out.println(query3);
                        
                    }
                    if(!emailClienteText.getText().equals(cliente.getEmail())){
                        cliente.setEmail(emailClienteText.getText());
                        String query4 = "UPDATE clientes SET email = ? WHERE idCliente = ?";
                        PreparedStatement queryEmail = sistema.conectar.getConnection().prepareStatement(query4);
                        queryEmail.setString(1, cliente.getEmail());
                        queryEmail.setInt(2, cliente.getId_Cliente());
                        queryEmail.executeUpdate();
                        System.out.println(query4);
                    }
                    if(!direccionClienteText.getText().equals(cliente.getDireccion())){
                        cliente.setDireccion(direccionClienteText.getText());
                        String query5 = "UPDATE clientes SET direccion = ? WHERE idCliente = ?";
                        PreparedStatement queryDireccion = sistema.conectar.getConnection().prepareStatement(query5);
                        queryDireccion.setString(1, cliente.getDireccion());
                        queryDireccion.setInt(2, cliente.getId_Cliente());
                        queryDireccion.executeUpdate();
                        System.out.println(query5);
                    }
                    
                    envio.setIdCliete(cliente.getId_Cliente());
                    
                    String query = "INSERT INTO envios VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                    PreparedStatement envios = sistema.conectar.getConnection().prepareStatement(query);
                    envios.setInt(1, envio.getIdEnvios());
                    envios.setInt(2, envio.getIdCliete());
                    envios.setDouble(3, envio.getPeso());
                    envios.setString(4, envio.getCategoria());
                    envios.setDate(5, envio.getIngreso());
                    envios.setBoolean(6, envio.isPriorizar());
                    envios.setInt(7, 1);
                    envios.setString(8, envio.getCod_D());
                    envios.setString(9, envio.getPais());
                    envios.setString(10, envio.getCiudad());
                    envios.setString(11, envio.getUbicacion());
                    envios.setDouble(12, envio.getMontoPriorizar());
                    envios.setDouble(13, envio.getMontoPeso());
                    envios.setDouble(14, envio.getMontoDestino());
                    envios.setDouble(15, envio.getMontoTotal()); 
                    envios.setDouble(16, 0);
                    envios.executeUpdate();
                    
                    sistema.conectar.getConnection().commit();
                    sistema.conectar.getConnection().setAutoCommit(true);
                    JOptionPane.showMessageDialog(this, "Tu envio ha sido colocado en cola, idEnvio: " + envio.getIdEnvios(), "Envio Agregado", HEIGHT);
                }catch(SQLException ex){
                    ex.printStackTrace();
                    System.out.println("Fallo la conexion a la base de datos");
                    try {
                        sistema.conectar.getConnection().rollback();
                    } catch (SQLException ex1) {
                        Logger.getLogger(DatosCliente.class.getName()).log(Level.SEVERE, null, ex1);
                        System.out.println("Error haciendo rollback");
                    }
                }
                sistema.conectar.desconectar();
                
            }else{
                sistema.conectar.conectar();
                try{
                    sistema.conectar.getConnection().setAutoCommit(false);
                    cliente = new Cliente(id, nit, nombreClienteText.getText(), telefono, emailClienteText.getText(), direccionClienteText.getText());
                    String query = "INSERT INTO clientes VALUES(?, ?, ?, ?, ?, ?)";
                    
                    PreparedStatement nuevoCliente = sistema.conectar.getConnection().prepareStatement(query);
                    nuevoCliente.setInt(1, cliente.getId_Cliente());
                    nuevoCliente.setInt(2, cliente.getNit());
                    nuevoCliente.setString(3, cliente.getNombre());
                    nuevoCliente.setInt(4, cliente.getTelefono());
                    nuevoCliente.setString(5, cliente.getEmail());
                    nuevoCliente.setString(6, cliente.getDireccion());
                    nuevoCliente.executeUpdate();
                    
                    JOptionPane.showMessageDialog(this, "Nuevo cliente ingresado al sistema", "Nuevo Cliente", JOptionPane.INFORMATION_MESSAGE);
                    
                    envio.setIdCliete(cliente.getId_Cliente());
                    
                    String queryEnvio = "INSERT INTO envios VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                    PreparedStatement envios = sistema.conectar.getConnection().prepareStatement(queryEnvio);
                    envios.setInt(1, envio.getIdEnvios());
                    envios.setInt(2, envio.getIdCliete());
                    envios.setDouble(3, envio.getPeso());
                    envios.setString(4, envio.getCategoria());
                    envios.setDate(5, envio.getIngreso());
                    envios.setBoolean(6, envio.isPriorizar());
                    envios.setInt(7, 1);
                    envios.setString(8, envio.getCod_D());
                    envios.setString(9, envio.getPais());
                    envios.setString(10, envio.getCiudad());
                    envios.setString(11, envio.getUbicacion());
                    envios.setDouble(12, envio.getMontoPriorizar());
                    envios.setDouble(13, envio.getMontoPeso());
                    envios.setDouble(14, envio.getMontoDestino());
                    envios.setDouble(15, envio.getMontoTotal());
                    envios.setDouble(16, 0);
                    envios.executeUpdate();
                    
                    sistema.conectar.getConnection().commit();
                    System.out.println("Ejecutando");
                    sistema.conectar.getConnection().setAutoCommit(true);
                    JOptionPane.showMessageDialog(this, "Tu envio ha sido colocado en cola, idEnvio: " + envio.getIdEnvios(), "Envio Agregado", HEIGHT);
                }catch(SQLException ex){
                    System.out.println("Fallo con la conexion de datos");
                    try {
                        sistema.conectar.getConnection().rollback();
                    } catch (SQLException ex1) {
                        Logger.getLogger(DatosCliente.class.getName()).log(Level.SEVERE, null, ex1);
                        System.out.println("Fallo haciendo rollback");
                    }
                }
                sistema.conectar.desconectar();
            }
            
            sistema.setContadorEnvios(0);
            sistema.MostrarTabla("envios", "");
            sistema.inicio.recepcionista.idEnvioLabel.setText("Id Envio: " + sistema.getContadorEnvios());
            sistema.inicio.recepcionista.pesoText.setText(null);
            sistema.inicio.recepcionista.priorizarRadioBoton.setSelected(false);
            sistema.inicio.recepcionista.categoriaCombo.setSelectedIndex(0);
            sistema.inicio.recepcionista.getEnviosObservable().clear();
            sistema.inicio.recepcionista.tablaRutas.clearSelection();
            sistema.inicio.recepcionista.aceptarBoton.setEnabled(false);
            sistema.inicio.recepcionista.peso = 0;
            
            
            com.proyecto.Mover mover = new com.proyecto.Mover();
            mover.mover();
            
            this.setVisible(false);
            
                

            
        }else if(id == 0){
            idClienteText.setText(null);
            JOptionPane.showMessageDialog(this, "El campo idCliente=0 no es valido", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            
            JOptionPane.showMessageDialog(this, "Los campos idCliente, Nombre y Direccion son obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_aceptarBotonActionPerformed

    private void nitClienteTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nitClienteTextKeyTyped
        if(nitClienteText.getText().length() == 11){
            evt.consume();
        }
    }//GEN-LAST:event_nitClienteTextKeyTyped

    private void telefonoClienteTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonoClienteTextKeyTyped
        if(telefonoClienteText.getText().length() == 11){
            evt.consume();
        }
    }//GEN-LAST:event_telefonoClienteTextKeyTyped

    private void nombreClienteTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreClienteTextKeyTyped
        if(nombreClienteText.getText().length() == 50){
            evt.consume();
        }
    }//GEN-LAST:event_nombreClienteTextKeyTyped

    private void emailClienteTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailClienteTextKeyTyped
        if(emailClienteText.getText().length() == 50){
            evt.consume();
        }
    }//GEN-LAST:event_emailClienteTextKeyTyped

    private void direccionClienteTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_direccionClienteTextKeyTyped
        if(direccionClienteText.getText().length() == 100){
            evt.consume();
        }
    }//GEN-LAST:event_direccionClienteTextKeyTyped

    private void idClienteTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idClienteTextKeyPressed
        
        
    }//GEN-LAST:event_idClienteTextKeyPressed

    private void idClienteTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idClienteTextKeyReleased
        
        if(!idClienteText.getText().equals("")){
            try{
                id = Integer.parseInt(idClienteText.getText());
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(this, "No es un formato de id valido", "Error", JOptionPane.ERROR_MESSAGE);
                idClienteText.setText(null);
                id = 0;
            }

        
            for (int i=0; i<sistema.getClientes().size(); i++) {
                if(id == sistema.getClientes().get(i).getId_Cliente()){
                    nit = sistema.getClientes().get(i).getNit();
                    telefono = sistema.getClientes().get(i).getTelefono();
                    nitClienteText.setText(""+nit);
                    telefonoClienteText.setText(""+telefono);
                    nombreClienteText.setText(sistema.getClientes().get(i).getNombre());
                    emailClienteText.setText(sistema.getClientes().get(i).getEmail());
                    direccionClienteText.setText(sistema.getClientes().get(i).getDireccion());
                    cliente = sistema.getClientes().get(i);
                    break;
                }else{
                    nit = 0;
                    telefono = 0;
                    nitClienteText.setText(null);
                    telefonoClienteText.setText(null);
                    nombreClienteText.setText(null);
                    emailClienteText.setText(null);
                    direccionClienteText.setText(null);
                    cliente = null;
                }
            }
        }else{
            nit = 0;
            telefono = 0;
            nitClienteText.setText(null);
            telefonoClienteText.setText(null);
            nombreClienteText.setText(null);
            emailClienteText.setText(null);
            direccionClienteText.setText(null);
            cliente = null;
        }
    }//GEN-LAST:event_idClienteTextKeyReleased

    private void nitClienteTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nitClienteTextKeyReleased
        if(!nitClienteText.getText().equals("")){
            try{
                nit = Integer.parseInt(nitClienteText.getText());
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(this, "No es un formato de nit valido", "Error", JOptionPane.ERROR_MESSAGE);
                nitClienteText.setText(null);
                nit = 0;
            }        
        }else{
            nit = 0;
        }
    }//GEN-LAST:event_nitClienteTextKeyReleased

    private void telefonoClienteTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonoClienteTextKeyReleased
        if(!telefonoClienteText.getText().equals("")){
            try{
                telefono = Integer.parseInt(telefonoClienteText.getText());
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(this, "No es un formato de telefono valido", "Error", JOptionPane.ERROR_MESSAGE);
                telefonoClienteText.setText(null);
                telefono = 0;
            }        
        }else{
            telefono = 0;
        }
    }//GEN-LAST:event_telefonoClienteTextKeyReleased
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarBoton;
    private javax.swing.JButton cancelarBoton;
    private javax.swing.JLabel clienteLabel;
    private javax.swing.JTextField direccionClienteText;
    private javax.swing.JLabel direccionLabel;
    private javax.swing.JTextField emailClienteText;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField idClienteText;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nitClienteText;
    private javax.swing.JLabel nitLabel;
    private javax.swing.JTextField nombreClienteText;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JTextField telefonoClienteText;
    private javax.swing.JLabel telefonoLabel;
    // End of variables declaration//GEN-END:variables
}
