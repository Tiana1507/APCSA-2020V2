package Unit5;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Andrew Tian
//Date -

public class VowelRunner
{
	public static void main( String args[] )
	{
		FirstLastVowel s = new FirstLastVowel();
			
		System.out.println(  s.go(  "dog#cat#pigaplus")    );
		System.out.println(  s.go(  "pigs#apluscompsci#food")    );
		System.out.println(  s.go(  "##catgiraffeapluscompsci")    );
		System.out.println(  s.go(  "apluscatsanddogsaplus###")    );
		System.out.println(  s.go(  "##")    );
		System.out.println(  s.go(  "aplusdog#13337#pigaplusprogram")    );
		System.out.println(  s.go(  "code#H00P#code1234")    );
		System.out.println(  s.go(  "##wowgira77##eplus")    );
		System.out.println(  s.go(  "catsandaplusdogsaplus###")    );
		System.out.println(  s.go(  "7")    );

	}
}

/* desired output
 * no
no
yes
yes
no
yes
no
no
no
no
*/

/* MY output (GOT IT)
no
no
yes
yes
no
yes
no
no
no
no
*/
