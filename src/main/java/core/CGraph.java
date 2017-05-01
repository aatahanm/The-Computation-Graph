package core;

import org.jgrapht.experimental.dag.DirectedAcyclicGraph;

public class CGraph<CVertex, CEdge> extends DirectedAcyclicGraph
{
    public CGraph(Class edgeClass) {
        super(edgeClass);
    }
}
