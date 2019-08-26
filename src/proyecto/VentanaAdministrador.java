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
public class VentanaAdministrador extends javax.swing.JFrame{

    Sistema sistema;
    String usuario;
    private Usuario usuarioSeleccionado;
    private PuntosDeControl puntoSeleccionado;
    private Ruta rutaSeleccionada;
    
    private ObservableList<Usuario> usuariosObservable;
    private List<Usuario> listadoUsuario = new ArrayList<>();
    
    private ObservableList<Ruta> rutaObservable;
    private List<Ruta> listadoRuta = new ArrayList<>();
    private ObservableList<PuntosDeControl> puntosObservable;
    private List<PuntosDeControl> listadoPuntos = new ArrayList<>();
    
    private ObservableList<Precios> preciosObservable;
    private List<Precios> listadoPrecios = new ArrayList<>();
    
    private ObservableList<Cliente> clientesObservable;
    private List<Cliente> listadoClientes = new ArrayList<>();
    private Cliente clienteSeleccionado;
    
    
    public VentanaAdministrador(Sistema sistema, String usuario) {
        usuariosObservable = ObservableCollections.observableList(listadoUsuario);
        rutaObservable = ObservableCollections.observableList(listadoRuta);
        puntosObservable = ObservableCollections.observableList(listadoPuntos);
        preciosObservable = ObservableCollections.observableList(listadoPrecios);
        clientesObservable = ObservableCollections.observableList(listadoClientes);
        this.sistema = sistema;
        this.usuario = usuario;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        panelTabbed = new javax.swing.JTabbedPane();
        inicioPanel = new javax.swing.JPanel();
        usuariosPanel = new javax.swing.JPanel();
        usuariosScroll = new javax.swing.JScrollPane();
        usuariosTabla = new javax.swing.JTable();
        mostrarUsuarios = new javax.swing.JButton();
        eliminarBoton = new javax.swing.JButton();
        nuevoBoton = new javax.swing.JButton();
        puntosDeControlPanel = new javax.swing.JPanel();
        mostrarPuntos = new javax.swing.JButton();
        nuevoPCBoton = new javax.swing.JButton();
        eliminarPuntoBoton = new javax.swing.JButton();
        editarPunto = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        rutasPanel = new javax.swing.JPanel();
        mostrarRutas = new javax.swing.JButton();
        rutasScroll2 = new javax.swing.JScrollPane();
        rutasScroll = new javax.swing.JScrollPane();
        rutasTabla = new javax.swing.JTable();
        nuevaRutaBoton = new javax.swing.JButton();
        eliminarRutaBoton = new javax.swing.JButton();
        reporteRuta = new javax.swing.JButton();
        clientesPanel = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        mostrarClientes = new javax.swing.JButton();
        reporteCliente = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        cuentaMenu = new javax.swing.JMenu();
        aboutItem = new javax.swing.JMenuItem();
        cerrarSesionItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelTabbed.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);
        panelTabbed.setMinimumSize(new java.awt.Dimension(622, 647));

