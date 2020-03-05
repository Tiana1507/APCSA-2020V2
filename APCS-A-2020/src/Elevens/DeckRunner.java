package Elevens;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - andrew tian

import static java.lang.System.*;

public class DeckRunner
{
	public static void main( String args[] )
	{
		//create new deck
		Deck test = new Deck();
		
		System.out.println( "All cards in order." );
		for( int j = 1; j <= 52; j++ )
		{
			System.out.println( test.deal() );
		}
		
		//cal the shuffle method (do this after the deck part)
		test.shuffle();	
		
		//print out shuffled deck
		System.out.println( "\n\nAll cards after shuffling." );
		for( int j = 1; j <= 52; j++ )
		{
			System.out.println( test.deal() );
		}				
	}
}
