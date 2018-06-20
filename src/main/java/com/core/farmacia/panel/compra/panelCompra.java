package com.core.farmacia.panel.compra;

import com.mxrck.autocompleter.TextAutoCompleter;
import com.core.farmacia.dao.DAOException;
import com.core.farmacia.dao.DAOManager;
import com.core.farmacia.model.Ent_paginacion_bs;
import com.core.farmacia.model.Laboratorio;
import com.core.farmacia.model.Presentacion;
import com.mxrck.autocompleter.AutoCompleterCallback;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author desconocido
 */
public class panelCompra extends javax.swing.JPanel {
    
    DAOManager manager;
    comboBusquedaModel modelCombo;
    TextAutoCompleter textAutoAcompleter;
    TextAutoCompleter present;
    TextAutoCompleter lab;
    List<Ent_paginacion_bs> paginacionProduc;
    List<Laboratorio> laboratoriosList;
    List<Presentacion> presentacionesList;
    Laboratorio laboratorioOb;
    Presentacion presentacionOb;
    Ent_paginacion_bs productoInventario;
    boolean productoAntiguo;
    
    public panelCompra(DAOManager manager) throws DAOException {
        initComponents();
        this.manager = manager;
        desbloquearCampos(false);
        productoAntiguo = false;
        
        textAutoAcompleter = new TextAutoCompleter(text_busca, new AutoCompleterCallback() {
            @Override
            public void callback(Object selectedItem) {
                //System.out.println("El usuario seleccionó: " + selectedItem.toString());
                productoInventario = (Ent_paginacion_bs) selectedItem;
                mostrarDatosProducto();
                productoAntiguo = true;
            }
        });
        
        present = new TextAutoCompleter(presentacion, new AutoCompleterCallback() {
            @Override
            public void callback(Object selectedItem) {
                //System.out.println("El usuario seleccionó: " + selectedItem.toString());
                presentacionOb = (Presentacion) selectedItem;
            }
        });
        lab = new TextAutoCompleter(laboratorio, new AutoCompleterCallback() {
            @Override
            public void callback(Object selectedItem) {
                //System.out.println("El usuario seleccionó: " + selectedItem.toString());
                laboratorioOb = (Laboratorio) selectedItem;
            }
        });
        
        textAutoAcompleter.setCaseSensitive(false);
        textAutoAcompleter.setMode(0);
        present.setCaseSensitive(false);
        present.setMode(0);
        lab.setCaseSensitive(false);
        lab.setMode(0);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        nuevo = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        nuevaCompra = new javax.swing.JPanel();
        compraProduc = new javax.swing.JPanel();
        factura = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        proveedor = new javax.swing.JTextField();
        continuar = new javax.swing.JButton();
        producCampos = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        invima = new javax.swing.JFormattedTextField();
        precio = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        unidades = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        iva = new javax.swing.JFormattedTextField();
        total = new javax.swing.JTextField();
        lineaProducto = new javax.swing.JTextField();
        nombre = new javax.swing.JFormattedTextField();
        subTotal = new javax.swing.JTextField();
        text_busca = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        agregar = new javax.swing.JButton();
        terminar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lote = new javax.swing.JFormattedTextField();
        presentacion = new javax.swing.JFormattedTextField();
        laboratorio = new javax.swing.JFormattedTextField();
        fechaVencimiento = new javax.swing.JTextField();
        RegistroCompra = new javax.swing.JPanel();

        jButton2.setText("Registrar");

        nuevo.setText("Nuevo");

        compraProduc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        compraProduc.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        compraProduc.add(factura, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 143, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Proveedor");
        compraProduc.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, -1, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("N° Factura:");
        compraProduc.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));
        compraProduc.add(proveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 417, -1));

        continuar.setText("Continuar");
        continuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuarActionPerformed(evt);
            }
        });
        compraProduc.add(continuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 80, -1, -1));

        producCampos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        producCampos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Nombre:");
        producCampos.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Precio:");
        producCampos.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 50, -1));
        producCampos.add(invima, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 135, -1));
        producCampos.add(precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 120, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Unidades:");
        producCampos.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, -1, 20));
        producCampos.add(unidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 120, 120, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Iva:");
        producCampos.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 32, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Fecha Vencimineto:");
        producCampos.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Lote:");
        producCampos.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Sub Total:");
        producCampos.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Total:");
        producCampos.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, -1, -1));

        iva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ivaActionPerformed(evt);
            }
        });
        producCampos.add(iva, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 120, -1));

        total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalActionPerformed(evt);
            }
        });
        producCampos.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 121, -1));
        producCampos.add(lineaProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 180, 120, -1));
        producCampos.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 690, -1));
        producCampos.add(subTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 121, -1));

        text_busca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text_buscaKeyReleased(evt);
            }
        });
        producCampos.add(text_busca, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 690, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Buscar: ");
        producCampos.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        agregar.setText("Agregar");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
        producCampos.add(agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, -1, -1));

        terminar.setText("Terminar Compra");
        terminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terminarActionPerformed(evt);
            }
        });
        producCampos.add(terminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 310, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Presentacion:");
        producCampos.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Laboratorio:");
        producCampos.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Invima:");
        producCampos.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Linea Producto:");
        producCampos.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 180, -1, -1));
        producCampos.add(lote, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 135, -1));

        presentacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                presentacionKeyReleased(evt);
            }
        });
        producCampos.add(presentacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 135, -1));

        laboratorio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                laboratorioKeyReleased(evt);
            }
        });
        producCampos.add(laboratorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 135, -1));
        producCampos.add(fechaVencimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 150, 120, -1));

        javax.swing.GroupLayout nuevaCompraLayout = new javax.swing.GroupLayout(nuevaCompra);
        nuevaCompra.setLayout(nuevaCompraLayout);
        nuevaCompraLayout.setHorizontalGroup(
            nuevaCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nuevaCompraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(nuevaCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(compraProduc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(producCampos, javax.swing.GroupLayout.DEFAULT_SIZE, 901, Short.MAX_VALUE))
                .addContainerGap())
        );
        nuevaCompraLayout.setVerticalGroup(
            nuevaCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nuevaCompraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(compraProduc, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(producCampos, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Nueva Compra", nuevaCompra);

        javax.swing.GroupLayout RegistroCompraLayout = new javax.swing.GroupLayout(RegistroCompra);
        RegistroCompra.setLayout(RegistroCompraLayout);
        RegistroCompraLayout.setHorizontalGroup(
            RegistroCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 921, Short.MAX_VALUE)
        );
        RegistroCompraLayout.setVerticalGroup(
            RegistroCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 503, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Registro Compra", RegistroCompra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalActionPerformed

    private void ivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ivaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ivaActionPerformed

    private void comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void continuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continuarActionPerformed
        if (!"".equals(factura.getText()) && !"".equals(proveedor.getText())) {
            desbloquearCampos(true);
        }
    }//GEN-LAST:event_continuarActionPerformed

    private void text_buscaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_buscaKeyReleased
        try {
            paginacionProduc = manager.crearPaginacion().paginacion_producto(0, 10, text_busca.getText().trim());
            paginacionProduc.stream().forEach(ob -> {
                if (!textAutoAcompleter.itemExists(ob)) {
                    textAutoAcompleter.addItem(ob);
                }
            });
        } catch (DAOException ex) {
            Logger.getLogger(panelCompra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_text_buscaKeyReleased

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        if(productoAntiguo){
            //Aqui realizamos la insercion de la tabla compra
            
            //Obtenemos el id del producto
            //Realizamos la insercion la tabla compra producto
            
            //Aqui realizamos el update
            
        }else{
            //Aqui realizamos la insercion
        }
        
        productoAntiguo = false;
        vaciarCamposProduc();
    }//GEN-LAST:event_agregarActionPerformed

    private void terminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terminarActionPerformed
        vaciarCampos();
        desbloquearCampos(false);

    }//GEN-LAST:event_terminarActionPerformed

    private void presentacionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_presentacionKeyReleased
        try {
            presentacionesList = manager.crearPresentacion().vw_presentacion(0, 10, presentacion.getText().trim());
            presentacionesList.stream().forEach(ob -> {
                if (!present.itemExists(ob)) {
                    present.addItem(ob);
                }
            });
        } catch (DAOException ex) {
            Logger.getLogger(panelCompra.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_presentacionKeyReleased

    private void laboratorioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_laboratorioKeyReleased
        try {
            laboratoriosList = manager.crearLaboratorio().vw_laboratorio(0, 10, laboratorio.getText().trim());
            laboratoriosList.stream().forEach(ob -> {
                if (!lab.itemExists(ob)) {
                    lab.addItem(ob);
                }
            });
        } catch (DAOException ex) {
            Logger.getLogger(panelCompra.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_laboratorioKeyReleased
    private void mostrarDatosProducto() {
        
        nombre.setText(productoInventario.getNombre_producto());
        precio.setText("" + productoInventario.getPrecio_uds_venta());
        iva.setText("" + productoInventario.getIva());
        unidades.setText("" + productoInventario.getCantidad());
        laboratorio.setText("" + productoInventario.getLaboratorio());
        presentacion.setText("" + productoInventario.getNombre_presentacion());
        lineaProducto.setText(productoInventario.getLinea());
        invima.setText(productoInventario.getInvima());
        
    }
    
    private void desbloquearCampos(boolean value) {
        text_busca.setEnabled(value);
        nombre.setEnabled(value);
        invima.setEnabled(value);
        precio.setEnabled(value);
        iva.setEnabled(value);
        subTotal.setEnabled(value);
        total.setEditable(value);
        unidades.setEnabled(value);
        lineaProducto.setEditable(value);
        fechaVencimiento.setEditable(value);
        laboratorio.setEditable(value);
        lote.setEditable(value);
        presentacion.setEditable(value);
        
        
    }
    
    private void vaciarCampos() {
        text_busca.setText("");
        nombre.setText("");
        invima.setText("");
        precio.setText("");
        iva.setText("");
        subTotal.setText("");
        total.setText("");
        unidades.setText("");
        lineaProducto.setText("");
        factura.setText("");
        proveedor.setText("");
        presentacion.setText("");
        laboratorio.setText("");
        lote.setText("");
        fechaVencimiento.setText("");
    }
    
    private void vaciarCamposProduc() {
        text_busca.setText("");
        nombre.setText("");
        invima.setText("");
        precio.setText("");
        iva.setText("");
        subTotal.setText("");
        total.setText("");
        unidades.setText("");
        lineaProducto.setText("");
        presentacion.setText("");
        laboratorio.setText("");
        lote.setText("");
        fechaVencimiento.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel RegistroCompra;
    private javax.swing.JButton agregar;
    private javax.swing.JPanel compraProduc;
    private javax.swing.JButton continuar;
    private javax.swing.JFormattedTextField factura;
    private javax.swing.JTextField fechaVencimiento;
    private javax.swing.JFormattedTextField invima;
    private javax.swing.JFormattedTextField iva;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JFormattedTextField laboratorio;
    private javax.swing.JTextField lineaProducto;
    private javax.swing.JFormattedTextField lote;
    private javax.swing.JFormattedTextField nombre;
    private javax.swing.JPanel nuevaCompra;
    private javax.swing.JButton nuevo;
    private javax.swing.JFormattedTextField precio;
    private javax.swing.JFormattedTextField presentacion;
    private javax.swing.JPanel producCampos;
    private javax.swing.JTextField proveedor;
    private javax.swing.JTextField subTotal;
    private javax.swing.JButton terminar;
    private javax.swing.JTextField text_busca;
    private javax.swing.JTextField total;
    private javax.swing.JFormattedTextField unidades;
    // End of variables declaration//GEN-END:variables
}
