package Unit9;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListSumFirst
{
	public static int go(List<Integer> ray)
	{
		List <Integer> nums = ray;
		int returnsum = 0;
		
		//checks for big lists
		if (nums.size() > 2) {
			for (int i = 1; i < nums.size(); i++){
				if(nums.get(0) < nums.get(i)) {
					returnsum += nums.get(i);
				}
			}
		}
		else {
			return -1;
		}
		if (returnsum != 0) {
			return returnsum;
		}
		else{
			return -1;
		}
	}
}