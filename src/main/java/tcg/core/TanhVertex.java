package tcg.core;

import java.util.ArrayList;

/**
 * This class include properties of tanh vertex.
 */

public class TanhVertex extends CVertex{

    /**
     * Constructor for tanh vertex.
     */
    public TanhVertex() {
        inpCount = 1;
        super.input.add(0.0);
    }

    /**
     * Get derivative
     * @param ID ID number
     * @return  derivative
     */
    @Override
    public ArrayList<Double> getDerivative(int ID) {
        ArrayList<Double> d = new ArrayList<>();
        d.add(1.0/Math.pow(Math.cosh(input.get(0)),2));
        return d;
    }

    /**
     * Calculate output for tanh vertex.
     * @return  output
     */
    @Override
    ArrayList<Double> calcOutput() {
        ArrayList<Double> al = new ArrayList<>();
        al.add(Math.tanh(super.input.get(0)));
        return al;
    }

    /**
     *
     * @return  string representation of tanh vertex.
     */
    public String toString()
    {
        return "tanh(x0)";
    }

    public int getType()
    {
        return STATICS.TANH_VERTEX;
    }
}
