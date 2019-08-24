
package proyecto;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import org.jdesktop.observablecollections.ObservableCollections;
import org.jdesktop.observablecollections.ObservableList;

/**
 *
 * @author cesar31
 */
public class VentanaRecepcionista extends javax.swing.JFrame {

    Sistema sistema;
    String usuario;
    double peso = 0;
    private Ruta rutaSeleccionada; 
    private ObservableList<Ruta> rutaObservable;
    private List<Ruta> listadoRuta = new ArrayList<>();
    private ObservableList<Envios> enviosObservable;
    private List<Envios> listadoEnvios = new ArrayList<>();
    private Envios envio;
    private ObservableList<ConsultaInner> consultaObservable;
    private List<ConsultaInner> listadoConsulta = new ArrayList<>();
    private int idEnvio = 0;
    
    public VentanaRecepcionista(Sistema sistema, String usuario) {
        this.sistema = sistema;
        this.usuario = usuario;
        rutaObservable = ObservableCollections.observableList(listadoRuta);
        enviosObservable = ObservableCollections.observableList(listadoEnvios);
        consultaObservable = ObservableCollections.observableList(listadoConsulta);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        tabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        panelNuevoEnvio = new javax.swing.JPanel();
        idEnvioLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pesoText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        categoriaCombo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        priorizarRadioBoton = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaRutas = new javax.swing.JTable();
        continuarBoton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaEnvio = new javax.swing.JTable();
        aceptarBoton = new javax.swing.JButton();
        cancelarBoton = new javax.swing.JButton();
        fechaChooser = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        idEnvioText = new javax.swing.JTextField();
        buscarBoton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        menu = new javax.swing.JMenuBar();
        cuentaMenu = new javax.swing.JMenu();
        aboutItem = new javax.swing.JMenuItem();
        cerrarItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(630, 560));

