
package core;



public class Card {
	
	//card # 
	private int Numb; 
	
	//card suit
	private Suit Suit; 
	
	//Card constructor 
	public Card(Suit CSuit,int CNumb ) {
		
		// Suit assignment 
		Suit = CSuit;
		// Number assignment 
		Numb = CNumb; 
		}
	// gets card number 
	public int getCNum() {
			
		return Numb; 
		}
	
	// gets card suit
	public Suit getSuit() {
		return Suit; 
		}
	
	// gets card number and suit in string format
	public String getCardInfo() {
			
		return ("Suit:" + Suit.toString() + " Number:" + Numb); 
		}
	
	// returns card information in formatted string
	public String toString() {
		
		return (Numb + " of " + Suit.toString()); 
		}
	
}
