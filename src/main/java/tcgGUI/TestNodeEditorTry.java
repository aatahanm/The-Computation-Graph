package tcgGUI;

import core.CEdge;
import core.CGraph;
import core.ConstantVertex;

import javax.swing.*;

/**
 * {TestNodeEditorTry}
 * Author: Yaman Yağız Taşbağ
 * Version: {7.05.2017}
 */
public class TestNodeEditorTry {
    public static void main( String[] a)
    {
        CGraph g = new CGraph(CEdge.class);
        ConstantVertex c1 = new ConstantVertex(2);
        ConstantVertex c2 = new ConstantVertex(3);
        g.addVertex(c1);
        g.addVertex(c2);
        g.addEdge(c1,c2,new CEdge(0,0));
        NodeEditorTry n = new NodeEditorTry(g);
        JFrame frame = new JFrame("test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);
        frame.add(n);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
