package Elevens;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - andrew tian

import static java.lang.System.*;
import java.awt.Color;

public class CardRunner
{
	public static void main( String args[] )
	{
		//Card one = new Card("SPADES", 9);
		//out.println(one.getSuit());
		//out.println(one.getFace());
		
		
		Card two = new Card("ace","DIAMONDS", 1);
		out.println(two);
		two.setFace(3);
		out.println(two);

		Card three = new Card("Four","CLUBS", 4);
		out.println(three);

		Card four = new Card("Queen","SPADES", 12);
		out.println(four);

		Card five = new Card("QUEEN","HEARTS", 12);
		out.println(five);
	}
}