package tcgGUI;

import core.CEdge;
import core.CGraph;
import core.CVertex;
import sun.font.GlyphLayout;
import tcgGUI.GUIcomponents.GEdge;
import tcgGUI.GUIcomponents.GVertex;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

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
        Listener l = new Listener();
        addMouseListener(l);
        addMouseMotionListener(l);
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

    private class Listener extends MouseAdapter
    {

        GVertex currentVertex;

        public void mousePressed (MouseEvent event)
        {
            currentVertex = null;
            for (GVertex gv : vertices)
                if(gv.contains(event.getX(), event.getY()))
                {
                    currentVertex = gv;
                    break;
                }

        }

        public void mouseDragged (MouseEvent event)
        {
            if (currentVertex != null) {
                currentVertex.setX(event.getX());
                currentVertex.setY(event.getY());

                repaint();
            }
        }

    }
}
