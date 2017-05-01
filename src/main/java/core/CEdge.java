package core;

import org.jgrapht.graph.DefaultEdge;

public class CEdge extends DefaultEdge implements Selectable
{
    private final int ID;
    private int inputOrder;
    private boolean selected;

    public CEdge()
    {
        ID = STATICS.getID();
        inputOrder = 0;
        selected = false;
    }

    int getOrder()
    {
        return inputOrder;
    }

    void setOrder ( int order)
    {
        inputOrder = order;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean s) {
        selected = s;
    }
}
