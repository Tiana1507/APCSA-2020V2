package Elevens;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//make a Deck class
class Deck{

	public static final int NUMCARDS = 52;
	public static String[] SUITS = "CLUBS HEARTS DIAMONDS SPADES".split(" ");
	
	private List<Card> cards;
	private int top;
	private int deckSize;
	// this variable is equal to cards.size()
	
   //make a Deck constructor
   	//refer cards to new ArrayList
   	//set top to the top of the deck 51
   	
   	//loop through all suits
   		//loop through all faces 1 to 13
   			//add a new TwentyOneCard to the deck
	
	public Deck() {
		//loops through each card in deck
		String stringcardvalue = "";
		for (int count = 1; count <= NUMCARDS; count++) {
			//loops through each suit
			for (int suit = 1; suit <= 4; suit++) {
				//loops through each face
				for (int face = 1; face <= 13; face ++) {
					Card<?> DeckCard = new Card<Object>(stringcardvalue, SUITS[suit], face);
					DeckCard.setAll(stringcardvalue, SUITS[suit], face);
					cards.add(DeckCard);
				}
			}
		}
	}
	
//make a dealCard() method that returns the top card
   
	public Card<?> dealTopCard(int index) {
		return cards.get(index);
	}
	
	public Deck(String[]ranks, String[]suits, int[]pointValues) {
		cards = new ArrayList<Card>();
		
	}
	
	public boolean isEmpty() {
		return cards.size() == 0;
	}

	//method to deal Cards
	public Card<?> dealCard() {
		if (isEmpty()) {
			return null;
		}
		else {
			int topindex = cards.size() - 1;
			for (int i = topindex; i > 0; i--) {
				dealTopCard(i);
				topindex -= 1;
				top = i+1;
			}
			return cards.get(0);
		}
	}
	
	//write a shuffle() method
   	//use Collections.shuffle
   	//reset the top card
	public void shuffle() {
		for (int i = cards.size(); i <=1; i--) {
			int r = (int)Math.random()*(i);
			Collections.swap(cards,  r,  i);
		}
		deckSize = cards.size();
	}
}