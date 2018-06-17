package com.core.farmacia.panel.inventario;

import com.core.farmacia.dao.DAOException;
import com.core.farmacia.dao.DAOManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author desconocido
 */
public class panelInventario extends javax.swing.JPanel {

    DAOManager manager;
    PageTableModel modelPage;
    int sig = 10;
    int ant = 10;
    int pag = 10;//BLoque  paginacion
    int lim = 0;

    public panelInventario(DAOManager manager) throws DAOException {
        initComponents();
        this.manager = manager;
        modelPage = new PageTableModel(manager.crearPaginacion());
        modelPage.update(10, 10, "");
        tablaInv.setModel(modelPage);
        registros.setText("" + manager.crearPaginacion().cantidadRegistros());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaInv = new javax.swing.JTable();
        btn_search = new javax.swing.JButton();
        txt_str = new javax.swing.JTextField();
        registros = new javax.swing.JLabel();
        anterior = new javax.swing.JButton();
        siguiente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(954, 698));

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

        btn_search.setText("Búscar");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });

        txt_str.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_strActionPerformed(evt);
            }
        });

        anterior.setText("Anterior");
        anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anteriorActionPerformed(evt);
            }
        });

        siguiente.setText("Siguiente");
        siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteActionPerformed(evt);
            }
        });

        jLabel1.setText("Total Registros");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_str, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_search))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 876, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(registros, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(anterior)
                        .addGap(18, 18, 18)
                        .addComponent(siguiente)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_str, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_search))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(anterior)
                        .addComponent(siguiente)
                        .addComponent(jLabel1))
                    .addComponent(registros, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        ant = 0;
        sig = 10;
        modelPage = new PageTableModel(manager.crearPaginacion());
        try {
            modelPage.update(ant, pag, this.txt_str.getText().trim());
        } catch (DAOException ex) {
            Logger.getLogger(panelInventario.class.getName()).log(Level.SEVERE, null, ex);
        }
        tablaInv.setModel(modelPage);

        lim = manager.crearPaginacion().cantidadRegistros();
        registros.setText(""+lim);
    }//GEN-LAST:event_btn_searchActionPerformed

    private void txt_strActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_strActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_strActionPerformed

    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed
        ant += pag;
        modelPage = new PageTableModel(manager.crearPaginacion());
        try {
            modelPage.update(ant, pag, this.txt_str.getText().trim());
        } catch (DAOException ex) {
            Logger.getLogger(panelInventario.class.getName()).log(Level.SEVERE, null, ex);
        }
        tablaInv.setModel(modelPage);

    }//GEN-LAST:event_siguienteActionPerformed

    private void anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anteriorActionPerformed
        ant -= pag;
        modelPage = new PageTableModel(manager.crearPaginacion());
        try {
            modelPage.update(ant, pag, this.txt_str.getText().trim());
        } catch (DAOException ex) {
            Logger.getLogger(panelInventario.class.getName()).log(Level.SEVERE, null, ex);
        }
        tablaInv.setModel(modelPage);

    }//GEN-LAST:event_anteriorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anterior;
    private javax.swing.JButton btn_search;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel registros;
    private javax.swing.JButton siguiente;
    private javax.swing.JTable tablaInv;
    private javax.swing.JTextField txt_str;
    // End of variables declaration//GEN-END:variables
}
