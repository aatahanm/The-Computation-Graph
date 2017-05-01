package core;

import org.jgrapht.graph.DefaultEdge;

public class CEdge extends DefaultEdge
{
    private final int ID;
    private int inputOrder;

    public CEdge()
    {
        ID = STATICS.getID();
        inputOrder = 0;
    }

    int getOrder()
    {
        return inputOrder;
    }

    void setOrder ( int order)
    {
        inputOrder = order;
    }
}
