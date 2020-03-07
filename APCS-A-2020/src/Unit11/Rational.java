package Unit11;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - andrew tian

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	//add two instance variables
	private int numerator;
	private int denominator;

	//write two constructors
	//blank rat
	public Rational() {
		numerator = 0;
		denominator = 0;
	}
	  
	//rat with 2 params (for the runner)
	public Rational (int numer, int denom)
	{
		setRational(numer,denom);
		reduce();
	}
	   
	public void setRational(int numer, int denom) {
		setNum(numer);
		setDen(denom);
	}

	//write  a set method for numerator and denominator
	public void setNum(int numer) {
		numerator = numer;
	}
	
	public void setDen(int denom) {
		//making sure there isn't a 0 denominator or else we get a maths fallacy.
		if (denom == 0) {
			denom = 1;
		}
		denominator = denom;
	}

	public Rational add (Rational addthis)
	{
		//num1/den1 + num2/den2 
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)
		
		
		//punch of print test statements
		//takes the add this, then takes the numerator, mults against denom and vice versa. Then adds together the new
		//numerators and creates a common denominator.
		
		//new denominator = (den1 * den2)
		int commonDenominator = denominator * addthis.getDenominator();
		//System.out.println("CD " + commonDenominator);
		
		//new numerator = (num1 * den2 + num2 * den1)
		int numerator1 = numerator * addthis.getDenominator();
		//System.out.println("NM1 " + numerator1);
		int numerator2 = addthis.getNumerator() * denominator;
		//System.out.println("NM2 " + numerator2);
	
		
		int sum = numerator1 + numerator2;
		setRational(sum, commonDenominator);
		reduce();
		//this one is just here to stop the return errors.
		Rational returnrat = new Rational(sum,commonDenominator);
		returnrat.reduce();
		return returnrat;
	}

	//  Reduces this rational number by dividing both the numerator by their gcd - abs difference. 
	private void reduce ()
	{
		if (numerator != 0)
		{
			int common = gcd (Math.abs(numerator), denominator);

			numerator = numerator / common;
			denominator = denominator / common;
		}
	}

	//  Computes and returns the greatest common divisor of the two
	private int gcd (int num1, int num2)
	{
		while (num1 != num2)
	    	  if (num1 > num2)
	    		  num1 = num1 - num2;
	    	  else
	    		  num2 = num2 - num1;

		return num1;
	}
	
	//simply creates a new rational with the numerator and demoninator then returns it.
	public Object clone ()
	{
		Rational Rational = new Rational (numerator,denominator);
			return Rational;
	}
	
	//ACCESSORS

	//write get methods for numerator and denominator
	   
	public int getNumerator ()
	{
		reduce();
		return numerator;
	}

	public int getDenominator ()
	{
		reduce();
		return denominator;
	}

	//equalchecker
	public boolean equals (Rational equalthis)
	{
		//checks if both their numreators and denoms are equal. In the num part they are already reduced so NTS don't put it here.
		if ( numerator == equalthis.getNumerator() && denominator == equalthis.getDenominator() ) {
			return true;
		}
		return false;
	}
	
	//implements the comparable interface
	public int compareTo(Rational other)
	{
		Rational num = (Rational) other;

		double thisValue = (double)numerator / denominator;
		double otherValue = (double)num.numerator / num.denominator;

		if (Math.abs(thisValue - otherValue) == 0)
			return 0;
		else
			if (thisValue > otherValue)
				return 1;
			else
				return -1;
	}
	
	//write  toString() method
	public String toString ()
	{
		String result;
		
		if (numerator == 0)
			result = "0";
		else
			if (denominator == 1)
				result = numerator + "";
			else
	            result = numerator + "/" + denominator;

		return result;
	}
}