        javax.swing.GroupLayout inicioPanelLayout = new javax.swing.GroupLayout(inicioPanel);
        inicioPanel.setLayout(inicioPanelLayout);
        inicioPanelLayout.setHorizontalGroup(
            inicioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );
        inicioPanelLayout.setVerticalGroup(
            inicioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 622, Short.MAX_VALUE)
        );

        panelTabbed.addTab("Inicio", inicioPanel);

        usuariosPanel.setPreferredSize(new java.awt.Dimension(600, 612));

        usuariosScroll.setPreferredSize(new java.awt.Dimension(600, 400));

        usuariosTabla.setMinimumSize(new java.awt.Dimension(600, 500));
        usuariosTabla.setPreferredSize(new java.awt.Dimension(600, 500));

        org.jdesktop.beansbinding.ELProperty eLProperty = org.jdesktop.beansbinding.ELProperty.create("${usuariosObservable}");
        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, eLProperty, usuariosTabla);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${usuario}"));
        columnBinding.setColumnName("Usuario");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tipoUsuario}"));
        columnBinding.setColumnName("Tipo Usuario");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nombre}"));
        columnBinding.setColumnName("Nombre");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${apellidos}"));
        columnBinding.setColumnName("Apellidos");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${usuarioSeleccionado}"), usuariosTabla, org.jdesktop.beansbinding.BeanProperty.create("selectedElement"));
        bindingGroup.addBinding(binding);

        usuariosScroll.setViewportView(usuariosTabla);

        mostrarUsuarios.setText("Mostrar");
        mostrarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarUsuariosActionPerformed(evt);
            }
        });

        eliminarBoton.setText("Eliminar Usuario");
        eliminarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarBotonActionPerformed(evt);
            }
        });

        nuevoBoton.setText("Nuevo Usuario");
        nuevoBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoBotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout usuariosPanelLayout = new javax.swing.GroupLayout(usuariosPanel);
        usuariosPanel.setLayout(usuariosPanelLayout);
        usuariosPanelLayout.setHorizontalGroup(
            usuariosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usuariosPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(usuariosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(usuariosPanelLayout.createSequentialGroup()
                        .addComponent(mostrarUsuarios)
                        .addGap(18, 18, 18)
                        .addComponent(eliminarBoton)
                        .addGap(18, 18, 18)
                        .addComponent(nuevoBoton))
                    .addComponent(usuariosScroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        usuariosPanelLayout.setVerticalGroup(
            usuariosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usuariosPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(usuariosScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(usuariosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mostrarUsuarios)
                    .addComponent(eliminarBoton)
                    .addComponent(nuevoBoton))
                .addContainerGap(213, Short.MAX_VALUE))
        );

        panelTabbed.addTab("Usuarios", usuariosPanel);

        mostrarPuntos.setText("Mostrar");
        mostrarPuntos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarPuntosActionPerformed(evt);
            }
        });

        nuevoPCBoton.setText("Nuevo Punto de Control");
        nuevoPCBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoPCBotonActionPerformed(evt);
            }
        });

        eliminarPuntoBoton.setText("Eliminar");
        eliminarPuntoBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarPuntoBotonActionPerformed(evt);
            }
        });

        editarPunto.setText("Editar");
        editarPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarPuntoActionPerformed(evt);
            }
        });

        jScrollPane3.setMinimumSize(new java.awt.Dimension(599, 320));
        jScrollPane3.setPreferredSize(new java.awt.Dimension(599, 320));

        jScrollPane2.setMinimumSize(new java.awt.Dimension(580, 1000));
        jScrollPane2.setPreferredSize(new java.awt.Dimension(580, 1000));

        eLProperty = org.jdesktop.beansbinding.ELProperty.create("${puntosObservable}");
        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, eLProperty, jTable1);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codigo}"));
        columnBinding.setColumnName("Codigo");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${pais}"));
        columnBinding.setColumnName("Pais");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nombreCiudad}"));
        columnBinding.setColumnName("Ciudad");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tamañoBodega}"));
        columnBinding.setColumnName("TamañoBodega");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tarifa}"));
        columnBinding.setColumnName("Tarifa");
        columnBinding.setColumnClass(Double.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${encargado}"));
        columnBinding.setColumnName("Encargado");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${puntoSeleccionado}"), jTable1, org.jdesktop.beansbinding.BeanProperty.create("selectedElement"));
        bindingGroup.addBinding(binding);

        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(80);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(80);
            jTable1.getColumnModel().getColumn(1).setMinWidth(100);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(2).setMinWidth(120);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(120);
            jTable1.getColumnModel().getColumn(3).setMinWidth(60);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(60);
            jTable1.getColumnModel().getColumn(4).setMinWidth(70);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(70);
            jTable1.getColumnModel().getColumn(5).setMinWidth(80);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(80);
        }

        jScrollPane3.setViewportView(jScrollPane2);

        javax.swing.GroupLayout puntosDeControlPanelLayout = new javax.swing.GroupLayout(puntosDeControlPanel);
        puntosDeControlPanel.setLayout(puntosDeControlPanelLayout);
        puntosDeControlPanelLayout.setHorizontalGroup(
            puntosDeControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(puntosDeControlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(puntosDeControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(puntosDeControlPanelLayout.createSequentialGroup()
                        .addComponent(mostrarPuntos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nuevoPCBoton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editarPunto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(eliminarPuntoBoton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        puntosDeControlPanelLayout.setVerticalGroup(
            puntosDeControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(puntosDeControlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(puntosDeControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mostrarPuntos)
                    .addComponent(nuevoPCBoton)
                    .addComponent(editarPunto)
                    .addComponent(eliminarPuntoBoton))
                .addGap(87, 87, 87))
        );

        panelTabbed.addTab("Puntos de Control", puntosDeControlPanel);

        mostrarRutas.setText("Mostrar");
        mostrarRutas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarRutasActionPerformed(evt);
            }
        });

        rutasScroll2.setMinimumSize(new java.awt.Dimension(600, 350));
        rutasScroll2.setPreferredSize(new java.awt.Dimension(600, 350));

        rutasScroll.setMinimumSize(new java.awt.Dimension(1150, 600));
        rutasScroll.setPreferredSize(new java.awt.Dimension(1150, 600));

        eLProperty = org.jdesktop.beansbinding.ELProperty.create("${rutaObservable}");
        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, eLProperty, rutasTabla);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idRutas}"));
        columnBinding.setColumnName("Id Rutas");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cod_D}"));
        columnBinding.setColumnName("Cod_ D");
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
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${precio}"));
        columnBinding.setColumnName("Precio");
        columnBinding.setColumnClass(Double.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${puntosC}"));
        columnBinding.setColumnName("Puntos C");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${pc1}"));
        columnBinding.setColumnName("Pc1");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${pc2}"));
        columnBinding.setColumnName("Pc2");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${pc3}"));
        columnBinding.setColumnName("Pc3");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${pc4}"));
        columnBinding.setColumnName("Pc4");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${pc5}"));
        columnBinding.setColumnName("Pc5");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${rutaSeleccionada}"), rutasTabla, org.jdesktop.beansbinding.BeanProperty.create("selectedElement"));
        bindingGroup.addBinding(binding);

        rutasScroll.setViewportView(rutasTabla);
        if (rutasTabla.getColumnModel().getColumnCount() > 0) {
            rutasTabla.getColumnModel().getColumn(0).setMinWidth(60);
            rutasTabla.getColumnModel().getColumn(0).setPreferredWidth(60);
            rutasTabla.getColumnModel().getColumn(1).setResizable(false);
            rutasTabla.getColumnModel().getColumn(2).setMinWidth(160);
            rutasTabla.getColumnModel().getColumn(2).setPreferredWidth(160);
            rutasTabla.getColumnModel().getColumn(3).setMinWidth(160);
            rutasTabla.getColumnModel().getColumn(3).setPreferredWidth(160);
            rutasTabla.getColumnModel().getColumn(4).setResizable(false);
            rutasTabla.getColumnModel().getColumn(5).setResizable(false);
            rutasTabla.getColumnModel().getColumn(6).setResizable(false);
            rutasTabla.getColumnModel().getColumn(7).setResizable(false);
            rutasTabla.getColumnModel().getColumn(8).setResizable(false);
            rutasTabla.getColumnModel().getColumn(9).setResizable(false);
            rutasTabla.getColumnModel().getColumn(10).setResizable(false);
        }

        rutasScroll2.setViewportView(rutasScroll);

        nuevaRutaBoton.setText("Nueva Ruta");
        nuevaRutaBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevaRutaBotonActionPerformed(evt);
            }
        });

        eliminarRutaBoton.setText("Eliminar Ruta");
        eliminarRutaBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarRutaBotonActionPerformed(evt);
            }
        });

        reporteRuta.setText("Reporte de Ruta");
        reporteRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reporteRutaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rutasPanelLayout = new javax.swing.GroupLayout(rutasPanel);
        rutasPanel.setLayout(rutasPanelLayout);
        rutasPanelLayout.setHorizontalGroup(
            rutasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rutasPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rutasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rutasScroll2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(rutasPanelLayout.createSequentialGroup()
                        .addComponent(mostrarRutas)
                        .addGap(18, 18, 18)
                        .addComponent(nuevaRutaBoton)
                        .addGap(18, 18, 18)
                        .addComponent(eliminarRutaBoton)
                        .addGap(18, 18, 18)
                        .addComponent(reporteRuta)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        rutasPanelLayout.setVerticalGroup(
            rutasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rutasPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rutasScroll2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(rutasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mostrarRutas)
                    .addComponent(nuevaRutaBoton)
                    .addComponent(eliminarRutaBoton)
                    .addComponent(reporteRuta))
                .addContainerGap(217, Short.MAX_VALUE))
        );

        panelTabbed.addTab("Rutas", rutasPanel);

        jScrollPane5.setMinimumSize(new java.awt.Dimension(599, 320));
        jScrollPane5.setPreferredSize(new java.awt.Dimension(599, 320));

        jScrollPane1.setMinimumSize(new java.awt.Dimension(800, 600));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(800, 600));

        eLProperty = org.jdesktop.beansbinding.ELProperty.create("${clientesObservable}");
        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, eLProperty, jTable2);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${id_Cliente}"));
        columnBinding.setColumnName("idCliente");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nit}"));
        columnBinding.setColumnName("Nit");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nombre}"));
        columnBinding.setColumnName("Nombre");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${telefono}"));
        columnBinding.setColumnName("Telefono");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${email}"));
        columnBinding.setColumnName("Email");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${direccion}"));
        columnBinding.setColumnName("Direccion");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${clienteSeleccionado}"), jTable2, org.jdesktop.beansbinding.BeanProperty.create("selectedElement"));
        bindingGroup.addBinding(binding);

        jScrollPane1.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setMinWidth(60);
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(60);
            jTable2.getColumnModel().getColumn(1).setMinWidth(70);
            jTable2.getColumnModel().getColumn(1).setPreferredWidth(70);
            jTable2.getColumnModel().getColumn(2).setMinWidth(180);
            jTable2.getColumnModel().getColumn(2).setPreferredWidth(180);
            jTable2.getColumnModel().getColumn(3).setMinWidth(70);
            jTable2.getColumnModel().getColumn(3).setPreferredWidth(70);
            jTable2.getColumnModel().getColumn(4).setMinWidth(180);
            jTable2.getColumnModel().getColumn(4).setPreferredWidth(180);
            jTable2.getColumnModel().getColumn(5).setMinWidth(220);
            jTable2.getColumnModel().getColumn(5).setPreferredWidth(220);
        }

        jScrollPane5.setViewportView(jScrollPane1);

        mostrarClientes.setText("Mostrar");
        mostrarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarClientesActionPerformed(evt);
            }
        });

        reporteCliente.setText("Reporte de Cliente");
        reporteCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reporteClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout clientesPanelLayout = new javax.swing.GroupLayout(clientesPanel);
        clientesPanel.setLayout(clientesPanelLayout);
        clientesPanelLayout.setHorizontalGroup(
            clientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clientesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(clientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(clientesPanelLayout.createSequentialGroup()
                        .addComponent(mostrarClientes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(reporteCliente)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        clientesPanelLayout.setVerticalGroup(
            clientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clientesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(clientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mostrarClientes)
                    .addComponent(reporteCliente))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        panelTabbed.addTab("Clientes", clientesPanel);

        cuentaMenu.setText("Cuenta");

        aboutItem.setText("About...");
        cuentaMenu.add(aboutItem);

        cerrarSesionItem.setText("Cerrar Sesión");
        cerrarSesionItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesionItemActionPerformed(evt);
            }
        });
        cuentaMenu.add(cerrarSesionItem);

        menuBar.add(cuentaMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTabbed, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelTabbed, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Metodo para cerrrar sesion mediante un menu item
    private void cerrarSesionItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesionItemActionPerformed
        this.setVisible(false);
        this.removeAll();
        sistema.inicio.setVisible(true);
    }//GEN-LAST:event_cerrarSesionItemActionPerformed

    //Metodo para mostrar las rutas en su tabla correspondiente
    private void mostrarRutasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarRutasActionPerformed
        rutaObservable.clear();
        sistema.MostrarTabla("rutas", "");
        rutaObservable.addAll(sistema.getRutas());
    }//GEN-LAST:event_mostrarRutasActionPerformed

    //Boton para mostrar el Dialog para la creacion de un nuevo usuario
    private void nuevoBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoBotonActionPerformed
        NuevoUsuarioDialog nuevoUsuario = new NuevoUsuarioDialog(this, sistema);
        nuevoUsuario.setLocationRelativeTo(null);
        nuevoUsuario.setVisible(true);
    }//GEN-LAST:event_nuevoBotonActionPerformed

    //Metodo para eliminar a un usuario seleccionado de la tabla de usuarios
    private void eliminarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarBotonActionPerformed
        if(usuarioSeleccionado == null){
            JOptionPane.showMessageDialog(this, "Seleccione un usuario", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            if(!usuarioSeleccionado.getUsuario().equals(usuario)){
                String query ="DELETE from usuarios where usuario = "+"\""+usuarioSeleccionado.getUsuario()+"\"";
                sistema.IngresarEliminarEnTabla(query);
                mostrarUsuariosActionPerformed(evt);
            }
        }
    }//GEN-LAST:event_eliminarBotonActionPerformed

    //Metodo para mostrar la tabla de usuarios
    private void mostrarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarUsuariosActionPerformed
        usuariosObservable.clear();
        sistema.MostrarTabla("usuarios", "");
        usuariosObservable.addAll(sistema.getUsuarios());
    }//GEN-LAST:event_mostrarUsuariosActionPerformed

    private void nuevaRutaBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevaRutaBotonActionPerformed
        NuevaRutaDialog nuevaRuta = new NuevaRutaDialog(this, sistema);
        nuevaRuta.setLocationRelativeTo(null);
        nuevaRuta.setVisible(true);
