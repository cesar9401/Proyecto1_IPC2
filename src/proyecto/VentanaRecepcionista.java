
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
    private Envios envioSeleccionado;
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
        panel_inicio = new javax.swing.JPanel();
        panelNuevoEnvio = new javax.swing.JPanel();
        idEnvioLabel = new javax.swing.JLabel();
        pesoLabel = new javax.swing.JLabel();
        pesoText = new javax.swing.JTextField();
        categoriaLabel = new javax.swing.JLabel();
        categoriaCombo = new javax.swing.JComboBox<>();
        fechaLabel = new javax.swing.JLabel();
        priorizarRadioBoton = new javax.swing.JRadioButton();
        destinoLabel = new javax.swing.JLabel();
        scroll1 = new javax.swing.JScrollPane();
        tablaRutas = new javax.swing.JTable();
        continuarBoton = new javax.swing.JButton();
        panelContinuar = new javax.swing.JPanel();
        scroll2 = new javax.swing.JScrollPane();
        tablaEnvio = new javax.swing.JTable();
        aceptarBoton = new javax.swing.JButton();
        cancelarBoton = new javax.swing.JButton();
        fechaChooser = new com.toedter.calendar.JDateChooser();
        panelBuscarPaquete = new javax.swing.JPanel();
        idEnvioText = new javax.swing.JTextField();
        buscarBoton = new javax.swing.JButton();
        idEnvioLabel2 = new javax.swing.JLabel();
        scroll3 = new javax.swing.JScrollPane();
        scroll4 = new javax.swing.JScrollPane();
        talblaBusqueda = new javax.swing.JTable();
        panelBodegas = new javax.swing.JPanel();
        scrollpane3 = new javax.swing.JScrollPane();
        scrollpane2 = new javax.swing.JScrollPane();
        tablaBodegas = new javax.swing.JTable();
        mostrarBodegas = new javax.swing.JButton();
        RetirarPaquete = new javax.swing.JButton();
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

        javax.swing.GroupLayout panel_inicioLayout = new javax.swing.GroupLayout(panel_inicio);
        panel_inicio.setLayout(panel_inicioLayout);
        panel_inicioLayout.setHorizontalGroup(
            panel_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 616, Short.MAX_VALUE)
        );
        panel_inicioLayout.setVerticalGroup(
            panel_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 737, Short.MAX_VALUE)
        );

        tabbedPane1.addTab("Inicio", panel_inicio);

        idEnvioLabel.setText("Id Envio:");

        pesoLabel.setText("Peso (Lb)");

        pesoText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pesoTextKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pesoTextKeyReleased(evt);
            }
        });

        categoriaLabel.setText("Categoria");

        categoriaCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Documentos", "Quimicos", "Automotriz", "Manufactura", "Comercio Min", "Tecnologia", "Salud" }));

        fechaLabel.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        fechaLabel.setText("Fecha Ingreso");

        priorizarRadioBoton.setText("Priorizar");

        destinoLabel.setText("Destino");

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

        scroll1.setViewportView(tablaRutas);
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
        scroll2.setViewportView(tablaEnvio);
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

        javax.swing.GroupLayout panelContinuarLayout = new javax.swing.GroupLayout(panelContinuar);
        panelContinuar.setLayout(panelContinuarLayout);
        panelContinuarLayout.setHorizontalGroup(
            panelContinuarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContinuarLayout.createSequentialGroup()
                .addGroup(panelContinuarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelContinuarLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(scroll2, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelContinuarLayout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(aceptarBoton)
                        .addGap(61, 61, 61)
                        .addComponent(cancelarBoton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelContinuarLayout.setVerticalGroup(
            panelContinuarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContinuarLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(scroll2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelContinuarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
                        .addComponent(destinoLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNuevoEnvioLayout.createSequentialGroup()
                        .addGroup(panelNuevoEnvioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(scroll1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
                            .addGroup(panelNuevoEnvioLayout.createSequentialGroup()
                                .addGroup(panelNuevoEnvioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNuevoEnvioLayout.createSequentialGroup()
                                        .addComponent(pesoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(panelNuevoEnvioLayout.createSequentialGroup()
                                        .addComponent(fechaLabel)
                                        .addGap(14, 14, 14)))
                                .addGroup(panelNuevoEnvioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelNuevoEnvioLayout.createSequentialGroup()
                                        .addComponent(pesoText, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(categoriaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(fechaChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelNuevoEnvioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(categoriaCombo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(priorizarRadioBoton, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(90, 90, 90))))
            .addComponent(panelContinuar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelNuevoEnvioLayout.setVerticalGroup(
            panelNuevoEnvioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNuevoEnvioLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(idEnvioLabel)
                .addGap(17, 17, 17)
                .addGroup(panelNuevoEnvioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pesoLabel)
                    .addComponent(pesoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoriaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoriaLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelNuevoEnvioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(priorizarRadioBoton)
                    .addComponent(fechaLabel)
                    .addComponent(fechaChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(destinoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scroll1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(continuarBoton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        idEnvioLabel2.setText("Id de Envio");

        scroll3.setMinimumSize(new java.awt.Dimension(562, 250));
        scroll3.setPreferredSize(new java.awt.Dimension(562, 250));

        scroll4.setMinimumSize(new java.awt.Dimension(1000, 250));
        scroll4.setPreferredSize(new java.awt.Dimension(1000, 250));
        scroll4.setRequestFocusEnabled(false);

        eLProperty = org.jdesktop.beansbinding.ELProperty.create("${consultaObservable}");
        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, eLProperty, talblaBusqueda);
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
        scroll4.setViewportView(talblaBusqueda);
        if (talblaBusqueda.getColumnModel().getColumnCount() > 0) {
            talblaBusqueda.getColumnModel().getColumn(0).setMinWidth(70);
            talblaBusqueda.getColumnModel().getColumn(0).setPreferredWidth(70);
            talblaBusqueda.getColumnModel().getColumn(1).setMinWidth(70);
            talblaBusqueda.getColumnModel().getColumn(1).setPreferredWidth(70);
            talblaBusqueda.getColumnModel().getColumn(2).setMinWidth(70);
            talblaBusqueda.getColumnModel().getColumn(2).setPreferredWidth(70);
            talblaBusqueda.getColumnModel().getColumn(3).setMinWidth(100);
            talblaBusqueda.getColumnModel().getColumn(3).setPreferredWidth(100);
            talblaBusqueda.getColumnModel().getColumn(4).setMinWidth(100);
            talblaBusqueda.getColumnModel().getColumn(4).setPreferredWidth(100);
            talblaBusqueda.getColumnModel().getColumn(5).setMinWidth(110);
            talblaBusqueda.getColumnModel().getColumn(5).setPreferredWidth(110);
            talblaBusqueda.getColumnModel().getColumn(6).setMinWidth(100);
            talblaBusqueda.getColumnModel().getColumn(6).setPreferredWidth(100);
            talblaBusqueda.getColumnModel().getColumn(7).setMinWidth(100);
            talblaBusqueda.getColumnModel().getColumn(7).setPreferredWidth(100);
            talblaBusqueda.getColumnModel().getColumn(8).setMinWidth(100);
            talblaBusqueda.getColumnModel().getColumn(8).setPreferredWidth(100);
            talblaBusqueda.getColumnModel().getColumn(9).setMinWidth(80);
            talblaBusqueda.getColumnModel().getColumn(9).setPreferredWidth(80);
            talblaBusqueda.getColumnModel().getColumn(10).setMinWidth(70);
            talblaBusqueda.getColumnModel().getColumn(10).setPreferredWidth(70);
        }

        scroll3.setViewportView(scroll4);

        javax.swing.GroupLayout panelBuscarPaqueteLayout = new javax.swing.GroupLayout(panelBuscarPaquete);
        panelBuscarPaquete.setLayout(panelBuscarPaqueteLayout);
        panelBuscarPaqueteLayout.setHorizontalGroup(
            panelBuscarPaqueteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscarPaqueteLayout.createSequentialGroup()
                .addGroup(panelBuscarPaqueteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBuscarPaqueteLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(idEnvioLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idEnvioText, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buscarBoton))
                    .addGroup(panelBuscarPaqueteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(scroll3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBuscarPaqueteLayout.setVerticalGroup(
            panelBuscarPaqueteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscarPaqueteLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(panelBuscarPaqueteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idEnvioText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarBoton)
                    .addComponent(idEnvioLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scroll3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(433, Short.MAX_VALUE))
        );

        tabbedPane1.addTab("BuscarPaquete", panelBuscarPaquete);

        scrollpane3.setMinimumSize(new java.awt.Dimension(600, 310));
        scrollpane3.setPreferredSize(new java.awt.Dimension(600, 310));

        scrollpane2.setMinimumSize(new java.awt.Dimension(800, 600));
        scrollpane2.setPreferredSize(new java.awt.Dimension(800, 600));

        eLProperty = org.jdesktop.beansbinding.ELProperty.create("${enviosObservable}");
        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, eLProperty, tablaBodegas);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idEnvios}"));
        columnBinding.setColumnName("idEnvio");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idCliete}"));
        columnBinding.setColumnName("Cliente");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idRuta}"));
        columnBinding.setColumnName("idRuta");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${categoria}"));
        columnBinding.setColumnName("Categoria");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${ubicacion}"));
        columnBinding.setColumnName("Ubicacion");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cod_D}"));
        columnBinding.setColumnName("Codigo");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${pais}"));
        columnBinding.setColumnName("Pais");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${ciudad}"));
        columnBinding.setColumnName("Ciudad");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${costo}"));
        columnBinding.setColumnName("Costo");
        columnBinding.setColumnClass(Double.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${montoTotal}"));
        columnBinding.setColumnName("Monto Total");
        columnBinding.setColumnClass(Double.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${envioSeleccionado}"), tablaBodegas, org.jdesktop.beansbinding.BeanProperty.create("selectedElement"));
        bindingGroup.addBinding(binding);

        scrollpane2.setViewportView(tablaBodegas);
        if (tablaBodegas.getColumnModel().getColumnCount() > 0) {
            tablaBodegas.getColumnModel().getColumn(0).setMinWidth(60);
            tablaBodegas.getColumnModel().getColumn(0).setPreferredWidth(60);
            tablaBodegas.getColumnModel().getColumn(1).setMinWidth(60);
            tablaBodegas.getColumnModel().getColumn(1).setPreferredWidth(60);
            tablaBodegas.getColumnModel().getColumn(2).setMinWidth(60);
            tablaBodegas.getColumnModel().getColumn(2).setPreferredWidth(60);
            tablaBodegas.getColumnModel().getColumn(6).setMinWidth(100);
            tablaBodegas.getColumnModel().getColumn(6).setPreferredWidth(100);
            tablaBodegas.getColumnModel().getColumn(7).setMinWidth(120);
            tablaBodegas.getColumnModel().getColumn(7).setPreferredWidth(120);
        }

        scrollpane3.setViewportView(scrollpane2);

        mostrarBodegas.setText("MostrarBodegas");
        mostrarBodegas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarBodegasActionPerformed(evt);
            }
        });

        RetirarPaquete.setText("Retirar Paquete");
        RetirarPaquete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetirarPaqueteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBodegasLayout = new javax.swing.GroupLayout(panelBodegas);
        panelBodegas.setLayout(panelBodegasLayout);
        panelBodegasLayout.setHorizontalGroup(
            panelBodegasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBodegasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBodegasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollpane3, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
                    .addGroup(panelBodegasLayout.createSequentialGroup()
                        .addComponent(mostrarBodegas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RetirarPaquete)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelBodegasLayout.setVerticalGroup(
            panelBodegasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBodegasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollpane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBodegasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mostrarBodegas)
                    .addComponent(RetirarPaquete))
                .addContainerGap(378, Short.MAX_VALUE))
        );

        tabbedPane1.addTab("Bodegas", panelBodegas);

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
                .addComponent(tabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 592, Short.MAX_VALUE)
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
        ArrayList<Ruta> tmp = sistema.getRutas();
        for (int i=0; i<tmp.size(); i++){
            for (int j=i+1; j<tmp.size(); j++) {
                if(tmp.get(i).getCod_D().equals(tmp.get(j).getCod_D())){
                    tmp.remove(j);
                }
            }
        }
        rutaObservable.addAll(tmp);
        sistema.MostrarTabla("envios", "");
        enviosObservable.addAll(sistema.getEnvios());
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

    private void mostrarBodegasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarBodegasActionPerformed
        String query = "SELECT * FROM envios WHERE ubicacion = " + "\"" + "Bod. Destino" + "\"";
        sistema.MostrarTabla("envios", query);
        enviosObservable.clear();
        enviosObservable.addAll(sistema.getEnvios());
    }//GEN-LAST:event_mostrarBodegasActionPerformed

    private void RetirarPaqueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetirarPaqueteActionPerformed
        if(envioSeleccionado != null){
            String query = "UPDATE envios SET ubicacion = " + "\"" + "Entregado" + "\"" + " WHERE idEnvios = " + envioSeleccionado.getIdEnvios();
            sistema.IngresarEliminarEnTabla(query);
            
            mostrarBodegasActionPerformed(evt);
        }else{
            JOptionPane.showMessageDialog(this, "Seleccione un paquete para poder retirarlo", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_RetirarPaqueteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RetirarPaquete;
    private javax.swing.JMenuItem aboutItem;
    protected javax.swing.JButton aceptarBoton;
    private javax.swing.JButton buscarBoton;
    private javax.swing.JButton cancelarBoton;
    protected javax.swing.JComboBox<String> categoriaCombo;
    private javax.swing.JLabel categoriaLabel;
    private javax.swing.JMenuItem cerrarItem;
    private javax.swing.JButton continuarBoton;
    private javax.swing.JMenu cuentaMenu;
    private javax.swing.JLabel destinoLabel;
    protected com.toedter.calendar.JDateChooser fechaChooser;
    private javax.swing.JLabel fechaLabel;
    protected javax.swing.JLabel idEnvioLabel;
    private javax.swing.JLabel idEnvioLabel2;
    private javax.swing.JTextField idEnvioText;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuBar menu;
    private javax.swing.JButton mostrarBodegas;
    private javax.swing.JPanel panelBodegas;
    private javax.swing.JPanel panelBuscarPaquete;
    private javax.swing.JPanel panelContinuar;
    private javax.swing.JPanel panelNuevoEnvio;
    private javax.swing.JPanel panel_inicio;
    private javax.swing.JLabel pesoLabel;
    protected javax.swing.JTextField pesoText;
    protected javax.swing.JRadioButton priorizarRadioBoton;
    private javax.swing.JScrollPane scroll1;
    private javax.swing.JScrollPane scroll2;
    private javax.swing.JScrollPane scroll3;
    private javax.swing.JScrollPane scroll4;
    private javax.swing.JScrollPane scrollpane2;
    private javax.swing.JScrollPane scrollpane3;
    protected javax.swing.JTabbedPane tabbedPane1;
    private javax.swing.JTable tablaBodegas;
    private javax.swing.JTable tablaEnvio;
    protected javax.swing.JTable tablaRutas;
    private javax.swing.JTable talblaBusqueda;
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

    public Envios getEnvioSeleccionado() {
        return envioSeleccionado;
    }

    public void setEnvioSeleccionado(Envios envioSeleccionado) {
        this.envioSeleccionado = envioSeleccionado;
    }
}
