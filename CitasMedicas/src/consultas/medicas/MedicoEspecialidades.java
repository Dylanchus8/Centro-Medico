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
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Andres
 */
public class MedicoEspecialidades extends javax.swing.JFrame {
    Conexion cc=new Conexion();
    Connection con=cc.getConnection();
        
    PreparedStatement ps;
    ResultSet rs;
    
        // Funcion que va conectarse a mi bd de mysql
    
    
     private void limpiarCajas(){
        
        cboxEsp.setSelectedIndex(0);
        cboxMedID.setSelectedIndex(0);
        
       
    }
    public MedicoEspecialidades() {
        initComponents();
        
        
        PreparedStatement ps=null;
        ResultSet rs=null;
        
        try{
            String sql = "SELECT * FROM medico";
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            
            while(rs.next())
            {
               cboxMedID.addItem(rs.getString("ID_MEDICO"));
            }
            rs.close();
        } catch(SQLException ex)
        {
         System.err.println(ex.toString());
        }
        try{
            String sql = "SELECT * FROM especialidad";
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            
            while(rs.next())
            {
               cboxEsp.addItem(rs.getString("ID_MEDESPE"));
            }
            rs.close();
        } catch(SQLException ex)
        {
         System.err.println(ex.toString());
        }
        
        
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
        btnAnaMedEsp = new javax.swing.JButton();
        cboxMedID = new javax.swing.JComboBox();
        cboxEsp = new javax.swing.JComboBox();
        btnVerMedEsp = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablamedespecialidad = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Medicos Especialidades ");

        btnAnaMedEsp.setText("Añadir");
        btnAnaMedEsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnaMedEspActionPerformed(evt);
            }
        });

        cboxMedID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxMedIDActionPerformed(evt);
            }
        });

        btnVerMedEsp.setText("Ver");
        btnVerMedEsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerMedEspActionPerformed(evt);
            }
        });

        tablamedespecialidad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablamedespecialidad);

        jLabel2.setText("Cedula");

        jLabel3.setText("Especialidad");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel2)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cboxMedID, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cboxEsp, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(btnAnaMedEsp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVerMedEsp)
                .addGap(124, 124, 124))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cboxMedID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboxEsp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAnaMedEsp)
                    .addComponent(btnVerMedEsp))
                .addGap(55, 55, 55)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnaMedEspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnaMedEspActionPerformed
        
        Conexion cc=new Conexion();
        Connection con=cc.getConnection();
        
        try{
            
            ps = con.prepareStatement("INSERT INTO medicoespecialidad(Medico_ID_MEDICO, Medico_Especialidad_ID_MEDESPE) VALUES(?,?)");
            ps.setString(1, cboxMedID.getSelectedItem().toString());
            ps.setString(2, cboxEsp.getSelectedItem().toString());
           
            
            
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
        
        
    }//GEN-LAST:event_btnAnaMedEspActionPerformed
    
    private void btnVerMedEspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerMedEspActionPerformed
        mostarDatos();
        
    }//GEN-LAST:event_btnVerMedEspActionPerformed

    private void cboxMedIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxMedIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxMedIDActionPerformed

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
            java.util.logging.Logger.getLogger(MedicoEspecialidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MedicoEspecialidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MedicoEspecialidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MedicoEspecialidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MedicoEspecialidades().setVisible(true);
            }
        });
    }
    
    private void mostarDatos() {
        String [] titulos={"Cedula","NombreMedico"};
        String [] registros=new String [2];
        
        DefaultTableModel modelo= new DefaultTableModel(null, titulos);
        
        String SQL="select* from medicoespecialidad";
        
        try {
            
           Statement st=con.createStatement();
           ResultSet rsu=st.executeQuery(SQL);
           
            while (rsu.next()) {
                
                registros [0]= rsu.getString("Medico_ID_MEDICO");
                registros [1]= rsu.getString("Medico_Especialidad_ID_MEDESPE");
                
            modelo.addRow(registros);
            }
           tablamedespecialidad.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al Mostar la especialidad de los medicos" + e.getMessage());
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnaMedEsp;
    private javax.swing.JButton btnVerMedEsp;
    private javax.swing.JComboBox cboxEsp;
    private javax.swing.JComboBox cboxMedID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablamedespecialidad;
    // End of variables declaration//GEN-END:variables

    
}
