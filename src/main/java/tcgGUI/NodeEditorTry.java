package tcgGUI;
import core.CEdge;
import core.CGraph;
;
import tcgGUI.GUIcomponents.GEdge;
import tcgGUI.GUIcomponents.GGraph;
import tcgGUI.GUIcomponents.GVertex;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Line2D;


public class NodeEditorTry extends JPanel
{
    GGraph graph;

    public NodeEditorTry ( CGraph graph)
    {
        this.graph = new GGraph(graph);
        init();
    }

    public NodeEditorTry(GGraph gg){
        setBackground(Color.white);
        graph = gg;
        init();
    }

    public void setGraph(GGraph graph)
    {
        this.graph = graph;
    }

    private void init(){
        Listener l = new Listener();
        addMouseListener(l);
        addMouseMotionListener(l);

    }

    @Override
    public void paintComponent ( Graphics g)
    {
        super.paintComponent(g);
        for ( GEdge e : graph.getEdges())
            e.paint(g);
        for ( GVertex v : graph.getVertices())
            v.paint(g);
    }

    private class Listener extends MouseAdapter
    {

        GVertex currentVertex;

        public void mousePressed (MouseEvent event)
        {
            deselect();
            currentVertex = null;
            for (GVertex gv : graph.getVertices())
                if(gv.contains(event.getX(), event.getY()))
                {
                    gv.setSelected(true);
                    currentVertex = gv;
                    break;
                }
            for (GEdge e : graph.getEdges()){
                if(e.contains(event.getX(), event.getY())){
                    e.setSelected(true);
                    break;
                }
            }
        }

        public void deselect(){
            for (GVertex v : graph.getVertices()){
                v.setSelected(false);
            }
            for (GEdge e : graph.getEdges()){
                e.setSelected(false);
            }
            repaint();
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
