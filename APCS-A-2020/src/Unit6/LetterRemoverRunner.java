//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Andrew Tian
package Unit6;
import static java.lang.System.*;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		LetterRemover cleaner = new LetterRemover();
		cleaner.setRemover("I am Sam I am", 'a');
		cleaner.removeLetters();
		System.out.println(cleaner.toString());
		cleaner.setRemover("ssssssssxssssesssssesss", 's');
		cleaner.removeLetters();
		System.out.println(cleaner.toString());
		cleaner.setRemover("qwertyqwertyqwerty ", 'a');
		cleaner.removeLetters();
		System.out.println(cleaner.toString());
		cleaner.setRemover("abababababa ", 'b');
		cleaner.removeLetters();
		System.out.println(cleaner.toString());
		cleaner.setRemover("abaababababa ", 'x');
		cleaner.removeLetters();
		System.out.println(cleaner.toString());
	}
}

/*
TEST CASES
I am Sam I am        a
ssssssssxssssesssssesss           s
qwertyqwertyqwerty           a
abababababa         b
abaababababa        x
*/