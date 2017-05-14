package tcg.core;

import java.util.ArrayList;

/**
 * This class include properties of sinus vertex.
 */

public class SinVertex extends CVertex{

    /**
     * Constructor for sinus vertex.
     */
    public SinVertex() {
        inpCount = 1;
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
        d.add(Math.cos(input.get(0)));
        return d;
    }

    /**
     * Calculate output for sinus vertex.
     * @return  output
     */
    @Override
    ArrayList<Double> calcOutput() {
        ArrayList<Double> al = new ArrayList<>();
        al.add(Math.sin(super.input.get(0)));
        return al;
    }

    /**
     *
     * @return  string representation of sinus vertex.
     */
    public String toString()
    {
        return "sin(x0)";
    }
}
