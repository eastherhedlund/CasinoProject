package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Deck {
	private ArrayList deck;

	public Deck (){
		this.deck = new ArrayList();
		for (int i=0; i<=12; i++){
			for (int j=0; j<=3; j++){
				Rank rank = Rank.values()[i];
				Suits suits = Suits.values()[j];
				Card card = new Card(rank, suits);
				this.deck.add(card);
			}
		}	
	}
	public void shuffleDeck(){
		Collections.shuffle(deck);
	}
	public Card getRandomCard(){
		Iterator cardIterator = deck.iterator();
		Card aCard = null;
		while (cardIterator.hasNext()){
			aCard = (Card) cardIterator.next();
		}
		return aCard;
	}
}
