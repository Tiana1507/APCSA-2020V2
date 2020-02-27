//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  andrew tian 
package Unit7;

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples(int num)
	{
	}

	public void setNum(int num)
	{
		number = num;
	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int gcf = 0;
		if (a<b && a<c) {
			gcf = a;
		}
		if (b<a && b<c) {
			gcf= b;
		}
		if (c<a && c<b) {
			gcf = c;
		}
        for (int i = number; i > 0; i--) {
            if ((a % i == 0) && (b % i == 0)) {
                for (int j = i; j > 0; j--) {
                    if ((i % j == 0) && (c % j == 0)) {
                        return j;
                    }//end if 2
                }//end for
            }//end if 1
        }//end for
		return 1;
	}
	private boolean evenOrOdd(int a, int b) {
		//NTS return statemetns can act like if parameters with boolean stuffs
		return (((a % 2) == 1) && ((b % 2) == 0));
	}
	private String triplesChecker() {
		String gcfoutput="";
		for (int a = 1; a <= number; a++) {
            for (int b = a + 1; b <= number; b++) {
                for (int c = b + 1; c <= number; c++) {
                    if ((a*a) + (b*b) == (c*c)) {
                        if (evenOrOdd(a, b) == true || evenOrOdd(b, a) == true) {
                        	if (greatestCommonFactor(a, b, c) == 1) {
                        		gcfoutput += a + " " + b + " " + c + "\n";
                        	}//end fif
                        } //end if
                    } //end for
                } //end for
            }//end for
        } // end for
		return gcfoutput;
	}
	/*
	public String toString()
	{
		//triplecheckerfunction does it already
		return triplesChecker();
	}
	*/
}