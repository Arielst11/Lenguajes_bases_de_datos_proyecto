
package views;

import Bo.VuelosBO;
import conexion.Conexion;
import Entidades.Vuelo;

import javax.swing.JOptionPane;

/**
 *
 * @author Luis Carlos
 */
public class FrmVuelos extends javax.swing.JFrame {

    /**
     * Creates new form FrmVuelos
     */
    private VuelosBO ebo = new VuelosBO();
    
            
    String mensaje = "";
    
    public FrmVuelos() {
        initComponents();
        idMax();
        setTitle("FORMULARIO VUELOS");
        setLocationRelativeTo(null);
        setResizable(false);
        
               
    }
    
    public void listarVuelo(){
        ebo.listarVuelo(tb_vuelos);
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        label_id = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_avion = new javax.swing.JTextField();
        label_avion = new javax.swing.JLabel();
        txt_origen = new javax.swing.JTextField();
        label_origen = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        label_nombre = new javax.swing.JLabel();
        txt_destno = new javax.swing.JTextField();
        label_destino = new javax.swing.JLabel();
        Label_asiento = new javax.swing.JLabel();
        txt_asiento = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_vuelos = new javax.swing.JTable();
        btn_salir = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_destinos = new javax.swing.JButton();
        btn_Modificar1 = new javax.swing.JButton();
        btn_cargar_tabla = new javax.swing.JButton();
        btn_limpiar2 = new javax.swing.JButton();
        btn_agregar1 = new javax.swing.JButton();
        btn_agregar2 = new javax.swing.JButton();
        btn_aviones = new javax.swing.JButton();
        Label_asiento1 = new javax.swing.JLabel();
        Label_asiento2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_id.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_id.setText("ID:");
        jPanel1.add(label_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        txt_id.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });
        jPanel1.add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 250, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Vuelos");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        txt_avion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_avion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_avionActionPerformed(evt);
            }
        });
        jPanel1.add(txt_avion, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 250, -1));

        label_avion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_avion.setText("ID_Avion");
        jPanel1.add(label_avion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        txt_origen.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_origen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_origenActionPerformed(evt);
            }
        });
        jPanel1.add(txt_origen, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 250, -1));

        label_origen.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_origen.setText("Origen:");
        jPanel1.add(label_origen, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        txt_nombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });
        jPanel1.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 250, -1));

        label_nombre.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_nombre.setText("Nombre:");
        jPanel1.add(label_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        txt_destno.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_destno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_destnoActionPerformed(evt);
            }
        });
        jPanel1.add(txt_destno, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 250, -1));

        label_destino.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_destino.setText("ID_Destino");
        jPanel1.add(label_destino, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        Label_asiento.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Label_asiento.setText("20 - Regular");
        jPanel1.add(Label_asiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, -1, -1));

        txt_asiento.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_asiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_asientoActionPerformed(evt);
            }
        });
        jPanel1.add(txt_asiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 250, -1));

        tb_vuelos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tb_vuelos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_vuelosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_vuelos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, 430, -1));

        btn_salir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        jPanel1.add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 510, -1, -1));

        btn_eliminar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 510, -1, -1));

        btn_destinos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_destinos.setText("Ver destinos");
        btn_destinos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_destinosMouseClicked(evt);
            }
        });
        btn_destinos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_destinosActionPerformed(evt);
            }
        });
        jPanel1.add(btn_destinos, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 460, -1, -1));

        btn_Modificar1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_Modificar1.setText("Modificar");
        btn_Modificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Modificar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Modificar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 510, -1, -1));

        btn_cargar_tabla.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_cargar_tabla.setText("Cargar Tabla");
        btn_cargar_tabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cargar_tablaActionPerformed(evt);
            }
        });
        jPanel1.add(btn_cargar_tabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 450, -1, -1));

        btn_limpiar2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_limpiar2.setText("Limpiar");
        btn_limpiar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiar2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_limpiar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 510, -1, -1));

        btn_agregar1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_agregar1.setText("Agregar");
        btn_agregar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_agregar1MouseClicked(evt);
            }
        });
        btn_agregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_agregar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 510, -1, -1));

        btn_agregar2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_agregar2.setText("Agregar");
        btn_agregar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_agregar2MouseClicked(evt);
            }
        });
        btn_agregar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregar2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_agregar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 510, -1, -1));

        btn_aviones.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_aviones.setText("Ver aviones");
        btn_aviones.setActionCommand("");
        btn_aviones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_avionesMouseClicked(evt);
            }
        });
        btn_aviones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_avionesActionPerformed(evt);
            }
        });
        jPanel1.add(btn_aviones, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, -1, -1));

        Label_asiento1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Label_asiento1.setText("ID Tipo Asiento");
        jPanel1.add(Label_asiento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, -1));

        Label_asiento2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Label_asiento2.setText("10 - VIP");
        jPanel1.add(Label_asiento2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idActionPerformed

    private void txt_avionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_avionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_avionActionPerformed

    private void txt_origenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_origenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_origenActionPerformed

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreActionPerformed

    private void txt_destnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_destnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_destnoActionPerformed

    private void txt_asientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_asientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_asientoActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
       if (txt_nombre.getText().isEmpty() || txt_origen.getText().isEmpty() 
                || txt_destno.getText().isEmpty() || txt_asiento.getText().isEmpty() || txt_avion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Llene todos los campos de texto");
            
        } else {
            
           Vuelo vu = new Vuelo();
       
        
       
        mensaje = ebo.eliminarVuelo(Integer.parseInt(txt_id.getText()));
        JOptionPane.showMessageDialog(null, mensaje);
        
        listarVuelo();
        limpiar();
            
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_destinosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_destinosActionPerformed
verDestinos destinos = new verDestinos();
destinos.setVisible(true);
     
    }//GEN-LAST:event_btn_destinosActionPerformed

    private void btn_Modificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Modificar1ActionPerformed
        if (txt_nombre.getText().isEmpty() || txt_origen.getText().isEmpty() 
                || txt_destno.getText().isEmpty() || txt_asiento.getText().isEmpty() || txt_avion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Llene todos los campos de texto");
            
        } else {
            
           Vuelo vu = new Vuelo();
       
        vu.setId_vuelo(Integer.parseInt(txt_id.getText()));
        vu.setNombre_vuelo(txt_nombre.getText());
        vu.setOrigen(txt_origen.getText());
        vu.setId_destino(Integer.parseInt(txt_destno.getText()));
        vu.setId_avion(Integer.parseInt(txt_avion.getText()));
        vu.setId_tipo_asiento(Integer.parseInt(txt_asiento.getText()));
       
        mensaje = ebo.modificarVuelo(vu);
        JOptionPane.showMessageDialog(null, mensaje);
        
        listarVuelo();
        limpiar();
            
        }
    }//GEN-LAST:event_btn_Modificar1ActionPerformed

    private void btn_cargar_tablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cargar_tablaActionPerformed
       listarVuelo();
    }//GEN-LAST:event_btn_cargar_tablaActionPerformed
    public void idMax(){
        txt_id.setText(ebo.getMaxID()+"");
    }
    private void btn_destinosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_destinosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_destinosMouseClicked

    private void btn_limpiar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiar2ActionPerformed
       limpiar();
    }//GEN-LAST:event_btn_limpiar2ActionPerformed

    private void tb_vuelosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_vuelosMouseClicked
        int seleccion = tb_vuelos.rowAtPoint(evt.getPoint()); 
        
        txt_id.setText(tb_vuelos.getValueAt(seleccion, 0)+"");
        txt_nombre.setText(tb_vuelos.getValueAt(seleccion, 1)+"");
        txt_origen.setText(tb_vuelos.getValueAt(seleccion, 2)+"");
        txt_destno.setText(tb_vuelos.getValueAt(seleccion, 3)+"");
        txt_avion.setText(tb_vuelos.getValueAt(seleccion, 4)+"");
        txt_asiento.setText(tb_vuelos.getValueAt(seleccion, 5)+"");
        
    }//GEN-LAST:event_tb_vuelosMouseClicked

    private void btn_agregar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agregar1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_agregar1MouseClicked

    private void btn_agregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregar1ActionPerformed
     if (txt_nombre.getText().isEmpty() || txt_origen.getText().isEmpty() 
                || txt_destno.getText().isEmpty() || txt_asiento.getText().isEmpty() || txt_avion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Llene todos los campos de texto");
            
        } else {
            
         Vuelo vu = new Vuelo();
       
        vu.setNombre_vuelo(txt_nombre.getText());
        vu.setOrigen(txt_origen.getText());
        vu.setId_destino(Integer.parseInt(txt_destno.getText()));
        vu.setId_avion(Integer.parseInt(txt_avion.getText()));
        vu.setId_tipo_asiento(Integer.parseInt(txt_asiento.getText()));
       
        mensaje = ebo.agregarVuelo(vu);
        JOptionPane.showMessageDialog(null, mensaje);
        
        listarVuelo();
        limpiar();
            
        }
    }//GEN-LAST:event_btn_agregar1ActionPerformed

    private void btn_agregar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agregar2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_agregar2MouseClicked

    private void btn_agregar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_agregar2ActionPerformed

    private void btn_avionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_avionesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_avionesMouseClicked

    private void btn_avionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_avionesActionPerformed
