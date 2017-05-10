package tcgGUI.GUIcomponents;

import javax.swing.*;

/**
 * {GButton}
 * Author: Yaman Yağız Taşbağ
 * Version: {11.05.2017}
 */
public class GButton extends JButton
{
    private int type;
    public GButton ( String label, int type)
    {
        super(label);
        this.type = type;
    }
    public int getType()
    {
        return type;
    }
}
