package tcgGUI;

import core.CGraph;
import org.jgrapht.ListenableGraph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.ListenableDirectedGraph;

import javax.swing.*;

/**
 * {NodeEditor}
 * Author: Yaman Yağız Taşbağ
 * Version: {6.05.2017}
 */
public class NodeEditor extends JPanel
{

    public void init()
    {
        // create a JGraphT graph
        ListenableGraph g = new ListenableDirectedGraph( DefaultEdge.class );

        // create a visualization using JGraph, via an adapter
        JGraphModelAdapter m_jgAdapter = new JGraphModelAdapter(g);

        CGraph jgraph = new CGraph( m_jgAdapter );

        add(jgraph);
    }

    public void calc()
    {

    }
}
