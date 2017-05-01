package core;

import org.jgrapht.experimental.dag.DirectedAcyclicGraph;

import java.util.ArrayList;

public class CGraph extends DirectedAcyclicGraph<CVertex, CEdge>
{
    ArrayList<CVertex> leafNodes;
    ArrayList<CVertex> outNodes;
    public CGraph(Class edgeClass) {
        super(edgeClass);
    }

    public void calcGraph()
    {
        leafNodes = new ArrayList<CVertex>();
        outNodes = new ArrayList<CVertex>();
        for ( CVertex v : this)
            if ( inDegreeOf(v) == 0)
                leafNodes.add(v);
            else if ( outDegreeOf(v) == 0 && v instanceof OutputVertex)
                outNodes.add(v);

        calcOutputs();
    }

    public void calcOutputs()
    {

    }

    public void calcDerivative ( int ID)
    {

    }

    public void removeSelected()
    {
        for ( CVertex v : this)
        {
            if ( v.isSelected())
            {
                removeAllEdges(incomingEdgesOf(v));
                removeAllEdges(outgoingEdgesOf(v));
                removeVertex(v);
            }
        }
    }
}
