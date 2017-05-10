package tcgGUI;


import java.awt.Color;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class WelcomeWindowJFrame extends javax.swing.JFrame {
   
   private JFileChooser openFileChooser;

   /**
    * Creates new form NewJFrame1
    */
   public WelcomeWindowJFrame() {
      initComponents();
      
      openFileChooser = new JFileChooser();
      openFileChooser.setCurrentDirectory(new File("c:\\temp"));
      openFileChooser.setFileFilter(new FileNameExtensionFilter("CGF files", "cgf"));
   }

   /**
    * This method is called from within the constructor to initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is always
    * regenerated by the Form Editor.
    */
   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      welcomeWindowJPanel = new javax.swing.JPanel();
      greetingJLabel = new javax.swing.JLabel();
      jPanel3 = new javax.swing.JPanel();
      jPanel2 = new javax.swing.JPanel();
      versionJLabel = new javax.swing.JLabel();
      openJLabel = new javax.swing.JLabel();
      newJLabel = new javax.swing.JLabel();
      TutorialsJLabel = new javax.swing.JLabel();
      jLabel6 = new javax.swing.JLabel();
      welcomeBackgroundJLabel = new javax.swing.JLabel();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      setTitle("Welcome to the Computation Graph");

      welcomeWindowJPanel.setLayout(null);

      greetingJLabel.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
      greetingJLabel.setText("       The Computation Graph");
      welcomeWindowJPanel.add(greetingJLabel);
      greetingJLabel.setBounds(0, 60, 422, 37);

      jPanel3.setBackground(new Color(51, 102, 255));

      javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
      jPanel3.setLayout(jPanel3Layout);
      jPanel3Layout.setHorizontalGroup(
         jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 270, Short.MAX_VALUE)
      );
      jPanel3Layout.setVerticalGroup(
         jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 10, Short.MAX_VALUE)
      );

      welcomeWindowJPanel.add(jPanel3);
      jPanel3.setBounds(90, 230, 270, 10);

      jPanel2.setBackground(new Color(51, 102, 255));

      javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
      jPanel2.setLayout(jPanel2Layout);
      jPanel2Layout.setHorizontalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 0, Short.MAX_VALUE)
      );
      jPanel2Layout.setVerticalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 200, Short.MAX_VALUE)
      );

      welcomeWindowJPanel.add(jPanel2);
      jPanel2.setBounds(170, 190, 10, 200);

      versionJLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
      versionJLabel.setText("Version 1.0");
      welcomeWindowJPanel.add(versionJLabel);
      versionJLabel.setBounds(335, 120, 80, 19);

      openJLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
      openJLabel.setText("Open");
      openJLabel.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
            openJLabelMouseClicked(evt);
         }
         public void mouseEntered(java.awt.event.MouseEvent evt) {
            openJLabelMouseEntered(evt);
         }
         public void mouseExited(java.awt.event.MouseEvent evt) {
            openJLabelMouseExited(evt);
         }
      });
      welcomeWindowJPanel.add(openJLabel);
      openJLabel.setBounds(90, 250, 42, 22);

      newJLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
      newJLabel.setText("New");
      newJLabel.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
            newJLabelMouseClicked(evt);
         }
         public void mouseEntered(java.awt.event.MouseEvent evt) {
            newJLabelMouseEntered(evt);
         }
         public void mouseExited(java.awt.event.MouseEvent evt) {
            newJLabelMouseExited(evt);
         }
      });
      welcomeWindowJPanel.add(newJLabel);
      newJLabel.setBounds(90, 290, 34, 22);

      TutorialsJLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
      TutorialsJLabel.setText("Tutorials");
      TutorialsJLabel.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
            TutorialsJLabelMouseClicked(evt);
         }
         public void mouseEntered(java.awt.event.MouseEvent evt) {
            TutorialsJLabelMouseEntered(evt);
         }
         public void mouseExited(java.awt.event.MouseEvent evt) {
            TutorialsJLabelMouseExited(evt);
         }
      });
      welcomeWindowJPanel.add(TutorialsJLabel);
      TutorialsJLabel.setBounds(90, 330, 68, 22);

      jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
      jLabel6.setText("Recent Porjects");
      welcomeWindowJPanel.add(jLabel6);
      jLabel6.setBounds(190, 200, 121, 22);
      welcomeWindowJPanel.add(welcomeBackgroundJLabel);
      welcomeBackgroundJLabel.setBounds(0, 0, 500, 530);

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(welcomeWindowJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(welcomeWindowJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

   private void newJLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newJLabelMouseClicked
      dispose();
      MainWindowJFrame main = new MainWindowJFrame();
      main.setVisible(true);
   }//GEN-LAST:event_newJLabelMouseClicked

   private void newJLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newJLabelMouseEntered
      newJLabel.setForeground(Color.WHITE);
// TODO add your handling code here:
   }//GEN-LAST:event_newJLabelMouseEntered

   private void newJLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newJLabelMouseExited
      newJLabel.setForeground(Color.BLACK);
      // TODO add your handling code here:
   }//GEN-LAST:event_newJLabelMouseExited

   private void openJLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_openJLabelMouseEntered
      openJLabel.setForeground(Color.WHITE);
   }//GEN-LAST:event_openJLabelMouseEntered

   private void openJLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_openJLabelMouseExited
      openJLabel.setForeground(Color.BLACK);
   }//GEN-LAST:event_openJLabelMouseExited

   private void TutorialsJLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TutorialsJLabelMouseEntered
       TutorialsJLabel.setForeground(Color.WHITE);
   }//GEN-LAST:event_TutorialsJLabelMouseEntered

   private void TutorialsJLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TutorialsJLabelMouseExited
      TutorialsJLabel.setForeground(Color.BLACK);
   }//GEN-LAST:event_TutorialsJLabelMouseExited

   private void openJLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_openJLabelMouseClicked
      int returnValue = openFileChooser.showOpenDialog(this);
         
      if(returnValue == JFileChooser.APPROVE_OPTION){
         //TO DO
      }
   }//GEN-LAST:event_openJLabelMouseClicked

   private void TutorialsJLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TutorialsJLabelMouseClicked
      dispose();
      TutorialJFrame tutorial = new TutorialJFrame();
      tutorial.setVisible(true);
   }//GEN-LAST:event_TutorialsJLabelMouseClicked

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
         java.util.logging.Logger.getLogger(WelcomeWindowJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (InstantiationException ex) {
         java.util.logging.Logger.getLogger(WelcomeWindowJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (IllegalAccessException ex) {
         java.util.logging.Logger.getLogger(WelcomeWindowJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (javax.swing.UnsupportedLookAndFeelException ex) {
         java.util.logging.Logger.getLogger(WelcomeWindowJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      //</editor-fold>
      //</editor-fold>
      //</editor-fold>
      //</editor-fold>

      /* Create and display the form */
      java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            new WelcomeWindowJFrame().setVisible(true);
         }
      });
   }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JLabel TutorialsJLabel;
   private javax.swing.JLabel greetingJLabel;
   private javax.swing.JLabel jLabel6;
   private javax.swing.JPanel jPanel2;
   private javax.swing.JPanel jPanel3;
   private javax.swing.JLabel newJLabel;
   private javax.swing.JLabel openJLabel;
   private javax.swing.JLabel versionJLabel;
   private javax.swing.JLabel welcomeBackgroundJLabel;
   private javax.swing.JPanel welcomeWindowJPanel;
   // End of variables declaration//GEN-END:variables
}
