
package core;



public class Card {
	
	//card # 
	private String Numb;
	
	private int Value;
	
	//card suit
	private Suit Suit; 
	
	
	
	//Card constructor
	
	public Card(Suit CSuit,int CNumb ) {
		
		// bounds checking 
		
		if(CNumb > 13 || CNumb < 1) {
			
			System.err.println("Enter a valid card number");
			System.exit(1);
			
		}
		
		
		// Suit assignment 
		
		Suit = CSuit;
		
		// Value assignment
		
		if(CNumb < 10) {
		
			Value = CNumb;}
		
		// Number assignment 
		
		if(CNumb > 9) {
			
			Value = 10; 
		}
		if(CNumb >1||CNumb < 11) {
			Numb = Integer.toString(CNumb); 
			}
		if(CNumb > 10 || CNumb <2) {
			
			switch(CNumb) {
			case(1): Numb = "Ace"; break;
			case(11): Numb = "Jack";break;
			case(12): Numb = "Queen";break;
			case(13): Numb = "King";break;
			
			}
		} 
		
		
		
		}
	// gets card number as string
	public String getCNum() {
			
		return Numb; 
		}
	
	
	
	public int getValue() {
		
		return Value; 
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
