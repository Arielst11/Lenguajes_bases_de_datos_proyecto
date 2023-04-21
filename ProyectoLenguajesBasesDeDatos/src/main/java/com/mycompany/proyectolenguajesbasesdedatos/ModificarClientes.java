/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyectolenguajesbasesdedatos;
import Entidades.Cliente;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
/**
 *
 * @author fidelitas
 */
public class ModificarClientes extends javax.swing.JFrame {
//Conexion cn;
PreparedStatement ps;
ResultSet rs;
ResultSetMetaData rsm;
DefaultTableModel dtm;


    /**
     * Creates new form NewJFrame
     */
    public ModificarClientes() {
        initComponents();
        setLocationRelativeTo(null);
    
       ///////////////////Tabla Pais//////////////////////////
        
      // se crea la conexion  
      Conexion cn = new Conexion();     
      cn.conectar();
    // se prepara el statement.    
    try {
        ps = cn.conn.prepareStatement("select * from Paises");
    // se ejecuta el statement  
       rs = ps.executeQuery(); 
    // se optienen los datos. 
       rsm = rs.getMetaData();
    
    ArrayList<Object[]> data = new ArrayList<>();
    while (rs.next()){
        Object[] rows=new Object[rsm.getColumnCount()];
        for (int i = 0; i <rows.length; i++){
            rows[i] = rs.getObject(i+1);
        }
        data.add(rows);
    }
    dtm = (DefaultTableModel)this.jTablePais.getModel();
    for (int i = 0; i < data.size(); i++){
        dtm.addRow(data.get(i));
    }
    
    }catch (Exception e){    
  JOptionPane.showMessageDialog(null, "error al mostrar datos");
    }
     cn.desconectar();
    
      ///////////////////Tabla Clientes//////////////////////////
         
      cn.conectar();
    try {
        ps = cn.conn.prepareStatement("select * from Cliente");
    // se ejecuta el statement  
       rs = ps.executeQuery(); 
    // se optienen los datos. 
       rsm = rs.getMetaData();
    
    ArrayList<Object[]> data = new ArrayList<>();
    while (rs.next()){
        Object[] rows=new Object[rsm.getColumnCount()];
        for (int i = 0; i <rows.length; i++){
            rows[i] = rs.getObject(i+1);
        }
        data.add(rows);
    }
    dtm = (DefaultTableModel)this.jTClientes.getModel();
    for (int i = 0; i < data.size(); i++){
        dtm.addRow(data.get(i));
    }
    
    }catch (Exception e){    
  JOptionPane.showMessageDialog(null, "error al mostrar datos");
    }
     cn.desconectar();
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLmodificarClientesTitulo = new javax.swing.JLabel();
        jTnombreCliente = new javax.swing.JTextField();
        jLnombreCliente = new javax.swing.JLabel();
        jLcorreoCliente = new javax.swing.JLabel();
        jTcorreoCliente = new javax.swing.JTextField();
        jLtelefonoCliente = new javax.swing.JLabel();
        jTpais = new javax.swing.JTextField();
        jLdireccion = new javax.swing.JLabel();
        jTtelefonoCliente1 = new javax.swing.JTextField();
        jLpais = new javax.swing.JLabel();
        jTdireccion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePais = new javax.swing.JTable();
        jLpaisLista = new javax.swing.JLabel();
        jBingresarCliente = new javax.swing.JButton();
        jBcerrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTidClienteModificar = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTClientes = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));

        jLmodificarClientesTitulo.setText("Modificar Clientes");

        jTnombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTnombreClienteActionPerformed(evt);
            }
        });

        jLnombreCliente.setText("Nombre");

        jLcorreoCliente.setText("Correo");

        jTcorreoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTcorreoClienteActionPerformed(evt);
            }
        });

        jLtelefonoCliente.setText("Teléfono");

        jTpais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTpaisActionPerformed(evt);
            }
        });

        jLdireccion.setText("Dirección");

        jTtelefonoCliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTtelefonoCliente1ActionPerformed(evt);
            }
        });

        jLpais.setText("ID país");

        jTdireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTdireccionActionPerformed(evt);
            }
        });

        jTablePais.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Código"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTablePais);

        jLpaisLista.setText("Lista de países");

        jBingresarCliente.setText("Modificar Clientes");
        jBingresarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBingresarClienteMouseClicked(evt);
            }
        });
        jBingresarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBingresarClienteActionPerformed(evt);
            }
        });

        jBcerrar.setText("Cerrar");
        jBcerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBcerrarMouseClicked(evt);
            }
        });

        jLabel1.setText("ID cliente modificar");

        jTidClienteModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTidClienteModificarActionPerformed(evt);
            }
        });

        jTClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID cliente", "Nombre", "Correo", "Teléfono", "Dirección", "ID País"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTClientes);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jBingresarCliente)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLmodificarClientesTitulo)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jBcerrar)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLnombreCliente)
                                            .addComponent(jLcorreoCliente))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTcorreoCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTnombreCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLtelefonoCliente)
                                            .addComponent(jLdireccion)
                                            .addComponent(jLpais))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTtelefonoCliente1, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                            .addComponent(jTpais)
                                            .addComponent(jTdireccion))))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(73, 73, 73)
                                        .addComponent(jLpaisLista)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTidClienteModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLmodificarClientesTitulo)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLnombreCliente)
                    .addComponent(jTnombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLpaisLista))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLcorreoCliente)
                            .addComponent(jTcorreoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLtelefonoCliente)
                            .addComponent(jTtelefonoCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLdireccion)
                            .addComponent(jTdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLpais)
                            .addComponent(jTpais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTidClienteModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jBingresarCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jBcerrar)
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 82, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 139, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTnombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTnombreClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTnombreClienteActionPerformed

    private void jTcorreoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTcorreoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTcorreoClienteActionPerformed

    private void jTpaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTpaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTpaisActionPerformed

    private void jTtelefonoCliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTtelefonoCliente1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTtelefonoCliente1ActionPerformed

    private void jTdireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTdireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTdireccionActionPerformed

    private void jBingresarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBingresarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBingresarClienteActionPerformed

    private void jBcerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBcerrarMouseClicked
