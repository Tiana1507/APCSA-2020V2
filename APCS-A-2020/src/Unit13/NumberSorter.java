package Unit13;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - andrew tian

import java.util.Arrays; 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;


//LAB GOAL:
//Send in a number and get back an array that contains all of the digits from the
//number in sorted order. 634152 would come back [1, 2, 3, 4, 5, 6]. You may not use Strings in this program.


public class NumberSorter
{
	//instance variables and other methods not shown

	private static int getNumDigits(int number)
	{
		int count = 0;
		while (number > 0) {
			count++;
			
			//NTS: int will automatically round down.
			number = number / 10;
		}

		return count;
	}

	public static int[] getSortedDigitArray(int number)
	{
		int[] sorted = new int[getNumDigits(number)];
		int spot = 0;
		
		//while loop to load it up.
		while (number > 0) {
			//++ words but not +1?
			sorted[spot++] = number % 10;
			number = number / 10;
		}
		Arrays.sort(sorted);
		return sorted;
	}
}
