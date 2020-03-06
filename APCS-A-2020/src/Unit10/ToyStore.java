package Unit10;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
	}

	public void loadToys( String toys )
	{
		ArrayList<Toy> TOYLIST = new ArrayList<Toy>();
		String toyname = "";
		int spacecounter = 0;
		Toy addToy;
		//loops through and seperates the spaces inbetween each toy. 
		for (int i = 0; i < toys.length(); i++) {
			if (toys.charAt(i) ==' ') {
				toyname = toys.substring(i-spacecounter, i);
				addToy = new Toy(toyname);
				//print statement to check it. comment out later.
				System.out.println(toyname);
				
				TOYLIST.add(addToy);
				spacecounter = 0;
			}
			else {
				spacecounter += 1;
			}
		}
		toyList = TOYLIST;
	}
  
  	public Toy getThatToy( String nm )
  	{
  		for (Toy t : toyList) {
  			if (t.getName().equals(nm)) {
  				return t;
  			}
  		}
  		return null;
  	}
  
  	public String getMostFrequentToy()
  	{
  		ArrayList<String> uniquenames = new ArrayList<String>();
  		ArrayList<Integer> adjcounts = new ArrayList<Integer>();
  		ArrayList<Toy> copy = new ArrayList<Toy>();
  		copy = toyList;
  		int pos = 0;
  		
  		
  		for (Toy t : copy) {
  			if (t.getName() =="") {
  		
  			}
  		}
  		return"";
  		}  
  
  	public void sortToysByCount()
  	{
  	}  
  	  
	public String toString()
	{
	   return "";
	}
	
	public String myName(){
		String name = "Andrew Tian";
		System.out.println("Andrew Tian");
		return name;
	}
	
	/*
	 * * Test your Toy and ToyStore classes to work with the attached ToyStoreRunner

	* Add the following method to your ToyStore.java file:
	public String myName(){
	System.out.printLn("First Name Last Name");
	}

	* Right Click on your ToyStore.java file and Refactor-->Rename: Rename the file with your computer number.
	Ex) ToyStore1.java for computer #1.

	* Turn in your ToyStore.java file --> Right Click --> Show In --> System Explorer
	** ONLY TURN IN ToyStore.java no other files
	 */
}