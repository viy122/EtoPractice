package spa_salon_frontdesk;

import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import javax.swing.ButtonGroup;

public class LoginFrame extends javax.swing.JFrame {

    ButtonGroup group = new ButtonGroup();

    public LoginFrame() {
        initComponents();
        group.add(rbtnCustomer);
        group.add(rbtnAdmin);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblSignUp = new javax.swing.JLabel();
        tfUsername = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        hiddenEye = new javax.swing.JLabel();
        Eye = new javax.swing.JLabel();
        tfPassword = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rbtnCustomer = new javax.swing.JRadioButton();
        rbtnAdmin = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(800, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 550));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Luxe Luminaria");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 390, -1));

        jLabel4.setFont(new java.awt.Font("Book Antiqua", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Username:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 136, -1));

        btnLogin.setBackground(new java.awt.Color(204, 204, 204));
        btnLogin.setFont(new java.awt.Font("Book Antiqua", 3, 24)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 470, 129, -1));

        jButton4.setBackground(new java.awt.Color(204, 204, 204));
        jButton4.setFont(new java.awt.Font("Book Antiqua", 3, 24)); // NOI18N
        jButton4.setText("Cancel");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 470, 139, -1));

        jLabel2.setFont(new java.awt.Font("Book Antiqua", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Dont have an account?");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, -1, -1));

        lblSignUp.setFont(new java.awt.Font("Book Antiqua", 3, 18)); // NOI18N
        lblSignUp.setForeground(new java.awt.Color(255, 255, 255));
        lblSignUp.setText("Sign up");
        lblSignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSignUpMouseClicked(evt);
            }
        });
        jPanel1.add(lblSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 390, -1, -1));

        tfUsername.setFont(new java.awt.Font("Book Antiqua", 3, 24)); // NOI18N
        jPanel1.add(tfUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 310, 35));

        tfEmail.setFont(new java.awt.Font("Book Antiqua", 3, 24)); // NOI18N
        jPanel1.add(tfEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 310, 35));

        hiddenEye.setFont(new java.awt.Font("Book Antiqua", 3, 24)); // NOI18N
        hiddenEye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/hidden.png"))); // NOI18N
        hiddenEye.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hiddenEyeMouseClicked(evt);
            }
        });
        jPanel1.add(hiddenEye, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, -1, 100));

        Eye.setFont(new java.awt.Font("Book Antiqua", 3, 24)); // NOI18N
        Eye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/eye.png"))); // NOI18N
        Eye.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EyeMouseClicked(evt);
            }
        });
        jPanel1.add(Eye, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, -1, 80));

        tfPassword.setFont(new java.awt.Font("Book Antiqua", 3, 24)); // NOI18N
        jPanel1.add(tfPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 310, 35));

        jLabel5.setFont(new java.awt.Font("Book Antiqua", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 136, -1));

        jLabel6.setFont(new java.awt.Font("Book Antiqua", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Email:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 136, -1));

        rbtnCustomer.setFont(new java.awt.Font("Book Antiqua", 3, 18)); // NOI18N
        rbtnCustomer.setForeground(new java.awt.Color(255, 255, 255));
        rbtnCustomer.setText("Customer");
        rbtnCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnCustomerActionPerformed(evt);
            }
        });
        jPanel1.add(rbtnCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, -1, -1));

        rbtnAdmin.setFont(new java.awt.Font("Book Antiqua", 3, 18)); // NOI18N
        rbtnAdmin.setForeground(new java.awt.Color(255, 255, 255));
        rbtnAdmin.setText("Admin");
        rbtnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnAdminActionPerformed(evt);
            }
        });
        jPanel1.add(rbtnAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 430, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/login.jpg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblSignUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSignUpMouseClicked
        SignUpFrame suf = new SignUpFrame();
        suf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblSignUpMouseClicked

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String username = tfUsername.getText();
        String password = tfPassword.getText();
        String email = tfEmail.getText();
        String userRole = "";  // This will be set based on the radio button selection

// Validate user input for role selection
        if (rbtnCustomer.isSelected()) {
            userRole = "Customer";
        } else if (rbtnAdmin.isSelected()) {
            userRole = "Admin";
        }

// Validate all required fields are filled
        if (username.isEmpty()) {
            JOptionPane.showMessageDialog(new JFrame(), "Username is required", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (password.isEmpty()) {
            JOptionPane.showMessageDialog(new JFrame(), "Password is required", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (email.isEmpty()) {
            JOptionPane.showMessageDialog(new JFrame(), "Email is required", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (userRole.isEmpty()) {  // Ensure role is selected
            JOptionPane.showMessageDialog(this, "Please select either Customer or Admin", "Selection Error", JOptionPane.ERROR_MESSAGE);
        } else {
            String SUrl = "jdbc:mysql://localhost:3306/spa_salon";
            String SUser = "root";
            String SPass = "";

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
                Statement st = con.createStatement();

                // SQL query based on selected role
                String sql;
                PreparedStatement pst = null;

                if ("Customer".equals(userRole)) {
                    sql = "SELECT * FROM customers WHERE name = ? AND password = ? AND email = ?";
                    pst = con.prepareStatement(sql);
                    pst.setString(1, username);
                    pst.setString(2, password);
                    pst.setString(3, email);
                } else if ("Admin".equals(userRole)) {
                    sql = "SELECT * FROM admin WHERE name = ? AND password = ? AND email = ?";
                    pst = con.prepareStatement(sql);
                    pst.setString(1, username);
                    pst.setString(2, password);
                    pst.setString(3, email);
                }

                ResultSet rs = pst.executeQuery();

                if (rs.next()) {
                    // If user exists, get their role from the database
                    String dbUserRole = rs.getString("userRole");

                    // Verify if the role matches the selected role
                    if (dbUserRole.equals(userRole)) {
                        JOptionPane.showMessageDialog(null, "Logged in Successfully!");

                        // Navigate to HomeFrame based on user role
                        if ("Customer".equals(dbUserRole)) {
                            HomeFrame hf = new HomeFrame();
                            hf.setVisible(true);
                        } else if ("Admin".equals(dbUserRole)) {
                            AdminDesk ad = new AdminDesk();
                            ad.setVisible(true);
                        }

                        this.dispose();  // Close the current frame (login frame)
                    } else {
                        JOptionPane.showMessageDialog(new JFrame(), "Role mismatch. Please check your selection.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(new JFrame(), "Incorrect credentials or account does not exist.", "Error", JOptionPane.ERROR_MESSAGE);
                }

                rs.close();
                pst.close();
                con.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(new JFrame(), "Error connecting to database: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_btnLoginActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void rbtnCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnCustomerActionPerformed
        if (rbtnCustomer.isSelected()) {
            rbtnCustomer.setSelected(true);
        } else {
            rbtnCustomer.setSelected(false);
        }
    }//GEN-LAST:event_rbtnCustomerActionPerformed

    private void rbtnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnAdminActionPerformed
        if (rbtnAdmin.isSelected()) {
            rbtnAdmin.setSelected(true);
        } else {
            rbtnAdmin.setSelected(false);
        }
    }//GEN-LAST:event_rbtnAdminActionPerformed

    private void EyeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EyeMouseClicked
        tfPassword.setEchoChar('*');
        hiddenEye.setVisible(true);
        Eye.setVisible(false);
    }//GEN-LAST:event_EyeMouseClicked

    private void hiddenEyeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hiddenEyeMouseClicked
        tfPassword.setEchoChar((char) 0);
        hiddenEye.setVisible(false);
        Eye.setVisible(true);
    }//GEN-LAST:event_hiddenEyeMouseClicked

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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        LoginFrame lf = new LoginFrame();
        lf.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Eye;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel hiddenEye;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblSignUp;
    private javax.swing.JRadioButton rbtnAdmin;
    private javax.swing.JRadioButton rbtnCustomer;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JPasswordField tfPassword;
    private javax.swing.JTextField tfUsername;
    // End of variables declaration//GEN-END:variables
}
