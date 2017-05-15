package tcg.core;

import java.util.ArrayList;

/**
 * This class include properties of multiplication vertex.
 */

public class MultiplicationVertex extends CVertex
{

    /**
     * Constructor for multiplication vertex.
     */
    public MultiplicationVertex(){
        super.inpCount = 2;
        super.input.add(0.0);
        super.input.add(0.0);
    }

    /**
     * Get derivative for multiplication vertex.
     * @param ID ID number
     * @return  derivative
     */
    public ArrayList<Double> getDerivative (int ID)
    {
        ArrayList<Double> al;
        al = new ArrayList<Double>();
        al.add(input.get(1));
        al.add(input.get(0));
        return al;
    }

    /**
     * Calculate output.
     * @return output
     */
    public ArrayList<Double> calcOutput() {
        ArrayList<Double> al;
        al = new ArrayList<Double>();
        al.add ( input.get(0) * input.get(1));
        return al;
    }

    /**
     *
     * @return string representation of multiplication vertex.
     */
    public String toString()
    {
        return "x0 * x1";
    }

    public int getType()
    {
        return STATICS.MULTIPLICATION_VERTEX;
    }
}