this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jBcerrarMouseClicked

    private void jBingresarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBingresarClienteMouseClicked

int id = 1;
String nombre = jTnombreCliente.getText();
String correo = jTcorreoCliente.getText();
int telefono = Integer.parseInt(jTtelefonoCliente1.getText());
String direccion = jTdireccion.getText();
int idPais = Integer.parseInt(jTpais.getText());
Cliente clienteNuevo = new Cliente(id, nombre,correo, telefono, direccion , idPais  );
clienteNuevo.ingresarCliente();

//hacer ingreso de cliente en base de datos.
    }//GEN-LAST:event_jBingresarClienteMouseClicked

    private void jTidClienteModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTidClienteModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTidClienteModificarActionPerformed

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
            java.util.logging.Logger.getLogger(ModificarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBcerrar;
    private javax.swing.JButton jBingresarCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLcorreoCliente;
    private javax.swing.JLabel jLdireccion;
    private javax.swing.JLabel jLmodificarClientesTitulo;
    private javax.swing.JLabel jLnombreCliente;
    private javax.swing.JLabel jLpais;
    private javax.swing.JLabel jLpaisLista;
    private javax.swing.JLabel jLtelefonoCliente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTClientes;
    private javax.swing.JTable jTable1;
    public static javax.swing.JTable jTablePais;
    private javax.swing.JTextField jTcorreoCliente;
    private javax.swing.JTextField jTdireccion;
    private javax.swing.JTextField jTidClienteModificar;
    private javax.swing.JTextField jTnombreCliente;
    private javax.swing.JTextField jTpais;
    private javax.swing.JTextField jTtelefonoCliente1;
    // End of variables declaration//GEN-END:variables
}
