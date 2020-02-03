package Unit0;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name - andrew tian
//Date - 2/3/2020

public class Line
{
	public static double getSlope( int x1, int y1, int x2, int y2 )
	{
		//literally the slope formula lol
		double slope = (double) (y2-y1)/(x2-x1);
		return slope;
	}

}