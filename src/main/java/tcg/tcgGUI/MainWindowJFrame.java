package tcg.tcgGUI;

import javax.swing.*;

import net.java.balloontip.styles.BalloonTipStyle;
import tcg.core.CEdge;
import tcg.core.CGraph;
import tcg.core.*;
import tcg.file.FileUtilities;
import org.json.JSONException;
import org.json.JSONObject;
import tcg.tcgGUI.GUIcomponents.GButton;
import tcg.tcgGUI.GUIcomponents.GGraph;
import tcg.tcgGUI.GUIcomponents.GVertex;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.filechooser.FileNameExtensionFilter;

import net.java.balloontip.BalloonTip;
import net.java.balloontip.ListItemBalloonTip;
import net.java.balloontip.styles.EdgedBalloonStyle;

/**
 * This class include the GUI components of the main window of the program.
 */

public class MainWindowJFrame extends JFrame {

    /**
     * Creates new form NewJFrame
     */
    public MainWindowJFrame(int b) {
        tutorial = b;
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

        toAdd = new ArrayList<>();

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
        edgedLook = new EdgedBalloonStyle(Color.WHITE, Color.BLUE);
        save = 0;
        runTime =0;
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
        allButtons = new GButton();

if(tutorial==1) {
    tooltipBalloon = new BalloonTip(allButtons.get().get(0), "This is the Node Panel. Now select 'input'");
    tooltipBalloon.setVisible(true);

    tooltipBalloon.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent evt) {
            tooltipBalloon.setVisible(false);
        }
    });

    workAreaJPanel.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            if (e.getClickCount() == 2 && graph.getVertices().get(0).isSelected()) {
                tooltipBalloon.setVisible(false);
                tooltipBalloon = new BalloonTip(allButtons.get().get(5),"Good. Now add an output node");
                tooltipBalloon.setVisible(true);
                repaint();
            }
        }

        public void mouseReleased(MouseEvent arg0) {
            if (SwingUtilities.isRightMouseButton(arg0) && graph.getEdges().size() != 0) {
                int response = JOptionPane.showOptionDialog(null,
                        "You finished tutorial #1. What would you like to do now?",
                        "Congratulations!",
                        JOptionPane.OK_CANCEL_OPTION,
                        JOptionPane.INFORMATION_MESSAGE,
                        null,
                        new String[]{"Return to Main Menu", "Return to Tutorials Window"}, // this is the array
                        "default");
                if (response == JOptionPane.OK_OPTION) {
                    WelcomeWindowJFrame newScreen = new WelcomeWindowJFrame();
                    dispose();
                    newScreen.setVisible(true);
                } else if (response == JOptionPane.NO_OPTION) {
                    dispose();
                    TutorialJFrame newSc = new TutorialJFrame();
                    newSc.setVisible(true);
                }
            }
        }
    });
}else if (tutorial == 3){

    tooltipBalloon = new BalloonTip(mainJMenuBar,
            new JLabel("In this tutorial you are going to see the menu options.Click to 'File' to see the options"),
            edgedLook,
            BalloonTip.Orientation.LEFT_BELOW,
            BalloonTip.AttachLocation.ALIGNED,
            40, 15, false);
    tooltipBalloon.setVisible(true);

    tooltipBalloon.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent evt) {
            //TO DO
        }
    });

    fileJMenu.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            if (fileName.equals("")) {
                tooltipBalloon.setVisible(false);
                tooltipBalloon = new BalloonTip(jMenuItemClose,
                        new JLabel("Now let's see how to open a existing project. Click to 'Open'."),
                        edgedLook,
                        BalloonTip.Orientation.RIGHT_BELOW,
                        BalloonTip.AttachLocation.ALIGNED,
                        40, 15, false);
                tooltipBalloon.setVisible(true);
            }else if (save == 0) {
                tooltipBalloon.setVisible(false);
                tooltipBalloon = new BalloonTip(jMenuItemClose,
                        new JLabel("Clicking to the 'save' option will save your project to the same directory you called it."),
                        edgedLook,
                        BalloonTip.Orientation.RIGHT_BELOW,
                        BalloonTip.AttachLocation.ALIGNED,
                        40, 15, false);
                        save ++;
            }
        }
    });
} else if (tutorial == 4){
    tooltipBalloon = new BalloonTip(allButtons.get().get(2),
            new JLabel("In this tutorial you are going use how to run a simple subtraction equation. Now firstly, put 2 input nodes."),
            edgedLook,
            BalloonTip.Orientation.LEFT_BELOW,
            BalloonTip.AttachLocation.ALIGNED,
            40, 15, false);
    tooltipBalloon.setVisible(true);

    workAreaJPanel.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            if (e.getClickCount() == 2 && graph.getVertices().size()>1) {
                if(graph.getVertices().get(0).getVertex().getInput().get(0) != 0.0
                        && graph.getVertices().get(1).getVertex().getInput().get(0) != 0.0 ) {
                    if (graph.getVertices().get(0).getVertex().getInput().get(0) > 0.0
                            && graph.getVertices().get(1).getVertex().getInput().get(0) > 0.0 ) {
                        tooltipBalloon.setTextContents("Please change one of the inputs to negative.");
                    } else if (graph.getVertices().get(0).getVertex().getInput().get(0) < 0.0
                                || graph.getVertices().get(1).getVertex().getInput().get(0) < 0.0) {
                        if (graph.getEdges().size() == 0) {
                            tooltipBalloon.setVisible(false);
                            tooltipBalloon = new BalloonTip(allButtons.get().get(6),
                                    new JLabel("Good now add the subtraction node."),
                                    edgedLook,
                                    BalloonTip.Orientation.LEFT_ABOVE,
                                    BalloonTip.AttachLocation.ALIGNED,
                                    40, 15, false);
                            tooltipBalloon.setVisible(true);

                        }
                    }
                }
            }
            repaint();
        }
        public void mouseReleased(MouseEvent arg0) {
            if (SwingUtilities.isRightMouseButton(arg0) && graph.getEdges().size()==2) {
                tooltipBalloon.setVisible(false);
                tooltipBalloon = new BalloonTip(allButtons.get().get(6),
                        new JLabel("Now notice the input order (x0) next to the edges. Select one and change it with the arrow keys (up) to (x1)."),
                        edgedLook,
                        BalloonTip.Orientation.LEFT_ABOVE,
                        BalloonTip.AttachLocation.ALIGNED,
                        40, 15, false);
                tooltipBalloon.setVisible(true);
                System.out.println(graph.getEdges().get(0).getToOrder());
            } else if (graph.getEdges().size()==3 && SwingUtilities.isRightMouseButton(arg0)){
                tooltipBalloon.setVisible(false);
                tooltipBalloon = new BalloonTip(actionsJMenu,
                        new JLabel("Now, click the action menu and select Run option to see the result."),
                        edgedLook,
                        BalloonTip.Orientation.LEFT_BELOW,
                        BalloonTip.AttachLocation.ALIGNED,
                        40, 15, false);
                tooltipBalloon.setVisible(true);
            }
        }
    });

}

        for(int i = 0 ; i<allButtons.get().size();i++){
            allNodes.add(allButtons.get().get(i));
            allButtons.get().get(i).addActionListener(new ButtonListener());
        }

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

        workAreaJPanel.setPreferredSize(new Dimension (1040,630));
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

            //Action for starting a new project.
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tutorial == 0) {
                    String projectName = JOptionPane.showInputDialog("Project Name: ");


                    if (projectName == null || projectName.isEmpty()) {
                    } else {
                        dispose();
                        MainWindowJFrame main = new MainWindowJFrame(0);
                        main.setTitle("The Computation Graph - " + projectName);
                        main.setVisible(true);
                    }
                }
            }

        });
        fileJMenu.add(jMenuItemNew);


        jMenuItemSave.setText("Save");
        fileJMenu.add(jMenuItemSave);
        jMenuItemSave.addActionListener(new ActionListener(){

            //Action for saving the project
            public void actionPerformed(ActionEvent evt){
                if (tutorial == 4) {
                    tooltipBalloon.setVisible(false);
                    tooltipBalloon = new BalloonTip(mainJMenuBar,
                            new JLabel("Good. Now if you want to choose where you want to save your project Click at 'Save As'."),
                            edgedLook,
                            BalloonTip.Orientation.LEFT_BELOW,
                            BalloonTip.AttachLocation.ALIGNED,
                            40, 15, false);
                    tooltipBalloon.setVisible(true);
                }
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
            //Action for saving the project on different location.
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

            //Action for closing the program
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
                try {
                    jMenuItemInputActionPerformed(evt);
                } catch (IOException e) {
                    e.printStackTrace();
                }
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
    //Perform open action
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
            if (returnValue == JFileChooser.APPROVE_OPTION && tutorial == 3) {
                tooltipBalloon.setVisible(false);
                tooltipBalloon = new BalloonTip(
                        mainJMenuBar,
                        new JLabel("Nicely done! As you can notice the title of the program has changed to your" +
                                " file name and the components in your project have been created."),
                        edgedLook,
                        BalloonTip.Orientation.LEFT_BELOW, BalloonTip.AttachLocation.ALIGNED,
                        40, 15, false);
                tooltipBalloon.setVisible(true);

            }
            repaint();
        }
    }
    //Perform save as action
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
        if (returnValue == JFileChooser.APPROVE_OPTION && tutorial == 3){
            int response = JOptionPane.showOptionDialog(null,
                    "You finished tutorial #3. What would you like to do now?",
                    "Congratulations!",
                    JOptionPane.OK_CANCEL_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    new String[]{"Return to Main Menu", "Return to Tutorials Window"}, // this is the array
                    "default");
            if (response == JOptionPane.OK_OPTION) {
                WelcomeWindowJFrame newScreen = new WelcomeWindowJFrame();
                dispose();
                newScreen.setVisible(true);
            } else if (response == JOptionPane.NO_OPTION) {
                dispose();
                TutorialJFrame newSc = new TutorialJFrame();
                newSc.setVisible(true);
            }

        }
    }
    //Perform save action
    private void jMenuItemSaveActionPerformed() throws JSONException {
        JSONObject json = FileUtilities.parseFromGraph(graph);
        if (saved == false)
            jMenuItemSaveAsActionPerformed();
        else
            FileUtilities.writeToFile(json, path);
    }

    //Perform close action
    private void jMenuItemBlackBoxActionPerformed() {
        CGraph ng = new CGraph(CEdge.class);
        GGraph ngg = new GGraph(ng);
        ngg.addVertex(100,100, workAreaJPanel.graph.getGraph());
        workAreaJPanel.setGraph(ngg);
        repaint();
    }

    private void jMenuItemCloseActionPerformed(ActionEvent evt) {dispose();}

    //Perform run action
    private void jMenuItemRunActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        graph.calc();
        repaint();
        if(tutorial == 4 && runTime == 0){
            tooltipBalloon.setTextContents("This time using your arrow keys (up-down) change the input order of edges.");
            runTime ++;
        }else if ( runTime == 1){
            int response = JOptionPane.showOptionDialog(null,
                    "You finished tutorial #4. What would you like to do now?",
                    "Congratulations!",
                    JOptionPane.OK_CANCEL_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    new String[]{"Return to Main Menu", "Return to Tutorials Window"}, // this is the array
                    "default");
            if (response == JOptionPane.OK_OPTION) {
                WelcomeWindowJFrame newScreen = new WelcomeWindowJFrame();
                dispose();
                newScreen.setVisible(true);
            } else if (response == JOptionPane.NO_OPTION) {
                dispose();
                TutorialJFrame newSc = new TutorialJFrame();
                newSc.setVisible(true);
            }

        }
        repaint();
    }

    private void jMenuItemInputActionPerformed(ActionEvent evt) throws IOException {//GEN-FIRST:event_jMenuItemInputActionPerformed
        int returnValue = inputFromFile.showOpenDialog(this);
        ArrayList<Double> inps = new ArrayList<>();
        if(returnValue == JFileChooser.APPROVE_OPTION){
            File inpFile = inputFromFile.getSelectedFile();
            FileUtilities text = new FileUtilities();
            inps = text.loadInput(inpFile);
        }
        int i = 0;
        for (Dsf in : graph.getInNodes()){
            ArrayList<Double> temp = new ArrayList<>();
            temp.add(inps.get(i));
            in.setInput(temp);
            i++;
        }
        repaint();
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
                new MainWindowJFrame(0).setVisible(true);
            }
        });
    }

    //Properties
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
    private ArrayList<GVertex> toAdd;
    private GButton allButtons;
    private int tutorial;
    private BalloonTip tooltipBalloon;
    private BalloonTipStyle edgedLook;
    private int save,runTime;

    public void setTutorial(int s){
        this.tutorial=s;
    }

    public void setFileName(String s){
        fileName = s;
    }

    //Key interactions of the program
    class KeyUtilities implements KeyListener {

        public void keyTyped(KeyEvent e){}

        public void keyPressed(KeyEvent e)
        {
            //keyboard shortcut for save
            if(e.isControlDown() && e.isAltDown() && e.getKeyCode() == e.VK_S)
            workAreaJPanel.l.isCtrlDown = e.isControlDown();

            if (e.isControlDown() && e.getKeyCode() == e.VK_A)
            {
                System.out.println("Select All");
            }
            else if(e.isControlDown() && e.getKeyCode() == e.VK_S)
            {
                try {
                    jMenuItemSaveActionPerformed();
                } catch (JSONException e1) {
                    e1.printStackTrace();
                }
            }
            //keyboard shortcut for going up on the frame.
            else if(e.isControlDown() && e.isAltDown() && e.getKeyCode() == e.VK_S)
            {
                try {
                    jMenuItemSaveAsActionPerformed();
                } catch (JSONException e1) {
                    e1.printStackTrace();
                }
            }
            else if(e.isControlDown() && e.getKeyCode() == e.VK_C)
            {
                for (GVertex gv : graph.getVertices())
                    if (gv.isSelected()){
                        if (gv.getVertex().getType() != STATICS.CONSTANT_VERTEX)
                            toAdd.add(new GVertex(gv.getX() + 10, gv.getY() + 10,
                                    STATICS.typeToVertex(gv.getVertex().getType(), 0.0)));
                        else
                            toAdd.add(new GVertex(gv.getX() + 10, gv.getY() + 10,
                                    STATICS.typeToVertex(gv.getVertex().getType(), gv.getVertex().getOutput().get(0))));
                }
            }
            else if(e.isControlDown() && e.getKeyCode() == e.VK_X)
            {
                System.out.println("cut");
            }
            else if(e.isControlDown()&& e.getKeyCode() == e.VK_V)
            {
                for (GVertex gv : toAdd)
                    graph.addVertex(gv.getX(), gv.getY(), gv.getVertex());
                repaint();
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
            else if(e.getKeyCode() == e.VK_UP)
            {
                workAreaJPanel.setToOrder(workAreaJPanel.selectedEdge.getToOrder() + 1);

                if(tutorial == 4 && graph.getEdges().size()>1 ){
                    if (graph.getEdges().get(0).getToOrder() != 0 ||
                            graph.getEdges().get(1).getToOrder() != 0) {
                        if(!(graph.getEdges().get(0).getToOrder() == 1 &&
                                graph.getEdges().get(1).getToOrder() == 1)) {
                            if(runTime == 0) {
                                tooltipBalloon.setVisible(false);
                                tooltipBalloon = new BalloonTip(allButtons.get().get(5),
                                        new JLabel("Now add a output node and create and edge between it and subtraction node."),
                                        edgedLook,
                                        BalloonTip.Orientation.LEFT_ABOVE,
                                        BalloonTip.AttachLocation.ALIGNED,
                                        40, 15, false);
                                tooltipBalloon.setVisible(true);
                            }else{
                                tooltipBalloon.setTextContents("Run the program again to see the difference in results.");
                            }
                        }
                    }

                }
                repaint();
            }

            //keyboard shortcut for going down on the frame.
            else if(e.getKeyCode() == e.VK_DOWN)
            {
                workAreaJPanel.setToOrder(workAreaJPanel.selectedEdge.getToOrder() - 1);
                if(tutorial == 4 && graph.getEdges().size()>1 ){
                    if (graph.getEdges().get(0).getToOrder() != 0 ||
                            graph.getEdges().get(1).getToOrder() != 0) {
                        if(!(graph.getEdges().get(0).getToOrder() == 1 &&
                                graph.getEdges().get(1).getToOrder() == 1)) {
                            tooltipBalloon.setTextContents("Run the program again to see the difference in results.");
                        }
                    }

                }
                repaint();
            }

            //keyboard shortcut for deleting the selected item.
            else if( e.getKeyCode() == e.VK_DELETE)
            {
                graph.removeSelected();
                repaint();
            }
        }
        public void keyReleased(KeyEvent e)
        {
            workAreaJPanel.l.isCtrlDown = e.isControlDown();
        }
    }

    //Button utilities of the main window
   private class ButtonListener implements ActionListener
   {

      @Override
      public void actionPerformed(ActionEvent e) {
          requestFocusInWindow(true);
          if (tutorial != 1) {
              double d = 0;
              GButton button = (GButton) e.getSource();
              if (button.getType() == STATICS.CONSTANT_VERTEX) {
                  d = new Double(JOptionPane.showInputDialog("Please enter a value"));
              }
              Dsf vertex = STATICS.typeToVertex(button.getType(), d);

              graph.addVertex(((int) workAreaJPanel.getSize().getWidth() - (int) nodesJScrollPane.getSize().getWidth()) / 2,
                      (int) workAreaJPanel.getSize().getHeight() / 2, vertex);
          }
          if(tutorial == 1 && ((GButton) e.getSource()).getType() == STATICS.OUTPUT_VERTEX
                  && graph.getVertices().size()>0) {
              Dsf vertex = STATICS.typeToVertex(STATICS.OUTPUT_VERTEX, 0);
              graph.addVertex(((int) workAreaJPanel.getSize().getWidth() - (int) nodesJScrollPane.getSize().getWidth()) / 2,
                      (int) workAreaJPanel.getSize().getHeight() / 2, vertex);
              if (((GButton) e.getSource()).getType() == STATICS.OUTPUT_VERTEX && graph.getVertices().size()>1) {
                  tooltipBalloon.setVisible(false);
                  tooltipBalloon = new BalloonTip(
                          allButtons.get().get(5),
                          "Alright! Select a node by left clicking to it and right click on the second one to create an edge.");
                  tooltipBalloon.setVisible(true);
              }
          }
          if(tutorial == 1 && ((GButton) e.getSource()).getType() == STATICS.INPUT_VERTEX ) {
              Dsf vertex = STATICS.typeToVertex(STATICS.INPUT_VERTEX, 0);

              graph.addVertex(((int) workAreaJPanel.getSize().getWidth() - (int) nodesJScrollPane.getSize().getWidth()) / 2,
                      (int) workAreaJPanel.getSize().getHeight() / 2, vertex);

              if(graph.getVertices().size()==1) {
                  tooltipBalloon.setVisible(false);
                  tooltipBalloon = new BalloonTip(allButtons.get().get(2), "Good! Now change the input value by double clicking on it");
                  tooltipBalloon.setVisible(true);
              }
          }else if (tutorial == 1 && graph.getVertices().size() == 0) {
              tooltipBalloon.setVisible(false);
                  tooltipBalloon = new BalloonTip(allButtons.get().get(2),"Wrong! You need to select the input node");
                  tooltipBalloon.setVisible(true);
              }
          if(tutorial == 4 ) {
              if (graph.getVertices().size() == 2 && graph.getVertices().get(0).getVertex().getInput().get(0) == 0) {
                  tooltipBalloon.setTextContents("Okay, now change their value by double clicking on them. Enter one positive one negative value. ");
              } else if (((GButton) e.getSource()).getType() == STATICS.SUBTRACTION_VERTEX) {
                  tooltipBalloon.setTextContents("Now create edges between the input nodes and subtraction node");
              } else if (graph.getVertices().size() == 2)
                  if (graph.getVertices().get(0).getVertex().getInput().get(0) < 0.0
                      || graph.getVertices().get(1).getVertex().getInput().get(0) < 0.0) {
                  if (((GButton) e.getSource()).getType() == STATICS.SUBTRACTION_VERTEX) {
                      tooltipBalloon.setTextContents("Now create edges between the input nodes and subtraction node");
                  }
              }
          }
         repaint();
      }

   }

}
