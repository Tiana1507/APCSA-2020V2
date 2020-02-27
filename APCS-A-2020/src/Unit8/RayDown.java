//(c) A+ Computer Science
//www.apluscompsci.com
//Name - andrew tian
//Date -
package Unit8;

import static java.lang.System.*;

public class RayDown
{
	//go() will return true if all numbers in numArray
	//are in decreasing order [31,12,6,2,1]
	public static boolean go(int[] numArray)
	{
		int checknum;
		for (int i =1; i <= numArray.length -1; i++) {
			checknum = numArray[i-1];
			if (checknum <= numArray[i]) {
				return false;
			}
		}
		return true;
	}
}