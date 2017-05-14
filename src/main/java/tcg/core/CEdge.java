package tcg.core;

import org.jgrapht.graph.DefaultEdge;

/**
 * This class states the specialities of edges.
 */

public class CEdge extends DefaultEdge implements Selectable
{
    //Properties
    private final int ID;
    private int toOrder;
    private int fromOrder;
    private boolean selected;

    //Constructors

    public CEdge()
    {
        ID = STATICS.getID();
        selected = false;
    }

    /**
     * Constructor for the edge.
     * @param toOrder final destination of the edge
     * @param fromOrder starting point of the edge.
     */
    public CEdge(int toOrder, int fromOrder)
    {
        ID = STATICS.getID();
        selected = false;
        this.toOrder = toOrder;
        this.fromOrder = fromOrder;
    }

    /**
     * Get the final destination of the edge.
     * @return final dest.
     */
    public int getToOrder()
    {
        return toOrder;
    }

    /**
     * Set the final point of the edge.
     * @param order final point of the edge.
     */
    public void setToOrder ( int order)
    {
        toOrder = order % getTarget().getInputCount();
    }

    /**
     * Get the starting point of the edge.
     * @return starting point of the edge.
     */
    public int getFromOrder()
    {
        return fromOrder;
    }

    /**
     * Set the starting point of the edge.
     * @param order starting point of the edge
     */
    public void setFromOrder ( int order)
    {
        fromOrder = order;
    }

    /**
     * Check for the selected status of edge.
     * @return true if the edge selected.
     */
    public boolean isSelected() {
        return selected;
    }

    /**
     * Set an edge as selected.
     * @param s true for selecting
     */
    public void setSelected(boolean s) {
        selected = s;
    }

    /**
     * Get the source.
     * @return source
     */
    public Dsf getSource()
    {
        return (Dsf) super.getSource();
    }

    /**
     * Get the target.
     * @return target
     */
    public Dsf getTarget()
    {
        return (Dsf) super.getTarget();
    }
}
