package tcg.tcgGUI;


import org.json.JSONException;

import java.awt.Color;
import java.io.File;
import java.io.IOException;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import java.awt.event.MouseAdapter;

/**
 * This class include the GUI components of welcome window.
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


   @SuppressWarnings("unchecked")

   private void initComponents() {

      welcomeWindowJPanel = new JPanel();
      greetingJLabel = new JLabel();
      jPanel3 = new JPanel();
      jPanel2 = new JPanel();
      versionJLabel = new JLabel();
      openJLabel = new JLabel();
      newJLabel = new JLabel();
      TutorialsJLabel = new JLabel();
      jLabel6 = new JLabel();
      welcomeBackgroundJLabel = new JLabel();

      setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
      setTitle("Welcome to the Computation Graph");

      welcomeWindowJPanel.setLayout(null);
      greetingJLabel.setFont(new Font("Tahoma", 1, 30)); // NOI18N
      greetingJLabel.setText("       The Computation Graph");
      welcomeWindowJPanel.add(greetingJLabel);
      greetingJLabel.setBounds(0, 60, 422, 37);

      jPanel3.setBackground(new Color(51, 102, 255));

      javax.swing.GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
      jPanel3.setLayout(jPanel3Layout);
      jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 270, Short.MAX_VALUE));
      jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 10, Short.MAX_VALUE));

      welcomeWindowJPanel.add(jPanel3);
      jPanel3.setBounds(90, 230, 270, 10);

      jPanel2.setBackground(new Color(51, 102, 255));

      javax.swing.GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
      jPanel2.setLayout(jPanel2Layout);
      jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 0, Short.MAX_VALUE));
      jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 200, Short.MAX_VALUE));

      welcomeWindowJPanel.add(jPanel2);
      jPanel2.setBounds(170, 190, 10, 200);

      versionJLabel.setFont(new Font("Tahoma", 0, 15)); // NOI18N
      versionJLabel.setText("Version 1.0");
      welcomeWindowJPanel.add(versionJLabel);
      versionJLabel.setBounds(335, 120, 80, 19);

      openJLabel.setFont(new Font("Tahoma", 0, 18)); // NOI18N
      openJLabel.setText("Open");
      openJLabel.addMouseListener(new MouseAdapter() {

         //Mouse interactions of welcome window.

         public void mouseClicked(MouseEvent evt) {
            try {
               openJLabelMouseClicked(evt);
            } catch (IOException e) {
               e.printStackTrace();
            } catch (JSONException e) {
               e.printStackTrace();
            }
         }
         public void mouseEntered(MouseEvent evt) {
            openJLabelMouseEntered(evt);
         }
         public void mouseExited(MouseEvent evt) {
            openJLabelMouseExited(evt);
         }
      });
      welcomeWindowJPanel.add(openJLabel);
      openJLabel.setBounds(90, 250, 42, 22);

      newJLabel.setFont(new Font("Tahoma", 0, 18)); // NOI18N
      newJLabel.setText("New");
      newJLabel.addMouseListener(new MouseAdapter() {
         public void mouseClicked(MouseEvent evt) {
            newJLabelMouseClicked(evt);
         }
         public void mouseEntered(MouseEvent evt) {
            newJLabelMouseEntered(evt);
         }
         public void mouseExited(MouseEvent evt) {
            newJLabelMouseExited(evt);
         }
      });
      welcomeWindowJPanel.add(newJLabel);
      newJLabel.setBounds(90, 290, 34, 22);

      TutorialsJLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
      TutorialsJLabel.setText("Tutorials");
      TutorialsJLabel.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(MouseEvent evt) {
            TutorialsJLabelMouseClicked(evt);
         }
         public void mouseEntered(MouseEvent evt) {
            TutorialsJLabelMouseEntered(evt);
         }
         public void mouseExited(MouseEvent evt) {
            TutorialsJLabelMouseExited(evt);
         }
      });
      welcomeWindowJPanel.add(TutorialsJLabel);
      TutorialsJLabel.setBounds(90, 330, 68, 22);

      jLabel6.setFont(new Font("Tahoma", 0, 18)); // NOI18N
      jLabel6.setText("Recent Projects");
      welcomeWindowJPanel.add(jLabel6);
      jLabel6.setBounds(190, 200, 121, 22);
      welcomeWindowJPanel.add(welcomeBackgroundJLabel);
      welcomeBackgroundJLabel.setBounds(0, 0, 500, 530);

      javax.swing.GroupLayout layout = new GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(welcomeWindowJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE));
      layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(welcomeWindowJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE));

      pack();
   }

   private void newJLabelMouseClicked(MouseEvent evt) {
      dispose();
      String projectName = JOptionPane.showInputDialog("Project Name: ");
      MainWindowJFrame main = new MainWindowJFrame(0);
      if (projectName == null || projectName.isEmpty())
          new WelcomeWindowJFrame().setVisible(true);
      else {
          main.setTitle("The Computation Graph - " + projectName);
          main.setVisible(true);
      }
   }

   private void newJLabelMouseEntered(MouseEvent evt) {
      newJLabel.setForeground(Color.WHITE);

   }

   private void newJLabelMouseExited(MouseEvent evt) {
      newJLabel.setForeground(Color.BLACK);

   }

   private void openJLabelMouseEntered(MouseEvent evt) {
      openJLabel.setForeground(Color.WHITE);
   }

   private void openJLabelMouseExited(MouseEvent evt) {
      openJLabel.setForeground(Color.BLACK);
   }

   private void TutorialsJLabelMouseEntered(MouseEvent evt) {
       TutorialsJLabel.setForeground(Color.WHITE);
   }

   private void TutorialsJLabelMouseExited(MouseEvent evt) {
      TutorialsJLabel.setForeground(Color.BLACK);
   }

   private void openJLabelMouseClicked(MouseEvent evt) throws IOException, JSONException {
      int returnValue = openFileChooser.showOpenDialog(this);
         
      if(returnValue == JFileChooser.APPROVE_OPTION){

      }
   }

   private void TutorialsJLabelMouseClicked(MouseEvent evt) {
      dispose();
      TutorialJFrame tutorial = new TutorialJFrame();
      tutorial.setVisible(true);
   }

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
