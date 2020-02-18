//(c) A+ Computer Science
//www.apluscompsci.com
//Name
package Unit6;
import static java.lang.System.*;

public class TriangleOneRunner
{
	/*
	hippo
	abcd
	it
	a
	chicken
	*/
	public static void main ( String[] args )
	{
		TriangleOne trianglemaker = new TriangleOne();
		trianglemaker.setWord("hippo");
		trianglemaker.print();
		trianglemaker.setWord("abcd");
		trianglemaker.print();
		trianglemaker.setWord("it");
		trianglemaker.print();
		trianglemaker.setWord("a");
		trianglemaker.print();
		trianglemaker.setWord("chicken");
		trianglemaker.print();
	}
}