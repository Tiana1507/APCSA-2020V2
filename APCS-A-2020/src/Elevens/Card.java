package Elevens;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Card
{
	public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};

	//instance variables
		//String suit
		private int face;
		private String suit;
		//int face
		
		private String rank;
		private int pointValue;
		

  	//constructors
	public Card (String suit, int cardFaceValue) {
		this.suit = suit;
		setFace(cardFaceValue);
		getFace();
		getSuit();
		toString();
	}

	// modifiers
		//set methods
	public void setFace (int cardFaceValue) {
		face = cardFaceValue;
	}

  	//accessors
		//get methods
	public String getFace () {
		for (int i = 0; i < FACES.length;i++) {
			if (i==face) {
				return FACES[i];
			}
		}
		return "";
	}

	public String getSuit () {
		return suit;
	}
	
  	//toString
	public String toString() {
		String returnstring = getFace() + " of " + suit;
		return returnstring;
	}

 }