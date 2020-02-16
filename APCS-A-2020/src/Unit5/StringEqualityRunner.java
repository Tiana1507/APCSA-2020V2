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
		StringEquality stringtester = new StringEquality();
		stringtester.setWords("hello", "goodbye");
		System.out.println(stringtester.toString());
		stringtester.setWords("one", "two");
		System.out.println(stringtester.toString());
		stringtester.setWords("TCEA", "UIL");
		System.out.println(stringtester.toString());
		stringtester.setWords("State", "Champions");
		System.out.println(stringtester.toString());
		stringtester.setWords("ABC", "ABC");
		System.out.println(stringtester.toString());
		stringtester.setWords("ABC", "CBA");
		System.out.println(stringtester.toString());
		stringtester.setWords("Same", "Same");
		System.out.println(stringtester.toString());
	}
}