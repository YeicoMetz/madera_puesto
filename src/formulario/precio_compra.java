/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package formulario;

import java.awt.Color;
import java.awt.event.KeyEvent;

/**
 *
 * @author Yeico
 */
public class precio_compra extends javax.swing.JFrame {
 int xMouse, yMouse;
  
    public precio_compra() {
        initComponents();
         setLocationRelativeTo(null);

    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        panelsalir = new javax.swing.JPanel();
        salir1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        direccion = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        precio_venta = new javax.swing.JTextField();
        nuevo3 = new javax.swing.JPanel();
        nuevo4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(254, 247, 220));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(161, 152, 130));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelsalir.setBackground(new java.awt.Color(161, 152, 130));
        panelsalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelsalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelsalirMouseExited(evt);
            }
        });

        salir1.setBackground(new java.awt.Color(0, 0, 0));
        salir1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        salir1.setText("  X");
        salir1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salir1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salir1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salir1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salir1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelsalirLayout = new javax.swing.GroupLayout(panelsalir);
        panelsalir.setLayout(panelsalirLayout);
        panelsalirLayout.setHorizontalGroup(
            panelsalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelsalirLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(salir1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelsalirLayout.setVerticalGroup(
            panelsalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelsalirLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(salir1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(panelsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 0, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 20));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Roboto Medium", 1, 12)); // NOI18N
        jLabel1.setText("PRECIO DE VENTA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Roboto Medium", 1, 12)); // NOI18N
        jLabel2.setText("PRECIO DE COMPRA");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, -1));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 110, 10));

        direccion.setBackground(new java.awt.Color(254, 247, 220));
        direccion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        direccion.setBorder(null);
        direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccionActionPerformed(evt);
            }
        });
        direccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                direccionKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                direccionKeyTyped(evt);
            }
        });
        jPanel1.add(direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 110, -1));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 110, 10));

        precio_venta.setBackground(new java.awt.Color(254, 247, 220));
        precio_venta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        precio_venta.setBorder(null);
        precio_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precio_ventaActionPerformed(evt);
            }
        });
        precio_venta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                precio_ventaKeyTyped(evt);
            }
        });
        jPanel1.add(precio_venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 110, -1));

        nuevo3.setBackground(new java.awt.Color(161, 152, 130));
        nuevo3.setToolTipText("NUEVO");

        nuevo4.setBackground(new java.awt.Color(0, 0, 0));
        nuevo4.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        nuevo4.setForeground(new java.awt.Color(0, 0, 0));
        nuevo4.setText("  ACEPTAR");
        nuevo4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nuevo4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nuevo4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nuevo4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nuevo4MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nuevo4MousePressed(evt);
            }
        });

        javax.swing.GroupLayout nuevo3Layout = new javax.swing.GroupLayout(nuevo3);
        nuevo3.setLayout(nuevo3Layout);
        nuevo3Layout.setHorizontalGroup(
            nuevo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nuevo3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(nuevo4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        nuevo3Layout.setVerticalGroup(
            nuevo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nuevo3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(nuevo4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(nuevo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 70, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salir1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salir1MouseClicked
        this.dispose(); // TODO add your handling code here:
    }//GEN-LAST:event_salir1MouseClicked

    private void salir1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salir1MouseEntered
        panelsalir.setBackground(Color.RED);
    }//GEN-LAST:event_salir1MouseEntered

    private void salir1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salir1MouseExited
        Color colorPersonalizado = new Color(161, 152, 130);
        panelsalir.setBackground(colorPersonalizado);
    }//GEN-LAST:event_salir1MouseExited

    private void panelsalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelsalirMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_panelsalirMouseEntered

    private void panelsalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelsalirMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_panelsalirMouseExited

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation( x - xMouse,  y - yMouse);   // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        xMouse = evt.getX();
        yMouse = evt.getX();// TODO add your handling code here:
    }//GEN-LAST:event_jPanel2MousePressed

    private void direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_direccionActionPerformed

    private void direccionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_direccionKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        precio_venta.requestFocus();    // TODO add your handling code here:
    }//GEN-LAST:event_direccionKeyPressed

    private void direccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_direccionKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            evt.consume(); // Esto evita que el carácter no válido se ingrese en el campo de texto.
        }  // TODO add your handling code here:
    }//GEN-LAST:event_direccionKeyTyped

    private void precio_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precio_ventaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precio_ventaActionPerformed

    private void precio_ventaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precio_ventaKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            evt.consume(); // Esto evita que el carácter no válido se ingrese en el campo de texto.
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_precio_ventaKeyTyped

    private void nuevo4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevo4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_nuevo4MouseClicked

    private void nuevo4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevo4MouseEntered
        nuevo3.setBackground(Color.gray);
    }//GEN-LAST:event_nuevo4MouseEntered

    private void nuevo4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevo4MouseExited
        Color colorPersonalizado = new Color(161, 152, 130);
        nuevo3.setBackground(colorPersonalizado);// TODO add your handling code here:
    }//GEN-LAST:event_nuevo4MouseExited

    private void nuevo4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevo4MousePressed
        nuevo3.setBackground(Color.gray); // TODO add your handling code here:
    }//GEN-LAST:event_nuevo4MousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(precio_compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(precio_compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(precio_compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(precio_compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new precio_compra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField direccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JPanel nuevo3;
    private javax.swing.JLabel nuevo4;
    private javax.swing.JPanel panelsalir;
    private javax.swing.JTextField precio_venta;
    private javax.swing.JLabel salir1;
    // End of variables declaration//GEN-END:variables
}
