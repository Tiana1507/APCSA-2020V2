package DataLab;
import static java.lang.System.*;

public class Cereal {
	
	
	//variables etc
	private int protein;
	private int carbs;
	private String name;

	
	
	public Cereal()
	{
		
	}

	
	//constructors
	public Cereal (String n, int c, int p)
	{
		setCarbs(c);
		setProtein(p);
		setName(n);
	}
	
	
	//carbs
	public int getCarbs()
	{
		return carbs;
	}
		
	public void setCarbs( int c )
	{
		carbs = c;
	}
	
	
	//proteins
	public int getProtein()
	{
		return protein;
	}
	
	public void setProtein( int p) {
		protein = p;
	}

	public String getName()
	{
		return name;
	}
		
	public void setName( String n )
	{
		name = n;
	}
	
	public String toString()
	{
	   return "Cereal: " + name + ", Protein: " + protein + "carbs: " + carbs;
	}
}
