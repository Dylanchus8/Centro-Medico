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
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EspecialidadesMedicas extends javax.swing.JFrame {

    Conexion cc=new Conexion();
    Connection con=cc.getConnection();
    PreparedStatement ps;
    ResultSet rs;
    
        
   
    
    private void limpiarCajas(){
        txtEspMed.setText(null);
    }
    public EspecialidadesMedicas() {
        initComponents();
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtEspMed = new javax.swing.JTextField();
        btnGuaEsp = new javax.swing.JButton();
        txtVerEsp = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaespe = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Especialidades ");

        jLabel2.setText("Especialidad");

        txtEspMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEspMedActionPerformed(evt);
            }
        });

        btnGuaEsp.setText("Añadir");
        btnGuaEsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuaEspActionPerformed(evt);
            }
        });

        txtVerEsp.setText("Ver");
        txtVerEsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVerEspActionPerformed(evt);
            }
        });

        tablaespe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaespe);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnGuaEsp)
                .addGap(72, 72, 72)
                .addComponent(txtVerEsp)
                .addGap(162, 162, 162))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel2)
                        .addGap(34, 34, 34)
                        .addComponent(txtEspMed, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtEspMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVerEsp)
                    .addComponent(btnGuaEsp))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(170, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void mostrarDatos() {
        String [] titulos={"Especialidaad"};
        String [] registros=new String [1];
        
        DefaultTableModel modelo= new DefaultTableModel(null, titulos);
        
        String SQL="select* from especialidad";
        
        try {
            
           Statement st=con.createStatement();
           ResultSet rsu=st.executeQuery(SQL);
           
            while (rsu.next()) {
                
                registros [0]= rsu.getString("ID_MEDESPE");
                
                
            modelo.addRow(registros);
            }
           tablaespe.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al Mostar la especialidad " + e.getMessage());
        }
    }
    private void txtEspMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEspMedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEspMedActionPerformed

    private void btnGuaEspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuaEspActionPerformed
        
        Conexion cc=new Conexion();
        Connection con=cc.getConnection();
        
        try{
            
            ps = con.prepareStatement("INSERT INTO especialidad(ID_MEDESPE) VALUES(?)");
            ps.setString(1, txtEspMed.getText());
            
           
            
            
            int res = ps.executeUpdate();
            
            if(res > 0){
            JOptionPane.showMessageDialog(null, "   Especialidad Guardado");
            limpiarCajas();
            } else{
                JOptionPane.showMessageDialog(null,"Error al guardar la especialidad");
           limpiarCajas();
            }
            con.close();
            
        } catch(Exception e){
            System.err.println(e);
            
        }
        
        
    }//GEN-LAST:event_btnGuaEspActionPerformed

    private void txtVerEspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVerEspActionPerformed
       mostrarDatos();
    }//GEN-LAST:event_txtVerEspActionPerformed

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
            java.util.logging.Logger.getLogger(EspecialidadesMedicas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EspecialidadesMedicas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EspecialidadesMedicas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EspecialidadesMedicas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EspecialidadesMedicas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuaEsp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaespe;
    private javax.swing.JTextField txtEspMed;
    private javax.swing.JButton txtVerEsp;
    // End of variables declaration//GEN-END:variables

   
}
