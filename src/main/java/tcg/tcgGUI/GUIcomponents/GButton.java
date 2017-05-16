package tcg.tcgGUI.GUIcomponents;

import tcg.core.STATICS;

import javax.swing.*;
import java.util.ArrayList;

public class GButton extends JButton
{
    //properties
    private int type;
    ArrayList<JButton> buttons;

    //constructor
    public GButton ( String label, int type)
    {
        super(label);
        this.type = type;
    }
    public GButton(){

        //create buttons for main window.
        buttons = new ArrayList<>();
        JButton a = new GButton("Addition", STATICS.ADDITION_VERTEX);
        JButton b = new GButton("Multiplication",STATICS.MULTIPLICATION_VERTEX);
        JButton c = new GButton("Input",STATICS.INPUT_VERTEX);
        JButton e = new GButton("Sigmoid",STATICS.SIGMOID_VERTEX);
        JButton f = new GButton("Output",STATICS.OUTPUT_VERTEX);
        JButton d = new GButton("Constant",STATICS.CONSTANT_VERTEX);
        JButton g = new GButton("Subtraction", STATICS.SUBTRACTION_VERTEX);
        JButton h = new GButton("Exponential",STATICS.EXP_VERTEX);
        JButton i = new GButton("Logarithm",STATICS.LOG_VERTEX);
        JButton j = new GButton("Sin",STATICS.SIN_VERTEX);
        JButton k = new GButton("Cos",STATICS.COS_VERTEX);
        JButton l = new GButton("Tan",STATICS.TAN_VERTEX);
        JButton m = new GButton("Tanh",STATICS.TANH_VERTEX);
        JButton n = new GButton("Division",STATICS.DIVISION_VERTEX);
        JButton o = new GButton("Cot",STATICS.COT_VERTEX);

        buttons.add(a);
        buttons.add(b);
        buttons.add(c);
        buttons.add(d);
        buttons.add(e);
        buttons.add(f);
        buttons.add(g);
        buttons.add(h);
        buttons.add(i);
        buttons.add(j);
        buttons.add(k);
        buttons.add(l);
        buttons.add(m);
        buttons.add(n);
        buttons.add(o);
    }

    /**
     * Get type
     * @return type
     */
    public int getType()
    {
        return type;
    }

    /**
     * Get button
     * @return button
     */
    public ArrayList<JButton> get(){
        return buttons;
    }

}
