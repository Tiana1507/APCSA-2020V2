//(c) A+ Computer Science
//www.apluscompsci.com
//Name Andrew tian
package Unit6;
import static java.lang.System.*;

public class WordRunner
{
	public static void main ( String[] args )
	{
		//add test cases
		/*
		 * Hello
		World
		JukeBox
		TCEA
		UIL
		 */
		Word wordtester = new Word();
		wordtester.setString("Hello");
		System.out.println(wordtester.getFirstChar());
		System.out.println(wordtester.getLastChar());
		System.out.println(wordtester.getBackWards());
		System.out.println(wordtester.toString());
		System.out.println("\n");
		wordtester.setString("World");
		System.out.println(wordtester.getFirstChar());
		System.out.println(wordtester.getLastChar());
		System.out.println(wordtester.getBackWards());
		System.out.println(wordtester.toString());
		System.out.println("\n");
		wordtester.setString("JukeBox");
		System.out.println(wordtester.getFirstChar());
		System.out.println(wordtester.getLastChar());
		System.out.println(wordtester.getBackWards());
		System.out.println(wordtester.toString());
		System.out.println("\n");
		wordtester.setString("TCEA");
		System.out.println(wordtester.getFirstChar());
		System.out.println(wordtester.getLastChar());
		System.out.println(wordtester.getBackWards());
		System.out.println(wordtester.toString());
		System.out.println("\n");
		wordtester.setString("UIL");
		System.out.println(wordtester.getFirstChar());
		System.out.println(wordtester.getLastChar());
		System.out.println(wordtester.getBackWards());
		System.out.println(wordtester.toString());
		System.out.println("\n");
	}
}