package Unit4;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Andrew Tian
//Date -  
//Class -
//Lab  -

import static java.lang.System.*;

public class NumberVerify
{
	public static boolean isOdd( int num )
	{
		num = num % 2;
		if (num == 1) {
			return true;
		}
		return false;
	}
	public static boolean isEven( int num )
	{
		num = num % 2;
		if (num == 1) {
			return false;
		}
		return true;
	}	
}