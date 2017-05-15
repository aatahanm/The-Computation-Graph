package tcg.core;

import java.util.ArrayList;

/**
 * This class include properties of sigmoid vertex.
 */
public class SigmoidVertex extends CVertex{

    /**
     * Constructor for sigmoid vertex.
     */
    public SigmoidVertex(){
        super.inpCount = 1;
        super.input.add(0.0);
    }

    /**
     * Get derivative for sigmoid vertex.
     * @param ID
     * @return
     */
    public ArrayList<Double> getDerivative ( int ID)
    {
        ArrayList<Double> al;
        double temp;
        al = new ArrayList<Double>();
        temp = 1/(1+Math.exp(-input.get(0)));
        al.add(temp*(1-temp));
        return al;
    }

    /**
     * Calculate output for sigmoid vertex.
     * @return  output
     */
    public ArrayList<Double> calcOutput() {
        ArrayList<Double> al;
        al = new ArrayList<Double>();
        al.add ( 1/(1+Math.exp(-input.get(0))));
        return al;
    }

    /**
     *
     * @return string representation of sigmoid vertex.
     */
    public String toString()
    {
        return "sgm(x0)";
    }

    public int getType()
    {
        return STATICS.SIGMOID_VERTEX;
    }
}
