package KeyUtilities;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Pencere extends JFrame implements KeyListener {

	public void paint (Graphics g)
	{
		super.paint(g);
		g.drawRect(160,120,320,240);
		addKeyListener(this);
	}
	public void keyTyped(KeyEvent e){}

	public void keyPressed(KeyEvent e)
	{
		if (e.isControlDown() && e.getKeyCode() == e.VK_A) 
		{
			System.out.println("Select All"); 
		}
		else if(e.isControlDown() && e.isAltDown() && e.getKeyCode() == e.VK_S)
		{
			System.out.println("save as");
		}
		else if(e.isControlDown() && e.getKeyCode() == e.VK_S)
		{
			System.out.println("save");
		}
		else if(e.isControlDown() && e.getKeyCode() == e.VK_C)
		{
			System.out.println("copy");
		}
		else if(e.isControlDown() && e.getKeyCode() == e.VK_X)
		{
			System.out.println("cut");
		}
		else if(e.isControlDown()&& e.getKeyCode() == e.VK_V)
		{
			System.out.println("paste");
		}
		else if(e.isControlDown() && e.isShiftDown()&& e.getKeyCode() == e.VK_Z)
		{
			System.out.println("redo");
		}
		else if(e.isControlDown() && e.getKeyCode() == e.VK_Z)
		{
			System.out.println("undo");
		}
		else if(e.isControlDown() && e.getKeyCode() == e.VK_4)
		{
			System.out.println("zoom in");
		}
		else if(e.isControlDown() && e.getKeyCode() == e.VK_PLUS)
		{
			System.out.println("zoom in");
		}
		else if(e.isControlDown()&& e.getKeyCode() == e.VK_MINUS)
		{
			System.out.println("zoom out");
		}
		else if(e.isControlDown()&& e.getKeyCode() == e.VK_UP)
		{
			System.out.println("up");
		}
		else if(e.isControlDown()&& e.getKeyCode() == e.VK_DOWN)
		{
			System.out.println("down");
		}
		else if(e.isControlDown() && e.getKeyCode() == e.VK_LEFT)
		{
			System.out.println("left");
		}
		else if(e.isControlDown() && e.getKeyCode() == e.VK_RIGHT)
		{
			System.out.println("right");
		}
		else if(e.isControlDown()&& e.getKeyCode() == e.VK_KP_UP)
		{
			System.out.println("up");
		}
		else if(e.isControlDown()&& e.getKeyCode() == e.VK_KP_DOWN)
		{
			System.out.println("down");
		}
		else if(e.isControlDown()&& e.getKeyCode() == e.VK_KP_LEFT)
		{
			System.out.println("left");
		}
		else if(e.isControlDown()&& e.getKeyCode() == e.VK_KP_RIGHT)
		{
			System.out.println("right");
		}
		else if(e.isControlDown() && e.getKeyCode() == e.VK_DELETE)
		{
			System.out.println("delete");
		}
	}
	public void keyReleased(KeyEvent e){}
}
