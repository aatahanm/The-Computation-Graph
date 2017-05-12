package tcg.core;

import org.jgrapht.graph.DefaultEdge;

public class CEdge extends DefaultEdge implements Selectable
{
    private final int ID;
    private int toOrder;
    private int fromOrder;
    private boolean selected;

    public CEdge()
    {
        ID = STATICS.getID();
        selected = false;
    }
    public CEdge(int toOrder, int fromOrder)
    {
        ID = STATICS.getID();
        selected = false;
        this.toOrder = toOrder;
        this.fromOrder = fromOrder;
    }

    public int getToOrder()
    {
        return toOrder;
    }

    public void setToOrder ( int order)
    {
        toOrder = order % getTarget().getInputCount();
    }

    public int getFromOrder()
    {
        return fromOrder;
    }

    public void setFromOrder ( int order)
    {
        fromOrder = order;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean s) {
        selected = s;
    }

    public Dsf getSource()
    {
        return (Dsf) super.getSource();
    }

    public Dsf getTarget()
    {
        return (Dsf) super.getTarget();
    }
}
