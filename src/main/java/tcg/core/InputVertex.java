package tcg.core;

import java.util.ArrayList;

/**
 * This class include properties of input vertex.
 */

public class InputVertex extends CVertex {

    /**
     * Constructor for input vertex.
     */
    public InputVertex(){
        inpCount = 1;
        super.input.add(0.0);
    }

    /**
     * Get derivative for input vertex.
     * @param ID ID number
     * @return  derivative
     */
    public ArrayList<Double> getDerivative ( int ID)
    {
        ArrayList<Double> al;
        al = new ArrayList<Double>();
        al.add(0.0);
        return al;
    }

    /**
     * Calculate output for input vertex.
     * @return output
     */
    public ArrayList<Double> calcOutput()
    {
        return super.input;
    }

    /**
     *
     * @return  string representation of input vertex.
     */
    public String toString()
    {
        return super.input.get(0) + "";
    }
}