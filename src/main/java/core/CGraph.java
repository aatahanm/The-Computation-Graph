package core;

import org.jgrapht.experimental.dag.DirectedAcyclicGraph;
import org.jgrapht.ext.JGraphModelAdapter;

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

    //TODO
    /*
    The algorithm will work by recursion
    the idea is using the dot product and multivariable differentiation with partial derivatives
    the output of the getDerivative function is the coefficient of the partial derivative
    Ft(h,g,j) = ▽F(h,g,f) * (h',g',f')
                            |_________| -> this part is done recursively
     */
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
