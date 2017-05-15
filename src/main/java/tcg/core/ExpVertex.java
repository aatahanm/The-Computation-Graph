package tcg.core;

import java.util.ArrayList;

/**
 * This class include the properties of exponential vertex.
 */

public class ExpVertex extends CVertex{

    /**
     * Constructor for exponential vertex.
     */
    public ExpVertex() {
        inpCount = 1;
        super.input.add(0.0);
    }

    /**
     * Get derivative for exponential function.
     * @param ID ID number
     * @return  derivative
     */
    @Override
    public ArrayList<Double> getDerivative(int ID) {
        ArrayList<Double> d = new ArrayList<>();
        d.add(Math.exp(super.input.get(0)));
        return d;
    }

    /**
     * Calculate output for exponential vertex.
     * @return output.
     */
    @Override
    ArrayList<Double> calcOutput() {
        ArrayList<Double> al = new ArrayList<>();
        al.add(Math.exp(super.input.get(0)));
        return al;
    }

    /**
     *
     * @return string representation of exponential function.
     */
    public String toString()
    {
        return "exp(x0)";
    }

    public int getType()
    {
        return STATICS.EXP_VERTEX;
    }
}
