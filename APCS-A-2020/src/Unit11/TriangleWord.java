package Unit11;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - andrew tian

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWord
{
	//instance variables and constructors could be present, but are not necessary
		
	public static void printTriangle(String word)
	{
		String temp = "";
		for (int i1 = 0; i1 <= word.length(); i1++) {
			temp = word.substring(0,i1) + "";
			for (int i2 = 0; i2 < i1; i2++) {
				System.out.print(temp);
			}
			System.out.print("\n");
		}
	}
}
