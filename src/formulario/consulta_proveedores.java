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
public class consulta_proveedores extends javax.swing.JFrame {
     int xMouse, yMouse;
    conexion cc = new conexion();
    Connection  cx=cc.conectar();
    

    public consulta_proveedores() {
        initComponents();
         initComponents();
         setLocationRelativeTo(null);
          cargar_TABLA();
          contarRegistros();
         // idenpro.setText("");
         tabla2.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,12));
         tabla2.getTableHeader().setOpaque(false);
         tabla2.getTableHeader().setBackground(new Color(161, 152, 130));
         tabla2.getTableHeader().setForeground(new Color(32, 136, 203));
         tabla2.setRowHeight(25);
    }
      void cargar_TABLA(){
        
    
    DefaultTableModel modelo1 = (DefaultTableModel)tabla2.getModel();
    modelo1.getDataVector().clear();
    
    String [] registro = new String[8];
    String SQL ="SELECT idpro,nompro,rncpro,telepro,emailpro,direcpro,encargadopro FROM proveedores WHERE nompro LIKE '%"+idenpro.getText()+"%' or idpro LIKE '%"+idenpro.getText()+"%'";
    
    try{
            Statement st=cx.createStatement();
            ResultSet rs=st.executeQuery(SQL);
            
            while(rs.next()){
            registro[0]=rs.getString("idpro");
            registro[1]=rs.getString("nompro");
            registro[2]=rs.getString("rncpro");
            registro[3]=rs.getString("telepro");
            registro[4]=rs.getString("emailpro");
            registro[5]=rs.getString("direcpro");
            registro[6]=rs.getString("encargadopro");
           
             
            modelo1.addRow(registro);
            
            
              
            }
          tabla2.setModel(modelo1);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error" + e.getMessage());
        
        }
    }
       public void contarRegistros(){
         int fila=tabla2.getRowCount();
         text.setText(""+fila);
     
     }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        panelsalir1 = new javax.swing.JPanel();
        salir3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla2 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        text = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jSeparator7 = new javax.swing.JSeparator();
        idenpro = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(254, 247, 220));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(161, 152, 130));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        jLabel2.setText("CONSULTA DE PROVEEDORES");

        panelsalir1.setBackground(new java.awt.Color(161, 152, 130));
        panelsalir1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelsalir1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelsalir1MouseExited(evt);
            }
        });

        salir3.setBackground(new java.awt.Color(0, 0, 0));
        salir3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        salir3.setText("     X");
        salir3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salir3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salir3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salir3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelsalir1Layout = new javax.swing.GroupLayout(panelsalir1);
        panelsalir1.setLayout(panelsalir1Layout);
        panelsalir1Layout.setHorizontalGroup(
            panelsalir1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelsalir1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(salir3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelsalir1Layout.setVerticalGroup(
            panelsalir1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelsalir1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(salir3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 269, Short.MAX_VALUE)
                .addComponent(panelsalir1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelsalir1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 50));

        tabla2.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        tabla2.setForeground(new java.awt.Color(0, 0, 0));
        tabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOMBRE", "RNC", "TELEFONO", "DIRECCION", "EMAIL", "ENCARGADO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabla2.setFocusable(false);
        tabla2.setGridColor(new java.awt.Color(90, 22, 45));
        tabla2.setSelectionBackground(new java.awt.Color(161, 152, 130));
        jScrollPane1.setViewportView(tabla2);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 860, 270));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel3.setText("CANTIDAD DE REGISTROS:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 150, 20));

        text.setEditable(false);
        text.setBackground(new java.awt.Color(254, 247, 220));
        text.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        text.setForeground(new java.awt.Color(204, 0, 0));
        text.setBorder(null);
        text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textActionPerformed(evt);
            }
        });
        jPanel1.add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, 50, 20));

        jPanel3.setBackground(new java.awt.Color(254, 247, 220));

        jSeparator7.setBackground(new java.awt.Color(0, 0, 0));

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

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("BUSCAR PROVEEDOR:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(9, 9, 9)
                        .addComponent(idenpro, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(idenpro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 340, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salir3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salir3MouseClicked
        this.dispose(); // TODO add your handling code here:
    }//GEN-LAST:event_salir3MouseClicked

    private void salir3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salir3MouseEntered
        panelsalir1.setBackground(Color.RED);
    }//GEN-LAST:event_salir3MouseEntered

    private void salir3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salir3MouseExited
        Color colorPersonalizado = new Color(161, 152, 130);
        panelsalir1.setBackground(colorPersonalizado);
    }//GEN-LAST:event_salir3MouseExited

    private void panelsalir1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelsalir1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_panelsalir1MouseEntered

    private void panelsalir1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelsalir1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_panelsalir1MouseExited

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation( x - xMouse,  y - yMouse);
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        xMouse = evt.getX();
        yMouse = evt.getX(); // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2MousePressed

    private void textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textActionPerformed

    private void idenproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idenproActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idenproActionPerformed

    private void idenproKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idenproKeyReleased
        cargar_TABLA();
    }//GEN-LAST:event_idenproKeyReleased

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
            java.util.logging.Logger.getLogger(consulta_proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(consulta_proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(consulta_proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(consulta_proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new consulta_proveedores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField idenpro;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JPanel panelsalir1;
    private javax.swing.JLabel salir3;
    private javax.swing.JTable tabla2;
    private javax.swing.JTextField text;
    // End of variables declaration//GEN-END:variables
}
