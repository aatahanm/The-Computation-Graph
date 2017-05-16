package tcg.core;

import org.jgrapht.experimental.dag.DirectedAcyclicGraph;

import java.util.ArrayList;

/**
 * This class include the specialities of graph.
 */

public class CGraph extends DirectedAcyclicGraph<Dsf, CEdge> implements Dsf
{
    //Properties
    ArrayList<Dsf> outNodes;
    ArrayList<Dsf> inNodes;
    boolean selected;

    /**
     * Constructor for CGraph
     * @param edgeClass
     */
    public CGraph(Class edgeClass) {
        super(edgeClass);
        selected = false;
        outNodes = new ArrayList<Dsf>();
        inNodes = new ArrayList<Dsf>();
        for ( Dsf v : this) {
            if (outDegreeOf(v) == 0 && v instanceof OutputVertex)
                outNodes.add(v);
            if (inDegreeOf(v) == 0 && v instanceof InputVertex)
                inNodes.add(v);
        }
    }

    public ArrayList<Dsf> getInNodes(){
        inNodes = new ArrayList<Dsf>();
        for ( Dsf v : this) {
            if (outDegreeOf(v) == 0 && v instanceof OutputVertex)
                outNodes.add(v);
            if (inDegreeOf(v) == 0 && v instanceof InputVertex)
                inNodes.add(v);
        }

        return inNodes;
    }

    /**
     * Calculate the operations in graph.
     */
    public void calcGraph()
    {
        for ( Dsf v : this)
        {
            ArrayList<Double> input = new ArrayList<>();
            for ( int i = 0; i < v.getInputCount(); i++)
                input.add(0.0);
            if (inDegreeOf(v) != 0)
                v.setInput(input);
        }
        calcOutputs();
    }

    /**
     * Calculate the output of the graph.
     */
    public void calcOutputs()
    {
        for ( Dsf v : this) // this is in TopSort according to the java doc of the library
        {
            for ( CEdge e : outgoingEdgesOf(v))
            {
                ((Dsf)e.getTarget()).getInput().set(e.getToOrder(),v.getOutput().get(e.getFromOrder()));
            }
        }
    }

    /*
    The algorithm works by recursion
    the idea is using the dot product and multivariable differentiation with partial derivatives
    the output of the getDerivative function is the coefficient of the partial derivative
    Ft(h,g,j) = ▽F(h,g,f) * (h',g',f')
                            |_________| -> this part is done recursively
     */
    public ArrayList<Double> calcDerivative ( int ID, Dsf v)
    {
        ArrayList<Double> ret = new ArrayList<Double>();
        ArrayList<Double> chainCoefficients = new ArrayList<Double>();
        ArrayList<Double> gradient = v.getDerivative(ID);
        if ( incomingEdgesOf(v).size() == 0)
        {
            return gradient;
        }
        for ( CEdge e : incomingEdgesOf(v))
        {
            chainCoefficients.add(e.getToOrder(), e.getSource().getDerivative(ID).get(e.getFromOrder()) * gradient.get(e.getToOrder()));
        }
        double o = 0;
        for ( double d : chainCoefficients)
        {
            o += d;
        }
        ret.add(o);
        return ret;
    }

    /**
     * Remove the selected components from the graph.
     */
    public void removeSelected()
    {
        ArrayList<Dsf> vToRemove = new ArrayList<>();
        ArrayList<CEdge> eToRemove = new ArrayList<>();
        for ( Dsf v : this)
        {
            if ( v.isSelected())
            {
                removeAllEdges(incomingEdgesOf(v));
                removeAllEdges(outgoingEdgesOf(v));
                vToRemove.add(v);
            }
        }
        for ( CEdge e : edgeSet())
            if ( e.isSelected())
                eToRemove.add(e);

        removeAllEdges(eToRemove);
        removeAllVertices(vToRemove);
    }

    /**
     * Check for the selected status.
     * @return true if the component is selected.
     */
    public boolean isSelected() {
        return selected;
    }

    /**
     * Set a componenet as selected.
     * @param s true for selected
     */
    public void setSelected(boolean s) {
        selected = s;
    }

    /**
     * Calculate and get the output of the graph.
     * @return output
     */
    public ArrayList<Double> getOutput() {
        calcOutputs();
        ArrayList<Double> outputs = new ArrayList<Double>();
        for ( Dsf v : outNodes)
        {
            outputs.add(v.getOutput().get(0));
        }
        return outputs;
    }

    /**
     * Set input into the graph
     * @param al input
     */
    public void setInput(ArrayList<Double> al) {
        for ( int i = 0; i < inNodes.size(); i++)
        {
            ArrayList<Double> a = new ArrayList<Double>();
            a.add(al.get(i));
            inNodes.get(i).setInput(a);
        }
    }

    /**
     * Get derivative
     * @param ID specified number of vertex type
     * @return derivative
     */
    public ArrayList<Double> getDerivative(int ID) {
        ArrayList<Double> ret = new ArrayList<Double>();
        for ( Dsf v : outNodes)
        {
            ret.add(calcDerivative(ID, v).get(0));
        }
        return ret;
    }

    /**
     * Get type of the CGraph
     * @return specified type number of CGraph
     */
    public int getType()
    {
        return STATICS.CGRAPH;
    }

    /**
     * Get the input count
     * @return input count
     */
    public int getInputCount()
    {
        return inNodes.size();
    }

    public ArrayList<Double> getInput()
    {
        return null;
    }
}
