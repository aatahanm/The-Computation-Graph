package core;

import org.jgrapht.experimental.dag.DirectedAcyclicGraph;

import java.util.ArrayList;


public class CGraph extends DirectedAcyclicGraph<CVertex, CEdge>
{
    ArrayList<CVertex> outNodes;
    public CGraph(Class edgeClass) {
        super(edgeClass);
    }

    public void calcGraph()
    {
        outNodes = new ArrayList<CVertex>();
        for ( CVertex v : this)
             if ( outDegreeOf(v) == 0 && v instanceof OutputVertex)
                outNodes.add(v);

        calcOutputs();
    }

    public void calcOutputs()
    {
        for ( CVertex v : this) // this is in TopSort according to the java doc of the library
        {
            for ( CEdge e : outgoingEdgesOf(v))
            {
                ((CVertex)e.getTarget()).input.set(e.getToOrder(),v.getOutput().get(e.getFromOrder()));
            }
        }
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
