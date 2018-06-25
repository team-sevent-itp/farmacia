package com.core.farmacia.panel.compra;

import com.mxrck.autocompleter.TextAutoCompleter;
import com.core.farmacia.dao.DAOException;
import com.core.farmacia.dao.DAOManager;
import com.core.farmacia.model.Ent_compra_bs;
import com.core.farmacia.model.Ent_paginacion_bs;
import com.core.farmacia.model.Ent_producto;
import com.core.farmacia.model.Ent_proveedor_bs;
import com.core.farmacia.model.Ent_reg_comp;
import com.core.farmacia.model.Laboratorio;
import com.core.farmacia.model.LineaProducto;
import com.core.farmacia.model.Presentacion;
import com.core.farmacia.model.RegistroCompra;
import com.core.farmacia.panel.inventario.panelInventario;
import com.core.helper.UtiliesLocal;
import com.mxrck.autocompleter.AutoCompleterCallback;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

/**
 * @author desconocido
 */
public class panelCompra extends javax.swing.JPanel {

    /*
    Paginacion, tratar de hacerla generica ;O
     */
    PageTableModel modelPage;
    int paginaActual = 10;
    int pag = 20;//BLoque  paginacion
    int lim = 0; //Cantidad de registros de la busqueda
    int totalPag = 0; //Total de paginas de la consulta 
    int paginasAMostrar = 5; //Cantidad de botones a mostrar, puede variar de acuerdo a la busqueda
    int contador = 1;
    int rangoPaginas = 0; //Para calcular cuantos botones mostrar s
    int numPaginas = 5;
    int indice = 0; //Para controlar la pociosion de la pagina en el boton
    List<JButton> listPaginacion = new ArrayList<>();

    /////////////////////////////////->>>>>>>
    DAOManager manager;
    TextAutoCompleter textAutoAcompleter;
    TextAutoCompleter present;
    TextAutoCompleter lab;
    TextAutoCompleter entLineaProducto;
    TextAutoCompleter entProveedor;
    List<Ent_paginacion_bs> paginacionProduc;
    List<Laboratorio> laboratoriosList;
    List<Presentacion> presentacionesList;
    Laboratorio laboratorioOb;
    Presentacion presentacionOb;
    Ent_paginacion_bs productoInventario;
    LineaProducto lineaProductoOb;
    Ent_proveedor_bs proveedorOb;
    boolean productoAntiguo;
    List<LineaProducto> lineaProductoList;
    List<Ent_proveedor_bs> proveedorList;

    /*Para El registro de la compra del producto*/
    public panelCompra(DAOManager manager) throws DAOException {
        initComponents();
        this.manager = manager;
        desbloquearCampos(false);
        productoAntiguo = false;
        anterior.setEnabled(false);
        _all_registros();
        laboratorioOb = new Laboratorio();
        presentacionOb = new Presentacion();
        lineaProductoOb = new LineaProducto();
        proveedorOb = new Ent_proveedor_bs();
        productoInventario = new Ent_paginacion_bs();
        
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
        entLineaProducto = new TextAutoCompleter(lineaProducto, new AutoCompleterCallback() {
            @Override
            public void callback(Object selectedItem) {
                //System.out.println("El usuario seleccionó: " + selectedItem.toString());
                lineaProductoOb = (LineaProducto) selectedItem;
            }
        });
        entProveedor = new TextAutoCompleter(proveedor, new AutoCompleterCallback() {
            @Override
            public void callback(Object selectedItem) {
                //System.out.println("El usuario seleccionó: " + selectedItem.toString());
                proveedorOb = (Ent_proveedor_bs) selectedItem;
            }
        });
        
        textAutoAcompleter.setCaseSensitive(false);
        textAutoAcompleter.setMode(0);
        present.setCaseSensitive(false);
        present.setMode(0);
        lab.setCaseSensitive(false);
        lab.setMode(0);
    }

