package tcg.tcgGUI;

import javax.swing.*;
import tcg.core.CEdge;
import tcg.core.CGraph;
import tcg.core.*;
import tcg.file.FileUtilities;
import org.json.JSONException;
import org.json.JSONObject;
import tcg.tcgGUI.GUIcomponents.GButton;
import tcg.tcgGUI.GUIcomponents.GGraph;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;
import javax.swing.filechooser.FileNameExtensionFilter;

public class MainWindowJFrame extends JFrame {

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
        saved = false;
        path = "";
        fileName = "";
        setFocusable(true);
        graph = new GGraph(new CGraph(CEdge.class));
        workAreaJPanel = new NodeEditor(graph);
        nodeJPanelBackground = new JPanel();
        nodesJTabbedPane = new JTabbedPane();
        allNodes = new JPanel();
        standardNodes = new JPanel();
        addedNodes = new JPanel();
        jLabel1 = new JLabel();
        mainJMenuBar = new JMenuBar();
        fileJMenu = new JMenu();
        jMenuItemOpen = new JMenuItem();
        jMenuItemSave = new JMenuItem();
        jMenuItemOpenSaveAs = new JMenuItem();
        jMenuItemClose = new JMenuItem();
        actionsJMenu = new JMenu();
        jMenuItemRun = new JMenuItem();
        jMenuItemInput = new JMenuItem();
        jMenuItemNew = new JMenuItem();
        jMenuItemBlackBox = new JMenuItem();
        nodesJScrollPane = new JScrollPane(nodeJPanelBackground,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("The Computation Graph");


        openFileChooser = new JFileChooser();
        openFileChooser.setCurrentDirectory(new File("c:\\temp"));
        openFileChooser.setFileFilter(new FileNameExtensionFilter("CGF files", "cgf"));

        inputFromFile = new JFileChooser();
        inputFromFile.setCurrentDirectory(new File("c:\\temp"));
        inputFromFile.setFileFilter(new FileNameExtensionFilter("TXT files", "txt"));

        nodeJPanelBackground.setBackground(new Color(204, 204, 255));

        JPanel panel = new JPanel();

        allNodes.setBackground(new Color(204, 204, 255));
        allNodes.setLayout(new GridLayout(8,2,2,2));
        JButton a = new GButton("Addition", STATICS.ADDITION_VERTEX);
        JButton b = new GButton("Multiplication",STATICS.MULTIPLICATION_VERTEX);
        JButton c = new GButton("Input",STATICS.INPUT_VERTEX);
        JButton e = new GButton("Sigmoid",STATICS.SIGMOID_VERTEX);
        JButton f = new GButton("Output",STATICS.OUTPUT_VERTEX);
        JButton d = new GButton("Constant",STATICS.CONSTANT_VERTEX);
        JButton g = new GButton("Subtraction", STATICS.SUBTRACTION_VERTEX);
        JButton h = new GButton("Exponential",STATICS.EXP_VERTEX);
        JButton i = new GButton("Logarithm",STATICS.LOG_VERTEX);
        JButton j = new GButton("Sin",STATICS.SIN_VERTEX);
        JButton k = new GButton("Cos",STATICS.COS_VERTEX);
        JButton l = new GButton("Tan",STATICS.TAN_VERTEX);
        JButton m = new GButton("Tanh",STATICS.TANH_VERTEX);
        JButton n = new GButton("Division",STATICS.DIVISION_VERTEX);
        JButton o = new GButton("Cot",STATICS.COT_VERTEX);




        a.addActionListener(new ButtonListener());
        b.addActionListener(new ButtonListener());
        c.addActionListener(new ButtonListener());
        d.addActionListener(new ButtonListener());
        e.addActionListener(new ButtonListener());
        f.addActionListener(new ButtonListener());
        g.addActionListener(new ButtonListener());
        h.addActionListener(new ButtonListener());
        i.addActionListener(new ButtonListener());
        j.addActionListener(new ButtonListener());
        k.addActionListener(new ButtonListener());
        l.addActionListener(new ButtonListener());
        m.addActionListener(new ButtonListener());
        n.addActionListener(new ButtonListener());
        o.addActionListener(new ButtonListener());


        allNodes.add(a);
        allNodes.add(b);
        allNodes.add(c);
        allNodes.add(d);
        allNodes.add(e);
        allNodes.add(f);
        allNodes.add(g);
        allNodes.add(h);
        allNodes.add(i);
        allNodes.add(j);
        allNodes.add(k);
        allNodes.add(l);
        allNodes.add(m);
        allNodes.add(n);
        allNodes.add(o);


        allNodes.setPreferredSize(new Dimension(171,700));
        panel.setBackground(new Color(204,204,255));
        panel.setSize(new Dimension (171,700) );
        panel.add(allNodes);
        nodesJTabbedPane.addTab("All",panel);



        standardNodes.setBackground(new Color(204, 204, 255));

        JPanel panel2 = new JPanel();

        standardNodes.setLayout(new GridLayout(6,2,2,2));
        standardNodes.setPreferredSize(new Dimension (171,500));
        panel2.setBackground(new Color(204,204,255));
        panel2.setSize(new Dimension (171,500) );
        panel2.add(standardNodes);
        nodesJTabbedPane.addTab("Standard", panel2);

        addedNodes.setBackground(new Color(204, 204, 255));

        JPanel panel3 = new JPanel();

        addedNodes.setLayout(new GridLayout(6,2,2,2));
        addedNodes.setPreferredSize(new Dimension (171,500));
        panel3.setBackground(new Color(204,204,255));
        panel3.setSize(new Dimension (171,500) );
        panel3.add(addedNodes);
        nodesJTabbedPane.addTab("Added", panel3);

        jLabel1.setFont(new Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText(" Nodes");

        GroupLayout nodeJPanelBackgroundLayout = new GroupLayout(nodeJPanelBackground);
        nodeJPanelBackground.setLayout(nodeJPanelBackgroundLayout);
        nodeJPanelBackgroundLayout.setHorizontalGroup(
                nodeJPanelBackgroundLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(nodesJTabbedPane, GroupLayout.Alignment.TRAILING)
                        .addGroup(GroupLayout.Alignment.TRAILING, nodeJPanelBackgroundLayout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25))
        );
        nodeJPanelBackgroundLayout.setVerticalGroup(
                nodeJPanelBackgroundLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(nodeJPanelBackgroundLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(12, 12, 12)
                                .addComponent(nodesJTabbedPane)
                                .addContainerGap())
        );


        GroupLayout workAreaJPanelLayout = new GroupLayout(workAreaJPanel);
        workAreaJPanel.setLayout(workAreaJPanelLayout);
        workAreaJPanelLayout.setHorizontalGroup(
                workAreaJPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, workAreaJPanelLayout.createSequentialGroup()
                                .addGap(0, 882, Short.MAX_VALUE)
                                .addComponent(nodesJScrollPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        workAreaJPanelLayout.setVerticalGroup(
                workAreaJPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(nodesJScrollPane, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        workAreaJPanel.setPreferredSize(new Dimension (800,500));
        fileJMenu.setText("File");

        jMenuItemOpen.setText("Open");
        jMenuItemOpen.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
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

        jMenuItemNew.setText("New");
        jMenuItemNew.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String projectName = JOptionPane.showInputDialog("Project Name: ");


                if (projectName == null || projectName.isEmpty()){}

                else {
                    dispose();
                    MainWindowJFrame main = new MainWindowJFrame();
                    main.setTitle("The Computation Graph - " + projectName);
                    main.setVisible(true);
                }
            }

        });
        fileJMenu.add(jMenuItemNew);


        jMenuItemSave.setText("Save");
        fileJMenu.add(jMenuItemSave);
        jMenuItemSave.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                try {
                    jMenuItemSaveActionPerformed();
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });

        jMenuItemOpenSaveAs.setText("Save As");
        fileJMenu.add(jMenuItemOpenSaveAs);
        jMenuItemOpenSaveAs.addActionListener(new ActionListener(){
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
        jMenuItemClose.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jMenuItemCloseActionPerformed(evt);
            }
        });
        fileJMenu.add(jMenuItemClose);