        tabbedPane1.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);
        tabbedPane1.setPreferredSize(new java.awt.Dimension(618, 570));
        tabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabbedPane1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 545, Short.MAX_VALUE)
        );

        tabbedPane1.addTab("Inicio", jPanel1);

        idEnvioLabel.setText("Id Envio:");

        jLabel2.setText("Peso (Lb)");

        pesoText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pesoTextKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pesoTextKeyReleased(evt);
            }
        });

        jLabel5.setText("Categoria");

        categoriaCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Documentos", "Quimicos", "Automotriz", "Manufactura", "Comercio Min", "Tecnologia", "Salud" }));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel3.setText("Fecha Ingreso");

        priorizarRadioBoton.setText("Priorizar");

        jLabel4.setText("Destino");

        org.jdesktop.beansbinding.ELProperty eLProperty = org.jdesktop.beansbinding.ELProperty.create("${rutaObservable}");
        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, eLProperty, tablaRutas);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cod_D}"));
        columnBinding.setColumnName("Cod_ D");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${pais}"));
        columnBinding.setColumnName("Pais");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${ciudad}"));
        columnBinding.setColumnName("Ciudad");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${precio}"));
        columnBinding.setColumnName("Precio");
        columnBinding.setColumnClass(Double.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${rutaSeleccionada}"), tablaRutas, org.jdesktop.beansbinding.BeanProperty.create("selectedElement"));
        bindingGroup.addBinding(binding);

        jScrollPane1.setViewportView(tablaRutas);
        if (tablaRutas.getColumnModel().getColumnCount() > 0) {
            tablaRutas.getColumnModel().getColumn(0).setResizable(false);
            tablaRutas.getColumnModel().getColumn(1).setResizable(false);
            tablaRutas.getColumnModel().getColumn(2).setResizable(false);
            tablaRutas.getColumnModel().getColumn(3).setResizable(false);
        }

        continuarBoton.setText("Continuar");
        continuarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuarBotonActionPerformed(evt);
            }
        });

        eLProperty = org.jdesktop.beansbinding.ELProperty.create("${enviosObservable}");
        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, eLProperty, tablaEnvio);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idEnvios}"));
        columnBinding.setColumnName("Id Envio");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cod_D}"));
        columnBinding.setColumnName("Destino");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${montoPriorizar}"));
        columnBinding.setColumnName("CostoPriorizar");
        columnBinding.setColumnClass(Double.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${montoPeso}"));
        columnBinding.setColumnName("MontoPeso");
        columnBinding.setColumnClass(Double.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${montoDestino}"));
        columnBinding.setColumnName("MontoDestino");
        columnBinding.setColumnClass(Double.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${montoTotal}"));
        columnBinding.setColumnName("MontoTotal");
        columnBinding.setColumnClass(Double.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane2.setViewportView(tablaEnvio);
        if (tablaEnvio.getColumnModel().getColumnCount() > 0) {
            tablaEnvio.getColumnModel().getColumn(0).setMinWidth(70);
            tablaEnvio.getColumnModel().getColumn(0).setPreferredWidth(70);
            tablaEnvio.getColumnModel().getColumn(1).setMinWidth(90);
            tablaEnvio.getColumnModel().getColumn(1).setPreferredWidth(90);
            tablaEnvio.getColumnModel().getColumn(2).setMinWidth(95);
            tablaEnvio.getColumnModel().getColumn(2).setPreferredWidth(95);
            tablaEnvio.getColumnModel().getColumn(4).setMinWidth(95);
            tablaEnvio.getColumnModel().getColumn(4).setPreferredWidth(95);
        }

        aceptarBoton.setText("Aceptar");
        aceptarBoton.setEnabled(false);
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(aceptarBoton)
                        .addGap(61, 61, 61)
                        .addComponent(cancelarBoton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aceptarBoton)
                    .addComponent(cancelarBoton))
                .addContainerGap())
        );

        fechaChooser.setDateFormatString("yyyy/MM/dd");

        javax.swing.GroupLayout panelNuevoEnvioLayout = new javax.swing.GroupLayout(panelNuevoEnvio);
        panelNuevoEnvio.setLayout(panelNuevoEnvioLayout);
        panelNuevoEnvioLayout.setHorizontalGroup(
            panelNuevoEnvioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNuevoEnvioLayout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addComponent(continuarBoton)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelNuevoEnvioLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(panelNuevoEnvioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNuevoEnvioLayout.createSequentialGroup()
                        .addComponent(idEnvioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelNuevoEnvioLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNuevoEnvioLayout.createSequentialGroup()
                        .addGroup(panelNuevoEnvioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
                            .addGroup(panelNuevoEnvioLayout.createSequentialGroup()
                                .addGroup(panelNuevoEnvioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNuevoEnvioLayout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(panelNuevoEnvioLayout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(14, 14, 14)))
                                .addGroup(panelNuevoEnvioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelNuevoEnvioLayout.createSequentialGroup()
                                        .addComponent(pesoText, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(fechaChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelNuevoEnvioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(categoriaCombo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(priorizarRadioBoton, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(90, 90, 90))))
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelNuevoEnvioLayout.setVerticalGroup(
            panelNuevoEnvioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNuevoEnvioLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(idEnvioLabel)
                .addGap(17, 17, 17)
                .addGroup(panelNuevoEnvioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pesoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoriaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelNuevoEnvioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(priorizarRadioBoton)
                    .addComponent(jLabel3)
                    .addComponent(fechaChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(continuarBoton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(272, 272, 272))
        );

        tabbedPane1.addTab("Nuevo Envio", panelNuevoEnvio);

        idEnvioText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idEnvioTextKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                idEnvioTextKeyReleased(evt);
            }
        });

        buscarBoton.setText("Buscar");
        buscarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBotonActionPerformed(evt);
            }
        });

        jLabel1.setText("Id de Envio");

        jScrollPane6.setMinimumSize(new java.awt.Dimension(562, 250));
        jScrollPane6.setPreferredSize(new java.awt.Dimension(562, 250));

        jScrollPane5.setMinimumSize(new java.awt.Dimension(1000, 250));
        jScrollPane5.setPreferredSize(new java.awt.Dimension(1000, 250));
        jScrollPane5.setRequestFocusEnabled(false);

        eLProperty = org.jdesktop.beansbinding.ELProperty.create("${consultaObservable}");
        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, eLProperty, jTable2);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idEnvio}"));
        columnBinding.setColumnName("idEnvio");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idCliente}"));
        columnBinding.setColumnName("idCliente");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idRuta}"));
        columnBinding.setColumnName("Ruta");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${pais_D}"));
        columnBinding.setColumnName("PaisDestino");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${ciudad_D}"));
        columnBinding.setColumnName("CiudadDestino");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${ingresoEnvio}"));
        columnBinding.setColumnName("FechaIngreso");
        columnBinding.setColumnClass(java.sql.Date.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${ubicacion}"));
        columnBinding.setColumnName("UbicacionActual");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${pais_P}"));
        columnBinding.setColumnName("PaisUbicacion");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${ciudad_P}"));
        columnBinding.setColumnName("CiudadUbicacion");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${ingresoPunto}"));
        columnBinding.setColumnName("FechaIngreso");
        columnBinding.setColumnClass(java.sql.Date.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${horaPunto}"));
        columnBinding.setColumnName("HoraIngreso");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane5.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setMinWidth(70);
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(70);
            jTable2.getColumnModel().getColumn(1).setMinWidth(70);
            jTable2.getColumnModel().getColumn(1).setPreferredWidth(70);
            jTable2.getColumnModel().getColumn(2).setMinWidth(70);
            jTable2.getColumnModel().getColumn(2).setPreferredWidth(70);
            jTable2.getColumnModel().getColumn(3).setMinWidth(100);
            jTable2.getColumnModel().getColumn(3).setPreferredWidth(100);
            jTable2.getColumnModel().getColumn(4).setMinWidth(100);
            jTable2.getColumnModel().getColumn(4).setPreferredWidth(100);
            jTable2.getColumnModel().getColumn(5).setMinWidth(110);
            jTable2.getColumnModel().getColumn(5).setPreferredWidth(110);
            jTable2.getColumnModel().getColumn(6).setMinWidth(100);
            jTable2.getColumnModel().getColumn(6).setPreferredWidth(100);
            jTable2.getColumnModel().getColumn(7).setMinWidth(100);
            jTable2.getColumnModel().getColumn(7).setPreferredWidth(100);
            jTable2.getColumnModel().getColumn(8).setMinWidth(100);
            jTable2.getColumnModel().getColumn(8).setPreferredWidth(100);
            jTable2.getColumnModel().getColumn(9).setMinWidth(80);
            jTable2.getColumnModel().getColumn(9).setPreferredWidth(80);
            jTable2.getColumnModel().getColumn(10).setMinWidth(70);
            jTable2.getColumnModel().getColumn(10).setPreferredWidth(70);
        }

        jScrollPane6.setViewportView(jScrollPane5);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idEnvioText, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buscarBoton))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idEnvioText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarBoton)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(241, Short.MAX_VALUE))
        );

        tabbedPane1.addTab("BuscarPaquete", jPanel2);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 545, Short.MAX_VALUE)
        );

        tabbedPane1.addTab("Bodegas", jPanel4);

        cuentaMenu.setText("Cuenta");

        aboutItem.setText("About...");
        cuentaMenu.add(aboutItem);

        cerrarItem.setText("Cerrar Sesión");
        cerrarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarItemActionPerformed(evt);
            }
        });
        cuentaMenu.add(cerrarItem);

        menu.add(cuentaMenu);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(tabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarItemActionPerformed
        this.setVisible(false);
        this.removeAll();
        sistema.inicio.setVisible(true);
    }//GEN-LAST:event_cerrarItemActionPerformed

    private void tabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabbedPane1MouseClicked
        sistema.setContadorEnvios(0);
        rutaObservable.clear();
        sistema.MostrarTabla("rutas", "");
        rutaObservable.addAll(sistema.getRutas());
        sistema.MostrarTabla("envios", "");
        enviosObservable.addAll(sistema.getEnvios());
        sistema.setContadorEnvios(sistema.getContadorEnvios() + 1);
        enviosObservable.clear();
        idEnvioLabel.setText("Id Envio: " + sistema.getContadorEnvios());
        pesoText.setText(null);
        priorizarRadioBoton.setSelected(false);
        categoriaCombo.setSelectedIndex(0);
        fechaChooser.setDate(new Date());
    }//GEN-LAST:event_tabbedPane1MouseClicked

    private void continuarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continuarBotonActionPerformed

        Date date = fechaChooser.getDate();
        if(peso != 0 && date != null){
            long d = date.getTime();
            java.sql.Date fecha = new java.sql.Date(d);
            System.out.println("fecha: " + fecha);
            
            
            if(rutaSeleccionada != null){
                String categoria = establecerCategoria();
                
                Boolean priorizar = priorizarRadioBoton.isSelected();
                double montoPriorizar = 0;
                double montoPeso = 0;
                double montoDestino = 0;
                double montoTotal = 0;
                
                
                
                sistema.MostrarTabla("precios", "");
                for (int i=0; i<sistema.getPrecios().size(); i++){
                    if(priorizar && sistema.getPrecios().get(i).getTipoPago().equals("PrecioPriorizacion")){
                        montoPriorizar = sistema.getPrecios().get(i).getPrecio();
                    }

                    if(sistema.getPrecios().get(i).getTipoPago().equals("PrecioPorLibra")){
                        montoPeso = peso * sistema.getPrecios().get(i).getPrecio();
                        montoPeso = Math.round(montoPeso*10)/10d;
                    }
                }
                
                sistema.MostrarTabla("rutas", "");
                rutaObservable.addAll(sistema.getRutas());
                for (int i=0; i <rutaObservable.size(); i++) {
                    if(rutaObservable.get(i).getCod_D().equals(rutaSeleccionada.getCod_D())){
                        montoDestino = rutaSeleccionada.getPrecio();
                        break;
                    }
                }
            
                montoTotal = montoPriorizar + montoPeso + montoDestino;
                System.out.println("montoTotal: " + montoTotal);
                
                enviosObservable.clear();
                envio = new Envios(sistema.getContadorEnvios(), peso, categoria, fecha, priorizar);
                //envio.setIdRuta(0);
                envio.setCod_D(rutaSeleccionada.getCod_D());
                envio.setPais(rutaSeleccionada.getPais());
                envio.setCiudad(rutaSeleccionada.getCiudad());
                envio.setMontoPriorizar(montoPriorizar);
                envio.setMontoPeso(montoPeso);
                envio.setMontoDestino(montoDestino);
                envio.setMontoTotal(montoTotal);
                envio.setUbicacion("Bodega");
                enviosObservable.add(envio);
                System.out.println("id: " + envio.getIdEnvios());
                
                aceptarBoton.setEnabled(true);
                
            }else{
                JOptionPane.showMessageDialog(this, "Seleccione un destino para continuar", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Los campos Peso y Fecha de Ingreso son obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_continuarBotonActionPerformed

    private String establecerCategoria(){
        String categoria ="";
        switch(categoriaCombo.getSelectedIndex()){
            case 0:
                categoria = "Documentos";
                break;
            case 1:
                categoria = "Quimicos";
                break;
            case 2:
                categoria = "Automotriz";
                break;
            case 3: 
                categoria = "Manufactura";
                break;
            case 4:
                categoria = "Comercio";
                break;
            case 5:
                categoria = "Tecnologia";
                break;
            case 6:
                categoria = "Salud";
                break;
        }
        
        return categoria;
    }
    
    private void cancelarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBotonActionPerformed
        pesoText.setText("");
        peso = 0;
        categoriaCombo.setSelectedIndex(0);
        
        priorizarRadioBoton.setSelected(false);
        enviosObservable.clear();
        envio = null;
        tablaRutas.clearSelection();
        aceptarBoton.setEnabled(false);
    }//GEN-LAST:event_cancelarBotonActionPerformed

    private void aceptarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarBotonActionPerformed
        
        DatosCliente datos = new DatosCliente(this, sistema, envio);
        datos.setLocationRelativeTo(null);
        datos.setVisible(true);
    }//GEN-LAST:event_aceptarBotonActionPerformed

    private void pesoTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pesoTextKeyTyped
        
    }//GEN-LAST:event_pesoTextKeyTyped

    private void pesoTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pesoTextKeyReleased
        if(!pesoText.getText().equals("")){
            try{
                peso = Double.parseDouble(pesoText.getText());
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(this, "No es un formato de id valido", "Error", JOptionPane.ERROR_MESSAGE);
                pesoText.setText(null);
            }
        }else{
            peso = 0;
        }
    }//GEN-LAST:event_pesoTextKeyReleased

    private void idEnvioTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idEnvioTextKeyTyped
        if(idEnvioText.getText().length() == 12){
            evt.consume();
        }
    }//GEN-LAST:event_idEnvioTextKeyTyped

    private void idEnvioTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idEnvioTextKeyReleased
        if(!idEnvioText.getText().equals("")){
            try{
                idEnvio = Integer.parseInt(idEnvioText.getText());
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(this, "El formato ingresado no es valido", "Error", JOptionPane.ERROR_MESSAGE);
                idEnvioText.setText(null);
            }
        }else{
            idEnvio = 0;
        }
    }//GEN-LAST:event_idEnvioTextKeyReleased

    private void buscarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBotonActionPerformed
        if(!idEnvioText.getText().equals("")){
            consultaObservable.clear();
            String queryEnv = "SELECT * FROM envios WHERE idEnvios = " + idEnvio;
            sistema.MostrarTabla("envios", queryEnv);
            String ubicacion = "";
            try{
                ubicacion = sistema.getEnvios().get(0).getUbicacion();
            }catch(IndexOutOfBoundsException e){
                JOptionPane.showMessageDialog(this, "El id de Envio ingresado no existe", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
            String tabla = "";
            for (int i=0; i<ubicacion.length(); i++) {
                if(ubicacion.charAt(i) == '-'){
                    tabla += "_";
                }else{
                    tabla += ubicacion.charAt(i);
                }
            }
            System.out.println("tabla: " +tabla);
            
            if(!ubicacion.equals("Bodega") && !ubicacion.equals("Bod. Destino") &&  !ubicacion.equals("Entregado") && !tabla.equals("")){
                String query = "SELECT idEnvios, id_Cliente, ingreso, id_Ruta, paisD, ciudad_D, ubicacion, pais_P, "
                        + "ciudad_P, fechaIngreso FROM " + tabla + " INNER JOIN envios on idEnvio = idEnvios INNER JOIN "
                        + "puntosDeControl on ubicacion = codigo WHERE idEnvio = ?";
                
                sistema.ConsultaInner(query, idEnvio);
                consultaObservable.addAll(sistema.getInner_tmp());
            }else if(ubicacion.equals("Bodega") || ubicacion.equals("Bod. Destino") || ubicacion.equals("Entregado")){
                Envios tmp = sistema.getEnvios().get(0);
                ConsultaInner inner = new ConsultaInner(tmp.getIdEnvios(), tmp.getIdCliete(), tmp.getIngreso(), 0, tmp.getPais(), tmp.getCiudad());
                inner.setUbicacion(tmp.getUbicacion());
                consultaObservable.add(inner);
                
            }
        }
        

    }//GEN-LAST:event_buscarBotonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutItem;
    protected javax.swing.JButton aceptarBoton;
    private javax.swing.JButton buscarBoton;
    private javax.swing.JButton cancelarBoton;
    protected javax.swing.JComboBox<String> categoriaCombo;
    private javax.swing.JMenuItem cerrarItem;
    private javax.swing.JButton continuarBoton;
    private javax.swing.JMenu cuentaMenu;
    protected com.toedter.calendar.JDateChooser fechaChooser;
    protected javax.swing.JLabel idEnvioLabel;
    private javax.swing.JTextField idEnvioText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable2;
    private javax.swing.JMenuBar menu;
    private javax.swing.JPanel panelNuevoEnvio;
    protected javax.swing.JTextField pesoText;
    protected javax.swing.JRadioButton priorizarRadioBoton;
    protected javax.swing.JTabbedPane tabbedPane1;
    private javax.swing.JTable tablaEnvio;
    protected javax.swing.JTable tablaRutas;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
    
    public Ruta getRutaSeleccionada() {
        return rutaSeleccionada;
    }

    public void setRutaSeleccionada(Ruta rutaSeleccionada) {
        this.rutaSeleccionada = rutaSeleccionada;
    }

    public ObservableList<Ruta> getRutaObservable() {
        return rutaObservable;
    }

    public void setRutaObservable(ObservableList<Ruta> rutaObservable) {
        this.rutaObservable = rutaObservable;
    }
    
    public ObservableList<Envios> getEnviosObservable() {
        return enviosObservable;
    }

    public void setEnviosObservable(ObservableList<Envios> enviosObservable) {
        this.enviosObservable = enviosObservable;
    }

    public ObservableList<ConsultaInner> getConsultaObservable() {
        return consultaObservable;
    }

    public void setConsultaObservable(ObservableList<ConsultaInner> consultaObservable) {
        this.consultaObservable = consultaObservable;
    }

    public int getIdEnvio() {
        return idEnvio;
    }

    public void setIdEnvio(int idEnvio) {
        this.idEnvio = idEnvio;
    }
}
