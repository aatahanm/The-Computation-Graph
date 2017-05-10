package core;

import org.jgrapht.experimental.dag.DirectedAcyclicGraph;
import org.jgrapht.ext.JGraphModelAdapter;

import java.util.ArrayList;


public class CGraph extends DirectedAcyclicGraph<CVertex, CEdge> implements Dsf
{
    ArrayList<CVertex> outNodes;
    ArrayList<CVertex> inNodes;
    boolean selected;

    public CGraph(Class edgeClass) {
        super(edgeClass);
        selected = false;
        outNodes = new ArrayList<CVertex>();
        inNodes = new ArrayList<CVertex>();
        for ( CVertex v : this) {
            if (outDegreeOf(v) == 0 && v instanceof OutputVertex)
                outNodes.add(v);
            if (inDegreeOf(v) == 0 && v instanceof InputVertex)
                inNodes.add(v);
        }
    }


    public void calcGraph()
    {
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
    public ArrayList<Double> calcDerivative ( int ID, CVertex v)
    {
        ArrayList<Double> ret = new ArrayList<Double>();
        return ret;
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

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean s) {
        selected = s;
    }

    public ArrayList<Double> getOutput() {
        calcOutputs();
        ArrayList<Double> outputs = new ArrayList<Double>();
        for ( CVertex v : outNodes)
        {
            outputs.add(v.getOutput().get(0));
        }
        return outputs;
    }

    public void setInput(ArrayList<Double> al) {
        for ( int i = 0; i < inNodes.size(); i++)
        {
            ArrayList<Double> a = new ArrayList<Double>();
            a.add(al.get(i));
            inNodes.get(i).setInput(a);
        }
    }

    public ArrayList<Double> getDerivative(int ID) {
        ArrayList<Double> ret = new ArrayList<Double>();
        for ( CVertex v : outNodes)
        {
            ret.add(calcDerivative(ID, v).get(0));
        }
        return ret;
    }
    public int getType()
    {
        return STATICS.CGRAPH;
    }
}
