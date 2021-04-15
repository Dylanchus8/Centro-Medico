
package consultas.medicas;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class Cita extends javax.swing.JFrame {
    Conexion cc=new Conexion();
    Connection con=cc.getConnection();
    
    PreparedStatement ps;
    ResultSet res;
 
    public Cita() {
     
      initComponents();
      this.setLocationRelativeTo(null);
      
      PreparedStatement ps=null;
      ResultSet rs=null;
        
        try{
            String sql = "SELECT * FROM administrativo";
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            
            while(rs.next())
            {
               cbadmi.addItem(rs.getString("ID_ADMI"));
            }
            rs.close();
            
        } catch(SQLException ex)
        {
         System.err.println(ex.toString());
        }
        
        try{
            String sql = "SELECT * FROM medico";
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            
            while(rs.next())
            {
               cbmedico.addItem(rs.getString("ID_MEDICO"));
            }
            rs.close();
            
        } catch(SQLException ex)
        {
         System.err.println(ex.toString());
        }
    }
    
     
    private void LimpiarCajas (){
        txtidcita.setText(null);
        cbmedico.setSelectedIndex(0);
        txtpaciente.setText(null);
        cbadmi.setSelectedIndex(0);
        cbhoracita.setSelectedIndex(0);     
        jDate.setDate(null);
        txtpago.setText(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel4 = new javax.swing.JLabel();
        jDate = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnmodificar = new javax.swing.JButton();
        txtpago = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        cbadmi = new javax.swing.JComboBox();
        btnconsultar = new javax.swing.JButton();
        cbmedico = new javax.swing.JComboBox();
        btnMenu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtpaciente = new javax.swing.JTextField();
        txtidcita = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        cbhoracita = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Registro de Cita");

        jDate.setDateFormatString("yyyy/MM/dd");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Id Administrativo:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("Pago:");

        btnmodificar.setText("Actualizar");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        cbadmi.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecciona" }));

        btnconsultar.setText("Buscar");
        btnconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconsultarActionPerformed(evt);
            }
        });

        cbmedico.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecciona" }));

        btnMenu.setText("Menu Principal");
        btnMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMenuMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Médico:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Número de Cita");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Cédula Paciente:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Fecha de la cita:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Hora:");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        cbhoracita.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecciona", "8:00", "9:00", "10:00", "11:00", "12:00", "14:00", "15:00", "16:00", "17:00" }));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(57, 57, 57))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(146, 146, 146)))
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbhoracita, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtidcita, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtpaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbadmi, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbmedico, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtpago, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1)
                            .addComponent(jLabel8)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(btnGuardar)))
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(btnMenu))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(btnmodificar)
                                .addGap(51, 51, 51)
                                .addComponent(btnEliminar))))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnconsultar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(btnconsultar))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtidcita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(15, 15, 15)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(cbhoracita, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel7)
                                .addGap(14, 14, 14))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtpaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(cbadmi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(cbmedico, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(txtpago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardar)
                            .addComponent(btnEliminar)
                            .addComponent(btnmodificar))
                        .addGap(30, 30, 30)
                        .addComponent(btnMenu)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jDate, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnmodificar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtpago, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnEliminar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(cbadmi, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnconsultar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(cbmedico, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnMenu, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtpaciente, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtidcita, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnGuardar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(cbhoracita, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuMouseClicked
        MENU m = new MENU();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMenuMouseClicked
    
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
            Conexion cc=new Conexion();
            Connection con=cc.getConnection();
        
         try {
             
             ps = con.prepareStatement("insert into cita ( ID_CITA, CITA_HORA, CITA_FECHA, Paciente_ID_PAC, Administrativo_ID_ADMI, Medico_ID_MEDICO, Pago_ID_PAGO) VALUES (?,?,?,?,?,?,?)");
             
             ps.setString(1, txtidcita.getText());
             ps.setString(2, cbhoracita.getSelectedItem().toString());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String date= sdf.format(jDate.getDate());
             ps.setString(3, date);   
             ps.setString(4, txtpaciente.getText());
             ps.setString(5, cbadmi.getSelectedItem().toString());
             ps.setString(6, cbmedico.getSelectedItem().toString());
             ps.setString(7, txtpago.getText());
             
             int res = ps.executeUpdate();
             
             if(res>0){
                 JOptionPane.showMessageDialog(null,"Cita Guardada");
                 LimpiarCajas();
             } else {
                 JOptionPane.showMessageDialog(null, "Error al Guardar la Cita");
                 LimpiarCajas();
         }
             con.close();
         }catch (Exception e) {
             System.err.println("");
         }
       
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        Conexion cc=new Conexion();
        Connection con=cc.getConnection();
        try{
            
            ps=con.prepareStatement("DELETE From cita WHERE ID_CITA=? ");
            ps.setString(1, txtidcita.getText());
          
            
           int res= ps.executeUpdate();
           
           if(res>0){
               JOptionPane.showMessageDialog(null, "La cita ha sido eliminada correctamente");
              LimpiarCajas();
           }else{
               JOptionPane.showMessageDialog(null, "Error al eliminar la cita");
             LimpiarCajas();
           }
            con.close();
        }catch(Exception e){
            System.err.println(e);
        } 
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsultarActionPerformed
       Conexion cc=new Conexion();
       Connection con=cc.getConnection();
        try{
            
            ps = con.prepareStatement("SELECT * FROM cita WHERE ID_CITA=?");
            ps.setString (1, txtidcita.getText());
            
            res = ps.executeQuery();
            
            if (res.next ()){
                
                
                
                jDate.setDate(res.getDate("CITA_FECHA"));
                cbhoracita.setSelectedItem(res.getTime("CITA_HORA"));
                txtpaciente.setText(res.getString("Paciente_ID_PAC"));
                cbadmi.setSelectedItem(res.getString("Administrativo_ID_ADMI"));  
                cbmedico.setSelectedItem(res.getString("Medico_ID_MEDICO")); 
                txtpago.setText(res.getString("Pago_ID_PAGO")); 
                    
                
            }else{
                JOptionPane.showMessageDialog(null, "No existe la cita");
            }
        }catch(Exception e){
            System.err.println(e);
        } 
    }//GEN-LAST:event_btnconsultarActionPerformed

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        Conexion cc=new Conexion();
        Connection con=cc.getConnection();
        try {
             ps = con.prepareStatement("UPDATE cita SET ID_CITA=?, CITA_HORA=?, CITA_FECHA=?, Paciente_ID_PAC=?, Administrativo_ID_ADMI=?, Medico_ID_MEDICO=?, Pago_ID_PAGO=? WHERE ID_CITA=?");
             
             ps.setString(1, txtidcita.getText());
             ps.setString(2, cbhoracita.getSelectedItem().toString());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String date= sdf.format(jDate.getDate());
             ps.setString(3, date);   
             ps.setString(4, txtpaciente.getText());
             ps.setString(5, cbadmi.getSelectedItem().toString());
             ps.setString(6, cbmedico.getSelectedItem().toString());
             ps.setString(7, txtpago.getText());
             ps.setString(8, txtidcita.getText());
             
             int res = ps.executeUpdate();
             
             if(res>0){
                 JOptionPane.showMessageDialog(null,"Cita Modificado");
                 LimpiarCajas();
             } else {
                 JOptionPane.showMessageDialog(null, "Error al Modificar la Cita");
                 LimpiarCajas();
         }
             con.close();
         }catch (Exception e) {
             System.err.println("");
         }
    }//GEN-LAST:event_btnmodificarActionPerformed
/**/
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
            java.util.logging.Logger.getLogger(Cita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cita().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnconsultar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JComboBox cbadmi;
    private javax.swing.JComboBox cbhoracita;
    private javax.swing.JComboBox cbmedico;
    private com.toedter.calendar.JDateChooser jDate;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtidcita;
    private javax.swing.JTextField txtpaciente;
    private javax.swing.JTextField txtpago;
    // End of variables declaration//GEN-END:variables
}
