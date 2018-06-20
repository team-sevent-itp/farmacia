package principal;

import com.core.farmacia.panel.cliente.panelCliente;
import com.core.farmacia.panel.compra.panelCompra;
import com.core.farmacia.panel.proveedor.panelProveedor;
import com.core.farmacia.panel.inventario.panelInventario;
import com.core.farmacia.panel.venta.panelVenta;
import com.core.farmacia.cambiarpanel.CambiaPanel;
import com.core.farmacia.dao.DAOException;
import com.core.farmacia.dao.DAOManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author deconocido
 */
public class prinPnl extends javax.swing.JFrame {

    /**
     * Creates new form prinP
     */
    int posicion;
    DAOManager manager;

    public prinPnl(DAOManager manager) {
        initComponents();
        this.manager = manager;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        pnlboton = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        pnlMenu = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        pnlPrincipal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1150, 460));
        setPreferredSize(new java.awt.Dimension(934, 700));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        pnlboton.setBackground(new java.awt.Color(0, 18, 50));
        pnlboton.setPreferredSize(new java.awt.Dimension(140, 79));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Menu.png"))); // NOI18N
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlbotonLayout = new javax.swing.GroupLayout(pnlboton);
        pnlboton.setLayout(pnlbotonLayout);
        pnlbotonLayout.setHorizontalGroup(
            pnlbotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlbotonLayout.createSequentialGroup()
                .addGap(0, 84, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlbotonLayout.setVerticalGroup(
            pnlbotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlbotonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(pnlboton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 794, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlboton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5, java.awt.BorderLayout.PAGE_START);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 512, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel7, java.awt.BorderLayout.LINE_END);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        pnlMenu.setBackground(new java.awt.Color(0, 18, 50));
        pnlMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btCompra1.png"))); // NOI18N
        jButton7.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btCompra2.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        pnlMenu.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 140, 50));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnVenta1.png"))); // NOI18N
        jButton8.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnVenta2.png"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        pnlMenu.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 140, 50));

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btInventario.png"))); // NOI18N
        jButton9.setContentAreaFilled(false);
        jButton9.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btInventario2.png"))); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        pnlMenu.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 140, 50));

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnProveedor1.png"))); // NOI18N
        jButton10.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnProveedor2.png"))); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        pnlMenu.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 140, 50));

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnCliente1.png"))); // NOI18N
        jButton11.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnCliente2.png"))); // NOI18N
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        pnlMenu.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 140, 50));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

        pnlPrincipal.setLayout(new java.awt.CardLayout());
        getContentPane().add(pnlPrincipal, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        posicion = pnlMenu.getX();
        // int posicionP=pnlPrincipal.getX();
        //pnlMenu.setBounds(10, 59, 180, 520);

        if (posicion > -1) {
            Animacion.Animacion.mover_izquierda(0, -80, 2, 2, pnlMenu);
            Animacion.Animacion.mover_izquierda(0, -80, 2, 2, pnlboton);
            //Animacion.Animacion.mover_izquierda(190, 60, 2, 2, pnlPrincipal);
            // pnlMenu.setBounds(10, 59, 60, 520);

        } else {

            Animacion.Animacion.mover_derecha(-80, 0, 2, 2, pnlMenu);
            Animacion.Animacion.mover_derecha(-80, 0, 2, 2, pnlboton);
            // Animacion.Animacion.mover_derecha(60, 190, 2, 2, pnlPrincipal);
            // pnlMenu.setBounds(10, 59, 180, 520);

        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        try {
            new CambiaPanel(pnlPrincipal, new panelCompra(manager));
        } catch (DAOException ex) {
            Logger.getLogger(prinPnl.class.getName()).log(Level.SEVERE, null, ex);
        }

        posicion = pnlMenu.getX();
        if (posicion != -80) {
            Animacion.Animacion.mover_izquierda(0, -80, 2, 2, pnlMenu);
            Animacion.Animacion.mover_izquierda(0, -80, 2, 2, pnlboton);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        new CambiaPanel(pnlPrincipal, new panelVenta());
        posicion = pnlMenu.getX();
        if (posicion != -80) {
            Animacion.Animacion.mover_izquierda(0, -80, 2, 2, pnlMenu);
            Animacion.Animacion.mover_izquierda(0, -80, 2, 2, pnlboton);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        try {
            new CambiaPanel(pnlPrincipal, new panelInventario(manager));
        } catch (DAOException ex) {
            Logger.getLogger(prinPnl.class.getName()).log(Level.SEVERE, null, ex);
        }
        posicion = pnlMenu.getX();
        if (posicion != -80) {
            Animacion.Animacion.mover_izquierda(0, -80, 2, 2, pnlMenu);
            Animacion.Animacion.mover_izquierda(0, -80, 2, 2, pnlboton);
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        try {
            new CambiaPanel(pnlPrincipal, new panelProveedor(manager));
        } catch (DAOException ex) {
            Logger.getLogger(prinPnl.class.getName()).log(Level.SEVERE, null, ex);
        }
        posicion = pnlMenu.getX();
        if (posicion != -80) {
            Animacion.Animacion.mover_izquierda(0, -80, 2, 2, pnlMenu);
            Animacion.Animacion.mover_izquierda(0, -80, 2, 2, pnlboton);
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        new CambiaPanel(pnlPrincipal, new panelCliente());
        posicion = pnlMenu.getX();
        if (posicion != -80) {
            Animacion.Animacion.mover_izquierda(0, -80, 2, 2, pnlMenu);
            Animacion.Animacion.mover_izquierda(0, -80, 2, 2, pnlboton);
        }
    }//GEN-LAST:event_jButton11ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JPanel pnlboton;
    // End of variables declaration//GEN-END:variables
}
