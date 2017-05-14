package tcg.core;

import java.util.ArrayList;

/**
 * Class that include the properties and methods of addition vertex.
 */

public class AdditionVertex extends CVertex{

    /**
     * Constructor of the addition vertex.
     */
    public AdditionVertex(){
        super.inpCount = 2;
        super.input = new ArrayList<Double>();
        super.input.add(0.0);
        super.input.add(0.0);
    }

    /**
     * Get derivative of the addition vertex.
     * @param ID constant number of a vertex.
     * @return derivative
     */
    public ArrayList<Double> getDerivative ( int ID)
    {
        ArrayList<Double> al;
        al = new ArrayList<Double>();
        al.add(1.0);
        al.add(1.0);
        return al;
    }

    /**
     * Calculate the output for addition vertex.
     * @return output
     */
    public ArrayList<Double> calcOutput() {
        ArrayList<Double> al;
        al = new ArrayList<Double>();
        al.add ( input.get(0) + input.get(1));
        return al;
    }

    /**
     *
     * @return string representation of addition vertex.
     */
    public String toString()
    {
        return "Output for Addition Vertex is: " + calcOutput();
    }
}
