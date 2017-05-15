package tcg.core;

import java.util.ArrayList;

/**
 * Thiş class include properties of division vertex.
 */

public class DivisionVertex extends CVertex{

    /**
     * Constructor for division vertex.
     */
    public DivisionVertex(){
        inpCount = 2;
        super.input.add(0.0);
        super.input.add(1.0);
    }

    /**
     * Get derivative for division vertex.
     * @param ID ID number
     * @return derivative
     */
    @Override
    public ArrayList<Double> getDerivative(int ID) {
        ArrayList<Double> d = new ArrayList<>();
        d.add(1.0 / input.get(1));
        d.add(-input.get(0)/(input.get(1)*input.get(1)));
        return d;
    }

    /**
     * Calculate output for division vertex.
     * @return  output
     */
    @Override
    ArrayList<Double> calcOutput() {
        ArrayList<Double> al = new ArrayList<>();
        al.add(super.input.get(0) / super.input.get(1));
        return al;
    }

    /**
     *
     * @return string representation of division vertex.
     */
    public String toString()
    {
        return "x0 / x1";
    }

    public int getType()
    {
        return STATICS.DIVISION_VERTEX;
    }
}
