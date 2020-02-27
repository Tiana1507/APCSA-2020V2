package Elevens;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

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
		if(boomer.getFace() == 1 )
			return 11;
		if(boomer.getFace() >= 10 )
			return 10;
		return boomer.getFace();
		return 0;
	}

  	//toString
  	public String toString()
  	{
  		return super.toString() + " " + getValue();
  	}
 }