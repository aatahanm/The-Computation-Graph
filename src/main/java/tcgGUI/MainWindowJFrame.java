package tcgGUI;

import javax.swing.*;
import core.CEdge;
import core.CGraph;
import core.*;
import file.FileUtilities;
import org.json.JSONException;
import org.json.JSONObject;
import tcgGUI.GUIcomponents.GButton;
import tcgGUI.GUIcomponents.GGraph;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class MainWindowJFrame extends javax.swing.JFrame {

   /**
    * Creates new form NewJFrame
    */
   public MainWindowJFrame() {
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
      setFocusable(true);
      graph = new GGraph(new CGraph(CEdge.class));
      workAreaJPanel = new NodeEditorTry(graph);
      nodeJPanelBackground = new javax.swing.JPanel();
      nodesJTabbedPane = new javax.swing.JTabbedPane();
      allNodes = new JPanel();
      standardNodes = new JPanel();
      addedNodes = new JPanel();
      jLabel1 = new javax.swing.JLabel();
      mainJMenuBar = new javax.swing.JMenuBar();
      fileJMenu = new javax.swing.JMenu();
      jMenuItemOpen = new javax.swing.JMenuItem();
      jMenuItemSave = new javax.swing.JMenuItem();
      jMenuItemOpenSaveAs = new javax.swing.JMenuItem();
      jMenuItemClose = new javax.swing.JMenuItem();
      actionsJMenu = new javax.swing.JMenu();
      jMenuItemRun = new javax.swing.JMenuItem();
      jMenuItemInput = new javax.swing.JMenuItem();
      jMenuItemBlackBox = new javax.swing.JMenuItem();
      nodesJScrollPane = new JScrollPane(nodeJPanelBackground,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      setTitle("The Computation Graph");


      openFileChooser = new JFileChooser();
      openFileChooser.setCurrentDirectory(new File("c:\\temp"));
      openFileChooser.setFileFilter(new FileNameExtensionFilter("CGF files", "cgf"));

      inputFromFile = new JFileChooser();
      inputFromFile.setCurrentDirectory(new File("c:\\temp"));
      inputFromFile.setFileFilter(new FileNameExtensionFilter("TXT files", "txt"));

      nodeJPanelBackground.setBackground(new java.awt.Color(204, 204, 255));

      JPanel panel = new JPanel();

      allNodes.setBackground(new java.awt.Color(204, 204, 255));
      allNodes.setLayout(new GridLayout(6,2,2,2));
      JButton a = new GButton("Addition", STATICS.ADDITION_VERTEX);
      JButton b = new GButton("Multiplication",STATICS.MULTIPLICATION_VERTEX);
      JButton c = new GButton("Input",STATICS.INPUT_VERTEX);
      JButton e = new GButton("Sigmoid",STATICS.SIGMOID_VERTEX);
      JButton f = new GButton("Output",STATICS.OUTPUT_VERTEX);
      JButton d = new GButton("Constant",STATICS.CONSTANT_VERTEX);
      JButton g = new JButton("test");

      a.addActionListener(new ButtonListener());
      b.addActionListener(new ButtonListener());
      c.addActionListener(new ButtonListener());
      d.addActionListener(new ButtonListener());
      e.addActionListener(new ButtonListener());
      f.addActionListener(new ButtonListener());

      allNodes.add(a);
      allNodes.add(b);
      allNodes.add(c);
      allNodes.add(d);
      allNodes.add(e);
      allNodes.add(f);
      allNodes.add(g);


      allNodes.setPreferredSize(new Dimension(171,500));
      panel.setBackground(new java.awt.Color(204,204,255));
      panel.setSize(new Dimension (171,500) );
      panel.add(allNodes);
      nodesJTabbedPane.addTab("All",panel);



      standardNodes.setBackground(new java.awt.Color(204, 204, 255));

      JPanel panel2 = new JPanel();

      standardNodes.setLayout(new GridLayout(6,2,2,2));
      standardNodes.setPreferredSize(new Dimension (171,500));
      panel2.setBackground(new java.awt.Color(204,204,255));
      panel2.setSize(new Dimension (171,500) );
      panel2.add(standardNodes);
      nodesJTabbedPane.addTab("Standard", panel2);

      addedNodes.setBackground(new java.awt.Color(204, 204, 255));

      JPanel panel3 = new JPanel();

      addedNodes.setLayout(new GridLayout(6,2,2,2));
      addedNodes.setPreferredSize(new Dimension (171,500));
      panel3.setBackground(new java.awt.Color(204,204,255));
      panel3.setSize(new Dimension (171,500) );
      panel3.add(addedNodes);
      nodesJTabbedPane.addTab("Added", panel3);

      jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
      jLabel1.setText(" Nodes");

      javax.swing.GroupLayout nodeJPanelBackgroundLayout = new javax.swing.GroupLayout(nodeJPanelBackground);
      nodeJPanelBackground.setLayout(nodeJPanelBackgroundLayout);
      nodeJPanelBackgroundLayout.setHorizontalGroup(
              nodeJPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                      .addComponent(nodesJTabbedPane, javax.swing.GroupLayout.Alignment.TRAILING)
                      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nodeJPanelBackgroundLayout.createSequentialGroup()
                              .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addGap(25, 25, 25))
      );
      nodeJPanelBackgroundLayout.setVerticalGroup(
              nodeJPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                      .addGroup(nodeJPanelBackgroundLayout.createSequentialGroup()
                              .addComponent(jLabel1)
                              .addGap(12, 12, 12)
                              .addComponent(nodesJTabbedPane)
                              .addContainerGap())
      );


      javax.swing.GroupLayout workAreaJPanelLayout = new javax.swing.GroupLayout(workAreaJPanel);
      workAreaJPanel.setLayout(workAreaJPanelLayout);
      workAreaJPanelLayout.setHorizontalGroup(
              workAreaJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, workAreaJPanelLayout.createSequentialGroup()
                              .addGap(0, 882, Short.MAX_VALUE)
                              .addComponent(nodesJScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
      );
      workAreaJPanelLayout.setVerticalGroup(
              workAreaJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                      .addComponent(nodesJScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );

      workAreaJPanel.setPreferredSize(new Dimension (800,500));
      fileJMenu.setText("File");

      jMenuItemOpen.setText("Open");
      jMenuItemOpen.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
             try {
                 jMenuItemOpenActionPerformed(evt);
             } catch (IOException e) {
                 e.printStackTrace();
             } catch (JSONException e) {
                 e.printStackTrace();
             }
         }
      });
      fileJMenu.add(jMenuItemOpen);

      jMenuItemSave.setText("Save");
      fileJMenu.add(jMenuItemSave);
      jMenuItemSave.addActionListener(new java.awt.event.ActionListener(){
          public void actionPerformed(java.awt.event.ActionEvent evt){
              try {
                  jMenuItemSaveActionPerformed();
              } catch (JSONException e) {
                  e.printStackTrace();
              }
          }
      });

      jMenuItemOpenSaveAs.setText("Save As");
      fileJMenu.add(jMenuItemOpenSaveAs);
       jMenuItemOpenSaveAs.addActionListener(new java.awt.event.ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e) {
               try {
                   jMenuItemSaveAsActionPerformed();
               } catch (JSONException e1) {
                   e1.printStackTrace();
               }
           }
       });

      jMenuItemClose.setText("Close");
      jMenuItemClose.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jMenuItemCloseActionPerformed(evt);
         }
      });
      fileJMenu.add(jMenuItemClose);

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
           // try {
               jMenuItemInputActionPerformed(evt);
         /*
            } catch (IOException e) {
               e.printStackTrace();
            } catch (JSONException e) {
               e.printStackTrace();

            }*/
         }
      });

      addKeyListener(new KeyUtilities());
      actionsJMenu.add(jMenuItemInput);

      jMenuItemBlackBox.setText("Black Box the Graph");
      actionsJMenu.add(jMenuItemBlackBox);

      mainJMenuBar.add(actionsJMenu);

      setJMenuBar(mainJMenuBar);

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
              layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                      .addComponent(workAreaJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );
      layout.setVerticalGroup(
              layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                      .addComponent(workAreaJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );

      pack();
   }

   private void jMenuItemOpenActionPerformed(java.awt.event.ActionEvent evt) throws IOException, JSONException {
      int returnValue = openFileChooser.showOpenDialog(this);
      if (returnValue == JFileChooser.APPROVE_OPTION) {
          File file = openFileChooser.getSelectedFile();
          graph = FileUtilities.parseToGGraph(file);
          ((NodeEditorTry)workAreaJPanel).setGraph(graph);
          setTitle("The Computation Graph - " + file.getName());
          repaint();
      }
   }

    private void jMenuItemSaveAsActionPerformed() throws JSONException {
        chooser = new JFileChooser();
        chooser.setCurrentDirectory(new java.io.File("."));
        chooser.setDialogTitle(getTitle());
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setAcceptAllFileFilterUsed(false);
        int returnValue = chooser.showOpenDialog(this);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            String dir = file.getAbsolutePath();
            System.out.println(dir);
            JSONObject json = FileUtilities.parseFromGraph(graph);
            FileUtilities.writeToFile(json, this.getTitle(), dir);
            graph.setSaved(true);
            graph.setPath(dir);
        }
    }

   private void jMenuItemSaveActionPerformed() throws JSONException {
       JSONObject json = FileUtilities.parseFromGraph(graph);
       if (!graph.getSaved())
            jMenuItemSaveAsActionPerformed();
       else
           FileUtilities.writeToFile(json, this.getTitle(), graph.getPath());
   }

   private void jMenuItemCloseActionPerformed(java.awt.event.ActionEvent evt) {dispose();}


   private void jMenuItemRunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
      graph.calc();
      repaint();
   }

   private void jMenuItemInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemInputActionPerformed
      int returnValue = inputFromFile.showOpenDialog(this);
      /*
      if(returnValue == JFileChooser.APPROVE_OPTION){
          File file = inputFromFile.getSelectedFile();
          FileUtilities text = new FileUtilities(file);
          JSONObject json = text.parseToJSON();
          editor."(json);
      }
       */
   }//GEN-LAST:event_jMenuItemInputActionPerformed


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
      //</editor-fold>
      //</editor-fold>

      /* Create and display the form */
      java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            new MainWindowJFrame().setVisible(true);
         }
      });
   }

   private javax.swing.JMenu actionsJMenu;
   private javax.swing.JPanel addedNodes;
   private javax.swing.JPanel allNodes;
   private javax.swing.JMenu fileJMenu;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JMenuItem jMenuItemBlackBox;
   private javax.swing.JMenuItem jMenuItemClose;
   private javax.swing.JMenuItem jMenuItemInput;
   private javax.swing.JMenuItem jMenuItemOpen;
   private javax.swing.JMenuItem jMenuItemOpenSaveAs;
   private javax.swing.JMenuItem jMenuItemRun;
   private javax.swing.JMenuItem jMenuItemSave;
   private javax.swing.JMenuBar mainJMenuBar;
   private javax.swing.JPanel nodeJPanelBackground;
   private javax.swing.JTabbedPane nodesJTabbedPane;
   private javax.swing.JPanel standardNodes;
   private javax.swing.JPanel workAreaJPanel;
   private JFileChooser inputFromFile;
   private JFileChooser chooser;
   private JFileChooser openFileChooser;
   private JScrollPane nodesJScrollPane;
   private GGraph graph;

    class KeyUtilities implements KeyListener {

        public void keyTyped(KeyEvent e){}

        public void keyPressed(KeyEvent e)
        {
            if (e.isControlDown() && e.getKeyCode() == e.VK_A)
            {
                System.out.println("Select All");
            }
            else if(e.isControlDown() && e.isAltDown() && e.getKeyCode() == e.VK_S)
            {
                try {
                    jMenuItemSaveActionPerformed();
                } catch (JSONException e1) {
                    e1.printStackTrace();
                }
            }
            else if(e.isControlDown() && e.getKeyCode() == e.VK_S)
            {
                System.out.println("save as");
            }
            else if(e.isControlDown() && e.getKeyCode() == e.VK_C)
            {
                System.out.println("copy");
            }
            else if(e.isControlDown() && e.getKeyCode() == e.VK_X)
            {
                System.out.println("cut");
            }
            else if(e.isControlDown()&& e.getKeyCode() == e.VK_V)
            {
                System.out.println("paste");
            }
            else if(e.isControlDown() && e.isShiftDown()&& e.getKeyCode() == e.VK_Z)
            {
                System.out.println("redo");
            }
            else if(e.isControlDown() && e.getKeyCode() == e.VK_Z)
            {
                System.out.println("undo");
            }
            else if(e.isControlDown() && e.getKeyCode() == e.VK_4)
            {
                System.out.println("zoom in");
            }
            else if(e.isControlDown() && e.getKeyCode() == e.VK_PLUS)
            {
                System.out.println("zoom in");
            }
            else if(e.isControlDown()&& e.getKeyCode() == e.VK_MINUS)
            {
                System.out.println("zoom out");
            }
            else if(e.isControlDown()&& e.getKeyCode() == e.VK_UP)
            {
                System.out.println("up");
            }
            else if(e.isControlDown()&& e.getKeyCode() == e.VK_DOWN)
            {
                System.out.println("down");
            }
            else if(e.isControlDown() && e.getKeyCode() == e.VK_LEFT)
            {
                System.out.println("left");
            }
            else if(e.isControlDown() && e.getKeyCode() == e.VK_RIGHT)
            {
                System.out.println("right");
            }
            else if(e.isControlDown()&& e.getKeyCode() == e.VK_KP_UP)
            {
                System.out.println("up");
            }
            else if(e.isControlDown()&& e.getKeyCode() == e.VK_KP_DOWN)
            {
                System.out.println("down");
            }
            else if(e.isControlDown()&& e.getKeyCode() == e.VK_KP_LEFT)
            {
                System.out.println("left");
            }
            else if(e.isControlDown()&& e.getKeyCode() == e.VK_KP_RIGHT)
            {
                System.out.println("right");
            }
            else if(e.isControlDown() && e.getKeyCode() == e.VK_DELETE)
            {
                System.out.println("delete");
            }
        }
        public void keyReleased(KeyEvent e){}
    }

   private class ButtonListener implements ActionListener
   {

      @Override
      public void actionPerformed(ActionEvent e) {
         GButton button = (GButton)e.getSource();
         Dsf vertex = null;

         if ( button.getType() == STATICS.CONSTANT_VERTEX)
            vertex = new ConstantVertex(1);
         if ( button.getType() == STATICS.INPUT_VERTEX)
            vertex = new InputVertex();
         if ( button.getType() == STATICS.ADDITION_VERTEX)
            vertex = new AdditionVertex();
         if ( button.getType() == STATICS.MULTIPLICATION_VERTEX)
            vertex = new MultiplicationVertex();
         if ( button.getType() == STATICS.OUTPUT_VERTEX)
            vertex = new OutputVertex();
         if ( button.getType() == STATICS.SIGMOID_VERTEX)
            vertex = new SigmoidVertex();

         graph.addVertex ( ((int)workAreaJPanel.getSize().getWidth()-(int)nodesJScrollPane.getSize().getWidth())/2,
                 (int)workAreaJPanel.getSize().getHeight()/2, vertex);
         repaint();
      }
   }
}
