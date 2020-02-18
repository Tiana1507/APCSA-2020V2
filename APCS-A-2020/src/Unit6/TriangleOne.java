//(c) A+ Computer Science
//www.apluscompsci.com
//Name Andrew TIan
package Unit6;
import static java.lang.System.*;

public class TriangleOne
{
	private String word;

	public TriangleOne()
	{
	}

	public TriangleOne(String s)
	{
		word = s;
	}

	public void setWord(String s)
	{
		word = s;
	}

	public void print()
	{
		String test = "";
		for (int i = 0; i < word.length() + 1; i++) {
			test = test + "\n" + word.substring(0,i);
		}
		System.out.println(test);
	}
}