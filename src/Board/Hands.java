package Board;

import domain.Card;
import domain.Deck;

public class Hands extends Deck {
	public int points;
	public int cardscount;
	private int spadescount;
	public boolean turn;
	public Hands hands;
	private Card collectedCards;
	
	Deck deck;
	Card card;
	public Card[] hand; 
	
	public Hands(){
		hand = new Card[3];
		for(int i = 0; i<4; i++){
			card = deck.getRandomCard();
			spadescount = card.checkSpades();
			hand[i] = card;
		}
	}
	
	public boolean turn(){
		if(turn == true){
			return true;
		}else{
			return false;
		}
	}
}