        mainJMenuBar.add(fileJMenu);

        actionsJMenu.setText("Actions");

        jMenuItemRun.setText("Run");
        actionsJMenu.add(jMenuItemRun);
        jMenuItemRun.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jMenuItemRunActionPerformed(evt);
            }
        });


        jMenuItemInput.setText("Load From Input File");
        jMenuItemInput.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
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

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(workAreaJPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(workAreaJPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void jMenuItemOpenActionPerformed(ActionEvent evt) throws IOException, JSONException {
        int returnValue = openFileChooser.showOpenDialog(this);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File file = openFileChooser.getSelectedFile();
            graph = FileUtilities.parseToGGraph(file);
            saved = true;
            path = file.getAbsolutePath();
            fileName = file.getName();
            ((NodeEditor)workAreaJPanel).setGraph(graph);
            setTitle("The Computation Graph - " + file.getName());
            repaint();
        }
    }

    private void jMenuItemSaveAsActionPerformed() throws JSONException {
        saved = true;
        chooser = new JFileChooser();
        chooser.setCurrentDirectory(new java.io.File("."));
        chooser.setDialogTitle(getTitle());
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setAcceptAllFileFilterUsed(false);
        int returnValue = chooser.showOpenDialog(this);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            String dir = file.getAbsolutePath();
            JSONObject json = FileUtilities.parseFromGraph(graph);
            FileUtilities.writeToFile(json, dir);
            path = dir + fileName;
        }
    }

    private void jMenuItemSaveActionPerformed() throws JSONException {
        JSONObject json = FileUtilities.parseFromGraph(graph);
        if (saved == false)
            jMenuItemSaveAsActionPerformed();
        else
            FileUtilities.writeToFile(json, path);
    }

    private void jMenuItemCloseActionPerformed(ActionEvent evt) {dispose();}


    private void jMenuItemRunActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        graph.calc();
        repaint();
    }

    private void jMenuItemInputActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jMenuItemInputActionPerformed
        int returnValue = inputFromFile.showOpenDialog(this);
      /*
      if(returnValue == JFileChooser.APPROVE_OPTION){
          File tcg.file = inputFromFile.getSelectedFile();
          FileUtilities text = new FileUtilities(tcg.file);
          JSONObject json = text.parseToJSON();
          editor."(json);
      }
       */
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
            java.util.logging.Logger.getLogger(MainWindowJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindowJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindowJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindowJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


      /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindowJFrame().setVisible(true);
            }
        });
    }

    private JMenu actionsJMenu;
    private JPanel addedNodes;
    private JPanel allNodes;
    private JMenu fileJMenu;
    private JLabel jLabel1;
    private JMenuItem jMenuItemBlackBox;
    private JMenuItem jMenuItemClose;
    private JMenuItem jMenuItemInput;
    private JMenuItem jMenuItemOpen;
    private JMenuItem jMenuItemOpenSaveAs;
    private JMenuItem jMenuItemRun;
    private JMenuItem jMenuItemSave;
    private JMenuBar mainJMenuBar;
    private JPanel nodeJPanelBackground;
    private JTabbedPane nodesJTabbedPane;
    private JPanel standardNodes;
    private NodeEditor workAreaJPanel;
    private JFileChooser inputFromFile;
    private JFileChooser chooser;
    private JFileChooser openFileChooser;
    private JScrollPane nodesJScrollPane;
    private GGraph graph;
    private boolean saved;
    private String path;
    private String fileName;
    private JMenuItem jMenuItemNew;

    public void setFileName(String s){
        fileName = s;
    }

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
                System.out.print("asdasdsad");
                workAreaJPanel.setToOrder(workAreaJPanel.selectedEdge.getToOrder() + 1);
                repaint();
            }
            else if(e.isControlDown()&& e.getKeyCode() == e.VK_DOWN)
            {
                System.out.print("asdas");
                workAreaJPanel.setToOrder(workAreaJPanel.selectedEdge.getToOrder() - 1);
                repaint();
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
            else if( e.getKeyCode() == e.VK_DELETE)
            {
                graph.removeSelected();
                repaint();
            }
        }
        public void keyReleased(KeyEvent e){}
    }

    private class ButtonListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            requestFocusInWindow(true);
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
