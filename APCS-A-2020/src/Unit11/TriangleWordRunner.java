package Unit11;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - andrew tian

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWordRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
	 	String choice="";
			do{
				out.print("\nEnter a word :: ");
				String word = keyboard.next();
				
				TriangleWord printer = new TriangleWord();
				
				printer.printTriangle(word);

				System.out.print("\nDo you want to enter more sample input? ");
				choice=keyboard.next();			
			}while(choice.equals("Y")||choice.equals("y"));		
		}	
}
