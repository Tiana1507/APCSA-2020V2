package Unit13;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - andrew tian

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifterRunner
{
	public static void main( String args[] ) throws IOException
	{
		//10 test cases
		for (int i = 0; i < 10; i++) {
			int[] runray = NumberShifter.makeLucky7Array(20);
			System.out.println("Original Array: " + Arrays.toString(runray));
			NumberShifter.shiftEm(runray);
			System.out.println("Shifted Array: " + Arrays.toString(runray) + "\n");
		}
	}
}
