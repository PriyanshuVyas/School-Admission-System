/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
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
        tf1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        pf1 = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Enter Username");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(790, 310, 190, 28);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Enter Password");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(790, 390, 190, 28);
        getContentPane().add(tf1);
        tf1.setBounds(1070, 310, 220, 30);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(830, 500, 130, 31);
        getContentPane().add(pf1);
        pf1.setBounds(1070, 390, 220, 30);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("Create New Account");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(1060, 500, 200, 31);

        jLabel5.setIcon(new javax.swing.ImageIcon("G:\\project image\\logo.jpg")); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(90, 20, 190, 150);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel4.setText("CHAMELI DEVI PUBLIC SCHOOL");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(390, 10, 820, 60);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Tejpur Gadbadi, Kesar Bagh Road, Indore 452012 (M.P.)");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(560, 70, 460, 14);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Phone : 0731-4212999,  Fax : 0731-4059204");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(600, 110, 340, 22);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("email : info@cpsindore.com");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(650, 90, 220, 22);

        jLabel9.setIcon(new javax.swing.ImageIcon("G:\\project image\\cps1.jpg")); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(40, 270, 640, 300);

        jPanel1.setBackground(new java.awt.Color(255, 255, 102));
        jPanel1.setMinimumSize(new java.awt.Dimension(1366, 768));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1420, 880);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String user=tf1.getText();
String pass=new String(pf1.getPassword());
String username="",password="";
if(user.equals("") || pass.equals(""))
JOptionPane.showMessageDialog(null,"The text fields cannot be blank");
else
{
 try
 {
   Class.forName("java.sql.DriverManager");
   Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","admin");
   Statement s=c.createStatement();
   String q="Select username,password from users where username='"+user+"'and password='"+pass+"';";
   ResultSet rs=s.executeQuery(q);
   if(rs.next())
    {
      username=rs.getString("username");
      password=rs.getString("password");
    }
   else
   {
     JOptionPane.showMessageDialog(null,"User doesn't exist");
   }
   if(user.equals(username) && pass.equals(password))
   {
     JOptionPane.showMessageDialog(null,"Successfully logged in");
     new module().setVisible(true) ; 
        dispose();
   }
   else
      JOptionPane.showMessageDialog(null,"You cannot login");
  }
 catch(Exception e)
 {
   JOptionPane.showMessageDialog(null,e.getMessage());
 }

tf1.setText("");
pf1.setText("");

}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
new signup().setVisible(true) ; 
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField pf1;
    private javax.swing.JTextField tf1;
    // End of variables declaration//GEN-END:variables
}
