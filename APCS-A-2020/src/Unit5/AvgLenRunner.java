package Unit5;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - andrew tian
//Date -

public class AvgLenRunner
{
	public static void main( String args[] )
	{
		AvgLen s = new AvgLen();
		
		System.out.println( s.go( "dog", "cats" ) ) ;
		System.out.println( s.go( "aplus", "pigs" ) ) ;
		System.out.println( s.go( "catgiraffe", "apluscompsci" ) ) ;
		System.out.println( s.go( "ap", "aplus" ) ) ;
		System.out.println( s.go( "pluscat", "dogsaplus" ) ) ;
		System.out.println( s.go( "#", "#" ) ) ;
		System.out.println( s.go( "aplusdog#13337#", "pigaplusprogram" ) ) ;
		System.out.println( s.go( "code", "code1234" ) ) ;
		System.out.println( s.go( "wow", "eplus" ) ) ;
		System.out.println( s.go( "catsand" , "aplusdogsaplus" ) ) ;
		System.out.println( s.go( "7", "77777" ) ) ;
	/* SAMPLE OUTPUT - TRUE!
3.5
4.5
11.0
3.5
8.0
1.0
15.0
6.0
4.0
10.5
3.0	
	 */
		
		
	}
}