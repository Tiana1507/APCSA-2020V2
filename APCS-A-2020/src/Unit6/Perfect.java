//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package Unit6;
import static java.lang.System.*;

public class Perfect
{
   private int number;

	//add constructors
   private boolean istrue;
	//add a set method
	public void setNum(int num)
	{
		number = num;
	}
   
	public boolean isPerfect()
	{
		int divisor = 1;
		int divisorsum = 0;
		while (divisorsum < number) {
			if (number % divisor == 0)
				divisorsum += divisor;
			divisor += 1;
		}
		if (divisorsum == number) {
			istrue = true;
			return true;
		}
		istrue = false;
		return false;
		
	}

	//add a toString	
	public String toString()
	{
		if (istrue == true) {
			return number + " is perfect";
		}
		else {
			return number + " is not perfect";
		}
	}
}