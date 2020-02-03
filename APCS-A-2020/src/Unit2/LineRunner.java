package Unit2;
//© A+ Computer Science  -  www.apluscompsci.com
//Name - andrew tian
//Date - 2/3/2020

public class LineRunner
{
 public static void main( String[] args )
 {
	 //note to self, this is how you pull a method from another program, thats why its called a Runner file
		System.out.printf( "Slope is :: %.2f\n" , Line.getSlope( 1,9,14,2 ) );
		System.out.printf( "Slope is :: %.2f\n" , Line.getSlope( 1,7,18,3 ) );
		System.out.printf( "Slope is :: %.2f\n" , Line.getSlope( 6,4,2,2 ) );
		System.out.printf( "Slope is :: %.2f\n" , Line.getSlope( 4,4,5,3 ) );
		System.out.printf( "Slope is :: %.2f\n" , Line.getSlope( 1,1,2,9 ) );
		System.out.printf( "Slope is :: %.2f\n" , Line.getSlope( 1,7,2,9 ) );
	}
}

/*
Expected output
Slope is :: -0.54
Slope is :: -0.24
Slope is :: 0.50
Slope is :: -1.00
Slope is :: 8.00
Slope is :: 2.00

*/

/*
My output (Correct!)
Slope is :: -0.54
Slope is :: -0.24
Slope is :: 0.50
Slope is :: -1.00
Slope is :: 8.00
Slope is :: 2.00

*/