package week05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//2. Deck Class:
		//		Create a class called Deck.
		//		Fields:  This class should have a list of Card field called cards 
		//				 that will hold all the cards in the deck. 
		//			List<Card> cards = new ArrayList<Card>(); 
		//
		//		Constructor: The constructor for the Deck Class should
		// 			instantiate all 52 standard playing cards and add them to the cards list.
		//
		//		Methods:  
		//			a.  describe() to describe the deck to the Console -- 
		//					print out all of the cards in the deck.
		//
public class Deck {
	List<Card> cards = new ArrayList<Card>();
	Deck(){
		String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
		String[] numbers= {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" , "Ace"};
		for (String suit:suits) {
			int count=2;
			for (String number:numbers) {
				Card card= new Card(number,suit,count);
				this.cards.add(card);
				count+=1;
				
			}
		}
	 
	}
	
	 public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}

	public void describe() {
		 for(Card card:this.cards) {
			 card.describe();
		 }
	  }
	
	public void shuffle() {
		Collections.shuffle(cards); 
	}
	
	public Card draw() {
		Card card=this.cards.remove(0);
		return card;
	}
}
