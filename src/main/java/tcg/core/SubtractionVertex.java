package tcg.core;

import java.util.ArrayList;

/**
 * This class include the properties of substraction vertex.
 */

public class SubtractionVertex extends CVertex {

    /**
     * Constructor for substraction vertex.
     */
    public SubtractionVertex()
    {
        inpCount = 2;
        super.input.add(0.0);
        super.input.add(0.0);
    }

    /**
     * Get derivative
     * @param ID ID number
     * @return derivative
     */
    @Override
    public ArrayList<Double> getDerivative(int ID) {
        ArrayList<Double> d = new ArrayList<>();
        d.add(1.0);
        d.add(-1.0);
        return d;
    }

    /**
     * Calculate output for substraction vertex.
     * @return  output
     */
    @Override
    ArrayList<Double> calcOutput() {
        ArrayList<Double> al = new ArrayList<>();
        al.add(super.input.get(0) - super.input.get(1));
        return al;
    }

    /**
     *
     * @return  string representation of substraction vertex.
     */
    public String toString()
    {
        return "x0 - x1";
    }
}
