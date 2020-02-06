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
		xOne = 0;
		xTwo = 0;
		yOne = 0;
		yTwo = 0;
		distance = 0.0;
	}

	public Distance(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		xTwo = y1;
		yOne = x2;
		yTwo = y2;		
	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
	}

	public void calcDistance()
	{
		distance = (double) (double) Math.pow(Math.pow( (double) xOne- (double) xTwo, 2) + (double) Math.pow( (double) yOne-(double) yTwo, 2), 0.5);
	}
	
	public double getDistance()
	{
		return distance;
	}
	
	public void print()
	{
		System.out.println("Distance == " + distance);
	}
	
	//complete print or the toString

	public String toString()
	{
		return "";
	}
}