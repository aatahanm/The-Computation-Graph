package tcg.tcgGUI.GUIcomponents;

import tcg.core.CEdge;

import java.awt.*;
import java.awt.geom.Line2D;

/**
 * This class include GUI components of edge.
 */
public class GEdge
{
    //Properties
    public final int THICKNESS = 4;
    private GVertex from;
    private GVertex to;
    private CEdge edge;

    //Constructor
    public GEdge ( GVertex from, GVertex to, CEdge edge)
    {
        this.from = from;
        this.to = to;
        this.edge = edge;
    }


    /**
     * Paint method for edge.
     * @param g
     */
    public void paint ( Graphics g)
    {
        Color t_ = g.getColor();
        Graphics2D g2 = (Graphics2D) g;
        Stroke t = g2.getStroke();
        g2.setStroke(new BasicStroke(THICKNESS));
        if ( edge.isSelected())
            g.setColor(Color.pink);
        else
            g.setColor(Color.black);
        g2.draw(new Line2D.Float(from.getX(), from.getY(), to.getX(), to.getY()));
        g2.setStroke(new BasicStroke(2));
        g2.setColor(Color.red);
        g2.drawString("x"+getToOrder(),(from.getX() + to.getX())/2 , (from.getY() + to.getY())/2);
        g2.setStroke(t);

        g2.setColor(t_);
    }

    /**
     * Get toOrder
     * @return toOrder value of the edge
     */
    public int getToOrder(){
        return edge.getToOrder();
    }

    /**
     * Get fromOrder
     * @return fromOrder value of the edge.
     */
    public int getFromOrder(){
        return edge.getFromOrder();
    }

    public GVertex getFrom(){
        return from;
    }

    public GVertex getTo(){
        return to;
    }

    /**
     * Check if the given coordinate inside the edge or not.
     * @param x x coordinate
     * @param y y coordinate
     * @return true if contains
     */
    public boolean contains ( int x, int y)
    {
        int xs[] ={from.getX()-THICKNESS, to.getX()-THICKNESS, from.getX()+THICKNESS, to.getX() + THICKNESS};
        int ys[] ={from.getY()-THICKNESS, to.getY()-THICKNESS, from.getY()+THICKNESS, to.getY() + THICKNESS};
        Polygon p = new Polygon( xs, ys,4);
        return p.contains(x,y);
    }
    public void setToOrder ( int order)
    {
        edge.setToOrder(order);
    }

    /**
     * Set an edge as selected.
     * @param selected
     */
    public void setSelected(boolean selected){
        edge.setSelected(selected);
    }

    /**
     * Check for the selected status of an edge
     * @return true if selected
     */
    public boolean isSelected(){
        return edge.isSelected();
    }
}
