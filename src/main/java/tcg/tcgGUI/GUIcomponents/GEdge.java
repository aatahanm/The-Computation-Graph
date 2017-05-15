package tcg.tcgGUI.GUIcomponents;

import tcg.core.CEdge;

import java.awt.*;
import java.awt.geom.Line2D;

public class GEdge
{
    public final int THICKNESS = 4;
    private GVertex from;
    private GVertex to;
    private CEdge edge;
    public GEdge ( GVertex from, GVertex to, CEdge edge)
    {
        this.from = from;
        this.to = to;
        this.edge = edge;
    }
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
        g2.setColor(Color.red);
        double angle = Math.atan2 ( to.getY() - from.getY(), to.getX() - from.getX());
        g2.fillOval((int)(to.getX() - (GVertex.RADIUS / 4) * (2*Math.cos(angle) + 1)),(int)(to.getY() - (GVertex.RADIUS / 4 ) * (2*Math.sin(angle) + 1)),
                2*GVertex.RADIUS / 3, 2*GVertex.RADIUS / 3);
        g2.setStroke(new BasicStroke(2));
        g2.drawString("x"+getToOrder(),(from.getX() + to.getX())/2 , (from.getY() + to.getY())/2);
        g2.setStroke(t);

        g2.setColor(t_);
    }

    public int getToOrder(){
        return edge.getToOrder();
    }

    public int getFromOrder(){
        return edge.getFromOrder();
    }

    public GVertex getFrom(){
        return from;
    }

    public GVertex getTo(){
        return to;
    }

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
    public void setSelected(boolean selected){
        edge.setSelected(selected);
    }

    public boolean isSelected(){
        return edge.isSelected();
    }
}
