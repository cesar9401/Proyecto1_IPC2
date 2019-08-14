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
    
    private ObservableList<Usuario> usuariosObservable;
    private List<Usuario> listadoUsuario = new ArrayList<>();
    
    private ObservableList<Ruta> rutaObservable;
    private List<Ruta> listadoRuta = new ArrayList<>();
    private ObservableList<PuntosDeControl> puntosObservable;
    private List<PuntosDeControl> listadoPuntos = new ArrayList<>();

    
    public VentanaAdministrador(Sistema sistema, String usuario) {
        usuariosObservable = ObservableCollections.observableList(listadoUsuario);
        rutaObservable = ObservableCollections.observableList(listadoRuta);
        puntosObservable = ObservableCollections.observableList(listadoPuntos);
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
        puntosScroll = new javax.swing.JScrollPane();
        puntosTabla = new javax.swing.JTable();
        mostrarPuntos = new javax.swing.JButton();
        nuevoPCBoton = new javax.swing.JButton();
        eliminarPuntoBoton = new javax.swing.JButton();
        rutasPanel = new javax.swing.JPanel();
        mostrarRutas = new javax.swing.JButton();
        rutasScroll2 = new javax.swing.JScrollPane();
        rutasScroll = new javax.swing.JScrollPane();
        rutasTabla = new javax.swing.JTable();
        nuevaRutaBoton = new javax.swing.JButton();
        eliminarRutaBoton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
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
            .addGap(0, 611, Short.MAX_VALUE)
        );
        inicioPanelLayout.setVerticalGroup(
            inicioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 459, Short.MAX_VALUE)
        );

        panelTabbed.addTab("Inicio", inicioPanel);

        usuariosPanel.setPreferredSize(new java.awt.Dimension(600, 612));

        usuariosScroll.setPreferredSize(new java.awt.Dimension(600, 400));

        usuariosTabla.setMinimumSize(new java.awt.Dimension(600, 350));
        usuariosTabla.setPreferredSize(new java.awt.Dimension(600, 350));

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
                .addContainerGap(50, Short.MAX_VALUE))
        );

        panelTabbed.addTab("Usuarios", usuariosPanel);

        puntosScroll.setMinimumSize(new java.awt.Dimension(600, 350));
        puntosScroll.setPreferredSize(new java.awt.Dimension(600, 350));

        puntosTabla.setMinimumSize(new java.awt.Dimension(640, 350));
        puntosTabla.setPreferredSize(new java.awt.Dimension(640, 350));

        eLProperty = org.jdesktop.beansbinding.ELProperty.create("${puntosObservable}");
        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, eLProperty, puntosTabla);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codigo}"));
        columnBinding.setColumnName("Codigo");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nombreCiudad}"));
        columnBinding.setColumnName("Nombre Ciudad");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tamañoBodega}"));
        columnBinding.setColumnName("Tamaño de Bodega");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tarifa}"));
        columnBinding.setColumnName("Tarifa de Operacion");
        columnBinding.setColumnClass(Double.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${puntoSeleccionado}"), puntosTabla, org.jdesktop.beansbinding.BeanProperty.create("selectedElement"));
        bindingGroup.addBinding(binding);

        puntosScroll.setViewportView(puntosTabla);
        if (puntosTabla.getColumnModel().getColumnCount() > 0) {
            puntosTabla.getColumnModel().getColumn(0).setResizable(false);
            puntosTabla.getColumnModel().getColumn(0).setPreferredWidth(100);
            puntosTabla.getColumnModel().getColumn(1).setResizable(false);
            puntosTabla.getColumnModel().getColumn(2).setResizable(false);
            puntosTabla.getColumnModel().getColumn(3).setResizable(false);
        }

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

        javax.swing.GroupLayout puntosDeControlPanelLayout = new javax.swing.GroupLayout(puntosDeControlPanel);
        puntosDeControlPanel.setLayout(puntosDeControlPanelLayout);
        puntosDeControlPanelLayout.setHorizontalGroup(
            puntosDeControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(puntosDeControlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(puntosDeControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(puntosDeControlPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(mostrarPuntos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nuevoPCBoton)
                        .addGap(18, 18, 18)
                        .addComponent(eliminarPuntoBoton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(puntosDeControlPanelLayout.createSequentialGroup()
                        .addComponent(puntosScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        puntosDeControlPanelLayout.setVerticalGroup(
            puntosDeControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(puntosDeControlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(puntosScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(puntosDeControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mostrarPuntos)
                    .addComponent(nuevoPCBoton)
                    .addComponent(eliminarPuntoBoton))
                .addContainerGap(64, Short.MAX_VALUE))
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

        rutasScroll.setMinimumSize(new java.awt.Dimension(1150, 350));
        rutasScroll.setPreferredSize(new java.awt.Dimension(1150, 350));

        eLProperty = org.jdesktop.beansbinding.ELProperty.create("${rutaObservable}");
        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, eLProperty, rutasTabla);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idRutas}"));
        columnBinding.setColumnName("Id Ruta");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cod_D}"));
        columnBinding.setColumnName("Cod_ D");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${name_D}"));
        columnBinding.setColumnName("Name_ D");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${precio}"));
        columnBinding.setColumnName("Precio Destino");
        columnBinding.setColumnClass(Double.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${puntosC}"));
        columnBinding.setColumnName("Puntos Control");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${pc1}"));
        columnBinding.setColumnName("Pc1");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${pc2}"));
        columnBinding.setColumnName("Pc2");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${pc3}"));
        columnBinding.setColumnName("Pc3");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${pc4}"));
        columnBinding.setColumnName("Pc4");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${pc5}"));
        columnBinding.setColumnName("Pc5");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        rutasScroll.setViewportView(rutasTabla);
        if (rutasTabla.getColumnModel().getColumnCount() > 0) {
            rutasTabla.getColumnModel().getColumn(0).setMinWidth(25);
            rutasTabla.getColumnModel().getColumn(0).setPreferredWidth(25);
            rutasTabla.getColumnModel().getColumn(1).setMinWidth(100);
            rutasTabla.getColumnModel().getColumn(2).setMinWidth(180);
            rutasTabla.getColumnModel().getColumn(2).setPreferredWidth(180);
            rutasTabla.getColumnModel().getColumn(3).setMinWidth(70);
            rutasTabla.getColumnModel().getColumn(4).setMinWidth(70);
            rutasTabla.getColumnModel().getColumn(5).setMinWidth(90);
            rutasTabla.getColumnModel().getColumn(6).setMinWidth(90);
            rutasTabla.getColumnModel().getColumn(7).setMinWidth(90);
            rutasTabla.getColumnModel().getColumn(8).setMinWidth(90);
            rutasTabla.getColumnModel().getColumn(9).setMinWidth(90);
        }

        rutasScroll2.setViewportView(rutasScroll);

        nuevaRutaBoton.setText("Nueva Ruta");
        nuevaRutaBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevaRutaBotonActionPerformed(evt);
            }
        });

        eliminarRutaBoton.setText("Eliminar Ruta");

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
                    .addComponent(eliminarRutaBoton))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        panelTabbed.addTab("Rutas", rutasPanel);

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

        jMenuBar1.add(cuentaMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTabbed, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
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
        sistema.MostrarTabla("rutas");
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
        sistema.MostrarTabla("usuarios");
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
        sistema.MostrarTabla("puntosDeControl");
    }//GEN-LAST:event_mostrarPuntosActionPerformed

    private void eliminarPuntoBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarPuntoBotonActionPerformed
        if(puntoSeleccionado == null){
            JOptionPane.showMessageDialog(this, "Seleccione un punto de control", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            System.out.println(puntoSeleccionado.getNombreCiudad());
        }
    }//GEN-LAST:event_eliminarPuntoBotonActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutItem;
    private javax.swing.JMenuItem cerrarSesionItem;
    private javax.swing.JMenu cuentaMenu;
    private javax.swing.JButton eliminarBoton;
    private javax.swing.JButton eliminarPuntoBoton;
    private javax.swing.JButton eliminarRutaBoton;
    private javax.swing.JPanel inicioPanel;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JButton mostrarPuntos;
    private javax.swing.JButton mostrarRutas;
    protected javax.swing.JButton mostrarUsuarios;
    private javax.swing.JButton nuevaRutaBoton;
    private javax.swing.JButton nuevoBoton;
    private javax.swing.JButton nuevoPCBoton;
    private javax.swing.JTabbedPane panelTabbed;
    private javax.swing.JPanel puntosDeControlPanel;
    private javax.swing.JScrollPane puntosScroll;
    private javax.swing.JTable puntosTabla;
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
}