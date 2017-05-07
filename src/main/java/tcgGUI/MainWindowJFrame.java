package tcgGUI;

import file.Read;
import org.json.JSONException;
import org.json.JSONObject;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import java.awt.*;
import java.awt.Dimension;
import java.io.IOException;

public class MainWindowJFrame extends javax.swing.JFrame {

   public MainWindowJFrame() {
      initComponents();
   }

   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      nodesJScrollBar = new javax.swing.JScrollBar();
      editor = new NodeEditor();
      workAreaJPanel = new JPanel();
      nodeJPanelBackground = new javax.swing.JPanel();
      nodesJTabbedPane = new javax.swing.JTabbedPane();
      allNodes = new javax.swing.JPanel();
      standartNodes = new javax.swing.JPanel();
      addedNodes = new javax.swing.JPanel();
      jLabel = new javax.swing.JLabel();
      mainJMenuBar = new javax.swing.JMenuBar();
      fileJMenu = new javax.swing.JMenu();
      jMenuItemOpen = new javax.swing.JMenuItem();
      jMenuItemSave = new javax.swing.JMenuItem();
      jMenuItemSaveAs = new javax.swing.JMenuItem();
      jMenuItemClose = new javax.swing.JMenuItem();
      actionsJMenu = new javax.swing.JMenu();
      jMenuItemRun = new javax.swing.JMenuItem();
      jMenuItemInput = new javax.swing.JMenuItem();
      jMenuItemBlackBox = new javax.swing.JMenuItem();

      workAreaJPanel.add(editor);

      //editor.init();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      setTitle("The Computation Graph");
      setAutoRequestFocus(false);
      setBackground(new java.awt.Color(255, 255, 255));
      setForeground(java.awt.Color.white);

      workAreaJPanel.setBackground(new java.awt.Color(255, 255, 255));

      openFileChooser = new JFileChooser();
      openFileChooser.setCurrentDirectory(new File("c:\\temp"));
      openFileChooser.setFileFilter(new FileNameExtensionFilter("CGF files", "cgf"));

      inputFromFile = new JFileChooser();
      inputFromFile.setCurrentDirectory(new File("c:\\temp"));
      inputFromFile.setFileFilter(new FileNameExtensionFilter("TXT files", "txt"));

      javax.swing.GroupLayout workAreaJPanelLayout = new javax.swing.GroupLayout(workAreaJPanel);
      workAreaJPanel.setLayout(workAreaJPanelLayout);
      workAreaJPanelLayout.setHorizontalGroup(
              workAreaJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                      .addGap(0, 855, Short.MAX_VALUE)
      );
      workAreaJPanelLayout.setVerticalGroup(
              workAreaJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                      .addGap(0, 544, Short.MAX_VALUE)
      );

      nodeJPanelBackground.setBackground(new java.awt.Color(204, 204, 255));

      nodesJTabbedPane.add("All", allNodes);
      allNodes.setBackground(Color.WHITE);

      nodesJTabbedPane.add("Standart", standartNodes);
      standartNodes.setBackground(Color.WHITE);

      nodesJTabbedPane.add("Added", addedNodes);
      addedNodes.setBackground(Color.WHITE);

      jLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
      jLabel.setText("Nodes");



      javax.swing.GroupLayout nodeJPanelBackgroundLayout = new javax.swing.GroupLayout(nodeJPanelBackground);
      nodeJPanelBackground.setLayout(nodeJPanelBackgroundLayout);
      nodeJPanelBackgroundLayout.setHorizontalGroup(
              nodeJPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nodeJPanelBackgroundLayout.createSequentialGroup()
                              .addContainerGap(68, Short.MAX_VALUE)
                              .addComponent(jLabel)
                              .addGap(61, 61, 61))
                      .addGroup(nodeJPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(nodeJPanelBackgroundLayout.createSequentialGroup()
                                      .addGap(5, 5, 5)
                                      .addComponent(nodesJTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                      .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
      );
      nodeJPanelBackgroundLayout.setVerticalGroup(
              nodeJPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                      .addGroup(nodeJPanelBackgroundLayout.createSequentialGroup()
                              .addComponent(jLabel)
                              .addGap(0, 0, Short.MAX_VALUE))
                      .addGroup(nodeJPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(nodeJPanelBackgroundLayout.createSequentialGroup()
                                      .addGap(21, 21, 21)
                                      .addComponent(nodesJTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                                      .addContainerGap(22, Short.MAX_VALUE)))
      );

      mainJMenuBar.setBackground(new java.awt.Color(153, 153, 153));
      mainJMenuBar.setForeground(new java.awt.Color(204, 204, 204));

      fileJMenu.setText("File");

      jMenuItemOpen.setText("Open");
      jMenuItemOpen.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jMenuItemOpenActionPerformed(evt);
         }
      });
      fileJMenu.add(jMenuItemOpen);