verAviones aviones = new verAviones();
aviones.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_btn_avionesActionPerformed
    
    public void limpiar(){
        txt_id.setText("");
        txt_nombre.setText("");
        txt_origen.setText("");
        
        txt_destno.setText("");
        txt_asiento.setText("");
        txt_avion.setText("");
        idMax();
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
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmVuelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmVuelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmVuelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmVuelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmVuelos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_asiento;
    private javax.swing.JLabel Label_asiento1;
    private javax.swing.JLabel Label_asiento2;
    private javax.swing.JButton btn_Modificar1;
    private javax.swing.JButton btn_agregar1;
    private javax.swing.JButton btn_agregar2;
    private javax.swing.JButton btn_aviones;
    private javax.swing.JButton btn_cargar_tabla;
    private javax.swing.JButton btn_destinos;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_limpiar2;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_avion;
    private javax.swing.JLabel label_destino;
    private javax.swing.JLabel label_id;
    private javax.swing.JLabel label_nombre;
    private javax.swing.JLabel label_origen;
    private javax.swing.JTable tb_vuelos;
    private javax.swing.JTextField txt_asiento;
    private javax.swing.JTextField txt_avion;
    private javax.swing.JTextField txt_destno;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_origen;
    // End of variables declaration//GEN-END:variables
}
