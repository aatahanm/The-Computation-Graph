package tcgGUI;

import core.CEdge;
import core.CGraph;
import core.CVertex;
import tcgGUI.GUIcomponents.GEdge;
import tcgGUI.GUIcomponents.GVertex;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 * {NodeEditorTry}
 * Author: Yaman Yağız Taşbağ
 * Version: {7.05.2017}
 */
public class NodeEditorTry extends JPanel
{
    private ArrayList<GVertex> vertices;
    private ArrayList<GEdge> edges;
    private CGraph graph;
    public NodeEditorTry ( CGraph graph)
    {
        setSize(600,600);
        vertices = new ArrayList<GVertex>();
        edges = new ArrayList<GEdge>();
        Random random = new Random();
        this.graph = graph;
        for (CVertex v : graph.vertexSet())
        {
            vertices.add ( new GVertex(random.nextInt(200),random.nextInt(200), v));
        }
        for (CEdge e : graph.edgeSet())
        {
            edges.add(new GEdge( getGVertex(e.getSource()), getGVertex(e.getTarget()), e) );
        }
    }
    public GVertex getGVertex ( CVertex v)
    {
        for ( GVertex gv : vertices)
        {
            if ( gv.getVertex() == v)
                return gv;
        }
        return null;
    }
    @Override
    public void paintComponent ( Graphics g)
    {
        super.paintComponent(g);
        for ( GVertex v : vertices)
            v.paint(g);
        for ( GEdge e : edges)
            e.paint(g);
    }
}
