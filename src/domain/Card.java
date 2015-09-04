package domain;
/**
 * 
 * @author Selma
 *
 */
public class Card{
	  private Suits suits;
	  private Rank rank;
	  private int spadescount;
	 
	  public Card (Rank rank, Suits suits){
	    this.rank = rank;
	    this.suits = suits;
	  }
	 
	  public Suits getSuits(){
	    return suits;
	  }
	 
	  public Rank getRank(){
	    return rank;
	  }
	  
	  public int checkSpades(){
			if(getSuits().equals(Suits.SPADES));
			spadescount++; return spadescount;
		}
	  
}