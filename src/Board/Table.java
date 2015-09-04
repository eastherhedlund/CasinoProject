package Board;
import domain.Card;
import domain.Deck;

public class Table {
	Deck deck;
	Card card;
	
	Card[] table; 
	public Table(){
		table = new Card[3];
		for(int i = 0; i<4; i++){
			table[i] = deck.getRandomCard();
		} 
	}
	
	public void discard(){
		
	}
	
	public void updateTable(){
		
	}
}
