package tcgGUI.GUIcomponents;

import core.CEdge;

import java.awt.*;
import java.awt.geom.Line2D;

/**
 * {GEdge}
 * Author: Yaman Yağız Taşbağ
 * Version: {7.05.2017}
 */
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
        g2.setStroke(t);
        g2.setColor(t_);
    }
    public boolean contains ( int x, int y)
    {
        int xs[] ={from.getX(), to.getX(), from.getX()+THICKNESS, to.getX() + THICKNESS};
        int ys[] ={from.getY(), to.getY(), from.getY()+THICKNESS, to.getY() + THICKNESS};
        Polygon p = new Polygon( xs, ys,4);
        return p.contains(x,y);
    }

    public void setSelected(boolean selected){
        edge.setSelected(selected);
    }

    public boolean isSelected(){
        return edge.isSelected();
    }
}
