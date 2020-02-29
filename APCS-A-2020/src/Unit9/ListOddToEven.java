package Unit9;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	//for some reason this code started out with a go function that demanded that a boolean value was returned?
	//But the A+ guide asks to return integer, so I changed it to a public static int instead of public static boolean.
	public static int go( List<Integer> ray )
	{
		List <Integer> nums = ray;
		int returndist = 0;
		boolean startcheck = false;
	
		for (int i = 0; i < nums.size(); i++){
			if(nums.get(i) % 2 == 1 && startcheck == false) {
				startcheck = true;
				returndist = i * -1;
				break;
			}
		}
		for (int i = nums.size()-1; i > 0; i--){
			if(nums.get(i) % 2 == 0 && startcheck == true) {
				returndist = i + returndist;
				return returndist;
			}
			
		}
		return -1;
	}
}