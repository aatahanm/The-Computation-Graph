package tcg.tcgGUI.GUIcomponents;

import tcg.core.Dsf;
import org.json.JSONException;
import org.json.JSONObject;

import java.awt.*;

/**
 * This class include the GUI components of verteces.
 */
public class GVertex
{
    //Properties
    public static final int RADIUS = 20;
    private int x;
    private int y;
    private Dsf v;

    //Constructor
    public GVertex (Dsf v)
    {
        x = 0;
        y = 0;
        this.v = v;
    }

    /**
     * Constructer for GVertex
     * @param x x coordinate
     * @param y y coordinate
     * @param v
     */
    public GVertex ( int x, int y, Dsf v)
    {
        this.x = x;
        this.y = y;
        this.v = v;
    }

    /**
     * Paint method of vertices.
     * @param g
     */
    public void paint ( Graphics g)
    {
        Color t;
        t = g.getColor();
        if ( v.isSelected())
            g.setColor(Color.pink);
        else
            g.setColor(Color.black);
        g.fillOval(x - RADIUS / 2, y - RADIUS / 2, RADIUS, RADIUS);
        g.setColor(Color.blue);
        g.drawString ( v.toString(), x - RADIUS / 2 , y - RADIUS / 2);
        g.setColor(t);
    }

    public JSONObject parseToJson() throws JSONException {
        JSONObject vjson =  new JSONObject();
        vjson.put("x", x);
        vjson.put("y", y);
        vjson.put("type", v.getType());
        if (v.getType() == 1)
            vjson.put("val", v.getOutput().get(0));//??????????
        return vjson;
    }

    /**
     * Get x coordinate of the vertex
     * @return x coordinate
     */
    public int getX()
    {
        return x;
    }

    /**
     * Get y coordinate of the vertex.
     * @return y-coordinate.
     */
    public int getY()
    {
        return y;
    }

    /**
     * Set x coordinate of the vertex.
     * @param x x-coordimnate
     */
    public void setX(int x){this.x = x;}

    /**
     * Set y coordinate of the vertex.
     * @param y y-coordinate
     */
    public void setY(int y){this.y = y;}

    /**
     * Get vertex.
     * @return vertex
     */
    public Dsf getVertex()
    {
        return v;
    }

    /**
     * Set the status of a vertex as selected.
     * @param selected status of the vertex.
     */
    public void setSelected(boolean selected){
        v.setSelected(selected);
    }

    /**
     * Check the selected status of a vertex.
     * @return true if selected.
     */
    public boolean isSelected(){
        return v.isSelected();
    }

    /**
     * Check that if the vertex contains given coordinate
     * @param x x coordinate
     * @param y y coordinate
     * @return true if contains
     */
    public boolean contains ( int x, int y)
    {
        return ( (this.x - x)*(this.x - x) + (this.y - y)*(this.y - y) <= RADIUS * RADIUS / 4);
    }
}
