package formulario;


import conf.conexion;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.sql.Connection;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Yeico
 */
public class compras extends javax.swing.JFrame {

   int xMouse, yMouse;
    conexion cc = new conexion();
    Connection  cx=cc.conectar();
   
    public compras() {
        initComponents();
          initComponents();
        setLocationRelativeTo(null);
        tabla2.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,12));
         tabla2.getTableHeader().setOpaque(false);
         tabla2.getTableHeader().setBackground(new Color(161, 152, 130));
         tabla2.getTableHeader().setForeground(new Color(32, 136, 203));
         tabla2.setRowHeight(25);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelsalir = new javax.swing.JPanel();
        salir = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        proveedor = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        rnc = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        direccion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jTextField4 = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jTextField6 = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jTextField8 = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jTextField9 = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        jTextField10 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla2 = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        jTextField12 = new javax.swing.JTextField();
        nuevo3 = new javax.swing.JPanel();
        nuevo2 = new javax.swing.JLabel();
        nuevo4 = new javax.swing.JPanel();
        nuevo5 = new javax.swing.JLabel();
        nuevo6 = new javax.swing.JPanel();
        nuevo7 = new javax.swing.JLabel();
        nuevo10 = new javax.swing.JPanel();
        nuevo11 = new javax.swing.JLabel();
        nuevo12 = new javax.swing.JPanel();
        nuevo13 = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        jTextField13 = new javax.swing.JTextField();
        nuevo15 = new javax.swing.JPanel();
        nuevo14 = new javax.swing.JLabel();
        nuevo17 = new javax.swing.JPanel();
        nuevo16 = new javax.swing.JLabel();
        nuevo8 = new javax.swing.JPanel();
        nuevo9 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(254, 247, 220));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(161, 152, 130));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel2MouseMoved(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Gestion de Compras");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 13, 230, 37));

        panelsalir.setBackground(new java.awt.Color(161, 152, 130));
        panelsalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelsalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelsalirMouseExited(evt);
            }
        });

        salir.setBackground(new java.awt.Color(0, 0, 0));
        salir.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        salir.setText("     X");
        salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salirMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelsalirLayout = new javax.swing.GroupLayout(panelsalir);
        panelsalir.setLayout(panelsalirLayout);
        panelsalirLayout.setHorizontalGroup(
            panelsalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelsalirLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelsalirLayout.setVerticalGroup(
            panelsalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelsalirLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(panelsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(929, 0, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, -1));

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("PROVEEDOR:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 127, 90, 22));

        proveedor.setBackground(new java.awt.Color(254, 247, 220));
        proveedor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        proveedor.setBorder(null);
        proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proveedorActionPerformed(evt);
            }
        });
        jPanel1.add(proveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 131, 223, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 147, 223, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setToolTipText("");
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 223, 10));

        rnc.setBackground(new java.awt.Color(254, 247, 220));
        rnc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rnc.setBorder(null);
        jPanel1.add(rnc, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 161, 223, 20));

        jLabel3.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("RNC:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, 22));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 223, 10));

        direccion.setBackground(new java.awt.Color(254, 247, 220));
        direccion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        direccion.setBorder(null);
        direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccionActionPerformed(evt);
            }
        });
        jPanel1.add(direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 206, 223, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("DIRECCION:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 203, 80, 22));

        jLabel5.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("CODIGO:");
        jLabel5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabel5FocusGained(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, 20));

        jLabel6.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("DATOS DE VENTA");
        jLabel6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabel6FocusGained(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, 160, 22));

        jLabel7.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("STOCK:");
        jLabel7.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabel7FocusGained(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 50, 20));

        jLabel9.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("DESCRIPCION:");
        jLabel9.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabel9FocusGained(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, -1, 22));

        jLabel10.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("PRECIO:");
        jLabel10.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabel10FocusGained(evt);
            }
        });
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 330, -1, 22));

        jLabel12.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("CANTIDAD:");
        jLabel12.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabel12FocusGained(evt);
            }
        });
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 330, -1, 22));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 187, -1));

        jTextField4.setBackground(new java.awt.Color(254, 247, 220));
        jTextField4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField4.setBorder(null);
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 190, 20));

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 348, 187, -1));

        jTextField6.setBackground(new java.awt.Color(254, 247, 220));
        jTextField6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField6.setBorder(null);
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 187, -1));

        jSeparator8.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(347, 348, 90, -1));

        jTextField8.setBackground(new java.awt.Color(254, 247, 220));
        jTextField8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField8.setBorder(null);
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(347, 332, 80, -1));

        jSeparator9.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(517, 348, 114, -1));

        jTextField9.setBackground(new java.awt.Color(254, 247, 220));
        jTextField9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField9.setBorder(null);
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        jTextField9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField9KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(517, 332, 114, -1));

        jSeparator10.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 242, -1));

        jTextField10.setBackground(new java.awt.Color(254, 247, 220));
        jTextField10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField10.setBorder(null);
        jPanel1.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 242, 20));

        jLabel13.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("COND. COMPRA:");
        jLabel13.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabel13FocusGained(evt);
            }
        });
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(523, 127, 120, 22));

        jLabel14.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("NRO. FACTURA:");
        jLabel14.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabel14FocusGained(evt);
            }
        });
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, -1, 22));

        jComboBox1.setBackground(new java.awt.Color(161, 152, 130));
        jComboBox1.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(51, 51, 51));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Contado", "Credito" }));
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(643, 127, -1, -1));

        tabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "DESCRIPCION", "PRECIO", "CANTIDAD", "SUBTOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla2.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane3.setViewportView(tabla2);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 812, 208));

        jLabel15.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("TOTAL DE COMPRA:");
        jLabel15.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabel15FocusGained(evt);
            }
        });
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 590, -1, 22));

        jSeparator12.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 610, 114, -1));

        jTextField12.setEditable(false);
        jTextField12.setBackground(new java.awt.Color(254, 247, 220));
        jTextField12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField12.setBorder(null);
        jPanel1.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 590, 114, 20));

        nuevo3.setBackground(new java.awt.Color(161, 152, 130));
        nuevo3.setToolTipText("NUEVO");

        nuevo2.setBackground(new java.awt.Color(0, 0, 0));
        nuevo2.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        nuevo2.setForeground(new java.awt.Color(0, 0, 0));
        nuevo2.setText("   BUSCAR");
        nuevo2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nuevo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nuevo2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nuevo2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nuevo2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nuevo2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout nuevo3Layout = new javax.swing.GroupLayout(nuevo3);
        nuevo3.setLayout(nuevo3Layout);
        nuevo3Layout.setHorizontalGroup(
            nuevo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nuevo3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(nuevo2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        nuevo3Layout.setVerticalGroup(
            nuevo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nuevo3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(nuevo2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(nuevo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 70, 30));

        nuevo4.setBackground(new java.awt.Color(161, 152, 130));
        nuevo4.setToolTipText("NUEVO");

        nuevo5.setBackground(new java.awt.Color(0, 0, 0));
        nuevo5.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        nuevo5.setForeground(new java.awt.Color(0, 0, 0));
        nuevo5.setText("     PRECIO");
        nuevo5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nuevo5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nuevo5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nuevo5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nuevo5MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nuevo5MousePressed(evt);
            }
        });

        javax.swing.GroupLayout nuevo4Layout = new javax.swing.GroupLayout(nuevo4);
        nuevo4.setLayout(nuevo4Layout);
        nuevo4Layout.setHorizontalGroup(
            nuevo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nuevo4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(nuevo5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        nuevo4Layout.setVerticalGroup(
            nuevo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nuevo4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(nuevo5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(nuevo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 330, 70, 20));

        nuevo6.setBackground(new java.awt.Color(161, 152, 130));
        nuevo6.setToolTipText("NUEVO");

        nuevo7.setBackground(new java.awt.Color(0, 0, 0));
        nuevo7.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        nuevo7.setForeground(new java.awt.Color(0, 0, 0));
        nuevo7.setText("   BUSCAR");
        nuevo7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nuevo7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nuevo7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nuevo7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nuevo7MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nuevo7MousePressed(evt);
            }
        });

        javax.swing.GroupLayout nuevo6Layout = new javax.swing.GroupLayout(nuevo6);
        nuevo6.setLayout(nuevo6Layout);
        nuevo6Layout.setHorizontalGroup(
            nuevo6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nuevo6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(nuevo7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        nuevo6Layout.setVerticalGroup(
            nuevo6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nuevo6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(nuevo7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(nuevo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 300, -1, -1));

        nuevo10.setBackground(new java.awt.Color(161, 152, 130));
        nuevo10.setToolTipText("NUEVO");

        nuevo11.setBackground(new java.awt.Color(0, 0, 0));
        nuevo11.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        nuevo11.setForeground(new java.awt.Color(0, 0, 0));
        nuevo11.setText("  ELIMINAR");
        nuevo11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nuevo11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nuevo11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nuevo11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nuevo11MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nuevo11MousePressed(evt);
            }
        });

        javax.swing.GroupLayout nuevo10Layout = new javax.swing.GroupLayout(nuevo10);
        nuevo10.setLayout(nuevo10Layout);
        nuevo10Layout.setHorizontalGroup(
            nuevo10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nuevo10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(nuevo11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        nuevo10Layout.setVerticalGroup(
            nuevo10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nuevo10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(nuevo11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(nuevo10, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 300, -1, -1));

        nuevo12.setBackground(new java.awt.Color(161, 152, 130));
        nuevo12.setToolTipText("NUEVO");

        nuevo13.setBackground(new java.awt.Color(0, 0, 0));
        nuevo13.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        nuevo13.setForeground(new java.awt.Color(0, 0, 0));
        nuevo13.setText("   LIMPIAR");
        nuevo13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nuevo13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nuevo13MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nuevo13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nuevo13MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nuevo13MousePressed(evt);
            }
        });

        javax.swing.GroupLayout nuevo12Layout = new javax.swing.GroupLayout(nuevo12);
        nuevo12.setLayout(nuevo12Layout);
        nuevo12Layout.setHorizontalGroup(
            nuevo12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nuevo12Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(nuevo13, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        nuevo12Layout.setVerticalGroup(
            nuevo12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nuevo12Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(nuevo13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(nuevo12, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 330, -1, -1));

        jSeparator13.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 200, 90, 10));

        jTextField13.setBackground(new java.awt.Color(254, 247, 220));
        jTextField13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField13.setBorder(null);
        jPanel1.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 180, 90, 20));

        nuevo15.setBackground(new java.awt.Color(161, 152, 130));
        nuevo15.setToolTipText("NUEVO");

        nuevo14.setBackground(new java.awt.Color(0, 0, 0));
        nuevo14.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        nuevo14.setForeground(new java.awt.Color(0, 0, 0));
        nuevo14.setText("    GUARDAR");
        nuevo14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nuevo14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nuevo14MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nuevo14MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nuevo14MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nuevo14MousePressed(evt);
            }
        });

        javax.swing.GroupLayout nuevo15Layout = new javax.swing.GroupLayout(nuevo15);
        nuevo15.setLayout(nuevo15Layout);
        nuevo15Layout.setHorizontalGroup(
            nuevo15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nuevo15Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(nuevo14, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        nuevo15Layout.setVerticalGroup(
            nuevo15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nuevo15Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(nuevo14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(nuevo15, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 460, 80, 30));

        nuevo17.setBackground(new java.awt.Color(161, 152, 130));
        nuevo17.setToolTipText("NUEVO");

        nuevo16.setBackground(new java.awt.Color(0, 0, 0));
        nuevo16.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        nuevo16.setForeground(new java.awt.Color(0, 0, 0));
        nuevo16.setText(" CREAR LISTA");
        nuevo16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nuevo16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nuevo16MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nuevo16MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nuevo16MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nuevo16MousePressed(evt);
            }
        });

        javax.swing.GroupLayout nuevo17Layout = new javax.swing.GroupLayout(nuevo17);
        nuevo17.setLayout(nuevo17Layout);
        nuevo17Layout.setHorizontalGroup(
            nuevo17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nuevo17Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(nuevo16, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        nuevo17Layout.setVerticalGroup(
            nuevo17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nuevo17Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(nuevo16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(nuevo17, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 370, 80, 30));

        nuevo8.setBackground(new java.awt.Color(161, 152, 130));
        nuevo8.setToolTipText("NUEVO");

        nuevo9.setBackground(new java.awt.Color(0, 0, 0));
        nuevo9.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        nuevo9.setForeground(new java.awt.Color(0, 0, 0));
        nuevo9.setText("   CANCELAR");
        nuevo9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nuevo9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nuevo9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nuevo9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nuevo9MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nuevo9MousePressed(evt);
            }
        });

        javax.swing.GroupLayout nuevo8Layout = new javax.swing.GroupLayout(nuevo8);
        nuevo8.setLayout(nuevo8Layout);
        nuevo8Layout.setHorizontalGroup(
            nuevo8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nuevo8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(nuevo9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        nuevo8Layout.setVerticalGroup(
            nuevo8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nuevo8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(nuevo9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(nuevo8, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 540, -1, -1));

        jSeparator11.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 580, -1, -1));

        jPanel4.setBackground(new java.awt.Color(161, 152, 130));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 990, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 990, 10));

        jLabel16.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Articulos");
        jLabel16.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabel16FocusGained(evt);
            }
        });
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 100, 22));

        jPanel5.setBackground(new java.awt.Color(161, 152, 130));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 106, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 110, -1, 20));

        jPanel8.setBackground(new java.awt.Color(161, 152, 130));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 590, -1, -1));

        jPanel12.setBackground(new java.awt.Color(161, 152, 130));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 590, -1, -1));

        jPanel11.setBackground(new java.awt.Color(161, 152, 130));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 590, -1, -1));

        jPanel10.setBackground(new java.awt.Color(161, 152, 130));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 590, -1, -1));

        jPanel9.setBackground(new java.awt.Color(161, 152, 130));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 590, -1, -1));

        jPanel6.setBackground(new java.awt.Color(161, 152, 130));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 106, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 180, -1, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 991, 632));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseClicked
        this.dispose(); // TODO add your handling code here:
    }//GEN-LAST:event_salirMouseClicked

    private void salirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseEntered
        panelsalir.setBackground(Color.RED);
    }//GEN-LAST:event_salirMouseEntered

    private void salirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseExited
        Color colorPersonalizado = new Color(161, 152, 130);
        panelsalir.setBackground(colorPersonalizado);
    }//GEN-LAST:event_salirMouseExited

    private void panelsalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelsalirMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_panelsalirMouseEntered

    private void panelsalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelsalirMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_panelsalirMouseExited

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation( x - xMouse,  y - yMouse);  // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2MouseMoved

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        xMouse = evt.getX();
        yMouse = evt.getX(); // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2MousePressed

    private void proveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proveedorActionPerformed

    private void direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_direccionActionPerformed

    private void jLabel5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel5FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5FocusGained

    private void jLabel6FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel6FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6FocusGained

    private void jLabel7FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel7FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7FocusGained

    private void jLabel9FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel9FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9FocusGained

    private void jLabel10FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel10FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10FocusGained

    private void jLabel12FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel12FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel12FocusGained

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed

    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9KeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            evt.consume(); // Esto evita que el carácter no válido se ingrese en el campo de texto.
        }  // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9KeyTyped

    private void jLabel13FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel13FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel13FocusGained

    private void jLabel14FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel14FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel14FocusGained

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jLabel15FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel15FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel15FocusGained

    private void nuevo2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevo2MouseClicked
        new vista_proveedor().setVisible(true); // TODO add your handling code here:
    }//GEN-LAST:event_nuevo2MouseClicked

    private void nuevo2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevo2MouseEntered
        nuevo3.setBackground(Color.gray);
    }//GEN-LAST:event_nuevo2MouseEntered

    private void nuevo2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevo2MouseExited
        Color colorPersonalizado = new Color(161, 152, 130);
        nuevo3.setBackground(colorPersonalizado);// TODO add your handling code here:
    }//GEN-LAST:event_nuevo2MouseExited

    private void nuevo2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevo2MousePressed
        nuevo3.setBackground(Color.gray); // TODO add your handling code here:
    }//GEN-LAST:event_nuevo2MousePressed

    private void nuevo5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevo5MouseClicked
        new precio_compra().setVisible(true); // TODO add your handling code here:
    }//GEN-LAST:event_nuevo5MouseClicked

    private void nuevo5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevo5MouseEntered
        nuevo4.setBackground(Color.gray);   // TODO add your handling code here:
    }//GEN-LAST:event_nuevo5MouseEntered

    private void nuevo5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevo5MouseExited
        Color colorPersonalizado = new Color(161, 152, 130);
        nuevo4.setBackground(colorPersonalizado);  // TODO add your handling code here:
    }//GEN-LAST:event_nuevo5MouseExited

    private void nuevo5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevo5MousePressed
        nuevo4.setBackground(Color.gray);    // TODO add your handling code here:
    }//GEN-LAST:event_nuevo5MousePressed

    private void nuevo7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevo7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_nuevo7MouseClicked

    private void nuevo7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevo7MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_nuevo7MouseEntered

    private void nuevo7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevo7MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_nuevo7MouseExited

    private void nuevo7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevo7MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_nuevo7MousePressed

    private void nuevo11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevo11MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_nuevo11MouseClicked

    private void nuevo11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevo11MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_nuevo11MouseEntered

    private void nuevo11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevo11MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_nuevo11MouseExited

    private void nuevo11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevo11MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_nuevo11MousePressed

    private void nuevo13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevo13MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_nuevo13MouseClicked

    private void nuevo13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevo13MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_nuevo13MouseEntered

    private void nuevo13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevo13MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_nuevo13MouseExited

    private void nuevo13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevo13MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_nuevo13MousePressed

    private void nuevo14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevo14MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_nuevo14MouseClicked

    private void nuevo14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevo14MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_nuevo14MouseEntered

    private void nuevo14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevo14MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_nuevo14MouseExited

    private void nuevo14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevo14MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_nuevo14MousePressed

    private void nuevo16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevo16MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_nuevo16MouseClicked

    private void nuevo16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevo16MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_nuevo16MouseEntered

    private void nuevo16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevo16MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_nuevo16MouseExited

    private void nuevo16MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevo16MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_nuevo16MousePressed

    private void nuevo9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevo9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_nuevo9MouseClicked

    private void nuevo9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevo9MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_nuevo9MouseEntered

    private void nuevo9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevo9MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_nuevo9MouseExited

    private void nuevo9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevo9MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_nuevo9MousePressed

    private void jLabel16FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel16FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel16FocusGained

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
            java.util.logging.Logger.getLogger(compras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(compras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(compras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(compras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new compras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField direccion;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JPanel nuevo10;
    private javax.swing.JLabel nuevo11;
    private javax.swing.JPanel nuevo12;
    private javax.swing.JLabel nuevo13;
    private javax.swing.JLabel nuevo14;
    private javax.swing.JPanel nuevo15;
    private javax.swing.JLabel nuevo16;
    private javax.swing.JPanel nuevo17;
    private javax.swing.JLabel nuevo2;
    private javax.swing.JPanel nuevo3;
    private javax.swing.JPanel nuevo4;
    private javax.swing.JLabel nuevo5;
    private javax.swing.JPanel nuevo6;
    private javax.swing.JLabel nuevo7;
    private javax.swing.JPanel nuevo8;
    private javax.swing.JLabel nuevo9;
    private javax.swing.JPanel panelsalir;
    private javax.swing.JTextField proveedor;
    private javax.swing.JTextField rnc;
    private javax.swing.JLabel salir;
    private javax.swing.JTable tabla2;
    // End of variables declaration//GEN-END:variables
}
