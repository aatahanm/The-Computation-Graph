package tcgGUI;

import com.mxgraph.layout.mxCircleLayout;
import com.mxgraph.swing.mxGraphComponent;
import core.CEdge;
import core.CGraph;
import core.CVertex;
import core.ConstantVertex;
import org.jgrapht.ListenableGraph;
import org.jgrapht.ext.JGraphModelAdapter;
import org.jgrapht.ext.JGraphXAdapter;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.DefaultListenableGraph;
import org.jgrapht.graph.ListenableDirectedGraph;

import javax.swing.*;
import java.awt.*;

/**
 * {NodeEditor}
 * Author: Yaman Yağız Taşbağ
 * Version: {6.05.2017}
 */
public class NodeEditor extends JPanel
{
    private JGraphXAdapter<CVertex, CEdge> jgxAdapter;
    public NodeEditor()
    {
        System.out.println(">>>>>>>eben");
    }
    public void init()
    {
        ListenableGraph<CVertex, CEdge> g = new DefaultListenableGraph(new CGraph(CEdge.class));
        jgxAdapter = new JGraphXAdapter(g);
        add(new mxGraphComponent(jgxAdapter));
        setSize(500,500);
        System.out.println(getParent().getSize());
        ConstantVertex c = new ConstantVertex(5);
        ConstantVertex c2 = new ConstantVertex(3);
        g.addVertex(c);
        g.addVertex(c2);
        g.addEdge(c,c2, new CEdge(0,0));
        mxCircleLayout layout = new mxCircleLayout(jgxAdapter);
        layout.execute(jgxAdapter.getDefaultParent());
        System.out.println(g.vertexSet());
        setBackground(Color.BLACK);

    }

    public void calc()
    {

    }
}
