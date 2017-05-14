package tcg.core;

import java.util.ArrayList;

/**
 * This class include properties of tangent vector.
 */

public class TanVertex extends CVertex{

    /**
     * Constructor for tangent vertex
     */
    public TanVertex() {
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
        d.add(1.0/Math.pow(Math.cos(input.get(0)),2));
        return d;
    }

    /**
     * Calculate output for tangent vertex.
     * @return  output
     */
    @Override
    ArrayList<Double> calcOutput() {
        ArrayList<Double> al = new ArrayList<>();
        al.add(Math.tan(super.input.get(0)));
        return al;
    }

    /**
     *
     * @return string representation of tangent vector.
     */
    public String toString()
    {
        return "tan(x0)";
    }
}
