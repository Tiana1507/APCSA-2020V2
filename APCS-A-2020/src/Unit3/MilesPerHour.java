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

public class MilesPerHour
{
	private int distance, hours, minutes;
	private double mph;

	public MilesPerHour()
	{
		setNums(0,0,0);
		mph=0.0;
	}

	public MilesPerHour(int dist, int hrs, int mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins;
	}

	public void setNums(int dist, int hrs, int mins)
	{
	}

	public void calcMPH()
	{
		double convertedtime = hours + minutes/60.0;
		mph = distance/ (double) convertedtime;
	}

	public void print()
	{
		//Just so grammar is correct, minutes, hours, minute, hour, etc.
		if (hours != 1 && minutes != 1) 
			System.out.println(distance + " miles in " + hours + " hours " + minutes + " minutes = " + mph + " Miles Per Hour.");
		if (hours == 1 && minutes == 1 )
			System.out.println(distance + " miles in " + hours + " hour " + minutes + " minute = " + mph + " Miles Per Hour.");
		if (hours != 1 && minutes == 1)
			System.out.println(distance + " miles in " + hours + " hours " + minutes + " minute = " + mph + " Miles Per Hour.");
		if (hours ==1 && minutes != 1)
			System.out.println(distance + " miles in " + hours + " hour " + minutes + " minutes = " + mph + " Miles Per Hour.");
	}
	
	//create a print or toString or both
	
	/* public String toString()
	{
		return "";
	}
	*/
}