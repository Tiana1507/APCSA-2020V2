package GraphicsUnit2;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - andrew tian
//Date -
//Class -
//Lab  -

import javax.swing.JFrame; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GraphicsRunner extends JFrame
{
	//these are FInal, meaning you can't change it as you go along. HEre is the only place you can change it. Naming conventions for Final variables is ALL CAPS.
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public GraphicsRunner()
	{
		super("MAKE YOUR OWN SHAPE");

		setSize(WIDTH,HEIGHT);

		getContentPane().add(new ShapePanel());

		getContentPane().add(new MovingShapePanel());

		setVisible(true);
		
		// this command here means that the close button ACTUALLY WORKS.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main( String args[] )
	{
		GraphicsRunner run = new GraphicsRunner();
	}
}