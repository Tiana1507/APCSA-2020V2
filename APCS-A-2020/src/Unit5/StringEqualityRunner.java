package Unit5;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		//add test cases
		/*
		*hello goodbye
		one two
		three four
		TCEA UIL
		State Champions
		ABC ABC
		ABC CBA
		Same Same
		*/
		StringEquality stringtester = new StringEquality("hello", "bruh");
		System.out.println(stringtester.checkEquality());
	}
}