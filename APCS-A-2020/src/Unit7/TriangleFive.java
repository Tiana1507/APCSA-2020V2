package Unit7;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;
import java.lang.*;

public class TriangleFive
{
 private char letter;
 private int amount;

	public TriangleFive()
	{
	}

	public TriangleFive(char c, int amt)
	{
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}

	public String toString()
	{
		int cyclecounter = amount;
		String alphabet ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int theindex = alphabet.indexOf(letter);
		while (amount > 0) {
			cyclecounter = amount;
			while (cyclecounter > 0) {
				for (int i = cyclecounter + 1; i > 0; i--) {
					//modulo in order to ensure word wrap works
					theindex = Math.abs(theindex % 26);
					System.out.print(alphabet.charAt((theindex)));
				}
				System.out.print(" ");
				cyclecounter -= 1;
				theindex += 1;
			}
			System.out.println("");
			theindex = alphabet.indexOf(letter);
			amount -= 1;
		}
		
		String output="";
		return output;
	}
}