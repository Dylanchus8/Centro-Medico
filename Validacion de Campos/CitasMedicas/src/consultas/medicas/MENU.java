/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consultas.medicas;

/**
 *
 * @author User
 */
public class MENU extends javax.swing.JFrame {

    /**
     * Creates new form MENU
     */
    public MENU() {
        initComponents();
        
      this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu7 = new javax.swing.JMenu();
        mnIngreso = new javax.swing.JMenuItem();
        mnConsulta = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        mnIngresoAdmi = new javax.swing.JMenuItem();
        mnConsultaAdmi = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnIngresoMedico = new javax.swing.JMenuItem();
        mnConsultaMedico = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(102, 204, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/citas-medicas-no-urgentes-coronavirus.jpg"))); // NOI18N

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1021, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
        );
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jMenuBar1.setBorder(new javax.swing.border.MatteBorder(null));

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/user_icon-icons.com_57997 (1).png"))); // NOI18N
        jMenu7.setText("Paciente");
        jMenu7.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N

        mnIngreso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/17_113699 (1).png"))); // NOI18N
        mnIngreso.setText("Ingreso Datos");
        mnIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnIngresoActionPerformed(evt);
            }
        });
        jMenu7.add(mnIngreso);

        mnConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Query_icon-icons.com_53746.png"))); // NOI18N
        mnConsulta.setText("Consulta Datos");
        mnConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnConsultaActionPerformed(evt);
            }
        });
        jMenu7.add(mnConsulta);

        jMenuBar1.add(jMenu7);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/leadership_group_people_icon_148368.png"))); // NOI18N
        jMenu6.setText("Administrativo");
        jMenu6.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N

        mnIngresoAdmi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/17_113699 (1).png"))); // NOI18N
        mnIngresoAdmi.setText("Ingreso Datos");
        mnIngresoAdmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnIngresoAdmiActionPerformed(evt);
            }
        });
        jMenu6.add(mnIngresoAdmi);

        mnConsultaAdmi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Query_icon-icons.com_53746.png"))); // NOI18N
        mnConsultaAdmi.setText("Consulta Datos");
        mnConsultaAdmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnConsultaAdmiActionPerformed(evt);
            }
        });
        jMenu6.add(mnConsultaAdmi);

        jMenuBar1.add(jMenu6);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/medical-29_icon-icons.com_73943.png"))); // NOI18N
        jMenu3.setText("Medico");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N

        mnIngresoMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/17_113699 (1).png"))); // NOI18N
        mnIngresoMedico.setText("Ingreso Datos");
        mnIngresoMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnIngresoMedicoActionPerformed(evt);
            }
        });
        jMenu3.add(mnIngresoMedico);

        mnConsultaMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Query_icon-icons.com_53746.png"))); // NOI18N
        mnConsultaMedico.setText("Consulta Datos");
        mnConsultaMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnConsultaMedicoActionPerformed(evt);
            }
        });
        jMenu3.add(mnConsultaMedico);

        jMenuBar1.add(jMenu3);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/phonebook_notebook_14401.png"))); // NOI18N
        jMenu5.setText("Citas");
        jMenu5.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu5);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/forceexit_103817 (1).png"))); // NOI18N
        jMenu4.setText("Salir");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        Cita  ci = new Cita ();
        ci.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenu5MouseClicked

    private void mnIngresoMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnIngresoMedicoActionPerformed
        GestionMedico  medico = new GestionMedico ();
        medico.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnIngresoMedicoActionPerformed

    private void mnIngresoAdmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnIngresoAdmiActionPerformed
        GestionAdministrativo  admi = new GestionAdministrativo();
        admi.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnIngresoAdmiActionPerformed

    private void mnConsultaMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnConsultaMedicoActionPerformed
        ConsultaMedico consmed = new ConsultaMedico();
        consmed.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnConsultaMedicoActionPerformed

    private void mnIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnIngresoActionPerformed
        GestionPaciente  pac = new GestionPaciente ();
        pac.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnIngresoActionPerformed

    private void mnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnConsultaActionPerformed
        ConsultaPaciente conspac = new ConsultaPaciente();
        conspac.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnConsultaActionPerformed

    private void mnConsultaAdmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnConsultaAdmiActionPerformed
        ConsultaAdministrativo consadmi = new ConsultaAdministrativo();
        consadmi.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnConsultaAdmiActionPerformed

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
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MENU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mnConsulta;
    private javax.swing.JMenuItem mnConsultaAdmi;
    private javax.swing.JMenuItem mnConsultaMedico;
    private javax.swing.JMenuItem mnIngreso;
    private javax.swing.JMenuItem mnIngresoAdmi;
    private javax.swing.JMenuItem mnIngresoMedico;
    // End of variables declaration//GEN-END:variables
}
