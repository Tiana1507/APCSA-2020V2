package Unit7;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - andrew tian

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
		String output = "";
		String alphabet ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char temp = alphabet.charAt(alphabet.indexOf(letter));
		for (int i = 0; i < amount; i++){
			for (int x = 0; x < (amount - i); x++){
				if (x == 0)
					temp = letter;

				else if (temp == 'Z' && x > 0)
					temp = alphabet.charAt(0);

				else
					temp++;

				for (int y = 0; y < (amount - x); y++)
					output += temp;
				output += " ";
			}
      
			output += "\n";
		}
		return output;
	}
	/*{
		int cyclecounter = 0;
		String alphabet ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int theindex = alphabet.indexOf(letter);
		while (amount > 0) {
			while (cyclecounter > 0) {
				for (int i = amount; i > cyclecounter; i--) {
					//modulo in order to ensure word wrap works
					theindex = Math.abs(theindex % 26);
					System.out.print(alphabet.charAt((theindex)));
				}
				System.out.print(" ");
				cyclecounter +=1;
				theindex += 1;
			}
			System.out.println("");
			theindex = alphabet.indexOf(letter);
			amount -= 1;
		}
		
		String output="";
		return output;
	}*/
}