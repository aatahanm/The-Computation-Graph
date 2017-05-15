package tcg.core;

import java.util.ArrayList;

/**
 * This class include properties of constant vertex.
 */

public class ConstantVertex extends CVertex
{

    //Properties
    ArrayList<Double> consInput;

    /**
     * Constructor for constant vertex.
     * @param d constant number
     */
    public ConstantVertex ( double d)
    {
       consInput = new ArrayList<>();
       consInput.add(d);
    }

    /**
     * Get derivative of constant vertex.
     * @param ID type number
     * @return derivative
     */
    public ArrayList<Double> getDerivative(int ID) {
        ArrayList<Double> al;
        al = new ArrayList<Double>();
        if ( ID == super.ID)
            al.add(1.0);
        else
            al.add(0.0);
        return al;
    }

    /**
     * Set constant input.
     * @param consInput constant number
     */
    public void setConsInput ( ArrayList<Double> consInput)
    {
        this.consInput = consInput;
    }

    /**
     * Calculate output.
     * @return output
     */
    ArrayList<Double> calcOutput() {
        return consInput;
    }
    public String toString()
    {
        return "{" + consInput.get(0) + "}";
    }

    public int getType()
    {
        return STATICS.CONSTANT_VERTEX;
    }
}
