/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consultas.medicas;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Andres
 */
public class GestionMedico extends javax.swing.JFrame {
    
    PreparedStatement ps;
    ResultSet rs;
    
    
    private void limpiarCajas(){
        txtCedMed.setText(null);
        txtNomMed.setText(null);
        txtApeMed.setText(null);
        txtCelMed.setText(null);
        txtCorMed.setText(null);
        txtDirMed.setText(null);
        
        cboxGenMed.setSelectedIndex(0);
        jDate.setDate(null);
       
    }
    
    public GestionMedico() {
        initComponents();
        Conexion cc=new Conexion();
        Connection con=cc.getConnection();
        PreparedStatement ps=null;
        ResultSet rs=null;
        
        try{
            String sql = "SELECT * FROM medico";
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            
            while(rs.next())
            {
                cboxEspecia.addItem(rs.getString("MED_NOMBRE"));
            }
            rs.close();
        } catch(SQLException ex)
        {
         System.err.println(ex.toString());
        }
        
   
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCedMed = new javax.swing.JTextField();
        txtNomMed = new javax.swing.JTextField();
        txtApeMed = new javax.swing.JTextField();
        txtCelMed = new javax.swing.JTextField();
        txtCorMed = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnGuarMed = new javax.swing.JButton();
        btnModMed = new javax.swing.JButton();
        btmEliMed = new javax.swing.JButton();
        btnBusMed = new javax.swing.JButton();
        cboxEspecia = new javax.swing.JComboBox();
        jDate = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        txtDirMed = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cboxGenMed = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Cédula:");

        jLabel3.setText("Nombres:");

        jLabel4.setText("Apellidos:");

        jLabel5.setText("Celular:");

        jLabel6.setText("Correo:");

        txtCedMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedMedActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Gestión Medico");

        btnGuarMed.setText("Guardar");
        btnGuarMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuarMedActionPerformed(evt);
            }
        });

        btnModMed.setText("Modificar");
        btnModMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModMedActionPerformed(evt);
            }
        });

        btmEliMed.setText("Eliminar");
        btmEliMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmEliMedActionPerformed(evt);
            }
        });

        btnBusMed.setText("Buscar");
        btnBusMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusMedActionPerformed(evt);
            }
        });

        cboxEspecia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxEspeciaActionPerformed(evt);
            }
        });

        jDate.setDateFormatString("yyyy/MM/dd");

        jLabel8.setText("Direccion:");

        txtDirMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDirMedActionPerformed(evt);
            }
        });

        jLabel10.setText("Genero:");

        cboxGenMed.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecciona", "Maculino", "Femenino", "Otro" }));

        jLabel11.setText("Fecha Nacimiento:");

        jLabel12.setText("Especialidad:");

        jButton1.setText("Menu Principal");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cboxGenMed, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(120, 120, 120)
                                .addComponent(jLabel9))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCelMed)
                                    .addComponent(txtApeMed)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(txtCedMed, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30))
                                    .addComponent(txtNomMed, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtCorMed)
                                    .addComponent(txtDirMed))
                                .addGap(14, 14, 14)
                                .addComponent(btnBusMed)))
                        .addContainerGap(122, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboxEspecia, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(70, 70, 70))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnGuarMed)
                        .addGap(49, 49, 49)
                        .addComponent(btnModMed)
                        .addGap(40, 40, 40)
                        .addComponent(btmEliMed)
                        .addGap(148, 148, 148))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCedMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBusMed)
                    .addComponent(jLabel2))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApeMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCelMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCorMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDirMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(cboxGenMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboxEspecia, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btmEliMed)
                    .addComponent(btnModMed)
                    .addComponent(btnGuarMed))
                .addGap(45, 45, 45)
                .addComponent(jButton1)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCedMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedMedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedMedActionPerformed

    private void btnGuarMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuarMedActionPerformed
        Conexion cc=new Conexion();
        Connection con=cc.getConnection();
        
        try{
            
            ps = con.prepareStatement("INSERT INTO medico(ID_MEDICO, MED_NOMBRE, MED_APELLIDO, MED_CELULAR, MED_CORREO, MED_DIRECCION, MED_SEXO, MED_FECHA_NACIMIENTO) VALUES(?,?,?,?,?,?,?,?) ");
            ps.setString(1 ,txtCedMed.getText());
            ps.setString(2 ,txtNomMed.getText());
            ps.setString(3 ,txtApeMed.getText());
            ps.setString(4 ,txtCelMed.getText());
            ps.setString(5 ,txtCorMed.getText());
            ps.setString(6 ,txtDirMed.getText());
            ps.setString(7, cboxGenMed.getSelectedItem().toString());
            
            
            
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date= sdf.format(jDate.getDate());
            ps.setString(8, date);
            
            
            int res = ps.executeUpdate();
            
            if(res > 0){
            JOptionPane.showMessageDialog(null, "Medico Guardado");
            limpiarCajas();
            } else{
                JOptionPane.showMessageDialog(null,"Error al guardar med");
           limpiarCajas();
            }
            con.close();
            
        } catch(Exception e){
            System.err.println(e);
            
        }
        
    }//GEN-LAST:event_btnGuarMedActionPerformed

    private void btnBusMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusMedActionPerformed
        
        Conexion cc=new Conexion();
        Connection con=cc.getConnection();
        
        try{
            
          
            ps = con.prepareStatement("SELECT * FROM medico WHERE ID_MEDICO =?");
            ps.setString(1, txtCedMed.getText());
            
            rs = ps.executeQuery();
            
            if(rs.next()){
             
               
                txtNomMed.setText(rs.getString("MED_NOMBRE"));
                txtApeMed.setText(rs.getString("MED_APELLIDO"));
                txtCelMed.setText(rs.getString("MED_CELULAR"));
                txtCorMed.setText(rs.getString("MED_CORREO"));
                txtDirMed.setText(rs.getString("MED_DIRECCION"));
                jDate.setDate(rs.getDate("MED_FECHA_NACIMIENTO"));
                cboxGenMed.setSelectedItem(rs.getString("MED_SEXO"));
            } else{
                JOptionPane.showMessageDialog(null,"No existe ese medico");
            }
            
        } catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_btnBusMedActionPerformed

    private void btnModMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModMedActionPerformed
         Conexion cc=new Conexion();
         Connection con=cc.getConnection();
        
        try{
            
           
            ps = con.prepareStatement("UPDATE medico SET ID_MEDICO=?, MED_NOMBRE=?, MED_APELLIDO=?, MED_CELULAR=?, MED_CORREO=?, MED_DIRECCION=?, MED_SEXO=?, MED_FECHA_NACIMIENTO=? WHERE ID_MEDICO=?  ");
            //ps.setString(8 ,txtCedMed.getText());
            ps.setString(1 ,txtCedMed.getText());
            ps.setString(2 ,txtNomMed.getText());
            ps.setString(3 ,txtApeMed.getText());
            ps.setString(4 ,txtCelMed.getText());
            ps.setString(5 ,txtCorMed.getText());
            ps.setString(6 ,txtDirMed.getText());
            ps.setString(7, cboxGenMed.getSelectedItem().toString());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date= sdf.format(jDate.getDate());
            ps.setString(8, date);
            ps.setString(9 ,txtCedMed.getText());
            int res = ps.executeUpdate();
            
            if(res > 0){
            JOptionPane.showMessageDialog(null, "Medico Modificado");
            limpiarCajas();
            } else{
                JOptionPane.showMessageDialog(null,"Error al modificar med");
           limpiarCajas();
            }
            con.close();
            
        } catch(Exception e){
            System.err.println(e);
            
        }
        
        
   
        
        
    }//GEN-LAST:event_btnModMedActionPerformed

    private void btmEliMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmEliMedActionPerformed
        
          Conexion cc=new Conexion();
          Connection con=cc.getConnection();
        
        try{
            
            
            ps = con.prepareStatement("DELETE FROM medico WHERE ID_MEDICO=?  ");
            
            ps.setString(1 ,txtCedMed.getText());
            
            int res = ps.executeUpdate();
            
            if(res > 0){
            JOptionPane.showMessageDialog(null, "Medico borrado");
            limpiarCajas();
            } else{
                JOptionPane.showMessageDialog(null,"Error al borrar med");
           limpiarCajas();
            }
            con.close();
            
        } catch(Exception e){
            System.err.println(e);
            
        }
        
    }//GEN-LAST:event_btmEliMedActionPerformed

    private void cboxEspeciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxEspeciaActionPerformed
    
        
    }//GEN-LAST:event_cboxEspeciaActionPerformed

    private void txtDirMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDirMedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDirMedActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MENU m = new MENU();
        m.setVisible(true);
        this.dispose();
        this.setLocationRelativeTo(null);
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GestionMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionMedico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btmEliMed;
    private javax.swing.JButton btnBusMed;
    private javax.swing.JButton btnGuarMed;
    private javax.swing.JButton btnModMed;
    private javax.swing.JComboBox cboxEspecia;
    private javax.swing.JComboBox cboxGenMed;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDate;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtApeMed;
    private javax.swing.JTextField txtCedMed;
    private javax.swing.JTextField txtCelMed;
    private javax.swing.JTextField txtCorMed;
    private javax.swing.JTextField txtDirMed;
    private javax.swing.JTextField txtNomMed;
    // End of variables declaration//GEN-END:variables
}
