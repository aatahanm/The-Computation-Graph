package core;

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

    int getToOrder()
    {
        return toOrder;
    }

    void setToOrder ( int order)
    {
        toOrder = order;
    }

    int getFromOrder()
    {
        return fromOrder;
    }

    void setFromOrder ( int order)
    {
        fromOrder = order;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean s) {
        selected = s;
    }

    public Object getSource()
    {
        return super.getSource();
    }

    public Object getTarget()
    {
        return super.getTarget();
    }
}
