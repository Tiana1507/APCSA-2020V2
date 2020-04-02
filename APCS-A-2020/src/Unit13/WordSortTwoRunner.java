package Unit13;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - andrew tian

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class WordSortTwoRunner
{
	public static void main( String args[] ) throws IOException
	{
		//finds the wordsorttwo.dat file.
		Scanner file = new Scanner(new File("wordsorttwo.dat"));
		int size = file.nextInt();
		file.nextLine();
		for (int i = 0; i < size; i++) {
			String sentence = file.nextLine();
			System.out.println(sentence);
			//instantiate a new WordSort
			WordSortTwo ws2 = new WordSortTwo(sentence);
			ws2.sort();
			System.out.println(ws2);
		}
	}
}
