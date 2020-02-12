package Unit5;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordsCompareRunner
{
 public static void main( String args[] )
 {
	 WordsCompare wordcompare = new WordsCompare();
	 wordcompare.setWords("abe","ape");
	 wordcompare.compare();
	 wordcompare.toString();//add test cases
	 /*
	 	abe ape
		giraffe gorilla
		one two
		fun funny
		123 19
		193 1910
		goofy godfather
		funnel fun
	 */
	}
}