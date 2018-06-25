/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.core.farmacia.panel.cliente;

import com.core.farmacia.dao.DAOException;
import com.core.farmacia.dao.DAOManager;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author desconocido
 */
public class panelCliente extends javax.swing.JPanel {

     DAOManager manager;
    clienteTableModel modelPage;
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

    public panelCliente(DAOManager manager) throws DAOException {
        initComponents();
        this.manager = manager;
        anterior.setEnabled(false);
        _all_registros();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jToolBar1 = new javax.swing.JToolBar();
        jButtonNuevo = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jButtonEditar = new javax.swing.JButton();
        jButtonBorrar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jButtonGuardar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaInv = new javax.swing.JTable();
        jPanelDetalle = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNombre1 = new javax.swing.JTextField();
        jTextFieldNombre2 = new javax.swing.JTextField();
        jTextFieldApellido1 = new javax.swing.JTextField();
        jTextFieldApellido2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        JTFieldTelefono1 = new javax.swing.JTextField();
        JTFieldTelefono2 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        JTFFieldDepart = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        pagPrimera = new javax.swing.JButton();
        anterior = new javax.swing.JButton();
        siguiente = new javax.swing.JButton();
        pagFinal = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        registros = new javax.swing.JLabel();
        paginas = new javax.swing.JPanel();
        txt_str = new javax.swing.JTextField();
        btn_search = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(954, 698));

        jToolBar1.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar1.setBorder(null);
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

        tablaInv.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(52, 151, 218)));
        jScrollPane1.setViewportView(tablaInv);

        jPanelDetalle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(52, 151, 218)));

        jLabel1.setText("Primer Nombre:");

        jTextFieldNombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombre1ActionPerformed(evt);
            }
        });

        jTextFieldApellido1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldApellido1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Segundo Nombre:");

        jLabel4.setText("Primer Apellido:");

        jLabel5.setText("Segundo Apellido:");

        jLabel6.setText("Sexo:");

        jLabel7.setText("Telefono:");

        jLabel8.setText("Telefono:");

        jRadioButton1.setText("M");

        jRadioButton2.setText("F");

        jLabel9.setText("Departamento:");

        JTFFieldDepart.setText("jTextField7");

        javax.swing.GroupLayout jPanelDetalleLayout = new javax.swing.GroupLayout(jPanelDetalle);
        jPanelDetalle.setLayout(jPanelDetalleLayout);
        jPanelDetalleLayout.setHorizontalGroup(
            jPanelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDetalleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGroup(jPanelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDetalleLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDetalleLayout.createSequentialGroup()
                                .addGroup(jPanelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldApellido1)
                                    .addComponent(jTextFieldNombre1)
                                    .addComponent(jTextFieldNombre2)))
                            .addGroup(jPanelDetalleLayout.createSequentialGroup()
                                .addGroup(jPanelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanelDetalleLayout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(10, 10, 10)
                                        .addComponent(jTextFieldApellido2))
                                    .addGroup(jPanelDetalleLayout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(JTFieldTelefono2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelDetalleLayout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(JTFieldTelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelDetalleLayout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(JTFFieldDepart)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanelDetalleLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(23, 23, 23))
        );
        jPanelDetalleLayout.setVerticalGroup(
            jPanelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDetalleLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldApellido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(21, 21, 21)
                .addGroup(jPanelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JTFieldTelefono1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(JTFieldTelefono2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(JTFFieldDepart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel10.setBackground(new java.awt.Color(52, 151, 218));
        jLabel10.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("LISTA DE CLIENTES");
        jLabel10.setOpaque(true);

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("DATOS GENERALES");
        jLabel11.setOpaque(true);

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

        jLabel12.setText("Total Registros");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanelDetalle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(pagPrimera)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(anterior)
                                        .addGap(3, 3, 3)
                                        .addComponent(siguiente)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pagFinal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(registros, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(paginas, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)))))
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(txt_str, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_search)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_str, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_search))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addComponent(registros, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(11, 11, 11)
                            .addComponent(paginas, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pagPrimera)
                            .addComponent(anterior)
                            .addComponent(siguiente)
                            .addComponent(pagFinal))))
                .addGap(69, 69, 69))
        );
    }// </editor-fold>//GEN-END:initComponents

                                             

    
    private void jTextFieldApellido1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldApellido1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldApellido1ActionPerformed

    private void jTextFieldNombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombre1ActionPerformed

    private void pagPrimeraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagPrimeraActionPerformed
        anterior.setEnabled(false);
        resaltarPosPagina(indice, 100, 100, 100);
        indice = 0;
        paginaActual = 0;
        resaltarPosPagina(indice, 132, 192, 199);
        modelPage = new clienteTableModel(manager.creaCliente());
        try {
            modelPage.update(paginaActual, pag, this.txt_str.getText().trim());

        } catch (DAOException ex) {
            Logger.getLogger(panelCliente.class
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
        modelPage = new clienteTableModel(manager.creaCliente());
        try {
            modelPage.update(paginaActual, pag, this.txt_str.getText().trim());

        } catch (DAOException ex) {
            Logger.getLogger(panelCliente.class
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
        modelPage = new clienteTableModel(manager.creaCliente());
        try {
            modelPage.update(paginaActual, pag, this.txt_str.getText().trim());

        } catch (DAOException ex) {
            Logger.getLogger(panelCliente.class
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
        modelPage = new clienteTableModel(manager.creaCliente());
        try {
            modelPage.update(paginaActual, pag, this.txt_str.getText().trim());
            //paginaActual += pag;
        } catch (DAOException ex) {
            Logger.getLogger(panelCliente.class
                .getName()).log(Level.SEVERE, null, ex);
        }
        tablaInv.setModel(modelPage);
        ultimoPaginado();
        anterior.setEnabled(true);
    }//GEN-LAST:event_pagFinalActionPerformed

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
        modelPage = new clienteTableModel(manager.creaCliente());
        try {
            modelPage.update(paginaActual, pag, this.txt_str.getText().trim());
        } catch (DAOException ex) {
            Logger.getLogger(panelCliente.class.getName()).log(Level.SEVERE, null, ex);
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

                    modelPage = new clienteTableModel(manager.creaCliente());
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
    private void txt_strActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_strActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_strActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        _all_registros();
    }//GEN-LAST:event_btn_searchActionPerformed

     void setColor(JButton boton){
        boton.setBackground(new Color(0, 18, 50));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTFFieldDepart;
    private javax.swing.JTextField JTFieldTelefono1;
    private javax.swing.JTextField JTFieldTelefono2;
    private javax.swing.JButton anterior;
    private javax.swing.JButton btn_search;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonBorrar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelDetalle;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField jTextFieldApellido1;
    private javax.swing.JTextField jTextFieldApellido2;
    private javax.swing.JTextField jTextFieldNombre1;
    private javax.swing.JTextField jTextFieldNombre2;
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
