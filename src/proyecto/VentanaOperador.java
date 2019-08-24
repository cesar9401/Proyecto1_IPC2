
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
public class VentanaOperador extends javax.swing.JFrame {

    Sistema sistema;
    String usuario;
    private ObservableList<PuntoControl> puntoObservable;
    private List<PuntoControl> listadoPunto = new ArrayList<>();
    private int contador = 0;
    
    public VentanaOperador(Sistema sistema, String usuario) {
        this.sistema = sistema;
        this.usuario = usuario;
        puntoObservable = ObservableCollections.observableList(listadoPunto);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        mostrarBoton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaPuntos = new javax.swing.JTable();
        nombrePuntoText = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        cerrarSesionItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 611, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Inicio", jPanel1);

        mostrarBoton.setText("Mostrar");
        mostrarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarBotonActionPerformed(evt);
            }
        });

        jScrollPane3.setPreferredSize(new java.awt.Dimension(270, 270));

        jScrollPane2.setMinimumSize(new java.awt.Dimension(1000, 280));
        jScrollPane2.setPreferredSize(new java.awt.Dimension(1000, 280));

        org.jdesktop.beansbinding.ELProperty eLProperty = org.jdesktop.beansbinding.ELProperty.create("${puntoObservable}");
        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, eLProperty, tablaPuntos);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idRegistro}"));
        columnBinding.setColumnName("Id Registro");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idEnvio}"));
        columnBinding.setColumnName("Id Envio");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idCliente}"));
        columnBinding.setColumnName("Id Cliente");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idRuta}"));
        columnBinding.setColumnName("Id Ruta");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${pais}"));
        columnBinding.setColumnName("Pais");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${ciudad}"));
        columnBinding.setColumnName("Ciudad");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${fechaIngreso}"));
        columnBinding.setColumnName("Fecha Ingreso");
        columnBinding.setColumnClass(java.sql.Date.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${horaIngreso}"));
        columnBinding.setColumnName("Hora Ingreso");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${fechaSalida}"));
        columnBinding.setColumnName("Fecha Salida");
        columnBinding.setColumnClass(java.sql.Date.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${horaSalida}"));
        columnBinding.setColumnName("Hora Salida");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${costoTotal}"));
        columnBinding.setColumnName("Costo Total");
        columnBinding.setColumnClass(Double.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane2.setViewportView(tablaPuntos);

        jScrollPane3.setViewportView(jScrollPane2);

        nombrePuntoText.setText("Punto de Control: ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombrePuntoText, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mostrarBoton))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(nombrePuntoText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mostrarBoton)
                .addContainerGap(213, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("PuntoDeControl", jPanel2);

        jMenu1.setText("Cuenta");

        jMenuItem1.setText("About...");
        jMenu1.add(jMenuItem1);

        cerrarSesionItem.setText("Cerrar Sesión");
        cerrarSesionItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesionItemActionPerformed(evt);
            }
        });
        jMenu1.add(cerrarSesionItem);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarSesionItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesionItemActionPerformed
        this.setVisible(false);
        this.removeAll();
        sistema.inicio.setVisible(true);
    }//GEN-LAST:event_cerrarSesionItemActionPerformed

    private void mostrarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarBotonActionPerformed
        String query = "SELECT * FROM puntosDeControl WHERE encargado = " + "\"" + usuario + "\"";
        sistema.MostrarTabla("puntosDeControl", query);
        ArrayList<PuntosDeControl> tmp = sistema.getPuntosDeControl();

        String nombreTabla = "";
        if(tmp.size()>0){
            nombreTabla = tmp.get(contador).getCodigo();
            nombrePuntoText.setText("Punto de Control: " + nombreTabla);
            contador++;

            if(contador == tmp.size()){
                contador = 0;
            }
        }        


        if(!nombreTabla.equals("")){
            String nombre = "";
            for (int i= 0; i < nombreTabla.length(); i++) {
                if(nombreTabla.charAt(i) == '-'){
                    nombre = nombre + "_";
                }else{
                    nombre = nombre + nombreTabla.charAt(i);
                }
            }
            puntoObservable.clear();
            String instruccion = "SELECT * FROM " + nombre + " WHERE estado = 1";
            sistema.MostrarTabla(nombre, instruccion);
            puntoObservable.addAll(sistema.getPunto());
        }else{
            JOptionPane.showMessageDialog(this, "No tienes puntos de control asignados", "Info", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_mostrarBotonActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem cerrarSesionItem;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton mostrarBoton;
    private javax.swing.JLabel nombrePuntoText;
    private javax.swing.JTable tablaPuntos;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    public ObservableList<PuntoControl> getPuntoObservable() {
        return puntoObservable;
    }

    public void setPuntoObservable(ObservableList<PuntoControl> puntoObservable) {
        this.puntoObservable = puntoObservable;
    }
}
