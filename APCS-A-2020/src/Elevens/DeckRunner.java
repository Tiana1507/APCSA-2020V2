package Elevens;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - andrew tian

import static java.lang.System.*;

import java.lang.reflect.Array;

public class DeckRunner
{
	public static void main( String args[] )
	{
		//create new deck
		Deck test = new Deck();
		
		System.out.println( "All cards in order." );
		for( int i = 1; i <= 52; i++ )
		{
//<<<<<<< HEAD
			System.out.println( test.dealCard(i) );
//=======
			System.out.println( test.deal() );
//>>>>>>> branch 'master' of https://github.com/Tiana1507/APCSA-2020V2.git
		}
		
		System.out.println("shuffling...");
		//call the shuffle method (do this after the deck part)
		test.shuffle();	
		
		//test bit delete later
		//System.out.println("reach here");
		
		//print out shuffled deck
		System.out.println( "\n\nAll cards after shuffling." );
		for( int i = 1; i <= 52; i++ )
		{
//<<<<<<< HEAD
			System.out.println( test.dealCard(i) );
//=======
//>>>>>>> branch 'master' of https://github.com/Tiana1507/APCSA-2020V2.git
		}				
	}
}
