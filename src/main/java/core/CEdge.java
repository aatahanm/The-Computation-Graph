package core;

import org.jgrapht.graph.DefaultEdge;

/**
 * {CEdge}
 * Author: Yaman Yağız Taşbağ
 * Version: {30.04.2017}
 */
public class CEdge extends DefaultEdge
{
    private final int ID;
    public CEdge()
    {
        ID = STATICS.getID();
    }
}
