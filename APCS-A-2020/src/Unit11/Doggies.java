package Unit11;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - andrew tian

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		//point pups at a new aarry of Dog
		Dog[] pups = new Dog[size];
		this.pups = pups;
	}
	
	public void set(int spot, int age, String name)
	{
		pups[spot] = new Dog (age,name);
		//put a new Dog in the array at spot 
		//make sure spot is in bounds		
	}

	public String getNameOfOldest()
	{
		int oldest = 0;
		int oldestindex = 0;
		for (int i = 0; i < pups.length;i++) {
			if (pups[i].getAge() > oldest) {
				oldest = pups[i].getAge();
				oldestindex = i;
			}
		}
		return pups[oldestindex].getName();
	}

	public String getNameOfYoungest()
	{
		int youngest = 2^32-1;
		int youngestindex = 0;
		for (int i = 0; i < pups.length;i++) {
			if (pups[i].getAge() < youngest) {
				youngest = pups[i].getAge();
				youngestindex = i;
			}
		}
		return pups[youngestindex].getName();
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}
