//(c) A+ Computer Science
//www.apluscompsci.com
//Name - andrew tian
//Date -

package Unit9;

import java.util.List;
import java.util.ArrayList;

public class ListDown
{
	//go() will return true if all numbers in numArray
	//are in decreasing order [31,12,6,2,1]
	public static boolean go(List<Integer> numArray)
	{
		List <Integer> nums = numArray;
			
		//checks for big lists
		if (nums.size() - 2 > 0) {
			for (int i = 1; i <= nums.size() - 2; i++){
				if(nums.get(i) > nums.get(i-1)) {
					return false;
				}
			}
			
			if(nums.get(nums.size()-1) > nums.get(nums.size()-2)) {	
				return false;
			}
				return true;
	    }
		
		//checks for small lists
		if (nums.size() - 2 <= 0) {
			return false;
		}
		return true;
	}
}