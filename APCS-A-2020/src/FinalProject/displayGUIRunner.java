package FinalProject;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class displayGUIRunner extends JFrame
{
  //Nullified by displayGUI. 
	//private static final int WIDTH = 800;
	//private static final int HEIGHT = 600;

	public displayGUIRunner() throws IOException
	{
    //title screen
		super("ANDREW TIAN FINAL PROJECT");
		setSize(WIDTH,HEIGHT);

		getContentPane().add(new displayGUI());

		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	//runs displayGUI();
	//needs the IOException for the delays I think.
	public static void main( String args[] ) throws IOException
	{
		new displayGUI();
	}
	
	
}
