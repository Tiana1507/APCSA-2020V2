package Unit7;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

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
		c = letter;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}

	public String toString()
	{
		int cyclecounter = 0;
		String alphabet ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int theindex = alphabet.indexOf(letter);
		while (amount > 0) {
			for (int i = amount; i > 0; i--) {
				System.out.print(alphabet.charAt(theindex));
			}
			System.out.print(" ");
			amount -= 1;
		}
		
		String output="";
		return output;
	}
}