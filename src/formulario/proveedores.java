/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package formulario;

import conf.conexion;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.io.File;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;


public class proveedores extends javax.swing.JFrame {
     int xMouse, yMouse;
    conexion cc = new conexion();
    Connection  cx=cc.conectar();

    public proveedores() {
        initComponents();
        setLocationRelativeTo(null);
         cargar_TABLA();
         tabla1.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,12));
         tabla1.getTableHeader().setOpaque(false);
         tabla1.getTableHeader().setBackground(new Color(161, 152, 130));
         tabla1.getTableHeader().setForeground(new Color(32, 136, 203));
         tabla1.setRowHeight(25);
    }
     public void limpiar(){
        nombrepro.setText("");
        RNC.setText("");
        telefonopro.setText("");
        emailpro.setText("");
        direccionpro.setText("");
        encargadopro.setText("");
        idenpro.setText("");
        nombrepro.requestFocus(true);
     }
     
     
      private void actualizarCamposDeTextoConFilaSeleccionada() {
    int filaSeleccionada = tabla1.getSelectedRow();
    if (filaSeleccionada != -1) {
        // Obtener los valores de la fila seleccionada
        Object idValor = tabla1.getValueAt(filaSeleccionada, 0);
        Object nomValor = tabla1.getValueAt(filaSeleccionada, 1);
        Object rncValor = tabla1.getValueAt(filaSeleccionada, 2);
        Object telValor = tabla1.getValueAt(filaSeleccionada, 3);
        Object emailValor = tabla1.getValueAt(filaSeleccionada, 4);
        Object direcValor = tabla1.getValueAt(filaSeleccionada, 5);
        Object encargadoValor = tabla1.getValueAt(filaSeleccionada, 6);

        // Actualizar los campos de texto con los valores correspondientes
         idenpro.setText(idValor.toString());
        nombrepro.setText(nomValor.toString());
        RNC.setText(rncValor.toString());
        telefonopro.setText(telValor.toString());
        emailpro.setText(emailValor.toString());
        direccionpro.setText(direcValor.toString());
        encargadopro.setText(encargadoValor.toString());
    }
}
      
       public void agregar_base() {
    String[] registros = new String[10];
    String id = idenpro.getText();
    
    // Verificar si se ha seleccionado una tabla
    if (id.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Por favor, llene el campo.");
        return;
    }
    
    try {
        // Verificar si el contenido de id es un número entero
        int idInt = Integer.parseInt(id);
        
        String SQL = "SELECT nompro,rncpro , telepro, emailpro, direcpro, encargadopro FROM proveedores where idpro = ?";
        
        PreparedStatement ps = cx.prepareStatement(SQL);
        ps.setInt(1, idInt);
        ResultSet rs = ps.executeQuery();
    
        if (rs.next()) {
            registros[0] = rs.getString("nompro");
            registros[1] = rs.getString("rncpro");
            registros[2] = rs.getString("telepro");
            registros[3] = rs.getString("emailpro");
            registros[4] = rs.getString("direcpro");
            registros[5] = rs.getString("encargadopro");
      
             idenpro.setText(id);
            nombrepro.setText(registros[0]);
            RNC.setText(registros[1]);
            telefonopro.setText(registros[2]);
            emailpro.setText(registros[3]);
            direccionpro.setText(registros[4]);
            encargadopro.setText(registros[5]);
        } else {
            JOptionPane.showMessageDialog(null, "No se encontraron registros con el ID proporcionado.");
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Selecione la tabla.");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
    }
}
         void cargar_TABLA(){
        
    
    DefaultTableModel modelo1 = (DefaultTableModel)tabla1.getModel();
    modelo1.getDataVector().clear();
    
    String [] registro = new String[8];
    String SQL ="SELECT idpro,nompro,rncpro,telepro,emailpro,direcpro,encargadopro FROM proveedores "
            + "WHERE nompro LIKE '%"+idenpro.getText()+"%' or idpro LIKE '%"+idenpro.getText()+"%'";
    
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
          tabla1.setModel(modelo1);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error" + e.getMessage());
        
        }
    }
          public void modificar() {
    try {
        String id = idenpro.getText();
        String nombre = nombrepro.getText();
        String rnc = RNC.getText();
        String telefono = telefonopro.getText();
        String email = emailpro.getText();
        String direccion = direccionpro.getText();
        String encargado = encargadopro.getText();

        if (id.isEmpty() || nombre.isEmpty() || rnc.isEmpty() || telefono.isEmpty() || email.isEmpty() || direccion.isEmpty() || encargado.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se puede actualizar, si los compos estan vacios");
        } else {
            PreparedStatement psU = cx.prepareStatement("UPDATE proveedores SET " +
                    "nompro='" + nombre + "', " +
                    "rncpro='" + rnc + "', " +
                    "telepro='" + telefono + "', " +
                    "emailpro='" + email + "', " +
                    "direcpro='" + direccion + "', " +
                    "encargadopro='" + encargado + "' " +
                    "WHERE idpro='" + id + "'");
            
            psU.executeUpdate();
            JOptionPane.showMessageDialog(null, "Actualizado ");
            cargar_TABLA();
            limpiar();
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
    }
}
            public void eliminar_datos() {
    try {
        // Obtén el valor del ID desde el campo de texto
        String idProveedoresTexto = idenpro.getText();

        if (idProveedoresTexto.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Click en la tabla para eliminar");
            return;
        }

        int idProveedores = Integer.parseInt(idProveedoresTexto); // Convierte el valor a entero

        String SQL = "DELETE FROM proveedores WHERE idpro = ?";

        // Preparar la consulta SQL y ejecutar la eliminación
        PreparedStatement statement = cx.prepareStatement(SQL);
        statement.setInt(1, idProveedores);

        int n = statement.executeUpdate();

        if (n > 0) {
            JOptionPane.showMessageDialog(null, "Proveedor eliminado");
            limpiar();
            cargar_TABLA();
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo eliminar el proveedor");
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Ingrese un valor válido para el ID");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
    }
}


  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nombrepro = new javax.swing.JTextField();
        emailpro = new javax.swing.JTextField();
        direccionpro = new javax.swing.JTextField();
        encargadopro = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelsalir = new javax.swing.JPanel();
        salir = new javax.swing.JLabel();
        guardar = new javax.swing.JPanel();
        guardar1 = new javax.swing.JLabel();
        nuevo3 = new javax.swing.JPanel();
        nuevo1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        telefonopro = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        RNC = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        idenpro = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        actualizar = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        eliminar1 = new javax.swing.JPanel();
        eliminar = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(254, 247, 220));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("NOMBRE:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("EMAIL:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("DIRECCION:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 460, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("ENCARGADO:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 460, -1, -1));

        nombrepro.setBackground(new java.awt.Color(254, 247, 220));
        nombrepro.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        nombrepro.setBorder(null);
        nombrepro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreproActionPerformed(evt);
            }
        });
        nombrepro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nombreproKeyPressed(evt);
            }
        });
        jPanel1.add(nombrepro, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 230, 20));

        emailpro.setBackground(new java.awt.Color(254, 247, 220));
        emailpro.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        emailpro.setBorder(null);
        emailpro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailproActionPerformed(evt);
            }
        });
        emailpro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                emailproKeyPressed(evt);
            }
        });
        jPanel1.add(emailpro, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, 230, 20));

        direccionpro.setBackground(new java.awt.Color(254, 247, 220));
        direccionpro.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        direccionpro.setBorder(null);
        direccionpro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccionproActionPerformed(evt);
            }
        });
        direccionpro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                direccionproKeyPressed(evt);
            }
        });
        jPanel1.add(direccionpro, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 490, 230, 20));

        encargadopro.setBackground(new java.awt.Color(254, 247, 220));
        encargadopro.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        encargadopro.setBorder(null);
        encargadopro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encargadoproActionPerformed(evt);
            }
        });
        encargadopro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                encargadoproKeyPressed(evt);
            }
        });
        jPanel1.add(encargadopro, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 490, 230, 20));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 440, 229, 11));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 440, 229, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 510, 229, -1));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, 229, -1));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 229, -1));

        jPanel3.setBackground(new java.awt.Color(161, 152, 130));
        jPanel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel3MouseDragged(evt);
            }
        });
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("GESTION DE PROVEEDORES");

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
                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 304, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(256, 256, 256)
                .addComponent(panelsalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(panelsalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 60));

        guardar.setBackground(new java.awt.Color(161, 152, 130));
        guardar.setToolTipText("NUEVO");

        guardar1.setBackground(new java.awt.Color(0, 0, 0));
        guardar1.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        guardar1.setForeground(new java.awt.Color(0, 0, 0));
        guardar1.setText("    GUARDAR");
        guardar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guardar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guardar1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                guardar1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                guardar1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                guardar1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout guardarLayout = new javax.swing.GroupLayout(guardar);
        guardar.setLayout(guardarLayout);
        guardarLayout.setHorizontalGroup(
            guardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, guardarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(guardar1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        guardarLayout.setVerticalGroup(
            guardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, guardarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(guardar1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 560, 80, 30));

        nuevo3.setBackground(new java.awt.Color(161, 152, 130));
        nuevo3.setToolTipText("NUEVO");

        nuevo1.setBackground(new java.awt.Color(0, 0, 0));
        nuevo1.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        nuevo1.setForeground(new java.awt.Color(0, 0, 0));
        nuevo1.setText("     NUEVO");
        nuevo1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nuevo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nuevo1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nuevo1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nuevo1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nuevo1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout nuevo3Layout = new javax.swing.GroupLayout(nuevo3);
        nuevo3.setLayout(nuevo3Layout);
        nuevo3Layout.setHorizontalGroup(
            nuevo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nuevo3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(nuevo1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        nuevo3Layout.setVerticalGroup(
            nuevo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nuevo3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(nuevo1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(nuevo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 560, 70, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("TELEFONO:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 390, -1, 20));

        telefonopro.setBackground(new java.awt.Color(254, 247, 220));
        telefonopro.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        telefonopro.setBorder(null);
        telefonopro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoproActionPerformed(evt);
            }
        });
        telefonopro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                telefonoproKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telefonoproKeyTyped(evt);
            }
        });
        jPanel1.add(telefonopro, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 420, 230, 20));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("RNC:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 390, -1, 20));

        RNC.setBackground(new java.awt.Color(254, 247, 220));
        RNC.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        RNC.setBorder(null);
        RNC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RNCActionPerformed(evt);
            }
        });
        RNC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                RNCKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                RNCKeyTyped(evt);
            }
        });
        jPanel1.add(RNC, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 420, 230, 20));

        tabla1.setBackground(new java.awt.Color(255, 255, 255));
        tabla1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tabla1.setForeground(new java.awt.Color(0, 0, 0));
        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "RNC", "TELEFONO", "EMAIL", "DIRECCION", "ENCARGADO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla1.setFocusable(false);
        tabla1.setSelectionBackground(new java.awt.Color(161, 152, 130));
        tabla1.getTableHeader().setReorderingAllowed(false);
        tabla1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 800, 220));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("BUSCAR PROVEEDOR:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, 20));

        idenpro.setBackground(new java.awt.Color(254, 247, 220));
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
        jPanel1.add(idenpro, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 210, 20));

        jSeparator7.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 210, 10));

        actualizar.setBackground(new java.awt.Color(161, 152, 130));

        jLabel11.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("  ACTUALIZAR");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel11MouseExited(evt);
            }
        });

        javax.swing.GroupLayout actualizarLayout = new javax.swing.GroupLayout(actualizar);
        actualizar.setLayout(actualizarLayout);
        actualizarLayout.setHorizontalGroup(
            actualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, actualizarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        actualizarLayout.setVerticalGroup(
            actualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, actualizarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 560, 100, 30));

        eliminar1.setBackground(new java.awt.Color(161, 152, 130));

        eliminar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        eliminar.setForeground(new java.awt.Color(0, 0, 0));
        eliminar.setText("    ELIMINAR");
        eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                eliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                eliminarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout eliminar1Layout = new javax.swing.GroupLayout(eliminar1);
        eliminar1.setLayout(eliminar1Layout);
        eliminar1Layout.setHorizontalGroup(
            eliminar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, eliminar1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        eliminar1Layout.setVerticalGroup(
            eliminar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, eliminar1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(eliminar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 560, 90, 30));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 510, 230, 10));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreproActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreproActionPerformed

    private void nombreproKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreproKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        RNC.requestFocus();  // TODO add your handling code here:
    }//GEN-LAST:event_nombreproKeyPressed

    private void emailproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailproActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailproActionPerformed

    private void emailproKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailproKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        direccionpro.requestFocus();   // TODO add your handling code here:
    }//GEN-LAST:event_emailproKeyPressed

    private void direccionproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccionproActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_direccionproActionPerformed

    private void direccionproKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_direccionproKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        encargadopro.requestFocus();   // TODO add your handling code here:
    }//GEN-LAST:event_direccionproKeyPressed

    private void encargadoproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encargadoproActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_encargadoproActionPerformed

    private void encargadoproKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_encargadoproKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        guardar1.requestFocus();  // TODO add your handling code here:
    }//GEN-LAST:event_encargadoproKeyPressed

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

    private void jPanel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation( x - xMouse,  y - yMouse); // TODO add your handling code here:
    }//GEN-LAST:event_jPanel3MouseDragged

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
        xMouse = evt.getX();
        yMouse = evt.getX();
    }//GEN-LAST:event_jPanel3MousePressed

    private void guardar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardar1MouseClicked
        try {
            String nombre = nombrepro.getText();
            String rnc = RNC.getText();
            String telefono = telefonopro.getText();
            String email = emailpro.getText();
            String direccion = direccionpro.getText();
            String encargado = encargadopro.getText();

            if (nombre.isEmpty() || rnc.isEmpty() ||telefono.isEmpty()|| email.isEmpty() || direccion.isEmpty() || encargado.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese todos los datos");

                // Establecer el enfoque en el primer campo vacío
                if (nombre.isEmpty()) {
                    nombrepro.requestFocus();
                } else if (rnc.isEmpty()) {
                    RNC.requestFocus();
                }else if (rnc.isEmpty()) {
                    telefonopro.requestFocus();
                } else if (email.isEmpty()) {
                    emailpro.requestFocus();
                } else if (direccion.isEmpty()) {
                    direccionpro.requestFocus();
                } else if (encargado.isEmpty()) {
                    encargadopro.requestFocus();
                }
            } else {
                String SQL = "INSERT INTO proveedores (nompro,rncpro, telepro, emailpro, direcpro,encargadopro) VALUES (?, ?, ?, ?, ?, ?)";
                PreparedStatement psz = cx.prepareStatement(SQL);

                psz.setString(1, nombre);
                psz.setString(2, rnc);
                psz.setString(3, telefono);
                psz.setString(4, email);
                psz.setString(5, direccion);
                psz.setString(6, encargado);

                // Desactivar la opción de autocommit
                cx.setAutoCommit(false);

                int n = psz.executeUpdate();
                if (n > 0) {
                    // Confirmar la transacción
                    cx.commit();
                    JOptionPane.showMessageDialog(null, "Datos almacenados");
                    cargar_TABLA();
                    limpiar();
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_guardar1MouseClicked

    private void guardar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardar1MouseEntered
        guardar.setBackground(Color.gray);
    }//GEN-LAST:event_guardar1MouseEntered

    private void guardar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardar1MouseExited
        Color colorPersonalizado = new Color(161, 152, 130);
        guardar.setBackground(colorPersonalizado);// TODO add your handling code here:
    }//GEN-LAST:event_guardar1MouseExited

    private void guardar1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardar1MousePressed
        guardar.setBackground(Color.gray);// TODO add your handling code here:
    }//GEN-LAST:event_guardar1MousePressed

    private void nuevo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevo1MouseClicked
        limpiar();
        cargar_TABLA();// TODO add your handling code here:
    }//GEN-LAST:event_nuevo1MouseClicked

    private void nuevo1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevo1MouseEntered
        nuevo3.setBackground(Color.gray);
    }//GEN-LAST:event_nuevo1MouseEntered

    private void nuevo1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevo1MouseExited
        Color colorPersonalizado = new Color(161, 152, 130);
        nuevo3.setBackground(colorPersonalizado);// TODO add your handling code here:
    }//GEN-LAST:event_nuevo1MouseExited

    private void nuevo1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevo1MousePressed
        nuevo3.setBackground(Color.gray); // TODO add your handling code here:
    }//GEN-LAST:event_nuevo1MousePressed

    private void telefonoproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoproActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoproActionPerformed

    private void telefonoproKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonoproKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        emailpro.requestFocus();    // TODO add your handling code here:
    }//GEN-LAST:event_telefonoproKeyPressed

    private void telefonoproKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonoproKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            evt.consume(); // Esto evita que el carácter no válido se ingrese en el campo de texto.
        } // TODO add your handling code here:
    }//GEN-LAST:event_telefonoproKeyTyped

    private void RNCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RNCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RNCActionPerformed

    private void RNCKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RNCKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        telefonopro.requestFocus();// TODO add your handling code here:
    }//GEN-LAST:event_RNCKeyPressed

    private void RNCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RNCKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            evt.consume(); // Esto evita que el carácter no válido se ingrese en el campo de texto.
        } // TODO add your handling code here:
    }//GEN-LAST:event_RNCKeyTyped

    private void tabla1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla1MouseClicked
        actualizarCamposDeTextoConFilaSeleccionada();

        cargar_TABLA();// TODO add your handling code here:
    }//GEN-LAST:event_tabla1MouseClicked

    private void idenproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idenproActionPerformed
        agregar_base();  // TODO add your handling code here:
    }//GEN-LAST:event_idenproActionPerformed

    private void idenproKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idenproKeyReleased
        cargar_TABLA();
    }//GEN-LAST:event_idenproKeyReleased

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        modificar();

        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseEntered
        actualizar.setBackground(Color.GRAY);
    }//GEN-LAST:event_jLabel11MouseEntered

    private void jLabel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseExited
        Color colorPersonalizado = new Color(161, 152, 130);
        actualizar.setBackground(colorPersonalizado); // TODO add your handling code here:
    }//GEN-LAST:event_jLabel11MouseExited

    private void eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarMouseClicked
        eliminar_datos();
        cargar_TABLA();
    }//GEN-LAST:event_eliminarMouseClicked

    private void eliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarMouseEntered
        eliminar1.setBackground(Color.GRAY);// TODO add your handling code here:
    }//GEN-LAST:event_eliminarMouseEntered

    private void eliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarMouseExited
        Color colorPersonalizado = new Color(161, 152, 130);
        eliminar1.setBackground(colorPersonalizado);// TODO add your handling code here:
    }//GEN-LAST:event_eliminarMouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          try {
        // Ruta al informe JasperReport compilado
        String reportPath = "src/reportes/report1.jasper";

        // Verificar si el archivo del informe existe
        File reportFile = new File(reportPath);
        if (!reportFile.exists()) {
            System.out.println("El archivo del informe no se encuentra en la ruta: " + reportPath);
            return;
        }

        // Cargar el informe JasperReport compilado
        JasperReport proveedores = (JasperReport) JRLoader.loadObjectFromFile(reportPath);

        // Conectar a la base de datos
        conexion cc = new conexion();
        Connection cx = cc.conectar();
        
        if (cx == null) {
            System.out.println("No se pudo establecer una conexión a la base de datos.");
            return;
        }

        JasperPrint jprint = JasperFillManager.fillReport(proveedores, null, cx);

        // Mostrar el informe en un visor
        JasperViewer view = new JasperViewer(jprint, false);
        view.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        view.setVisible(true);
    } catch (JRException ex) {
        // Manejo de excepciones
        ex.printStackTrace();
        System.out.println("Error al generar el informe: " + ex.getMessage());
    }



    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new proveedores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField RNC;
    private javax.swing.JPanel actualizar;
    private javax.swing.JTextField direccionpro;
    private javax.swing.JLabel eliminar;
    private javax.swing.JPanel eliminar1;
    private javax.swing.JTextField emailpro;
    private javax.swing.JTextField encargadopro;
    private javax.swing.JPanel guardar;
    private javax.swing.JLabel guardar1;
    private javax.swing.JTextField idenpro;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextField nombrepro;
    private javax.swing.JLabel nuevo1;
    private javax.swing.JPanel nuevo3;
    private javax.swing.JPanel panelsalir;
    private javax.swing.JLabel salir;
    private javax.swing.JTable tabla1;
    private javax.swing.JTextField telefonopro;
    // End of variables declaration//GEN-END:variables
}