      jMenuItemSave.setText("Save");
      fileJMenu.add(jMenuItemSave);
      jMenuItemSave.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jMenuItemSaveActionPerformed(evt);
         }
      });

      jMenuItemSaveAs.setText("Save As");
      fileJMenu.add(jMenuItemSaveAs);
      jMenuItemSaveAs.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jMenuItemSaveAsActionPerformed(evt);
         }
      });

      jMenuItemClose.setText("Close");
      fileJMenu.add(jMenuItemClose);
      jMenuItemClose.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jMenuItemCloseActionPerformed(evt);
         }
      });

      mainJMenuBar.add(fileJMenu);

      actionsJMenu.setText("Actions");

      jMenuItemRun.setText("Run");
      actionsJMenu.add(jMenuItemRun);
      jMenuItemRun.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jMenuItemRunActionPerformed(evt);
         }
      });

      jMenuItemInput.setText("Load From Input File");
      jMenuItemInput.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
             try {
                 jMenuItemInputActionPerformed(evt);
             } catch (IOException e) {
                 e.printStackTrace();
             } catch (JSONException e) {
                 e.printStackTrace();
             }
         }
      });
      actionsJMenu.add(jMenuItemInput);

      jMenuItemBlackBox.setText("Black Box the Graph");
      actionsJMenu.add(jMenuItemBlackBox);

      mainJMenuBar.add(actionsJMenu);

      setJMenuBar(mainJMenuBar);

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
              layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                      .addGroup(layout.createSequentialGroup()
                              .addComponent(workAreaJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                              .addComponent(nodeJPanelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addGap(12, 12, 12)
                              .addComponent(nodesJScrollBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
      );
      layout.setVerticalGroup(
              layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                      .addGroup(layout.createSequentialGroup()
                              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                      .addComponent(nodeJPanelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                      .addGroup(layout.createSequentialGroup()
                                              .addContainerGap()
                                              .addComponent(nodesJScrollBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                      .addComponent(workAreaJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                              .addGap(20, 20, 20))
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

   private void jMenuItemOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
      int returnValue = openFileChooser.showOpenDialog(this);

      if(returnValue == JFileChooser.APPROVE_OPTION){
         //TO DO
      }
   }//GEN-LAST:event_jMenuItem1ActionPerformed
   private void jMenuItemSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed

   }
   private void jMenuItemSaveAsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed

   }

   private void jMenuItemCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
      dispose();
   }

   private void jMenuItemRunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed

      editor.calc();
   }

   private void jMenuItemInputActionPerformed(java.awt.event.ActionEvent evt) throws IOException, JSONException {//GEN-FIRST:event_jMenuItem6ActionPerformed
      int returnValue = inputFromFile.showOpenDialog(this);

      if(returnValue == JFileChooser.APPROVE_OPTION){
          File file = inputFromFile.getSelectedFile();
          Read text = new Read(file);
          JSONObject json = text.parseToJSON();
          editor.init(json);
      }
   }//GEN-LAST:event_jMenuItem6ActionPerformed


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
         java.util.logging.Logger.getLogger(MainWindowJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (InstantiationException ex) {
         java.util.logging.Logger.getLogger(MainWindowJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (IllegalAccessException ex) {
         java.util.logging.Logger.getLogger(MainWindowJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (javax.swing.UnsupportedLookAndFeelException ex) {
         java.util.logging.Logger.getLogger(MainWindowJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      //</editor-fold>
      //</editor-fold>

      /* Create and display the form */
      java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            new MainWindowJFrame().setVisible(true);
         }
      });
   }


   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JMenu actionsJMenu;
   private javax.swing.JPanel addedNodes;
   private javax.swing.JPanel allNodes;
   private javax.swing.JMenu fileJMenu;
   private javax.swing.JLabel jLabel;
   private javax.swing.JMenuItem jMenuItemOpen;
   private javax.swing.JMenuItem jMenuItemSave;
   private javax.swing.JMenuItem jMenuItemSaveAs;
   private javax.swing.JMenuItem jMenuItemClose;
   private javax.swing.JMenuItem jMenuItemRun;
   private javax.swing.JMenuItem jMenuItemInput;
   private javax.swing.JMenuItem jMenuItemBlackBox;
   private javax.swing.JMenuBar mainJMenuBar;
   private javax.swing.JPanel nodeJPanelBackground;
   private javax.swing.JScrollBar nodesJScrollBar;
   private javax.swing.JTabbedPane nodesJTabbedPane;
   private javax.swing.JPanel standartNodes;
   private javax.swing.JPanel workAreaJPanel;
   private JFileChooser inputFromFile;
   private JFileChooser openFileChooser;
   private NodeEditor editor;
   // End of variables declaration//GEN-END:variables
}
