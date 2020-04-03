package Unit13;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - andrew tian

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import static java.lang.System.*;

public class WordSortTwoRunner
{
	public static void main( String args[] ) throws IOException
	{
		//trying to find the path of a file because I can't read it.
	    File testFile = new File("wordsorttwo.dat");
	    String currentPath = testFile.getAbsolutePath();
	    System.out.println("current path is: " + currentPath);
		
		
		//finds the wordsorttwo.dat file.
		Scanner file = new Scanner(currentPath);
		int size = 3;
		file.nextLine();
		for (int i = 0; i < size; i++) {
			String sentence = file.nextLine();
			System.out.println(sentence);
			WordSortTwo sorter = new WordSortTwo(sentence);
			sorter.sort();
			System.out.println(sorter);
		}
	}
}
