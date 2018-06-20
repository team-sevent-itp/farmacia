package com.core.farmacia.panel.proveedor;

import com.core.farmacia.dao.DAOException;
import com.core.farmacia.dao.DAOManager;
import com.core.farmacia.panel.inventario.panelInventario;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

/**
 *
 * @author deconocido
 */
public class panelProveedor extends javax.swing.JPanel {

    DAOManager manager;
    PageTableModelProv modelPage;
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

    public panelProveedor(DAOManager manager) throws DAOException {
        initComponents();
        this.manager = manager;
        anterior.setEnabled(false);
        _all_registros();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaInv = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jToolBar1 = new javax.swing.JToolBar();
        jButtonNuevo = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jButtonEditar = new javax.swing.JButton();
        jButtonBorrar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jButtonGuardar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        pagPrimera = new javax.swing.JButton();
        anterior = new javax.swing.JButton();
        siguiente = new javax.swing.JButton();
        pagFinal = new javax.swing.JButton();
        paginas = new javax.swing.JPanel();
        txt_str = new javax.swing.JTextField();
        btn_search = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        registros = new javax.swing.JLabel();

        jScrollPane1.setViewportView(tablaInv);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(160, 160, 160)));

        jLabel1.setText("Nombre:");

        jLabel2.setText("Teléfono:");

        jLabel3.setText("Teléfono:");

        jLabel4.setText("Departamento:");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(107, Short.MAX_VALUE))
        );

        jToolBar1.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        jButtonNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8Nuevo1.png"))); // NOI18N
        jButtonNuevo.setText("Nuevo");
        jButtonNuevo.setContentAreaFilled(false);
        jButtonNuevo.setFocusable(false);
        jButtonNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonNuevo.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8Nuevo2 .png"))); // NOI18N
        jButtonNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButtonNuevo);
        jToolBar1.add(jSeparator1);

        jButtonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8editar1.png"))); // NOI18N
        jButtonEditar.setText("Editar");
        jButtonEditar.setContentAreaFilled(false);
        jButtonEditar.setFocusable(false);
        jButtonEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonEditar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Edit2.png"))); // NOI18N
        jButtonEditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButtonEditar);

        jButtonBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8Close1.png"))); // NOI18N
        jButtonBorrar.setText("Borrar");
        jButtonBorrar.setContentAreaFilled(false);
        jButtonBorrar.setFocusable(false);
        jButtonBorrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonBorrar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8Close2.png"))); // NOI18N
        jButtonBorrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButtonBorrar);
        jToolBar1.add(jSeparator2);

        jButtonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8Save1.png"))); // NOI18N
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.setContentAreaFilled(false);
        jButtonGuardar.setFocusable(false);
        jButtonGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonGuardar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8Save2.png"))); // NOI18N
        jButtonGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButtonGuardar);

        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8Cancelar1.png"))); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setContentAreaFilled(false);
        jButtonCancelar.setFocusable(false);
        jButtonCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCancelar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8Cancelar2.png"))); // NOI18N
        jButtonCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButtonCancelar);

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

        jLabel5.setText("Total Registros");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 893, Short.MAX_VALUE)
            .addComponent(jSeparator3)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_str, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_search)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(registros, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pagPrimera)
                                .addGap(1, 1, 1)
                                .addComponent(anterior)
                                .addGap(26, 26, 26)
                                .addComponent(siguiente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pagFinal)
                                .addGap(18, 18, 18)
                                .addComponent(paginas, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_str, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_search))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(anterior)
                            .addComponent(pagPrimera)
                            .addComponent(siguiente)
                            .addComponent(pagFinal)))
                    .addComponent(paginas, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(registros, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void pagPrimeraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagPrimeraActionPerformed
        anterior.setEnabled(false);
        resaltarPosPagina(indice, 100, 100, 100);
        indice = 0;
        paginaActual = 0;
        resaltarPosPagina(indice, 132, 192, 199);
        modelPage = new PageTableModelProv(manager.crearProveedor());
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
        modelPage = new PageTableModelProv(manager.crearProveedor());
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
        modelPage = new PageTableModelProv(manager.crearProveedor());
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
        modelPage = new PageTableModelProv(manager.crearProveedor());
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

    private void txt_strActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_strActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_strActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        _all_registros();
    }//GEN-LAST:event_btn_searchActionPerformed

    private void resaltarPosPagina(int index, int R, int G, int B) {
        listPaginacion.get(index).setForeground(new Color(R, G, B));
    }

    private void _all_registros() {
        pagPrimera.setEnabled(true);
        pagFinal.setEnabled(true);
        this.paginas.removeAll();
        listPaginacion = new ArrayList<>();
        paginaActual = 0;
        rangoPaginas = 0;
        contador = 1;
        indice = 0;
        modelPage = new PageTableModelProv(manager.crearProveedor());
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

                    modelPage = new PageTableModelProv(manager.crearProveedor());
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anterior;
    private javax.swing.JButton btn_search;
    private javax.swing.JButton jButtonBorrar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton pagFinal;
    private javax.swing.JButton pagPrimera;
    private javax.swing.JPanel paginas;
    private javax.swing.JLabel registros;
    private javax.swing.JButton siguiente;
    private javax.swing.JTable tablaInv;
    private javax.swing.JTextField txt_str;
    // End of variables declaration//GEN-END:variables
}
