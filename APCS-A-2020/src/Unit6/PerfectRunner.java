//(c) A+ Computer Science
//www.apluscompsci.com
//Name - andrew tian
package Unit6;
import static java.lang.System.*; 

public class PerfectRunner
{
	public static void main( String args[] )
	{
		//add test cases
		Perfect perfectchecker = new Perfect();
		perfectchecker.setNum(496);
		perfectchecker.isPerfect();
		System.out.println(perfectchecker.toString());
		perfectchecker.setNum(45);
		perfectchecker.isPerfect();
		System.out.println(perfectchecker.toString());
		perfectchecker.setNum(6);
		perfectchecker.isPerfect();
		System.out.println(perfectchecker.toString());
		perfectchecker.setNum(14);
		perfectchecker.isPerfect();
		System.out.println(perfectchecker.toString());
		perfectchecker.setNum(8128);
		perfectchecker.isPerfect();
		System.out.println(perfectchecker.toString());
		perfectchecker.setNum(1245);
		perfectchecker.isPerfect();
		System.out.println(perfectchecker.toString());
		perfectchecker.setNum(33);
		perfectchecker.isPerfect();
		System.out.println(perfectchecker.toString());
		perfectchecker.setNum(28);
		perfectchecker.isPerfect();
		System.out.println(perfectchecker.toString());
		perfectchecker.setNum(27);
		perfectchecker.isPerfect();
		System.out.println(perfectchecker.toString());
		perfectchecker.setNum(33550336);
		perfectchecker.isPerfect();
		System.out.println(perfectchecker.toString());
	}
}
/*
496
45
6
14
8128
1245
33
28
27
33550336
*/