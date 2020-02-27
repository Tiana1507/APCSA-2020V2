package Unit8;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - andrew tian
//Date -

import static java.lang.System.*;

public class RaySumLast
{
	public static int go(int[] ray)
	{
		int copy = ray[ray.length-1];
		int sum = 0;
		for (int i = 0; i <= ray.length-1; i++) {
			if (ray[i] > copy) {
				sum += ray[i];
			}
		}
		if (sum == 0) {
			return -1;
		}
		return sum;
	}
}