
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
    String nombre;
    private ObservableList<PuntoControl> puntoObservable;
    private List<PuntoControl> listadoPunto = new ArrayList<>();
    private PuntoControl paqueteSeleccionando;
    
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

        tabbed = new javax.swing.JTabbedPane();
        inicioPanel = new javax.swing.JPanel();
        panelPuntoControl = new javax.swing.JPanel();
        mostrarBoton = new javax.swing.JButton();
        scroll2 = new javax.swing.JScrollPane();
        scroll1 = new javax.swing.JScrollPane();
        tablaPuntos = new javax.swing.JTable();
        nombrePuntoText = new javax.swing.JLabel();
        procesarEnvio = new javax.swing.JButton();
        menuBarra = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        aboutItem = new javax.swing.JMenuItem();
        cerrarSesionItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabbed.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);

        javax.swing.GroupLayout inicioPanelLayout = new javax.swing.GroupLayout(inicioPanel);
        inicioPanel.setLayout(inicioPanelLayout);
        inicioPanelLayout.setHorizontalGroup(
            inicioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 611, Short.MAX_VALUE)
        );
        inicioPanelLayout.setVerticalGroup(
            inicioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );

        tabbed.addTab("Inicio", inicioPanel);

        mostrarBoton.setText("Mostrar");
        mostrarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarBotonActionPerformed(evt);
            }
        });

        scroll2.setPreferredSize(new java.awt.Dimension(270, 270));

        scroll1.setMinimumSize(new java.awt.Dimension(1000, 280));
        scroll1.setPreferredSize(new java.awt.Dimension(1000, 280));

        org.jdesktop.beansbinding.ELProperty eLProperty = org.jdesktop.beansbinding.ELProperty.create("${puntoObservable}");
        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, eLProperty, tablaPuntos);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idEnvio}"));
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
        scroll1.setViewportView(tablaPuntos);

        scroll2.setViewportView(scroll1);

        nombrePuntoText.setText("Punto de Control: ");

        procesarEnvio.setText("Procesar Paquete");
        procesarEnvio.setEnabled(false);
        procesarEnvio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procesarEnvioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPuntoControlLayout = new javax.swing.GroupLayout(panelPuntoControl);
        panelPuntoControl.setLayout(panelPuntoControlLayout);
        panelPuntoControlLayout.setHorizontalGroup(
            panelPuntoControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPuntoControlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPuntoControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scroll2, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
                    .addGroup(panelPuntoControlLayout.createSequentialGroup()
                        .addGroup(panelPuntoControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombrePuntoText, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelPuntoControlLayout.createSequentialGroup()
                                .addComponent(mostrarBoton)
                                .addGap(18, 18, 18)
                                .addComponent(procesarEnvio)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelPuntoControlLayout.setVerticalGroup(
            panelPuntoControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPuntoControlLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(nombrePuntoText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scroll2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelPuntoControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mostrarBoton)
                    .addComponent(procesarEnvio))
                .addContainerGap(213, Short.MAX_VALUE))
        );

        tabbed.addTab("PuntoDeControl", panelPuntoControl);

        jMenu1.setText("Cuenta");

        aboutItem.setText("About...");
        jMenu1.add(aboutItem);

        cerrarSesionItem.setText("Cerrar Sesión");
        cerrarSesionItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesionItemActionPerformed(evt);
            }
        });
        jMenu1.add(cerrarSesionItem);

        menuBarra.add(jMenu1);

        setJMenuBar(menuBarra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabbed)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbed, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            nombre = "";
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
            if(puntoObservable.size() > 0){
                procesarEnvio.setEnabled(true);
            }else{
                procesarEnvio.setEnabled(false);
            }
        }else{
            JOptionPane.showMessageDialog(this, "No tienes puntos de control asignados", "Info", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_mostrarBotonActionPerformed

    private void procesarEnvioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procesarEnvioActionPerformed
        
        
        ProcesarPaquete tmp = new ProcesarPaquete(this, sistema, puntoObservable.get(0));
        tmp.setLocationRelativeTo(null);
        tmp.inicializarInformacion();
        tmp.setVisible(true);
        
        
    }//GEN-LAST:event_procesarEnvioActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutItem;
    private javax.swing.JMenuItem cerrarSesionItem;
    private javax.swing.JPanel inicioPanel;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar menuBarra;
    public javax.swing.JButton mostrarBoton;
    private javax.swing.JLabel nombrePuntoText;
    private javax.swing.JPanel panelPuntoControl;
    private javax.swing.JButton procesarEnvio;
    private javax.swing.JScrollPane scroll1;
    private javax.swing.JScrollPane scroll2;
    private javax.swing.JTabbedPane tabbed;
    private javax.swing.JTable tablaPuntos;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    public ObservableList<PuntoControl> getPuntoObservable() {
        return puntoObservable;
    }

    public void setPuntoObservable(ObservableList<PuntoControl> puntoObservable) {
        this.puntoObservable = puntoObservable;
    }

    public PuntoControl getPaqueteSeleccionando() {
        return paqueteSeleccionando;
    }

    public void setPaqueteSeleccionando(PuntoControl paqueteSeleccionando) {
        this.paqueteSeleccionando = paqueteSeleccionando;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
}
