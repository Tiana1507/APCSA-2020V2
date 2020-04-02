package Unit13;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - andrew tian

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class WordSortTwo
{
	private String[] wordRay;

	public WordSortTwo(String sentence)
	{
		//note to self: split breaks things up by the char in the ().
		//when applied to a list, each individual element is added.
		wordRay = sentence.split(" ");
		
		//old manual splitting function
		  /*int spacecounter = 0;
		  for (int i = 0; i < sentence.length(); i++) {
			  spacecounter ++;
			  if (sentence.charAt(i) == ' ') {
				  wordRay.add((sentence.substring(i-spacecounter, i)););
				  spacecounter = 0;
			  }
		  }*/
	}

	public void sort()
	{
		//"sort() method is a java.util.Arrays class method."
		Arrays.sort(wordRay);
	}

	public String toString()
	{
		String output = "";
		for (String s : wordRay) {
			output += s + "\n";
		}
		return output + "\n\n";
	}
}
