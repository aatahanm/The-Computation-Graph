package tcgGUI.GUIcomponents;

import core.CVertex;

import java.awt.*;

/**
 * {GVertex}
 * Author: Yaman Yağız Taşbağ
 * Version: {7.05.2017}
 */
public class GVertex
{
    public static final int RADIUS = 20;
    private int x;
    private int y;
    private CVertex v;
    public GVertex (CVertex v)
    {
        x = 0;
        y = 0;
        this.v = v;
    }

    public GVertex ( int x, int y, CVertex v)
    {
        this.x = x;
        this.y = y;
        this.v = v;
    }
    public void paint ( Graphics g)
    {
        Color t;
        t = g.getColor();
        if ( v.isSelected())
            g.setColor(Color.pink);
        else
            g.setColor(Color.black);
        g.fillOval(x - RADIUS / 2, y - RADIUS / 2, RADIUS, RADIUS);
        g.setColor(Color.white);
        g.drawString ( v.toString(), x - RADIUS / 2 , y - RADIUS / 2);
        g.setColor(t);
    }
    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
    public void setX(int x){this.x = x;}
    public void setY(int y){this.y = y;}
    public CVertex getVertex()
    {
        return v;
    }
    public void setSelected(boolean selected){
        v.setSelected(selected);
    }
    public boolean isSelected(){
        return v.isSelected();
    }
    public boolean contains ( int x, int y)
    {
        return ( (this.x - x)*(this.x - x) + (this.y - y)*(this.y - y) <= RADIUS * RADIUS / 4);
    }
}
