package Unit11;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - andrew tian

public class Dog 
{
  private int age;
  private String name;
  
  public Dog(int a, String n) 
  {
  	age = a;
  	name = n;
  } 
  //test commit from new device
  	 
  public String getName()
  {
  	return name;
  }
  
  public int getAge()
  {
  	return age;
  }
  	    	
  public String toString()
  {
  	return "" + age + " " + name;
  }  
}
