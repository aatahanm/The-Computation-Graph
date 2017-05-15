package tcg.core;

import java.util.ArrayList;

/**
 * This class include properties of logarithmic vertex.
 */


public class LogVertex extends CVertex{

    /**
     * Constructor for logarithmic vertex.
     */
    public LogVertex() {
        inpCount = 1;
        super.input.add(1.0);
    }

    /**
     * Get derivative
     * @param ID ID number
     * @return derivative
     */
    @Override
    public ArrayList<Double> getDerivative(int ID) {
        ArrayList<Double> d = new ArrayList<>();
        d.add(1.0/(input.get(0)));
        return d;
    }

    /**
     * Calculate output for logarithmic vertex.
     * @return output
     */
    @Override
    ArrayList<Double> calcOutput() {
        ArrayList<Double> al = new ArrayList<>();
        al.add(Math.log(super.input.get(0)));
        return al;
    }

    /**
     *
     * @return string representation of logarithmic function.
     */
    public String toString()
    {
        return "ln(x0)";
    }

    public int getType()
    {
        return STATICS.LOG_VERTEX;
    }
}
