/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author Iwan Ma'ruf
 */
import java.awt.event.ActionListener;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class KKSignIn extends javax.swing.JPanel {

    /**
     * Creates new form SignIn
     */
    public KKSignIn() {
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
        jLabel3 = new javax.swing.JLabel();
        txFieldUsernameKK = new javax.swing.JTextField();
        txFieldPasswordKK = new javax.swing.JPasswordField();
        btnSignIn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PERAK");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("USERNAME :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PASSWORD :");

        txFieldPasswordKK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txFieldPasswordKKActionPerformed(evt);
            }
        });

        btnSignIn.setBackground(new java.awt.Color(255, 204, 204));
        btnSignIn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnSignIn.setForeground(new java.awt.Color(255, 153, 153));
        btnSignIn.setText("SIGN IN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(294, 294, 294))
            .addGroup(layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txFieldUsernameKK, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                        .addComponent(txFieldPasswordKK)))
                .addContainerGap(180, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jLabel1)
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txFieldUsernameKK, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(txFieldPasswordKK, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43)
                .addComponent(btnSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txFieldPasswordKKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txFieldPasswordKKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txFieldPasswordKKActionPerformed

    public void setUsernameAdmin(String username) {
        txFieldUsernameKK.setText(username);
    }
    
    public void setPasswordAdmin(String password) {
        txFieldPasswordKK.setText(password);
    }
    
    public String getUsernameAdmin() {
        return txFieldUsernameKK.getText();
    }
    
    public String getPassword() {
        String s = new String(txFieldPasswordKK.getPassword());
        return s;
    }
    
    public Object getBtnSignIn() {
        return btnSignIn;
    }

    public void addListener(ActionListener ae) {
        btnSignIn.addActionListener(ae);
        txFieldUsernameKK.addActionListener(ae);
        txFieldPasswordKK.addActionListener(ae);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSignIn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField txFieldPasswordKK;
    private javax.swing.JTextField txFieldUsernameKK;
    // End of variables declaration//GEN-END:variables
}