//        cancelarRutaActionPerformed(evt);
//        nuevaRuta.setLocationRelativeTo(null);
//        nuevaRuta.setVisible(true);
    }//GEN-LAST:event_nuevaRutaBotonActionPerformed

    //Metodo para mostrar el Dialog para la creacion de un nuevo punto de control
    private void nuevoPCBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoPCBotonActionPerformed
        NuevoPuntoDialog nuevoPunto = new NuevoPuntoDialog(this, sistema);
        nuevoPunto.setLocationRelativeTo(null);
        nuevoPunto.setVisible(true);
    }//GEN-LAST:event_nuevoPCBotonActionPerformed

    //Metodo para mostrar la tabla de puntosDeControl
    private void mostrarPuntosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarPuntosActionPerformed
        puntosObservable.clear();
        sistema.MostrarTabla("puntosDeControl", "");
        puntosObservable.addAll(sistema.getPuntosDeControl());
    }//GEN-LAST:event_mostrarPuntosActionPerformed

    private void eliminarPuntoBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarPuntoBotonActionPerformed
        if(puntoSeleccionado == null){
            JOptionPane.showMessageDialog(this, "Seleccione un punto de control", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            System.out.println(puntoSeleccionado.getTarifa());
        }
    }//GEN-LAST:event_eliminarPuntoBotonActionPerformed

    private void editarPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarPuntoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editarPuntoActionPerformed

    private void eliminarRutaBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarRutaBotonActionPerformed
        if(rutaSeleccionada != null){
        
        }else{
            JOptionPane.showMessageDialog(this, "Seleccione una ruta para poder eliminarla", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_eliminarRutaBotonActionPerformed

    private void reporteRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporteRutaActionPerformed
        if(rutaSeleccionada != null){
            ReporteRutas reporte = new ReporteRutas(this, sistema, rutaSeleccionada);
            reporte.setLocationRelativeTo(null);
            reporte.inicializarComponentes();
            reporte.setVisible(true);
        
        }else{
            JOptionPane.showMessageDialog(this, "Seleccione una ruta para poder visualisar su reporte", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_reporteRutaActionPerformed

    private void mostrarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarClientesActionPerformed
        clientesObservable.clear();
        sistema.MostrarTabla("clientes", "");
        clientesObservable.addAll(sistema.getClientes());
    }//GEN-LAST:event_mostrarClientesActionPerformed

    private void reporteClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporteClienteActionPerformed
        if(clienteSeleccionado != null){
            ReporteClientes reporte = new ReporteClientes(this, sistema, clienteSeleccionado);
            reporte.setLocationRelativeTo(null);
            reporte.inicializarComponentes();
            reporte.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(this, "Seleccione un cliente para poder visualisar su reporte", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_reporteClienteActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutItem;
    private javax.swing.JMenuItem cerrarSesionItem;
    private javax.swing.JPanel clientesPanel;
    private javax.swing.JMenu cuentaMenu;
    private javax.swing.JButton editarPunto;
    private javax.swing.JButton eliminarBoton;
    private javax.swing.JButton eliminarPuntoBoton;
    private javax.swing.JButton eliminarRutaBoton;
    private javax.swing.JPanel inicioPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JButton mostrarClientes;
    private javax.swing.JButton mostrarPuntos;
    private javax.swing.JButton mostrarRutas;
    protected javax.swing.JButton mostrarUsuarios;
    private javax.swing.JButton nuevaRutaBoton;
    private javax.swing.JButton nuevoBoton;
    private javax.swing.JButton nuevoPCBoton;
    private javax.swing.JTabbedPane panelTabbed;
    private javax.swing.JPanel puntosDeControlPanel;
    private javax.swing.JButton reporteCliente;
    private javax.swing.JButton reporteRuta;
    private javax.swing.JPanel rutasPanel;
    private javax.swing.JScrollPane rutasScroll;
    private javax.swing.JScrollPane rutasScroll2;
    private javax.swing.JTable rutasTabla;
    private javax.swing.JPanel usuariosPanel;
    private javax.swing.JScrollPane usuariosScroll;
    private javax.swing.JTable usuariosTabla;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    //Metodos Getters y Setters de los listados Observables
    public ObservableList<Usuario> getUsuariosObservable() {
        return usuariosObservable;
    }

    public void setUsuariosObservable(ObservableList<Usuario> usuariosObservable) {
        this.usuariosObservable = usuariosObservable;
    }
    
    public Usuario getUsuarioSeleccionado() {
        return usuarioSeleccionado;
    }

    public void setUsuarioSeleccionado(Usuario usuarioSeleccionado) {
        this.usuarioSeleccionado = usuarioSeleccionado;
    }
    
    public ObservableList<Ruta> getRutaObservable() {
        return rutaObservable;
    }

    public void setRutaObservable(ObservableList<Ruta> rutaObservable) {
        this.rutaObservable = rutaObservable;
    }
    
    public ObservableList<PuntosDeControl> getPuntosObservable() {
        return puntosObservable;
    }

    public void setPuntosObservable(ObservableList<PuntosDeControl> puntosObservable) {
        this.puntosObservable = puntosObservable;
    }
    
    public PuntosDeControl getPuntoSeleccionado() {
        return puntoSeleccionado;
    }

    public void setPuntoSeleccionado(PuntosDeControl puntoSeleccionado) {
        this.puntoSeleccionado = puntoSeleccionado;
    }
    
    public ObservableList<Precios> getPreciosObservable() {
        return preciosObservable;
    }

    public void setPreciosObservable(ObservableList<Precios> preciosObservable) {
        this.preciosObservable = preciosObservable;
    }

    public Ruta getRutaSeleccionada() {
        return rutaSeleccionada;
    }

    public void setRutaSeleccionada(Ruta rutaSeleccionada) {
        this.rutaSeleccionada = rutaSeleccionada;
    }

    public ObservableList<Cliente> getClientesObservable() {
        return clientesObservable;
    }

    public void setClientesObservable(ObservableList<Cliente> clientesObservable) {
        this.clientesObservable = clientesObservable;
    }

    public Cliente getClienteSeleccionado() {
        return clienteSeleccionado;
    }

    public void setClienteSeleccionado(Cliente clienteSeleccionado) {
        this.clienteSeleccionado = clienteSeleccionado;
    }
}