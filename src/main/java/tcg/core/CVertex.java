package tcg.core;

import java.io.Serializable;
import java.util.*;

/**
 * Abstract class that state the general methods of the vertices.
 */

public abstract class CVertex implements Dsf, Serializable
{
    //Properties
    private static final long serialVersionUID = 52177932855L;
    final int ID;
    private boolean selected;
    int inpCount = 0;
    ArrayList<Double> input;

    /**
     * Constructor for vertex
     */
    public CVertex()
    {
        ID = STATICS.getID();
        input = new ArrayList<Double>();
    }

    /**
     * Check for the selected status of the vertex.
     * @return true if selected, false if not selected.
     */
    public boolean isSelected()
    {
        return selected;
    }

    /**
     * Set a vertex as selected.
     * @param s true for setting a vertex selected.
     */
    public void setSelected(boolean s) {
        selected = s;
    }

    /**
     * Get the specified type number of a vertex.
     * @return type number of a vertex.
     */
    public int getType(){
        if (this instanceof ConstantVertex)
            return STATICS.CONSTANT_VERTEX;
        else if (this instanceof InputVertex)
            return STATICS.INPUT_VERTEX;
        else if (this instanceof AdditionVertex)
            return STATICS.ADDITION_VERTEX;
        else if (this instanceof MultiplicationVertex)
            return STATICS.MULTIPLICATION_VERTEX;
        else if (this instanceof OutputVertex)
            return STATICS.OUTPUT_VERTEX;
        else if (this instanceof SigmoidVertex)
            return STATICS.SIGMOID_VERTEX;
        return -1;
    }

    /**
     * Get the output.
     * @return output of the operations.
     */
    public ArrayList<Double> getOutput()
    {
            return calcOutput();
    }

    /**
     * Set input into a vertex.
     * @param al input
     */
    public void setInput(ArrayList<Double> al)
    {
            input = al;
    }

    /**
     * Calculate the output.
     * @return output
     */
    abstract ArrayList<Double> calcOutput();

    /**
     * Get the count of the input.
     * @return count of the input
     */
    public int getInputCount()
    {
        return inpCount;
    }

    /**
     * Get the input from a vertex.
     * @return input
     */
    public ArrayList<Double> getInput()
    {
        return input;
    }

}
