package core;
import org.jgrapht.*;

import java.util.ArrayList;

/**
 * Created by mertcinar on 30/04/2017.
 */
public class CGNode implements Dsf
{
    private int ID;
    private int val;
    private boolean selected;

    public double getDerivative(int ID) {
        return ID;
    }

    public boolean contains ( int ID) {
        return false;
    }

    public boolean isSelected() {
        return selected;
    }

    public boolean setSelected(boolean s) {
        return false;
    }

    public ArrayList<Double> getoutput() {
        return null;
    }

    public void setInput(ArrayList<Double> al)
    {

    }
}
