//(c) A+ Computer Science
// www.apluscompsci.com
//Name - andrew tian  

package Unit7;

import static java.lang.System.*;

public class BiggestDouble
{
	private double one,two,three,four;
	
	public void setDoubles(double a, double b, double c, double d)
	{
		one = a;
		two = b;
		three = c;
		four = d;
	}

	public double getBiggest()
	{
		//one bigliest
		if ( one > two && one > three && one > four) {
			return one;
		}
		//two bigliest
		else if ( two > one && two > three && two > four) {
			return two;
		}
		//three bigliest
		else if (three > one && three > two && three > four) {
			return three;
		}
		//four bigliest
		else {
			return four;
		}
	}
	
    public void printArray() {
    	System.out.print(one);
    	System.out.print(" "+ two);
    	System.out.print(" "+ three);
    	System.out.print(" "+ four);
     }
}