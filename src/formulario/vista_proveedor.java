/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package formulario;

import conf.conexion;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Yeico
 */
public class vista_proveedor extends javax.swing.JFrame {
 int xMouse, yMouse;
    conexion cc = new conexion();
    Connection  cx=cc.conectar();
    
    
    public vista_proveedor() {
        initComponents();
        initComponents();
        cargar_TABLA();
        setLocationRelativeTo(null);
         tabla2.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,12));
         tabla2.getTableHeader().setOpaque(false);
         tabla2.getTableHeader().setBackground(new Color(161, 152, 130));
         tabla2.getTableHeader().setForeground(new Color(32, 136, 203));
         tabla2.setRowHeight(25);
    }

    void cargar_TABLA() {
    DefaultTableModel modelo1 = (DefaultTableModel) tabla2.getModel();
    modelo1.getDataVector().clear();

    String[] registro = new String[4]; // Cambia el tamaño del arreglo a 4 para incluir solo los campos que deseas

    String SQL = "SELECT nompro, rncpro, telepro, direcpro FROM proveedores WHERE nompro LIKE '%" + buscarpro.getText() + "%' or idpro LIKE '%" + buscarpro + "'";

    try {
        Statement st = cx.createStatement();
        ResultSet rs = st.executeQuery(SQL);

        while (rs.next()) {
            registro[0] = rs.getString("nompro");
            registro[1] = rs.getString("rncpro");
            registro[2] = rs.getString("telepro");
            registro[3] = rs.getString("direcpro");

            modelo1.addRow(registro);
        }
        tabla2.setModel(modelo1);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla2 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        panelsalir = new javax.swing.JPanel();
        salir1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        idenpro = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        buscarpro = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(254, 247, 220));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla2.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        tabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NOMBRE", "RNC", "TELEFONO", "DIRECCION"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabla2.setFocusable(false);
        tabla2.setSelectionBackground(new java.awt.Color(161, 152, 130));
        tabla2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla2);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 650, 190));

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
        salir1.setText("    X");
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
                .addComponent(salir1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelsalirLayout.setVerticalGroup(
            panelsalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelsalirLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(salir1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel1.setText("VISTA PROVEEDORES");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 472, Short.MAX_VALUE)
                .addComponent(panelsalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelsalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 30));

        jSeparator7.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        idenpro.setBackground(new java.awt.Color(254, 247, 220));
        idenpro.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        idenpro.setBorder(null);
        idenpro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idenproActionPerformed(evt);
            }
        });
        idenpro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                idenproKeyReleased(evt);
            }
        });
        jPanel1.add(idenpro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("BUSCAR PROVEEDOR:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel2.setText("BUSCAR:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, 20));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 160, -1));

        buscarpro.setBackground(new java.awt.Color(254, 247, 220));
        buscarpro.setBorder(null);
        buscarpro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarproActionPerformed(evt);
            }
        });
        buscarpro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscarproKeyReleased(evt);
            }
        });
        jPanel1.add(buscarpro, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 160, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabla2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla2MouseClicked

        // TODO add your handling code here:
    }//GEN-LAST:event_tabla2MouseClicked

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
        this.setLocation( x - xMouse,  y - yMouse); // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        xMouse = evt.getX();
        yMouse = evt.getX();// TODO add your handling code here:
    }//GEN-LAST:event_jPanel2MousePressed

    private void idenproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idenproActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idenproActionPerformed

    private void idenproKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idenproKeyReleased
        cargar_TABLA();
    }//GEN-LAST:event_idenproKeyReleased

    private void buscarproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarproActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarproActionPerformed

    private void buscarproKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarproKeyReleased
        cargar_TABLA();
    }//GEN-LAST:event_buscarproKeyReleased

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
            java.util.logging.Logger.getLogger(vista_proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vista_proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vista_proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vista_proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vista_proveedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField buscarpro;
    private javax.swing.JTextField idenpro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JPanel panelsalir;
    private javax.swing.JLabel salir1;
    private javax.swing.JTable tabla2;
    // End of variables declaration//GEN-END:variables
}
