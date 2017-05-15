package tcg.core;

import java.util.ArrayList;

/**
 * This class include the properties of cotangent vertex.
 */

public class CotVertex extends CVertex{

    /**
     * Constructor for cotangent vertex.
     */
    public CotVertex() {
        inpCount = 1;
        super.input.add(0.0);
    }

    /**
     * Get derivative got cotangent vector.
     * @param ID ID number
     * @return  derivative
     */
    @Override
    public ArrayList<Double> getDerivative(int ID) {
        ArrayList<Double> d = new ArrayList<>();
        d.add(-1.0/Math.pow(Math.sin(input.get(0)),2));
        return d;
    }

    /**
     * Calculate output.
     * @return  output
     */
    @Override
    ArrayList<Double> calcOutput() {
        ArrayList<Double> al = new ArrayList<>();
        al.add(1.0/Math.tan(super.input.get(0)));
        return al;
    }

    /**
     *
     * @return string representation of cotangent vertex.
     */
    public String toString()
    {
        return "cot(x0)";
    }

    public int getType()
    {
        return STATICS.COT_VERTEX;
    }
}
