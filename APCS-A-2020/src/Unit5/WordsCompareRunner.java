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
	 System.out.println(wordcompare.toString());
	 wordcompare.setWords("giraffe","gorilla");
	 wordcompare.compare();
	 System.out.println(wordcompare.toString());	 
	 wordcompare.setWords("one","two");
	 wordcompare.compare();
	 System.out.println(wordcompare.toString());	 
	 wordcompare.setWords("fun","funny");
	 wordcompare.compare();
	 System.out.println(wordcompare.toString());
	 wordcompare.setWords("123","19");
	 wordcompare.compare();
	 System.out.println(wordcompare.toString());
	 wordcompare.setWords("193","1910");
	 wordcompare.compare();
	 System.out.println(wordcompare.toString());
	 wordcompare.setWords("goofy","godfather");
	 wordcompare.compare();
	 System.out.println(wordcompare.toString());
	 wordcompare.setWords("funnel","fun");
	 wordcompare.compare();
	 System.out.println(wordcompare.toString());
	 //add test cases
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