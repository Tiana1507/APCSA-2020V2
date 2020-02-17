//(c) A+ Computer Science
//www.apluscompsci.com
//Name Andrew Tian
package Unit6;
import static java.lang.System.*;

public class Word
{
	private String word;

	public Word()
	{
	}

	public Word(String s)
	{
	}

	public void setString(String s)
	{
		word = s;
	}

	public char getFirstChar()
	{
		return word.charAt(0);
	}

	public char getLastChar()
	{
		//System.out.println(word.length());
		if (word.length() == 1)
			return word.charAt(0);
		return word.charAt(word.length()-1);
	}

	public String getBackWards()
	{
		int runcounter = word.length();
		String back="";
		while (runcounter > 0) {
			back = back + word.charAt(runcounter - 1);
			runcounter -= 1;
		}
		return back;
	}

 	public String toString()
 	{
 		return word;
	}
}