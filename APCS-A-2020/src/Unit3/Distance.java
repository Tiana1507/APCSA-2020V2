package Unit3;
//(c) A+ Computer Science 
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private int xOne,yOne,xTwo,yTwo;
	private double distance;

	public Distance()
	{
		Scanner keyboard = new Scanner(System.in);

		//ask for the input here
		System.out.print("Enter X1 :: ");
		int x1 = keyboard.nextInt();
		System.out.print("Enter Y1 :: ");
		int y1 = keyboard.nextInt();
		System.out.print("Enter X2 :: ");
		int x2 = keyboard.nextInt();
		System.out.print("Enter Y2 :: ");
		int y2 = keyboard.nextInt();
	}

	public Distance(int x1, int y1, int x2, int y2)
	{
		distance = Math.pow(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2), 2);
	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
	}

	public void calcDistance()
	{
	}
	
	public double getDistance()
	{
		return 0.0;
	}
	
	public void print()
	{
	}
	
	//complete print or the toString

	public String toString()
	{
		return "";
	}
}