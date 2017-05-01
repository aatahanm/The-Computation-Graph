package core;

import org.jgrapht.experimental.dag.DirectedAcyclicGraph;

public class CGraph extends DirectedAcyclicGraph<CVertex, CEdge>
{
    public CGraph(Class edgeClass) {
        super(edgeClass);
    }
}
