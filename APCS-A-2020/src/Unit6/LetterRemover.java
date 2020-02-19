//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Andrew Tian
package Unit6;
import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		//call set
	}

	//add in second constructor
	
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		//alternate solution that doesn't use a while loop.
		String toreplace = "" + lookFor;
		sentence = sentence.replaceAll(toreplace,"");
		
		/*
		int runtime = sentence.length();
		while (runtime > 1) {
			char inspectedchar = sentence.charAt(runtime - 1);
			if (inspectedchar == lookFor) {
				if (runtime == sentence.length())
					sentence = sentence.substring(0,runtime-2);
				else if (runtime == 1)
					sentence = sentence.substring(runtime,sentence.length()-1);
				else
					sentence = sentence.substring(0,runtime) + sentence.substring(runtime+1,sentence.length()-1);
			}
			runtime -= 1;
		}
		*/
		String cleaned = sentence;
		return cleaned;
	}

	public String toString()
	{
		return sentence + " - letter removed: " + lookFor;
	}
}