package Unit8;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - andrew tian
//Date -

import static java.lang.System.*;
public class RayOddToEven
{
	public static int go(int[] ray)
	{
		for(int i = 0; i <= ray.length-1; i++) {
			if (ray[i]%2 == 1) {
				for (int j = i; j <= ray.length-1; j++) {
					if (ray[j]%2 == 0) {
						return j-i;
					}//end if
				}//end for
				return -1;
			}//end if
		}//end for
		return -1;
	}//end method
}//end class