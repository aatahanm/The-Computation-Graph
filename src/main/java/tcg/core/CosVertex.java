package tcg.core;

import java.util.ArrayList;

/**
 * Thiş class include properties of cosinus vertex.
 */

public class CosVertex extends CVertex{

    /**
     * Constructor
     */
    public CosVertex() {
        inpCount = 1;
        super.input.add(0.0);
    }

    /**
     * Get derivative.
     * @param ID ID number.
     * @return derivative
     */
    @Override
    public ArrayList<Double> getDerivative(int ID) {
        ArrayList<Double> d = new ArrayList<>();
        d.add(-Math.sin(input.get(0)));
        return d;
    }

    /**
     * Calculate output.
     * @return output
     */
    @Override
    ArrayList<Double> calcOutput() {
        ArrayList<Double> al = new ArrayList<>();
        al.add(Math.cos(super.input.get(0)));
        return al;
    }

    /**
     *
     * @return string representation of cosinus vertex.
     */
    public String toString()
    {
        return "cos(x0)";
    }
}

