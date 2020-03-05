package Elevens;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - andrew tian

public class Card<instance>
{
	public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};

	//instance variables
		private int face;
		private String suit;
		private int rank;
		private int pointValue;

  	//constructors
	public Card (String stringcardvalue, String suit, int cardFaceValue) {
		this.suit = suit;
		setFace(cardFaceValue);
		suit();
		rank();
		pointValue();
		toString();
	}

	// modifiers
		//set methods
	
	public void setAll(String stringcardvalue, String suit, int cardFaceValue) {
		this.suit = suit;
		setFace(cardFaceValue);
		suit();
		rank();
		pointValue();
	}
	
	public void setFace (int cardFaceValue) {
		face = cardFaceValue;
		pointValue = cardFaceValue;
	}

  	//accessors
		//get methods
	public String rank () {
		for (int i = 0; i < FACES.length;i++) {
			if (i==face) {
				rank = i;
				return FACES[i];
			}
		}
		return "";
	}

	public String suit () {
		return suit;
	}
	
	public int pointValue () {
		return pointValue;
	}
	
	//equals other card
	public boolean matches(Object cardcompare) {
		System.out.println(cardcompare.toString());
		System.out.println(toString());
		if (cardcompare.toString().equals(toString())) {
			return true;
		}
		return false;
	}
	
  	//toString
	public String toString() {
		String returnstring = rank() + " of " + suit + " (point value = " + pointValue + ")";
		return returnstring;
	}


}