    //Funcion para realizar el insertado de un registro de un producto
    public void _ingresar_registro_compra() {
        
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
        calendarFechaVen = new com.toedter.calendar.JDateChooser();
        RegistroCompra = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaInv = new javax.swing.JTable();
        paginas = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        registros = new javax.swing.JLabel();
        pagPrimera = new javax.swing.JButton();
        anterior = new javax.swing.JButton();
        siguiente = new javax.swing.JButton();
        pagFinal = new javax.swing.JButton();
        txt_str = new javax.swing.JTextField();
        btn_search = new javax.swing.JButton();

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

        proveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                proveedorKeyReleased(evt);
            }
        });
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

        lineaProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lineaProductoKeyReleased(evt);
            }
        });
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
        producCampos.add(calendarFechaVen, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 150, 120, -1));

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

        tablaInv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaInv);

        jLabel16.setText("Total Registros");

        pagPrimera.setText("1");
        pagPrimera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagPrimeraActionPerformed(evt);
            }
        });

        anterior.setText("Ant");
        anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anteriorActionPerformed(evt);
            }
        });

        siguiente.setText("Sig");
        siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteActionPerformed(evt);
            }
        });

        pagFinal.setText("n");
        pagFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagFinalActionPerformed(evt);
            }
        });

        txt_str.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_strActionPerformed(evt);
            }
        });

        btn_search.setText("Búscar");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RegistroCompraLayout = new javax.swing.GroupLayout(RegistroCompra);
        RegistroCompra.setLayout(RegistroCompraLayout);
        RegistroCompraLayout.setHorizontalGroup(
            RegistroCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistroCompraLayout.createSequentialGroup()
                .addGroup(RegistroCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegistroCompraLayout.createSequentialGroup()
                        .addComponent(pagPrimera)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(anterior)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(siguiente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pagFinal)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(RegistroCompraLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(RegistroCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 901, Short.MAX_VALUE)
                            .addGroup(RegistroCompraLayout.createSequentialGroup()
                                .addGroup(RegistroCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(RegistroCompraLayout.createSequentialGroup()
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(registros, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(paginas, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(RegistroCompraLayout.createSequentialGroup()
                                        .addComponent(txt_str, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_search)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        RegistroCompraLayout.setVerticalGroup(
            RegistroCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistroCompraLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(RegistroCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_str, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_search))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RegistroCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegistroCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel16)
                        .addComponent(registros, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(paginas, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RegistroCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pagFinal, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegistroCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(siguiente)
                        .addComponent(anterior)
                        .addComponent(pagPrimera))))
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

        //Insercion de la compra
        Ent_compra_bs EntNuevaCompra = new Ent_compra_bs();
        EntNuevaCompra.setFactura(factura.getText());
        EntNuevaCompra.setProveedor(String.valueOf(proveedorOb.getId()));

        //Insercion o actualizacion del producto
        Ent_producto ent_producto = new Ent_producto();
        ent_producto.setId(productoInventario.getId());
        ent_producto.setNombre(nombre.getText().trim());
        ent_producto.setCantidad(Integer.parseInt(unidades.getText()));
        ent_producto.setIva(Double.parseDouble(iva.getText()));
        ent_producto.setPrecio(Double.parseDouble(precio.getText()));
        ent_producto.setMargenDeGanancia(25);
        ent_producto.setIdPresentacion((int) presentacionOb.getId());
        ent_producto.setIdLaboratorio((int) laboratorioOb.getId());
        ent_producto.setInvima(invima.getText());
        ent_producto.setIdLineaProducto((int) lineaProductoOb.getId());
        
        try {
            //Aqui ingresamos la compra
            manager.crearCompraBs().ingresar(EntNuevaCompra);
            //Obtenemos el id del producto
            if (productoAntiguo) {
                
                manager.crearPaginacion().actualizar(ent_producto);
                System.out.println("El producto es antiguooooooo");
                //Realizamos la insercion en el registro de la compra
            } else {
                //Aqui realizamos la insercion del nuevo producto
                System.out.println("El producto es nuevoooooo");
                
                manager.crearPaginacion().ingresar(ent_producto);
                
            }

            //Realizamos la insercion la tabla compra producto
            RegistroCompra nuevaCompra = new RegistroCompra();
            nuevaCompra.setIdCompra(EntNuevaCompra.getId());
            nuevaCompra.setIdProducto(ent_producto.getId());
            nuevaCompra.setIva(Double.parseDouble(iva.getText()));
            nuevaCompra.setCantidadUnidades(Double.parseDouble(unidades.getText()));
            nuevaCompra.setPrecioUnidades(Double.parseDouble(precio.getText()));
            nuevaCompra.setSubTotal(Double.parseDouble(subTotal.getText()));
            nuevaCompra.setTotal(Double.parseDouble(total.getText()));
            nuevaCompra.setFechaVencimiento(LocalDate.of(2020, 12, 01));
            nuevaCompra.setLote(lote.getText());
            
            manager.crearRegistroCompra().ingresar(nuevaCompra);
            
        } catch (DAOException ex) {
            Logger.getLogger(panelCompra.class.getName()).log(Level.SEVERE, null, ex);
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

    private void pagPrimeraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagPrimeraActionPerformed
        anterior.setEnabled(false);
        resaltarPosPagina(indice, 100, 100, 100);
        indice = 0;
        paginaActual = 0;
        resaltarPosPagina(indice, 132, 192, 199);
        modelPage = new PageTableModel(manager.crearRegistroCompra());
        try {
            modelPage.update(paginaActual, pag, this.txt_str.getText().trim());
            
        } catch (DAOException ex) {
            Logger.getLogger(panelInventario.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        tablaInv.setModel(modelPage);
        primerPaginado();
        siguiente.setEnabled(true);
    }//GEN-LAST:event_pagPrimeraActionPerformed

    private void anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anteriorActionPerformed
        siguiente.setEnabled(true);
        resaltarPosPagina(indice, 100, 100, 100);
        indice -= 1;
        anteriorPaginacion();
        paginaActual -= pag;
        modelPage = new PageTableModel(manager.crearRegistroCompra());
        try {
            modelPage.update(paginaActual, pag, this.txt_str.getText().trim());
            
        } catch (DAOException ex) {
            Logger.getLogger(panelInventario.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        resaltarPosPagina(indice, 132, 192, 199);
        if (paginaActual == 0) {
            anterior.setEnabled(false);
        }
        tablaInv.setModel(modelPage);

    }//GEN-LAST:event_anteriorActionPerformed

    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed
        anterior.setEnabled(true);
        resaltarPosPagina(indice, 100, 100, 100);
        indice += 1;
        siguientePaginacion();
        paginaActual += pag;
        modelPage = new PageTableModel(manager.crearRegistroCompra());
        try {
            modelPage.update(paginaActual, pag, this.txt_str.getText().trim());
            
        } catch (DAOException ex) {
            Logger.getLogger(panelInventario.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        resaltarPosPagina(indice, 132, 192, 199);
        tablaInv.setModel(modelPage);
        if (paginaActual == (totalPag - 1) * pag) {
            siguiente.setEnabled(false);
        }
    }//GEN-LAST:event_siguienteActionPerformed

    private void pagFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagFinalActionPerformed
        siguiente.setEnabled(false);
        resaltarPosPagina(indice, 100, 100, 100);
        indice = listPaginacion.size() - 1;
        System.out.println("Indice" + indice);
        paginaActual = (totalPag - 1) * pag;
        resaltarPosPagina(indice, 132, 192, 199);
        modelPage = new PageTableModel(manager.crearRegistroCompra());
        try {
            modelPage.update(paginaActual, pag, this.txt_str.getText().trim());
            //paginaActual += pag;
        } catch (DAOException ex) {
            Logger.getLogger(panelInventario.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        tablaInv.setModel(modelPage);
        ultimoPaginado();
        anterior.setEnabled(true);
    }//GEN-LAST:event_pagFinalActionPerformed
    private void resaltarPosPagina(int index, int R, int G, int B) {
        listPaginacion.get(index).setForeground(new Color(R, G, B));
    }
    
    private void ultimoPaginado() {
        rangoPaginas = (totalPag - (numPaginas - 1)) - 1;
        System.err.println("Rango paginas: ----" + rangoPaginas);
        System.err.println("totalPag: ----" + totalPag);
        
        listPaginacion.stream().forEach(ob -> {
            rangoPaginas++;
            ob.setText("" + rangoPaginas);
        });
        System.err.println("Rango Paginas dC: -----" + rangoPaginas);
        //rangoPaginas--;
    }
    
    private void primerPaginado() {
        rangoPaginas = numPaginas;
        contador = 0;
        listPaginacion.stream().forEach(ob -> {
            contador++;
            ob.setText("" + contador);
        });
        
    }
    
    private void siguientePaginacion() {
        
        if (paginaActual == ((rangoPaginas - 1) * pag)) {
            indice = 0;
            listPaginacion.stream().forEach(ob -> {
                rangoPaginas++;
                ob.setText("" + rangoPaginas);
            });
        }
    }
    
    private void anteriorPaginacion() {
        contador = 0;
        contador = (paginaActual / pag) - numPaginas;
        
        if ((numPaginas + 1) * pag == ((rangoPaginas) * pag) - (paginaActual - pag)) {
            indice = 4;
            listPaginacion.stream().forEach(ob -> {
                rangoPaginas--;
                contador++;
                
                ob.setText("" + contador);
            });
        }
    }
    
    private void _add_object() {
        totalPag = lim / pag;
        
        if (lim % pag != 0) {
            totalPag += 1;
        }
        
        rangoPaginas = paginasAMostrar;
        
        if (totalPag < paginasAMostrar) {
            rangoPaginas = totalPag;
            numPaginas = rangoPaginas;
        }
        
        for (contador = 1; contador <= rangoPaginas; contador++) {
            JButton bt = new JButton();
            bt.setName("" + contador);
            bt.setText("" + contador);
            Dimension size = bt.getPreferredSize();
            bt.setSize(size.width, size.height);
            bt.setVisible(true);
            
            bt.addActionListener(new ActionListener() {
                
                public void actionPerformed(ActionEvent e) {
                    anterior.setEnabled(true);
                    siguiente.setEnabled(true);
                    int paginaRangoPaginas = Integer.parseInt(bt.getText()) - 1;
                    resaltarPosPagina(indice, 100, 100, 100);
                    indice = Integer.parseInt(bt.getName()) - 1;
                    resaltarPosPagina(indice, 132, 192, 199);
                    
                    if (paginaRangoPaginas + 1 == 1) {
                        anterior.setEnabled(false);
                    } else if (paginaRangoPaginas == totalPag - 1) {
                        siguiente.setEnabled(false);
                    }
                    
                    modelPage = new PageTableModel(manager.crearRegistroCompra());
                    try {
                        modelPage.update(paginaRangoPaginas * pag, pag, txt_str.getText().trim());
                        paginaActual = paginaRangoPaginas * pag;
                    } catch (DAOException ex) {
                        new DAOException("Error al mostrar datos", ex);
                    }
                    
                    tablaInv.setModel(modelPage);
                }
            });
            
            this.paginas.add(bt);
            listPaginacion.add(bt);
        }
        
        this.paginas.updateUI();
        if (rangoPaginas <= 1) {
            anterior.setEnabled(false);
            siguiente.setEnabled(false);
            pagPrimera.setEnabled(false);
            pagFinal.setEnabled(false);
            listPaginacion.get(0).setEnabled(false);
        }
        
    }
    private void txt_strActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_strActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_strActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        _all_registros();
    }//GEN-LAST:event_btn_searchActionPerformed

    private void lineaProductoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lineaProductoKeyReleased
        try {
            lineaProductoList = manager.crearLineaProducto().vw_linea_produc(0, 10, lineaProducto.getText().trim());
            lineaProductoList.stream().forEach(ob -> {
                if (!entLineaProducto.itemExists(ob)) {
                    entLineaProducto.addItem(ob);
                }
            });
        } catch (DAOException ex) {
            Logger.getLogger(panelCompra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lineaProductoKeyReleased

    private void proveedorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_proveedorKeyReleased
        try {
            proveedorList = manager.crearProveedor().paginacion_proveedor(0, 10, proveedor.getText().trim());
            proveedorList.stream().forEach(ob -> {
                if (!entProveedor.itemExists(ob)) {
                    entProveedor.addItem(ob);
                }
            });
        } catch (DAOException ex) {
            Logger.getLogger(panelCompra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_proveedorKeyReleased
    
    private void _all_registros() {
        pagPrimera.setEnabled(true);
        pagFinal.setEnabled(true);
        this.paginas.removeAll();
        listPaginacion = new ArrayList<>();
        paginaActual = 0;
        rangoPaginas = 0;
        contador = 1;
        indice = 0;
        modelPage = new PageTableModel(manager.crearRegistroCompra());
        try {
            modelPage.update(paginaActual, pag, this.txt_str.getText().trim());
        } catch (DAOException ex) {
            Logger.getLogger(panelInventario.class.getName()).log(Level.SEVERE, null, ex);
        }
        tablaInv.setModel(modelPage);
        
        lim = manager.crearPaginacion().cantidadRegistros();
        registros.setText("" + lim);
        
        _add_object();
        resaltarPosPagina(indice, 132, 192, 199);
    }
    
    private void mostrarDatosProducto() {
        
        nombre.setText(productoInventario.getNombre_producto());
        precio.setText("" + productoInventario.getPrecio_uds_venta());
        iva.setText("" + productoInventario.getIva());
        unidades.setText("" + productoInventario.getCantidad());
        laboratorio.setText("" + productoInventario.getLaboratorio());
        presentacion.setText("" + productoInventario.getNombre_presentacion());
        lineaProducto.setText(productoInventario.getLinea());
        invima.setText(productoInventario.getInvima());
        calendarFechaVen.setDate(UtiliesLocal.parseDate(LocalDate.now()));
        
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
        laboratorio.setEditable(value);
        lote.setEditable(value);
        presentacion.setEditable(value);
        calendarFechaVen.setEnabled(value);
        
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
        calendarFechaVen.setCalendar(null);
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
        calendarFechaVen.setCalendar(null);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel RegistroCompra;
    private javax.swing.JButton agregar;
    private javax.swing.JButton anterior;
    private javax.swing.JButton btn_search;
    private com.toedter.calendar.JDateChooser calendarFechaVen;
    private javax.swing.JPanel compraProduc;
    private javax.swing.JButton continuar;
    private javax.swing.JFormattedTextField factura;
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
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JFormattedTextField laboratorio;
    private javax.swing.JTextField lineaProducto;
    private javax.swing.JFormattedTextField lote;
    private javax.swing.JFormattedTextField nombre;
    private javax.swing.JPanel nuevaCompra;
    private javax.swing.JButton nuevo;
    private javax.swing.JButton pagFinal;
    private javax.swing.JButton pagPrimera;
    private javax.swing.JPanel paginas;
    private javax.swing.JFormattedTextField precio;
    private javax.swing.JFormattedTextField presentacion;
    private javax.swing.JPanel producCampos;
    private javax.swing.JTextField proveedor;
    private javax.swing.JLabel registros;
    private javax.swing.JButton siguiente;
    private javax.swing.JTextField subTotal;
    private javax.swing.JTable tablaInv;
    private javax.swing.JButton terminar;
    private javax.swing.JTextField text_busca;
    private javax.swing.JTextField total;
    private javax.swing.JTextField txt_str;
    private javax.swing.JFormattedTextField unidades;
    // End of variables declaration//GEN-END:variables
}
