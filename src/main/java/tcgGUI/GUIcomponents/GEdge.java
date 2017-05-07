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
    public final int THICKNESS = 2;
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
        Graphics2D g2 = (Graphics2D) g;
        Stroke t = g2.getStroke();
        g2.setStroke(new BasicStroke(THICKNESS));
        g2.draw(new Line2D.Float(from.getX(), from.getY(), to.getX(), to.getY()));
        g2.setStroke(t);
    }
}
