/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;


import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import paneles.*;

/**
 *
 * @author edin-
 */
public class prinP extends javax.swing.JFrame {

    /**
     * Creates new form prinP
     */
    int Xmouse;
    int Ymouse;
    public prinP() {
        initComponents();
       // this.setExtendedState(MAXIMIZED_BOTH);
        this.setLocationRelativeTo(this);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        
     //Animacion.Animacion.mover_izquierda(0, -110, 2, 2, pnlMenu);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelUndercorated = new javax.swing.JPanel();
        jCTextField1 = new app.bolivia.swing.JCTextField();
        jButtonCerrar = new javax.swing.JButton();
        jButtonMinimizar = new javax.swing.JButton();
        pnlPrincipal = new javax.swing.JPanel();
        pnlMenu = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        JpanelBotonInventario = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelInventario = new javax.swing.JLabel();
        JpanelBotonVentas = new javax.swing.JPanel();
        jLabelVenta = new javax.swing.JLabel();
        jLabelIconoVenta = new javax.swing.JLabel();
        JpanelBotonCompra = new javax.swing.JPanel();
        jLabelCompra = new javax.swing.JLabel();
        jLabelIcoCompra = new javax.swing.JLabel();
        JpanelBotonProvedores = new javax.swing.JPanel();
        jLabelProveedores = new javax.swing.JLabel();
        jLabelIcoProveedores = new javax.swing.JLabel();
        jPanelBontonCliente = new javax.swing.JPanel();
        jLabelCliente = new javax.swing.JLabel();
        jLabelIconoCliente = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1000, 730));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelUndercorated.setBackground(new java.awt.Color(0, 49, 105));
        jPanelUndercorated.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelUndercorated.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanelUndercoratedMouseDragged(evt);
            }
        });
        jPanelUndercorated.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelUndercoratedMousePressed(evt);
            }
        });
        jPanelUndercorated.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCTextField1.setBackground(new java.awt.Color(38, 86, 186));
        jCTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jCTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jCTextField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jCTextField1.setPhColor(new java.awt.Color(255, 255, 255));
        jCTextField1.setPlaceholder("SEARCH");
        jCTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCTextField1ActionPerformed(evt);
            }
        });
        jPanelUndercorated.add(jCTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1460, 10, 281, -1));

        jButtonCerrar.setBackground(new java.awt.Color(0, 49, 105));
        jButtonCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar.png"))); // NOI18N
        jButtonCerrar.setBorder(null);
        jButtonCerrar.setBorderPainted(false);
        jButtonCerrar.setContentAreaFilled(false);
        jButtonCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonCerrar.setOpaque(true);
        jButtonCerrar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrarNE.png"))); // NOI18N
        jButtonCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCerrarMouseClicked(evt);
            }
        });
        jPanelUndercorated.add(jButtonCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 0, 30, 30));

        jButtonMinimizar.setBackground(new java.awt.Color(0, 49, 105));
        jButtonMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Minimizar.png"))); // NOI18N
        jButtonMinimizar.setBorderPainted(false);
        jButtonMinimizar.setContentAreaFilled(false);
        jButtonMinimizar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/MinimizarNE.png"))); // NOI18N
        jButtonMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonMinimizarMouseClicked(evt);
            }
        });
        jPanelUndercorated.add(jButtonMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 0, 30, 30));

        getContentPane().add(jPanelUndercorated, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 30));

        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        pnlPrincipal.setAlignmentX(0.0F);
        pnlPrincipal.setAlignmentY(0.0F);
        pnlPrincipal.setLayout(new java.awt.CardLayout());
        getContentPane().add(pnlPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 890, 600));

        pnlMenu.setBackground(new java.awt.Color(0, 18, 50));
        pnlMenu.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 5, 0, 0, new java.awt.Color(239, 238, 244)));
        pnlMenu.setAlignmentX(0.0F);
        pnlMenu.setAlignmentY(0.0F);
        pnlMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlMenu.setPreferredSize(new java.awt.Dimension(174, 515));
        pnlMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnlMenu.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, -1, -1));

        JpanelBotonInventario.setBackground(new java.awt.Color(0, 18, 50));
        JpanelBotonInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JpanelBotonInventarioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JpanelBotonInventarioMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JpanelBotonInventarioMousePressed(evt);
            }
        });
        JpanelBotonInventario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(230, 230, 204));
        jLabel1.setFont(new java.awt.Font("Eras Demi ITC", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(230, 230, 204));
        jLabel1.setText("Inventario");
        JpanelBotonInventario.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 90, -1));

        jLabelInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/inventario.png"))); // NOI18N
        jLabelInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelInventarioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelInventarioMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelInventarioMousePressed(evt);
            }
        });
        JpanelBotonInventario.add(jLabelInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 60, -1));

        pnlMenu.add(JpanelBotonInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 180, 50));

        JpanelBotonVentas.setBackground(new java.awt.Color(32, 57, 90));
        JpanelBotonVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JpanelBotonVentasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JpanelBotonVentasMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JpanelBotonVentasMousePressed(evt);
            }
        });
        JpanelBotonVentas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelVenta.setFont(new java.awt.Font("Eras Demi ITC", 0, 14)); // NOI18N
        jLabelVenta.setForeground(new java.awt.Color(230, 230, 204));
        jLabelVenta.setText("Ventas");
        JpanelBotonVentas.add(jLabelVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 70, -1));

        jLabelIconoVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/venta.png"))); // NOI18N
        jLabelIconoVenta.setAlignmentX(0.5F);
        jLabelIconoVenta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelIconoVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelIconoVentaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelIconoVentaMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelIconoVentaMousePressed(evt);
            }
        });
        JpanelBotonVentas.add(jLabelIconoVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 60, -1));

        pnlMenu.add(JpanelBotonVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 180, 50));

        JpanelBotonCompra.setBackground(new java.awt.Color(32, 57, 90));
        JpanelBotonCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JpanelBotonCompraMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JpanelBotonCompraMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JpanelBotonCompraMousePressed(evt);
            }
        });
        JpanelBotonCompra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelCompra.setFont(new java.awt.Font("Eras Demi ITC", 0, 14)); // NOI18N
        jLabelCompra.setForeground(new java.awt.Color(230, 230, 204));
        jLabelCompra.setText("Compra");
        JpanelBotonCompra.add(jLabelCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabelIcoCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/compra.png"))); // NOI18N
        jLabelIcoCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelIcoCompraMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelIcoCompraMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelIcoCompraMousePressed(evt);
            }
        });
        JpanelBotonCompra.add(jLabelIcoCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 60, -1));

        pnlMenu.add(JpanelBotonCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 180, 50));

        JpanelBotonProvedores.setBackground(new java.awt.Color(32, 57, 90));
        JpanelBotonProvedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JpanelBotonProvedoresMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JpanelBotonProvedoresMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JpanelBotonProvedoresMousePressed(evt);
            }
        });
        JpanelBotonProvedores.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelProveedores.setFont(new java.awt.Font("Eras Demi ITC", 0, 14)); // NOI18N
        jLabelProveedores.setForeground(new java.awt.Color(230, 230, 204));
        jLabelProveedores.setText("Proveedores");
        JpanelBotonProvedores.add(jLabelProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabelIcoProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/provedor.png"))); // NOI18N
        jLabelIcoProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelIcoProveedoresMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelIcoProveedoresMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelIcoProveedoresMousePressed(evt);
            }
        });
        JpanelBotonProvedores.add(jLabelIcoProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 60, 50));

        pnlMenu.add(JpanelBotonProvedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 180, 50));

        jPanelBontonCliente.setBackground(new java.awt.Color(32, 57, 90));
        jPanelBontonCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelBontonClienteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelBontonClienteMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelBontonClienteMousePressed(evt);
            }
        });
        jPanelBontonCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelCliente.setFont(new java.awt.Font("Eras Demi ITC", 0, 14)); // NOI18N
        jLabelCliente.setForeground(new java.awt.Color(230, 230, 204));
        jLabelCliente.setText("Cliente");
        jPanelBontonCliente.add(jLabelCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabelIconoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cliente.png"))); // NOI18N
        jLabelIconoCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelIconoClienteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelIconoClienteMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelIconoClienteMousePressed(evt);
            }
        });
        jPanelBontonCliente.add(jLabelIconoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 60, -1));

        pnlMenu.add(jPanelBontonCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 180, 50));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Menu.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        pnlMenu.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 60, 50));

        getContentPane().add(pnlMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(-130, 30, 190, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // new CambiaPanel(pnlMenu, new paneles.pnMenu());
        
        int posicion = pnlMenu.getX();
       // int posicionP=pnlPrincipal.getX();
         //pnlMenu.setBounds(10, 59, 180, 520);
         
        if (posicion > -1) {
            Animacion.Animacion.mover_izquierda(0, -130, 2, 2, pnlMenu);
            Animacion.Animacion.mover_izquierda(190, 60, 2, 2, pnlPrincipal);
           // pnlMenu.setBounds(10, 59, 60, 520);
            
        } else {
          
            Animacion.Animacion.mover_derecha(-130, 0, 2, 2, pnlMenu);
            Animacion.Animacion.mover_derecha(60, 190, 2, 2, pnlPrincipal);
            // pnlMenu.setBounds(10, 59, 180, 520);

        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCTextField1ActionPerformed

    private void jPanelUndercoratedMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelUndercoratedMouseDragged
       int  x = evt.getXOnScreen();
       int y = evt.getYOnScreen();
         this.setLocation(  x-Xmouse, y-Ymouse);
    }//GEN-LAST:event_jPanelUndercoratedMouseDragged

    
    private void jPanelUndercoratedMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelUndercoratedMousePressed
      Xmouse= evt.getX();
      Ymouse= evt.getY();
    }//GEN-LAST:event_jPanelUndercoratedMousePressed

    private void JpanelBotonInventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JpanelBotonInventarioMouseClicked
        new CambiaPanel(pnlPrincipal, new panelInventario());
        Animacion.Animacion.mover_izquierda(0, -130, 2, 2, pnlMenu);
         Animacion.Animacion.mover_izquierda(190, 60, 2, 2, pnlPrincipal);
         
    }//GEN-LAST:event_JpanelBotonInventarioMouseClicked

    private void JpanelBotonVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JpanelBotonVentasMouseClicked
         new CambiaPanel(pnlPrincipal, new panelVenta());
        Animacion.Animacion.mover_izquierda(0, -130, 2, 2, pnlMenu);
         Animacion.Animacion.mover_izquierda(190, 60, 2, 2, pnlPrincipal);
    }//GEN-LAST:event_JpanelBotonVentasMouseClicked

    private void JpanelBotonCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JpanelBotonCompraMouseClicked
        new CambiaPanel(pnlPrincipal, new panelCompra());
        Animacion.Animacion.mover_izquierda(0, -130, 2, 2, pnlMenu);
         Animacion.Animacion.mover_izquierda(190, 60, 2, 2, pnlPrincipal);
    }//GEN-LAST:event_JpanelBotonCompraMouseClicked

    private void JpanelBotonProvedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JpanelBotonProvedoresMouseClicked
         new CambiaPanel(pnlPrincipal, new panelProveedor());
        Animacion.Animacion.mover_izquierda(0, -130, 2, 2, pnlMenu);
         Animacion.Animacion.mover_izquierda(190, 60, 2, 2, pnlPrincipal);
    }//GEN-LAST:event_JpanelBotonProvedoresMouseClicked

    private void jPanelBontonClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBontonClienteMouseClicked
         new CambiaPanel(pnlPrincipal, new panelCliente());
        Animacion.Animacion.mover_izquierda(0, -130, 2, 2, pnlMenu);
         Animacion.Animacion.mover_izquierda(190, 60, 2, 2, pnlPrincipal);
    }//GEN-LAST:event_jPanelBontonClienteMouseClicked

    private void JpanelBotonInventarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JpanelBotonInventarioMousePressed
       setColor(JpanelBotonInventario);
       resetColor(JpanelBotonVentas);
        resetColor(JpanelBotonCompra);
         resetColor(JpanelBotonProvedores);
          resetColor(jPanelBontonCliente);
    }//GEN-LAST:event_JpanelBotonInventarioMousePressed

    private void JpanelBotonVentasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JpanelBotonVentasMousePressed
        setColor(JpanelBotonVentas);
       resetColor(JpanelBotonInventario);
        resetColor(JpanelBotonCompra);
         resetColor(JpanelBotonProvedores);
          resetColor(jPanelBontonCliente);
    }//GEN-LAST:event_JpanelBotonVentasMousePressed

    private void JpanelBotonCompraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JpanelBotonCompraMousePressed
        setColor(JpanelBotonCompra);
       resetColor(JpanelBotonVentas);
        resetColor(JpanelBotonInventario);
         resetColor(JpanelBotonProvedores);
          resetColor(jPanelBontonCliente);
    }//GEN-LAST:event_JpanelBotonCompraMousePressed

    private void JpanelBotonProvedoresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JpanelBotonProvedoresMousePressed
         setColor(JpanelBotonProvedores);
       resetColor(JpanelBotonVentas);
        resetColor(JpanelBotonInventario);
         resetColor(JpanelBotonCompra);
          resetColor(jPanelBontonCliente);
    }//GEN-LAST:event_JpanelBotonProvedoresMousePressed

    private void jPanelBontonClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBontonClienteMousePressed
        setColor(jPanelBontonCliente);
       resetColor(JpanelBotonVentas);
        resetColor(JpanelBotonInventario);
         resetColor(JpanelBotonCompra);
          resetColor(JpanelBotonProvedores);
    }//GEN-LAST:event_jPanelBontonClienteMousePressed

    private void jLabelInventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelInventarioMouseClicked
        new CambiaPanel(pnlPrincipal, new panelInventario());
    }//GEN-LAST:event_jLabelInventarioMouseClicked

    private void jLabelIconoVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIconoVentaMouseClicked
       new CambiaPanel(pnlPrincipal, new panelVenta());
    }//GEN-LAST:event_jLabelIconoVentaMouseClicked

    private void jLabelIcoCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIcoCompraMouseClicked
         new CambiaPanel(pnlPrincipal, new panelCompra());
    }//GEN-LAST:event_jLabelIcoCompraMouseClicked

    private void jLabelIcoProveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIcoProveedoresMouseClicked
        new CambiaPanel(pnlPrincipal, new panelProveedor());
    }//GEN-LAST:event_jLabelIcoProveedoresMouseClicked

    private void jLabelIconoClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIconoClienteMouseClicked
          new CambiaPanel(pnlPrincipal, new panelCliente());
    }//GEN-LAST:event_jLabelIconoClienteMouseClicked

    private void jLabelInventarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelInventarioMousePressed
       setColor(JpanelBotonInventario);
       resetColor(JpanelBotonVentas);
        resetColor(JpanelBotonCompra);
         resetColor(JpanelBotonProvedores);
          resetColor(jPanelBontonCliente);
    }//GEN-LAST:event_jLabelInventarioMousePressed

    private void jLabelIconoVentaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIconoVentaMousePressed
       setColor(JpanelBotonVentas);
       resetColor(JpanelBotonInventario);
        resetColor(JpanelBotonCompra);
         resetColor(JpanelBotonProvedores);
          resetColor(jPanelBontonCliente);
    }//GEN-LAST:event_jLabelIconoVentaMousePressed

    private void jLabelIcoCompraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIcoCompraMousePressed
       setColor(JpanelBotonCompra);
       resetColor(JpanelBotonVentas);
        resetColor(JpanelBotonInventario);
         resetColor(JpanelBotonProvedores);
          resetColor(jPanelBontonCliente);
    }//GEN-LAST:event_jLabelIcoCompraMousePressed

    private void jLabelIcoProveedoresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIcoProveedoresMousePressed
         setColor(JpanelBotonProvedores);
       resetColor(JpanelBotonVentas);
        resetColor(JpanelBotonInventario);
         resetColor(JpanelBotonCompra);
          resetColor(jPanelBontonCliente);
    }//GEN-LAST:event_jLabelIcoProveedoresMousePressed

    private void jLabelIconoClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIconoClienteMousePressed
         setColor(jPanelBontonCliente);
       resetColor(JpanelBotonVentas);
        resetColor(JpanelBotonInventario);
         resetColor(JpanelBotonCompra);
          resetColor(JpanelBotonProvedores);
    }//GEN-LAST:event_jLabelIconoClienteMousePressed

    private void jButtonCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCerrarMouseClicked
      System.exit(0);
    }//GEN-LAST:event_jButtonCerrarMouseClicked

    private void jButtonMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonMinimizarMouseClicked
       this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jButtonMinimizarMouseClicked

    private void JpanelBotonInventarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JpanelBotonInventarioMouseEntered
        setColor(JpanelBotonInventario);
       resetColor(JpanelBotonVentas);
        resetColor(JpanelBotonCompra);
         resetColor(JpanelBotonProvedores);
          resetColor(jPanelBontonCliente);
    }//GEN-LAST:event_JpanelBotonInventarioMouseEntered

    private void JpanelBotonVentasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JpanelBotonVentasMouseEntered
       setColor(JpanelBotonVentas);
       resetColor(JpanelBotonInventario);
        resetColor(JpanelBotonCompra);
         resetColor(JpanelBotonProvedores);
          resetColor(jPanelBontonCliente);
    }//GEN-LAST:event_JpanelBotonVentasMouseEntered

    private void JpanelBotonCompraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JpanelBotonCompraMouseEntered
        setColor(JpanelBotonCompra);
       resetColor(JpanelBotonVentas);
        resetColor(JpanelBotonInventario);
         resetColor(JpanelBotonProvedores);
          resetColor(jPanelBontonCliente);
    }//GEN-LAST:event_JpanelBotonCompraMouseEntered

    private void JpanelBotonProvedoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JpanelBotonProvedoresMouseEntered
      setColor(JpanelBotonProvedores);
       resetColor(JpanelBotonVentas);
        resetColor(JpanelBotonInventario);
         resetColor(JpanelBotonCompra);
          resetColor(jPanelBontonCliente);
    }//GEN-LAST:event_JpanelBotonProvedoresMouseEntered

    private void jPanelBontonClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBontonClienteMouseEntered
       setColor(jPanelBontonCliente);
       resetColor(JpanelBotonVentas);
        resetColor(JpanelBotonInventario);
         resetColor(JpanelBotonCompra);
          resetColor(JpanelBotonProvedores);
    }//GEN-LAST:event_jPanelBontonClienteMouseEntered

    private void jLabelInventarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelInventarioMouseEntered
        setColor(JpanelBotonInventario);
       resetColor(JpanelBotonVentas);
        resetColor(JpanelBotonCompra);
         resetColor(JpanelBotonProvedores);
          resetColor(jPanelBontonCliente);
    }//GEN-LAST:event_jLabelInventarioMouseEntered

    private void jLabelIconoVentaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIconoVentaMouseEntered
       setColor(JpanelBotonVentas);
       resetColor(JpanelBotonInventario);
        resetColor(JpanelBotonCompra);
         resetColor(JpanelBotonProvedores);
          resetColor(jPanelBontonCliente);
    }//GEN-LAST:event_jLabelIconoVentaMouseEntered

    private void jLabelIcoCompraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIcoCompraMouseEntered
      setColor(JpanelBotonCompra);
       resetColor(JpanelBotonVentas);
        resetColor(JpanelBotonInventario);
         resetColor(JpanelBotonProvedores);
          resetColor(jPanelBontonCliente);
    }//GEN-LAST:event_jLabelIcoCompraMouseEntered

    private void jLabelIcoProveedoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIcoProveedoresMouseEntered
      setColor(JpanelBotonProvedores);
       resetColor(JpanelBotonVentas);
        resetColor(JpanelBotonInventario);
         resetColor(JpanelBotonCompra);
          resetColor(jPanelBontonCliente);
    }//GEN-LAST:event_jLabelIcoProveedoresMouseEntered

    private void jLabelIconoClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIconoClienteMouseEntered
         setColor(jPanelBontonCliente);
       resetColor(JpanelBotonVentas);
        resetColor(JpanelBotonInventario);
         resetColor(JpanelBotonCompra);
          resetColor(JpanelBotonProvedores);
    }//GEN-LAST:event_jLabelIconoClienteMouseEntered

    void setColor(JPanel panel){
        panel.setBackground(new Color(0, 93, 166));
    }
    void resetColor(JPanel panel){
        panel.setBackground(new Color(32,57,90));
        
    }
     
    /**
     * @param args the command line arguments
      */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
    
    //quitar
     
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(prinP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(prinP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(prinP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(prinP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        
     java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
               
                new prinP().setVisible(true);
            }
        });
    }   
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JpanelBotonCompra;
    private javax.swing.JPanel JpanelBotonInventario;
    private javax.swing.JPanel JpanelBotonProvedores;
    private javax.swing.JPanel JpanelBotonVentas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonCerrar;
    private javax.swing.JButton jButtonMinimizar;
    private app.bolivia.swing.JCTextField jCTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelCliente;
    private javax.swing.JLabel jLabelCompra;
    private javax.swing.JLabel jLabelIcoCompra;
    private javax.swing.JLabel jLabelIcoProveedores;
    private javax.swing.JLabel jLabelIconoCliente;
    private javax.swing.JLabel jLabelIconoVenta;
    private javax.swing.JLabel jLabelInventario;
    private javax.swing.JLabel jLabelProveedores;
    private javax.swing.JLabel jLabelVenta;
    private javax.swing.JPanel jPanelBontonCliente;
    private javax.swing.JPanel jPanelUndercorated;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlPrincipal;
    // End of variables declaration//GEN-END:variables
}
