
package timecalculator;

import javax.swing.JOptionPane;

public class pt1 extends javax.swing.JFrame {

   
    public pt1() {
        initComponents();
    }

                        

    private void text2ActionPerformed(java.awt.event.ActionEvent evt) {                                      
       
    }                                     

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                              
      
    }                                             

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
        if (text1.getText().isEmpty() && text2.getText().isEmpty() && text3.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Fields can't be Empty");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Submission Successfull");
        }
    }                                        

   
    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pt1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       

     
        java.awt.EventQueue.invokeLater(() -> {
            new pt1().setVisible(true);
        });
    }

                       
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JTextField text1;
    private javax.swing.JTextField text2;
    private javax.swing.JTextField text3;

    private void initComponents() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
                      
}