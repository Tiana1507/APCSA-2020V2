package Elevens;
package Elevens;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - andrew tian

public class BlackJackCard extends Card
{
  	//constructors
  	public BlackJackCard( String s, int f)
  	{
  		super( s, f );
  	}

  	//accessors
	public int getValue()
	{
		Card boomer = new Card("SPADES", 9);
		if(boomer.face() == 1 )
			return 11;
		if(boomer.face() >= 10 )
			return 10;
		return boomer.face();
	}

  	//toString
  	public String toString()
  	{
  		return super.toString() + " " + getValue();
  	}
 }
