
package proyecto;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.jdesktop.observablecollections.ObservableCollections;
import org.jdesktop.observablecollections.ObservableList;

/**
 *
 * @author cesar31
 */
public class NuevaRutaDialog extends java.awt.Dialog {

    Sistema sistema;
    private int contadorPuntos = 0;
    private int contadorRutas = 0;
    private ObservableList<PuntosDeControl> puntosObservable;
    private List<PuntosDeControl> listadoPuntos = new ArrayList<>();
    private ObservableList<PuntosDeControl> puntosRutaObservable;
    private List<PuntosDeControl> puntosRuta = new ArrayList<>();
    private PuntosDeControl puntoSeleccionado;
    
    public NuevaRutaDialog(java.awt.Frame parent, Sistema sistema) {
        super(parent, true);
        this.sistema = sistema;
        puntosObservable = ObservableCollections.observableList(listadoPuntos);
        puntosRutaObservable = ObservableCollections.observableList(puntosRuta);
        initComponents();
        MostrarTabla("rutas");
        contadorRutas++;
        rutaLabel.setText("Ruta # "+(contadorRutas));
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jPanel1 = new javax.swing.JPanel();
        rutaLabel = new javax.swing.JLabel();
        codigoL = new javax.swing.JLabel();
        codigoDT = new javax.swing.JTextField();
        nombreCiudadL = new javax.swing.JLabel();
        nombreCiudadT = new javax.swing.JTextField();
        precioL = new javax.swing.JLabel();
        precioText = new javax.swing.JTextField();
        VerificarRuta = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPuntosRuta = new javax.swing.JTable();
        AgregarPuntoBoton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        cancelarRuta = new javax.swing.JButton();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        rutaLabel.setText("Ruta #");

        codigoL.setText("Codigo de Destino");

        codigoDT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                codigoDTKeyTyped(evt);
            }
        });

        nombreCiudadL.setText("Nombre Ciudad");

        nombreCiudadT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreCiudadTKeyTyped(evt);
            }
        });

        precioL.setText("Precio Destino");

        precioText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                precioTextKeyTyped(evt);
            }
        });

        VerificarRuta.setText("Verificar");
        VerificarRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerificarRutaActionPerformed(evt);
            }
        });

        org.jdesktop.beansbinding.ELProperty eLProperty = org.jdesktop.beansbinding.ELProperty.create("${puntosObservable}");
        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, eLProperty, tablaPuntosRuta);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codigo}"));
        columnBinding.setColumnName("Codigo");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nombreCiudad}"));
        columnBinding.setColumnName("Nombre Ciudad");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tamañoBodega}"));
        columnBinding.setColumnName("Tamaño Bodega");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tarifa}"));
        columnBinding.setColumnName("Tarifa");
        columnBinding.setColumnClass(Double.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${encargado}"));
        columnBinding.setColumnName("Encargado");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${puntoSeleccionado}"), tablaPuntosRuta, org.jdesktop.beansbinding.BeanProperty.create("selectedElement"));
        bindingGroup.addBinding(binding);

        jScrollPane1.setViewportView(tablaPuntosRuta);
        if (tablaPuntosRuta.getColumnModel().getColumnCount() > 0) {
            tablaPuntosRuta.getColumnModel().getColumn(0).setResizable(false);
            tablaPuntosRuta.getColumnModel().getColumn(1).setResizable(false);
            tablaPuntosRuta.getColumnModel().getColumn(2).setResizable(false);
            tablaPuntosRuta.getColumnModel().getColumn(3).setResizable(false);
            tablaPuntosRuta.getColumnModel().getColumn(4).setResizable(false);
        }

        AgregarPuntoBoton.setText("Agregar");
        AgregarPuntoBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarPuntoBotonActionPerformed(evt);
            }
        });

        eLProperty = org.jdesktop.beansbinding.ELProperty.create("${puntosRutaObservable}");
        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, eLProperty, jTable2);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codigo}"));
        columnBinding.setColumnName("Codigo");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nombreCiudad}"));
        columnBinding.setColumnName("Nombre Ciudad");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tamañoBodega}"));
        columnBinding.setColumnName("Tamaño Bodega");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tarifa}"));
        columnBinding.setColumnName("Tarifa");
        columnBinding.setColumnClass(Double.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${encargado}"));
        columnBinding.setColumnName("Encargado");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
            jTable2.getColumnModel().getColumn(2).setResizable(false);
            jTable2.getColumnModel().getColumn(3).setResizable(false);
            jTable2.getColumnModel().getColumn(4).setResizable(false);
        }

        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cancelarRuta.setText("Cancelar");
        cancelarRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarRutaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(249, 249, 249)
                .addComponent(AgregarPuntoBoton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(nombreCiudadL)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nombreCiudadT, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(rutaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(codigoL)
                                    .addComponent(precioL))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(codigoDT)
                                    .addComponent(precioText, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(251, 251, 251)
                                .addComponent(VerificarRuta)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelarRuta)
                .addGap(217, 217, 217))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rutaLabel)
                    .addComponent(codigoL)
                    .addComponent(codigoDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreCiudadL)
                    .addComponent(nombreCiudadT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precioL)
                    .addComponent(precioText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(VerificarRuta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AgregarPuntoBoton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelarRuta)
                    .addComponent(jButton1))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void VerificarRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerificarRutaActionPerformed

        if(!codigoDT.getText().equals("") && !nombreCiudadT.getText().equals("") && !precioText.getText().equals("")){
            boolean codigoOcupado = false;
            if(!sistema.VerificarOcupado("rutas", "cod_D", codigoDT.getText(), codigoOcupado)){

                codigoDT.setEnabled(false);
                nombreCiudadT.setEnabled(false);
                precioText.setEnabled(false);
                VerificarRuta.setEnabled(false);
                MostrarTabla("puntosDeControl");
            }else{
                JOptionPane.showMessageDialog(this, "Ya existe una ruta hacia la ciudad con el codigo que ingreso", "Campo Vacío", JOptionPane.ERROR_MESSAGE);
                codigoDT.setText(null);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Todos los campos deben de llenarse", "Campo Vacío", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_VerificarRutaActionPerformed

    private void AgregarPuntoBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarPuntoBotonActionPerformed
        if(puntoSeleccionado != null){
            puntosRutaObservable.add(puntoSeleccionado);
            puntosObservable.remove(tablaPuntosRuta.getSelectedRow());
            contadorPuntos++;
        }else{
            JOptionPane.showMessageDialog(this, "Selecciones algun punto de control", "Error", JOptionPane.ERROR_MESSAGE);
        }
        if(contadorPuntos == 5){
            JOptionPane.showMessageDialog(this, "Se han agregado los 5 puntos de control necesarios", "Informacion", JOptionPane.INFORMATION_MESSAGE);
            AgregarPuntoBoton.setEnabled(false);
        }
    }//GEN-LAST:event_AgregarPuntoBotonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String query = "INSERT INTO rutas VALUES("
                + contadorRutas+", "
                + "\""+codigoDT.getText()+"\", "
                + "\""+nombreCiudadT.getText()+"\", "
                + Double.parseDouble(precioText.getText())+", "
                + contadorPuntos+", ";
        
        for (int i=0; i<contadorPuntos; i++) {
            if(i==4){
                query = query +"\""+puntosRutaObservable.get(i).getCodigo()+"\")";
            }else{
                query = query +"\""+puntosRutaObservable.get(i).getCodigo()+"\", ";
            }
        }
        
        int j = 5 - contadorPuntos;
        for (int i=0; i<j; i++) {
            if(i==(j-1)){
                query = query + null +")";
            }else{
                query = query + null+", ";
            }
        }
        System.out.println(query);
        sistema.IngresarEliminarEnTabla(query);
        JOptionPane.showMessageDialog(this, "Ruta ingresada con exito", "Información", JOptionPane.INFORMATION_MESSAGE);
        this.setVisible(false);
        sistema.inicio.admin.getRutaObservable().clear();
        sistema.MostrarTabla("rutas");
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cancelarRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarRutaActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_cancelarRutaActionPerformed

    private void codigoDTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigoDTKeyTyped
        if(codigoDT.getText().length() == 20){
            evt.consume();
        }
    }//GEN-LAST:event_codigoDTKeyTyped

    private void nombreCiudadTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreCiudadTKeyTyped
        if(nombreCiudadT.getText().length() == 40){
            evt.consume();
        }
    }//GEN-LAST:event_nombreCiudadTKeyTyped

    private void precioTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precioTextKeyTyped
        if(precioText.getText().length() == 11){
            evt.consume();
        }
    }//GEN-LAST:event_precioTextKeyTyped

    /**
     * Metodo que se encarga de mostrar los datos de la tabla que se indique en el string nombreTabla
     * @param nombreTabla 
     */
    public void MostrarTabla(String nombreTabla){
        sistema.conectar.conectar();
        try{
            Statement declaracion = sistema.conectar.getConnection().createStatement();
            ResultSet r = declaracion.executeQuery("SELECT * FROM "+nombreTabla);
            while(r.next()){
                if(nombreTabla.equals("rutas")){
                    contadorRutas++;
                }else{
                    PuntosDeControl puntos = new PuntosDeControl(r.getString("codigo"), r.getString("nombreCiudad"), r.getDouble("tarifa"), r.getInt("tamañoBodega"), r.getString("encargado"));
                    puntosObservable.add(puntos);
                }
            }
        }catch(SQLException ex){
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        sistema.conectar.desconectar();
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarPuntoBoton;
    private javax.swing.JButton VerificarRuta;
    private javax.swing.JButton cancelarRuta;
    private javax.swing.JTextField codigoDT;
    private javax.swing.JLabel codigoL;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel nombreCiudadL;
    private javax.swing.JTextField nombreCiudadT;
    private javax.swing.JLabel precioL;
    private javax.swing.JTextField precioText;
    private javax.swing.JLabel rutaLabel;
    private javax.swing.JTable tablaPuntosRuta;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    public ObservableList<PuntosDeControl> getPuntosRutaObservable() {
        return puntosRutaObservable;
    }

    public void setPuntosRutaObservable(ObservableList<PuntosDeControl> puntosRutaObservable) {
        this.puntosRutaObservable = puntosRutaObservable;
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
