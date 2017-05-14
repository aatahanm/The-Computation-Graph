package tcg.core;

import java.util.ArrayList;

/**
 * This class include properties of output vertex.
 */

public class OutputVertex extends CVertex
{

    /**
     * Constructor for output vertex.
     */
    public OutputVertex()
    {
        super.input = new ArrayList<Double>();
        super.input.add(0.0);
        super.inpCount = 1;
    }

    /**
     * Get derivative
     * @param ID ID number
     * @return  derivative
     */
    public ArrayList<Double> getDerivative ( int ID)
    {
        ArrayList<Double> al;
        al = new ArrayList<Double>();
        al.add(1.0);
        return al;
    }

    /**
     * Calculate output for output vertex.
     * @return output
     */
    public ArrayList<Double> calcOutput()
    {
        return super.input;
    }

    /**
     *
     * @return string representation of output vertex.
     */
    public String toString()
    {
        return "ID #" + ID + " :" + super.input.get(0);
    }
}
