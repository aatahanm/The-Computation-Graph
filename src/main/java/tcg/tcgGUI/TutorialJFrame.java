package tcg.tcgGUI;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TutorialJFrame extends javax.swing.JFrame {

   public TutorialJFrame() {
      initComponents();
   }

   @SuppressWarnings("unchecked")
   private void initComponents() {

      tutorialsWindowJPanel = new javax.swing.JPanel();
      tutorial4JPanel = new javax.swing.JPanel();
      jLabel1 = new javax.swing.JLabel();
      jLabel2 = new javax.swing.JLabel();
      jLabel4 = new javax.swing.JLabel();
      tutorialsHeaderJLabel = new javax.swing.JLabel();
      tutorial2JPanel = new javax.swing.JPanel();
      jLabel7 = new javax.swing.JLabel();
      jLabel8 = new javax.swing.JLabel();
      jLabel9 = new javax.swing.JLabel();
      jLabel10 = new javax.swing.JLabel();
      tutorial3JPanel = new javax.swing.JPanel();
      jLabel11 = new javax.swing.JLabel();
      jLabel12 = new javax.swing.JLabel();
      jLabel13 = new javax.swing.JLabel();
      jLabel14 = new javax.swing.JLabel();
      tutorial1JPanel = new javax.swing.JPanel();
      jLabel15 = new javax.swing.JLabel();
      jLabel16 = new javax.swing.JLabel();
      jLabel17 = new javax.swing.JLabel();
      jLabel18 = new javax.swing.JLabel();
      jLabel19 = new javax.swing.JLabel();
      backButton = new javax.swing.JButton("Back");

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      setTitle("The Computation Graph Tutorials");
      backButton.setSize(75, 75);
      backButton.addMouseListener(new java.awt.event.MouseAdapter(){
           public void mouseClicked(java.awt.event.MouseEvent evt) {
               if (evt.getSource() == backButton)
                   new WelcomeWindowJFrame().setVisible(true);
           }
       });
      add(backButton);
      tutorialsWindowJPanel.setLayout(null);

      tutorial4JPanel.setBackground(new java.awt.Color(153, 153, 153));
      tutorial4JPanel.addMouseListener(new MouseAdapter() {
         public void mouseClicked(MouseEvent evt) {
            tutorial4JPanelMouseClicked(evt);
         }
      });

      jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
      jLabel1.setText("   #4");

      jLabel2.setText("-Change input order");

      jLabel4.setText("-Run the project");

      javax.swing.GroupLayout tutorial4JPanelLayout = new javax.swing.GroupLayout(tutorial4JPanel);
      tutorial4JPanel.setLayout(tutorial4JPanelLayout);
      tutorial4JPanelLayout.setHorizontalGroup(
         tutorial4JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(tutorial4JPanelLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(tutorial4JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(tutorial4JPanelLayout.createSequentialGroup()
                  .addGap(46, 46, 46)
                  .addComponent(jLabel1))
               .addComponent(jLabel2)
               .addComponent(jLabel4))
            .addContainerGap(33, Short.MAX_VALUE))
      );
      tutorial4JPanelLayout.setVerticalGroup(
         tutorial4JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(tutorial4JPanelLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel2)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jLabel4)
            .addContainerGap(65, Short.MAX_VALUE))
      );

      tutorialsWindowJPanel.add(tutorial4JPanel);
      tutorial4JPanel.setBounds(260, 310, 160, 150);

      tutorialsHeaderJLabel.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
      tutorialsHeaderJLabel.setText("                    Choose a Tutorial");
      tutorialsWindowJPanel.add(tutorialsHeaderJLabel);
      tutorialsHeaderJLabel.setBounds(0, 30, 500, 70);

      tutorial2JPanel.setBackground(new java.awt.Color(153, 153, 153));
      tutorial2JPanel.addMouseListener(new MouseAdapter() {
         public void mouseClicked(MouseEvent evt) {
            tutorial2JPanelMouseClicked(evt);
         }
      });

      jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
      jLabel7.setText("   #2");

      jLabel8.setText("-Create your owan");

      jLabel9.setText("function");

      jLabel10.setText("-Select nodes");

      javax.swing.GroupLayout tutorial2JPanelLayout = new javax.swing.GroupLayout(tutorial2JPanel);
      tutorial2JPanel.setLayout(tutorial2JPanelLayout);
      tutorial2JPanelLayout.setHorizontalGroup(
         tutorial2JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(tutorial2JPanelLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(tutorial2JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(tutorial2JPanelLayout.createSequentialGroup()
                  .addGap(46, 46, 46)
                  .addComponent(jLabel7))
               .addComponent(jLabel8)
               .addComponent(jLabel10)
               .addComponent(jLabel9))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );
      tutorial2JPanelLayout.setVerticalGroup(
         tutorial2JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(tutorial2JPanelLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel7)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel8)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel9)
            .addGap(18, 18, 18)
            .addComponent(jLabel10)
            .addContainerGap(37, Short.MAX_VALUE))
      );

      tutorialsWindowJPanel.add(tutorial2JPanel);
      tutorial2JPanel.setBounds(260, 120, 160, 150);

      tutorial3JPanel.setBackground(new java.awt.Color(153, 153, 153));
      tutorial3JPanel.addMouseListener(new MouseAdapter() {
         public void mouseClicked(MouseEvent evt) {
            tutorial3JPanelMouseClicked(evt);
         }
      });

      jLabel11.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
      jLabel11.setText("   #3");

      jLabel12.setText("-Menu options");

      jLabel13.setText("-How to open a project");

      jLabel14.setText("-How to save your work");

      javax.swing.GroupLayout tutorial3JPanelLayout = new javax.swing.GroupLayout(tutorial3JPanel);
      tutorial3JPanel.setLayout(tutorial3JPanelLayout);
      tutorial3JPanelLayout.setHorizontalGroup(
         tutorial3JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(tutorial3JPanelLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(tutorial3JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(tutorial3JPanelLayout.createSequentialGroup()
                  .addGap(46, 46, 46)
                  .addComponent(jLabel11))
               .addComponent(jLabel12)
               .addComponent(jLabel14)
               .addComponent(jLabel13))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );
      tutorial3JPanelLayout.setVerticalGroup(
         tutorial3JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(tutorial3JPanelLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel11)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel12)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jLabel13)
            .addGap(18, 18, 18)
            .addComponent(jLabel14)
            .addContainerGap(31, Short.MAX_VALUE))
      );

      tutorialsWindowJPanel.add(tutorial3JPanel);
      tutorial3JPanel.setBounds(70, 310, 160, 150);

      tutorial1JPanel.setBackground(new java.awt.Color(153, 153, 153));
      tutorial1JPanel.addMouseListener(new MouseAdapter() {
         public void mouseClicked(MouseEvent evt) {
            tutorial1JPanelMouseClicked(evt);
         }
      });

      jLabel15.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
      jLabel15.setText("   #1");

      jLabel16.setText("-Adding inputs");

      jLabel17.setText("-Changing exiting inputs");

      jLabel18.setText("-Creating edges between");

      jLabel19.setText("nodes");

      javax.swing.GroupLayout tutorial1JPanelLayout = new javax.swing.GroupLayout(tutorial1JPanel);
      tutorial1JPanel.setLayout(tutorial1JPanelLayout);
      tutorial1JPanelLayout.setHorizontalGroup(
         tutorial1JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(tutorial1JPanelLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(tutorial1JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(tutorial1JPanelLayout.createSequentialGroup()
                  .addGap(46, 46, 46)
                  .addComponent(jLabel15))
               .addComponent(jLabel16)
               .addComponent(jLabel18)
               .addComponent(jLabel19)
               .addComponent(jLabel17))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );
      tutorial1JPanelLayout.setVerticalGroup(
         tutorial1JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(tutorial1JPanelLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel15)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel16)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jLabel17)
            .addGap(18, 18, 18)
            .addComponent(jLabel18)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel19)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );

      tutorialsWindowJPanel.add(tutorial1JPanel);
      tutorial1JPanel.setBounds(70, 120, 160, 150);

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(tutorialsWindowJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(tutorialsWindowJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
      );

      pack();
   }

   private void tutorial1JPanelMouseClicked(MouseEvent evt) {
      dispose();
      MainWindowJFrame main = new MainWindowJFrame(1);
         main.setTitle("The Computation Graph - Tutorial #1" );
      main.setVisible(true);
   }

   private void tutorial2JPanelMouseClicked(MouseEvent evt) {
      dispose();
      MainWindowJFrame main = new MainWindowJFrame(0);
      main.setTitle("The Computation Graph - Tutorial #2" );
      main.setVisible(true);
   }

   private void tutorial3JPanelMouseClicked(MouseEvent evt) {
      dispose();
      MainWindowJFrame main = new MainWindowJFrame(3);
      main.setTitle("The Computation Graph - Tutorial #3" );
      main.setVisible(true);
   }

   private void tutorial4JPanelMouseClicked(MouseEvent evt) {
      dispose();
      MainWindowJFrame main = new MainWindowJFrame(0);
      main.setTitle("The Computation Graph - Tutorial #4" );
      main.setVisible(true);
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
         java.util.logging.Logger.getLogger(TutorialJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (InstantiationException ex) {
         java.util.logging.Logger.getLogger(TutorialJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (IllegalAccessException ex) {
         java.util.logging.Logger.getLogger(TutorialJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (javax.swing.UnsupportedLookAndFeelException ex) {
         java.util.logging.Logger.getLogger(TutorialJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      //</editor-fold>
      //</editor-fold>

      /* Create and display the form */
      java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            new TutorialJFrame().setVisible(true);
         }
      });
   }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel10;
   private javax.swing.JLabel jLabel11;
   private javax.swing.JLabel jLabel12;
   private javax.swing.JLabel jLabel13;
   private javax.swing.JLabel jLabel14;
   private javax.swing.JLabel jLabel15;
   private javax.swing.JLabel jLabel16;
   private javax.swing.JLabel jLabel17;
   private javax.swing.JLabel jLabel18;
   private javax.swing.JLabel jLabel19;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel4;
   private javax.swing.JLabel jLabel7;
   private javax.swing.JLabel jLabel8;
   private javax.swing.JLabel jLabel9;
   private javax.swing.JPanel tutorial1JPanel;
   private javax.swing.JPanel tutorial2JPanel;
   private javax.swing.JPanel tutorial3JPanel;
   private javax.swing.JPanel tutorial4JPanel;
   private javax.swing.JLabel tutorialsHeaderJLabel;
   private javax.swing.JPanel tutorialsWindowJPanel;
   private javax.swing.JButton backButton;
   // End of variables declaration//GEN-END:variables
}
