package tcg.tcgGUI;
import tcg.core.CEdge;
import tcg.core.CGraph;
;
import tcg.core.STATICS;
import tcg.tcgGUI.GUIcomponents.GEdge;
import tcg.tcgGUI.GUIcomponents.GGraph;
import tcg.tcgGUI.GUIcomponents.GVertex;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

/**
 * User interactions of nodes.
 */

public class NodeEditor extends JPanel
{
    GGraph graph;
    GEdge selectedEdge;
    public Listener l;
    public NodeEditor(CGraph graph)
    {
        this.graph = new GGraph(graph);
        init();
    }

    public NodeEditor(GGraph gg){
        setBackground(Color.white);
        graph = gg;
        init();
    }

    public void setGraph(GGraph graph)
    {
        this.graph = graph;
    }

    private void init(){
        l = new Listener();
        addMouseListener(l);
        addMouseMotionListener(l);

    }

    /**
     * paint method of the node
     * @param g
     */
    @Override
    public void paintComponent ( Graphics g)
    {
        super.paintComponent(g);
        for ( GEdge e : graph.getEdges())
            e.paint(g);
        for ( GVertex v : graph.getVertices())
            v.paint(g);
    }
    public void setToOrder ( int order)
    {
        selectedEdge.setToOrder(order);
    }

    public class Listener extends MouseAdapter
    {
        public boolean isCtrlDown = false;
        GVertex currentVertex;

        //mouse interactions of the nodes
        public void mousePressed (MouseEvent event)
        {
            if ( event.isMetaDown())
            {
                GVertex target = null;
                for (GVertex gv : graph.getVertices())
                    if(gv.contains(event.getX(), event.getY()))
                    {
                        target = gv;
                        break;
                    }
                if ( target != null)
                {
                    for ( GVertex v : graph.getSelected())
                    {
                        if ( v == target)
                            continue;

                        graph.addEdge ( v, target, new CEdge ( 0, 0));
                    }
                }
            }
            else
            {
                if(!isCtrlDown)
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
                        selectedEdge = e;
                        break;
                    }
                }
            }
            repaint();
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
            if (currentVertex != null && !event.isMetaDown()) {
                currentVertex.setX(event.getX());
                currentVertex.setY(event.getY());

                repaint();
            }
        }

        public void mouseClicked(MouseEvent event) {
            if(currentVertex!=null){
             if (currentVertex.getVertex().getType() == STATICS.INPUT_VERTEX  ) {
                 if (event.getClickCount() == 2) {
                     ArrayList<Double> test = new ArrayList<>();
                     double d = new Double(JOptionPane.showInputDialog("Please enter a value"));
                     if (d == JOptionPane.CANCEL_OPTION || d == JOptionPane.CLOSED_OPTION) {
                         test.add(0.0);
                     } else {
                         test.add(d);
                     }
                     currentVertex.getVertex().setInput(test);
                     repaint();
                 }
             }
            }
        }
    }
}
