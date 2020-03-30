package Unit13;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - andrew tian

import java.util.Arrays;
import static java.lang.System.*; 

public class NumberSorterRunner
{
	public static void main(String args[])
	{
		int[] cases = {567891, 901912468, 864213507, 898777, 234422};
		for( int test : cases )
		{
			int[] one = NumberSorter.getSortedDigitArray( test );
			for(int item : one)
			{
				System.out.print(item + " ");
			}
			System.out.println();
		}
	}
}

/* Correct Output (from guideline doc)
 * 1 5 6 7 8 9
0 1 1 2 4 6 8 9 9
0 1 2 3 4 5 6 7 8
7 7 7 8 8 9
2 2 2 3 4 4
 * 
*/
