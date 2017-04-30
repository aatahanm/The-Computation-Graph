package core;

import org.jgrapht.experimental.dag.DirectedAcyclicGraph;

/**
 * {CGraph}
 * Author: Yaman Yağız Taşbağ
 * Version: {30.04.2017}
 */
public class CGraph<CVertex, CEdge> extends DirectedAcyclicGraph
{
    public CGraph(Class edgeClass) {
        super(edgeClass);
    }
}
