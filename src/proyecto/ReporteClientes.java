
package proyecto;

import java.util.ArrayList;
import java.util.List;
import org.jdesktop.observablecollections.ObservableCollections;
import org.jdesktop.observablecollections.ObservableList;

/**
 *
 * @author cesar31
 */
public class ReporteClientes extends java.awt.Dialog {

    Sistema sistema;
    Cliente cliente;
    private ObservableList<Envios> enviosObservable;
    private List<Envios> listadoEnvios = new ArrayList<>();
    
    public ReporteClientes(java.awt.Frame parent, Sistema sistema, Cliente cliente) {
        super(parent, true);
        this.sistema = sistema;
        this.cliente = cliente;
        enviosObservable = ObservableCollections.observableList(listadoEnvios);
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jPanel1 = new javax.swing.JPanel();
        clienteLabel = new javax.swing.JLabel();
        nitLabel = new javax.swing.JLabel();
        nombreLabel = new javax.swing.JLabel();
        telefonoLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        direccionLabel = new javax.swing.JLabel();
        idCliente = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        direccion = new javax.swing.JLabel();
        nit = new javax.swing.JLabel();
        telefono = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaEnviosCliente = new javax.swing.JTable();
        numeroLabel = new javax.swing.JLabel();
        montoLabel = new javax.swing.JLabel();
        costoLabel = new javax.swing.JLabel();
        rendimientoLabel = new javax.swing.JLabel();
        numero = new javax.swing.JLabel();
        monto = new javax.swing.JLabel();
        costo = new javax.swing.JLabel();
        rendimiento = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(500, 600));
        setTitle("Reporte de Cliente");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        clienteLabel.setText("idCliente: ");

        nitLabel.setText("Nit: ");

        nombreLabel.setText("Nombre: ");

        telefonoLabel.setText("Telefono");

        emailLabel.setText("Email:");

        direccionLabel.setText("Direccion");

        idCliente.setFont(new java.awt.Font("Nimbus Sans", 1, 14)); // NOI18N
        idCliente.setText("idCliente");

        nombre.setFont(new java.awt.Font("Nimbus Sans", 1, 14)); // NOI18N
        nombre.setText("nombre");

        email.setFont(new java.awt.Font("Nimbus Sans", 1, 14)); // NOI18N
        email.setText("email");

        direccion.setFont(new java.awt.Font("Nimbus Sans", 1, 14)); // NOI18N
        direccion.setText("direccion");

        nit.setFont(new java.awt.Font("Nimbus Sans", 1, 14)); // NOI18N
        nit.setText("nit");

        telefono.setFont(new java.awt.Font("Nimbus Sans", 1, 14)); // NOI18N
        telefono.setText("telefono");
        telefono.setToolTipText("");

        jLabel1.setText("Paquetes entregado al cliente:");

        jScrollPane3.setMinimumSize(new java.awt.Dimension(250, 200));
        jScrollPane3.setPreferredSize(new java.awt.Dimension(450, 200));

        jScrollPane2.setMinimumSize(new java.awt.Dimension(700, 450));
        jScrollPane2.setPreferredSize(new java.awt.Dimension(700, 450));

        org.jdesktop.beansbinding.ELProperty eLProperty = org.jdesktop.beansbinding.ELProperty.create("${enviosObservable}");
        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, eLProperty, tablaEnviosCliente);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idEnvios}"));
        columnBinding.setColumnName("idEnvio");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idRuta}"));
        columnBinding.setColumnName("idRuta");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cod_D}"));
        columnBinding.setColumnName("Destino");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${pais}"));
        columnBinding.setColumnName("Pais");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${ciudad}"));
        columnBinding.setColumnName("Ciudad");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${peso}"));
        columnBinding.setColumnName("Peso");
        columnBinding.setColumnClass(Double.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${categoria}"));
        columnBinding.setColumnName("Categoria");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${montoTotal}"));
        columnBinding.setColumnName("Monto");
        columnBinding.setColumnClass(Double.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${costo}"));
        columnBinding.setColumnName("Costo");
        columnBinding.setColumnClass(Double.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane2.setViewportView(tablaEnviosCliente);

        jScrollPane3.setViewportView(jScrollPane2);

        numeroLabel.setText("Numero de Paquetes:");

        montoLabel.setText("Monto Total:");

        costoLabel.setText("Costo Total");

        rendimientoLabel.setText("Rendimiento");

        numero.setText("numero");

        monto.setText("monto");

        costo.setText("costo");

        rendimiento.setText("rendimiento");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(clienteLabel)
                            .addComponent(telefonoLabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(idCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(nitLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(direccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(numeroLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numero))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(direccionLabel)
                            .addComponent(emailLabel)
                            .addComponent(nombreLabel)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(rendimientoLabel)
                                    .addGap(18, 18, 18)
                                    .addComponent(rendimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(montoLabel)
                                        .addComponent(costoLabel))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(monto, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                        .addComponent(costo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(0, 22, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clienteLabel)
                    .addComponent(nitLabel)
                    .addComponent(nit)
                    .addComponent(idCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefonoLabel)
                    .addComponent(telefono))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreLabel)
                    .addComponent(nombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(email))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(direccionLabel)
                    .addComponent(direccion))
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroLabel)
                    .addComponent(numero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(montoLabel)
                    .addComponent(monto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(costoLabel)
                    .addComponent(costo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rendimientoLabel)
                    .addComponent(rendimiento))
                .addContainerGap(120, Short.MAX_VALUE))
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
        idCliente.setText("" + cliente.getId_Cliente());
        nit.setText("" + cliente.getNit());
        nombre.setText(cliente.getNombre());
        telefono.setText("" + cliente.getTelefono());
        email.setText(cliente.getEmail());
        direccion.setText(cliente.getDireccion());
        
        String query = "SELECT * FROM envios WHERE id_Cliente = " + cliente.getId_Cliente() + " HAVING ubicacion = \"Entregado\"";
        sistema.MostrarTabla("envios", query);
        enviosObservable.clear();
        enviosObservable.addAll(sistema.getEnvios());
        
        double monto = 0;
        double costo = 0;
        for (int i=0; i<enviosObservable.size(); i++){
            monto += enviosObservable.get(i).getMontoTotal();
            costo += enviosObservable.get(i).getCosto();
        }
        
        monto = Math.round(monto*10)/10d;
        costo = Math.round(costo*10)/10d;
        double rendimiento = monto - costo;
        
        
        
        numero.setText("" + enviosObservable.size());
        this.monto.setText("" + monto);
        this.costo.setText("" + costo);
        this.rendimiento.setText("" + rendimiento);
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel clienteLabel;
    private javax.swing.JLabel costo;
    private javax.swing.JLabel costoLabel;
    private javax.swing.JLabel direccion;
    private javax.swing.JLabel direccionLabel;
    private javax.swing.JLabel email;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel idCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel monto;
    private javax.swing.JLabel montoLabel;
    private javax.swing.JLabel nit;
    private javax.swing.JLabel nitLabel;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JLabel numero;
    private javax.swing.JLabel numeroLabel;
    private javax.swing.JLabel rendimiento;
    private javax.swing.JLabel rendimientoLabel;
    private javax.swing.JTable tablaEnviosCliente;
    private javax.swing.JLabel telefono;
    private javax.swing.JLabel telefonoLabel;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    public ObservableList<Envios> getEnviosObservable() {
        return enviosObservable;
    }

    public void setEnviosObservable(ObservableList<Envios> enviosObservable) {
        this.enviosObservable = enviosObservable;
    }
}
