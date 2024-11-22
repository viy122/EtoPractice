package spa_salon_frontdesk;

import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;

import javax.swing.JFrame;

public class SignUpFrame extends javax.swing.JFrame {

    

    public SignUpFrame() {
        initComponents();
       

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfUsername = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        hiddenEye = new javax.swing.JLabel();
        Eye = new javax.swing.JLabel();
        tfPassword = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sign Up");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 140, -1));

        jLabel4.setFont(new java.awt.Font("Book Antiqua", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Username:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 136, -1));

        tfUsername.setFont(new java.awt.Font("Book Antiqua", 3, 24)); // NOI18N
        tfUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfUsernameKeyTyped(evt);
            }
        });
        jPanel1.add(tfUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 310, 35));

        jLabel5.setFont(new java.awt.Font("Book Antiqua", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 136, -1));

        btnSave.setBackground(new java.awt.Color(204, 204, 204));
        btnSave.setFont(new java.awt.Font("Book Antiqua", 3, 24)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, 90, -1));

        jButton4.setBackground(new java.awt.Color(204, 204, 204));
        jButton4.setFont(new java.awt.Font("Book Antiqua", 3, 24)); // NOI18N
        jButton4.setText("Back");
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, 90, -1));

        jLabel6.setFont(new java.awt.Font("Book Antiqua", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Email:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 200, -1));

        tfEmail.setFont(new java.awt.Font("Book Antiqua", 3, 24)); // NOI18N
        jPanel1.add(tfEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 310, 35));

        hiddenEye.setFont(new java.awt.Font("Book Antiqua", 3, 24)); // NOI18N
        hiddenEye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/hidden.png"))); // NOI18N
        hiddenEye.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hiddenEyeMouseClicked(evt);
            }
        });
        jPanel1.add(hiddenEye, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, -1, 30));

        Eye.setFont(new java.awt.Font("Book Antiqua", 3, 24)); // NOI18N
        Eye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/eye.png"))); // NOI18N
        Eye.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EyeMouseClicked(evt);
            }
        });
        jPanel1.add(Eye, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, -1, 30));

        tfPassword.setFont(new java.awt.Font("Book Antiqua", 3, 24)); // NOI18N
        jPanel1.add(tfPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 310, 35));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/login.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfUsernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfUsernameKeyTyped
        char input = evt.getKeyChar();
        if (!(input < '0' || input > '9' && input != '\b')) {
            JOptionPane.showMessageDialog(this, "No number may appear in the username!", "Caution", 2);
        }
    }//GEN-LAST:event_tfUsernameKeyTyped

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

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String username, password, email, userRole = "Customer", SUrl, SUser, SPass, query;
        SUrl = "jdbc:MySQL://localhost:3306/spa_salon";
        SUser = "root";
        SPass = "";

        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
            Statement st = con.createStatement();

            // Validate the input fields
            if ("".equals(tfUsername.getText())) {
                JOptionPane.showMessageDialog(new JFrame(), "Name is required", "Error", JOptionPane.ERROR_MESSAGE);
            } else if ("".equals(tfPassword.getText())) {
                JOptionPane.showMessageDialog(new JFrame(), "Password is required", "Error", JOptionPane.ERROR_MESSAGE);
            } else if ("".equals(tfEmail.getText())) {
                JOptionPane.showMessageDialog(new JFrame(), "Email is required", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                // Get input values
                username = tfUsername.getText();
                password = tfPassword.getText();
                email = tfEmail.getText();

               
                userRole = "Customer"; 

                
                query = "INSERT INTO customers (name, email, password, userRole) "
                        + "VALUES ('" + username + "', '" + email + "', '" + password + "', '" + userRole + "')";

                
                st.execute(query);

               
                tfUsername.setText("");
                tfPassword.setText("");
                tfEmail.setText("");

               
                JOptionPane.showMessageDialog(null, "New Account has been created Successfully!");

               
                LoginFrame ls = new LoginFrame();
                ls.setVisible(true);
                this.dispose();
            }

        } catch (Exception e) {
            // Handle any exceptions
            System.out.println("Error: " + e.getMessage());
            JOptionPane.showMessageDialog(this, "An error occurred: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

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
            java.util.logging.Logger.getLogger(SignUpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        SignUpFrame suf = new SignUpFrame();
        suf.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Eye;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel hiddenEye;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JPasswordField tfPassword;
    private javax.swing.JTextField tfUsername;
    // End of variables declaration//GEN-END:variables
}
