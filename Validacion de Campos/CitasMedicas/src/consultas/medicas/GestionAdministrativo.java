
package consultas.medicas;

import conexion.Conexion;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GestionAdministrativo extends javax.swing.JFrame {
    
    
    
    PreparedStatement ps;
    ResultSet res;
 
    public GestionAdministrativo() {
     
      initComponents();
      this.setLocationRelativeTo(null);
      btnGuardar.setEnabled(false);
        
    }
    
    
    public void validar(){
        
        if(txtcedula.getText().isEmpty()){
            jLabel10.setText("*Campo Requerido");
        }else {
            jLabel10.setText(" ");
        }
        
        if(txtnombre.getText().isEmpty()){
            jLabel11.setText("*Campo Requerido");
        }else {
            jLabel11.setText(" ");
        }
        
        if(txtapellido.getText().isEmpty()){
            jLabel12.setText("*Campo Requerido");
        }else {
            jLabel12.setText(" ");
        }
        
        if(txtcelular.getText().isEmpty()){
            jLabel13.setText("*Campo Requerido");
        }else {
            jLabel13.setText(" ");
        }
        
        if(txtcorreo.getText().isEmpty()){
            jLabel14.setText("*Campo Requerido");
        } else if (!txtcorreo.getText().contains("@") || !txtcorreo.getText().contains(".")){
            jLabel14.setText("*Correo invalido");
        }else {
            jLabel14.setText(" ");
        }
        
        if(txtdirec.getText().isEmpty()){
            jLabel15.setText("*Campo Requerido");
        }else {
            jLabel15.setText(" ");
        }
        
        if(cbsexo.getSelectedItem().toString().isEmpty()){
            jLabel16.setText("*Campo Requerido");
        }else {
            jLabel16.setText(" ");
        }
             
    }
    public void validacaracter (java.awt.event.KeyEvent evento) {
        
        if(evento.getKeyChar() >=33 && evento.getKeyChar() <=64 
                || evento.getKeyChar() >=91 && evento.getKeyChar() <=96)
                {
            
            evento.consume();
        JOptionPane.showMessageDialog(this, "No se permite caracteres especiales");
        }
    }
    public void validanumero (java.awt.event.KeyEvent evento) {
        
        if(evento.getKeyChar() >=65 && evento.getKeyChar() <=90 
                || evento.getKeyChar() >=97 && evento.getKeyChar() <=122){
            
            evento.consume();
        JOptionPane.showMessageDialog(this, "No se permite letras");
        }
    }
    public void habilitarboton (){
        if(txtcedula.getText().isEmpty() || txtnombre.getText().isEmpty() || txtapellido.getText().isEmpty() || txtcelular.getText().isEmpty() ||
                txtcorreo.getText().isEmpty() || txtdirec.getText().isEmpty() || txtnombre.getText().isEmpty() || jLabel14.getText().equals("*Correo invalido")){
                btnGuardar.setEnabled(false);
        }else {
              btnGuardar.setEnabled(true);
        }
    }
    private void LimpiarCajas (){
        txtcedula.setText(null);
        txtnombre.setText(null);
        txtapellido.setText(null);
        txtcelular.setText(null);
        txtcorreo.setText(null);
        txtdirec.setText(null);
        cbsexo.setSelectedIndex(0);     
        jDate.setDate(null);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        cbsexo = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jDate = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtdirec = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        btnmodificar = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnconsultar = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtapellido = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtcedula = new javax.swing.JTextField();
        txtcelular = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtcorreo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(204, 204, 204));

        cbsexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecciona", "Masculino", "Femenino", "Otro" }));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("Fecha de Nacimiento: ");

        jDate.setDateFormatString("yyyy/MM/dd");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 102, 102));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 102, 102));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 102, 102));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 102, 102));

        txtdirec.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtdirecKeyReleased(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 102, 102));

        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnombreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 102, 102));

        btnmodificar.setText("Actualizar");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 102, 102));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnconsultar.setText("Buscar");
        btnconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconsultarActionPerformed(evt);
            }
        });

        btnMenu.setText("Menu Principal");
        btnMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMenuMouseClicked(evt);
            }
        });
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Apellidos:");

        txtapellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtapellidoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtapellidoKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Correo:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Nombres:");

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Cédula:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Dirección:");

        txtcedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcedulaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcedulaKeyTyped(evt);
            }
        });

        txtcelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcelularKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcelularKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Celular:");

        txtcorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcorreoKeyReleased(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("Genero:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Gestion Administrativo");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 102, 102));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8))
                        .addGap(67, 67, 67)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtcelular, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(43, 43, 43)
                                        .addComponent(btnconsultar))
                                    .addComponent(txtdirec, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(cbsexo, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 54, Short.MAX_VALUE))))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(btnGuardar)
                        .addGap(78, 78, 78)
                        .addComponent(btnmodificar)
                        .addGap(56, 56, 56)
                        .addComponent(btnEliminar)
                        .addGap(83, 83, 83)
                        .addComponent(btnMenu))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnconsultar))
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtcelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtdirec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(cbsexo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnmodificar)
                    .addComponent(btnEliminar)
                    .addComponent(btnMenu))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jDesktopPane1.setLayer(cbsexo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jDate, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtdirec, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtnombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel15, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnmodificar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel16, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnEliminar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnconsultar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnMenu, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtapellido, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtcedula, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtcelular, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtcorreo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnGuardar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel17, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        Conexion cc=new Conexion();
        Connection con=cc.getConnection();

        try {

            ps = con.prepareStatement("INSERT INTO administrativo( Id_ADMI, ADMI_NOMBRE, ADMI_APELLIDO, ADMI_CELULAR, ADMI_CORREO, ADMI_DIRECCION, ADMI_SEXO, ADMI_FECHA_NACIMIENTO) VALUES (?,?,?,?,?,?,?,?)");

            ps.setString(1, txtcedula.getText());
            ps.setString(2, txtnombre.getText());
            ps.setString(3, txtapellido.getText());
            ps.setString(4, txtcelular.getText());
            ps.setString(5, txtcorreo.getText());
            ps.setString(6, txtdirec.getText());
            ps.setString(7, cbsexo.getSelectedItem().toString());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date= sdf.format(jDate.getDate());
            ps.setString(8, date);

            int res = ps.executeUpdate();

            if(res>0){
                JOptionPane.showMessageDialog(null,"Administrativo Guardado");
                LimpiarCajas();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Guardar el Administrativo" );

            }
            con.close();
        }catch (Exception e) {
           System.err.println(e);
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtcorreoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcorreoKeyReleased
        validar();
        habilitarboton();
    }//GEN-LAST:event_txtcorreoKeyReleased

    private void txtcelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcelularKeyTyped
        validanumero(evt);
        if(txtcelular.getText().length() >=10){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtcelularKeyTyped

    private void txtcelularKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcelularKeyReleased
        validar();
        habilitarboton();
    }//GEN-LAST:event_txtcelularKeyReleased

    private void txtcedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcedulaKeyTyped
        validanumero(evt);
        if(txtcedula.getText().length() >=10){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtcedulaKeyTyped

    private void txtcedulaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcedulaKeyReleased
        validar();
        habilitarboton();
    }//GEN-LAST:event_txtcedulaKeyReleased

    private void txtapellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidoKeyTyped
        validacaracter(evt);
    }//GEN-LAST:event_txtapellidoKeyTyped

    private void txtapellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidoKeyReleased
        validar();
        habilitarboton();
    }//GEN-LAST:event_txtapellidoKeyReleased

    private void btnMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuMouseClicked
        MENU m = new MENU();
        m.setVisible(true);
        this.dispose();
        this.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnMenuMouseClicked

    private void btnconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsultarActionPerformed
        Conexion cc=new Conexion();
        Connection con=cc.getConnection();
        try{

            ps = con.prepareStatement("SELECT * FROM administrativo WHERE Id_ADMI = ?");
            ps.setString (1, txtcedula.getText());

            res = ps.executeQuery();

            if (res.next ()){

                txtnombre.setText(res.getString("ADMI_NOMBRE"));
                txtapellido.setText(res.getString("ADMI_APELLIDO"));
                txtcelular.setText(res.getString("ADMI_CELULAR"));
                txtcorreo.setText(res.getString("ADMI_CORREO"));
                txtdirec.setText(res.getString("ADMI_DIRECCION"));
                cbsexo.setSelectedItem(res.getString("ADMI_SEXO"));
                jDate.setDate(res.getDate("ADMI_FECHA_NACIMIENTO"));

            }else{
                JOptionPane.showMessageDialog(null, "No existe el Administrativo");
            }
        }catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_btnconsultarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        Conexion cc=new Conexion();
        Connection con=cc.getConnection();
        try{

            ps=con.prepareStatement("DELETE FROM administrativo WHERE Id_ADMI=? ");
            ps.setString(1, txtcedula.getText());

            int res= ps.executeUpdate();

            if(res>0){
                JOptionPane.showMessageDialog(null, "El administrativo ha sido eliminado correctamente");
                LimpiarCajas();
            }else{
                JOptionPane.showMessageDialog(null, "Error al eliminar el administrativo");
                LimpiarCajas();
            }
            con.close();
        }catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        Conexion cc=new Conexion();
        Connection con=cc.getConnection();
        try {
            ps = con.prepareStatement("UPDATE administrativo SET Id_ADMI=?, ADMI_NOMBRE=?, ADMI_APELLIDO=?, ADMI_CELULAR=?, ADMI_CORREO=?, ADMI_DIRECCION=?, ADMI_SEXO=?, ADMI_FECHA_NACIMIENTO=?  WHERE Id_ADMI=?");

            ps.setString(1, txtcedula.getText());
            ps.setString(2, txtnombre.getText());
            ps.setString(3, txtapellido.getText());
            ps.setString(4, txtcelular.getText());
            ps.setString(5, txtcorreo.getText());
            ps.setString(6, txtdirec.getText());
            ps.setString(7, cbsexo.getSelectedItem().toString());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date= sdf.format(jDate.getDate());
            ps.setString(8, date);
            ps.setString(9, txtcedula.getText());

            int res = ps.executeUpdate();

            if(res>0){
                JOptionPane.showMessageDialog(null,"Administrativo Modificado");
                LimpiarCajas();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Modificar el Administrativo");
                LimpiarCajas();
            }
            con.close();
        }catch (Exception e) {
            System.err.println("");
        }

    }//GEN-LAST:event_btnmodificarActionPerformed

    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped
        validacaracter(evt);
    }//GEN-LAST:event_txtnombreKeyTyped

    private void txtnombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyReleased
        validar();
        habilitarboton();
    }//GEN-LAST:event_txtnombreKeyReleased

    private void txtdirecKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdirecKeyReleased
        validar();
        habilitarboton();
    }//GEN-LAST:event_txtdirecKeyReleased

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMenuActionPerformed

        
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
            java.util.logging.Logger.getLogger(GestionAdministrativo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionAdministrativo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionAdministrativo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionAdministrativo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionAdministrativo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnconsultar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JComboBox cbsexo;
    private com.toedter.calendar.JDateChooser jDate;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtcelular;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtdirec;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables

    
    
}
