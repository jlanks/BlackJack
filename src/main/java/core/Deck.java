package core;


import java.util.LinkedList;
 

public class Deck {

	private LinkedList<Card> Cards = new LinkedList<Card>() ; 
	
	
	public Deck(boolean shuff) {
		
		// loops through suits
		for(int j=0;j<4;j++) {
			
				// loops through numbers
				for(int i =1;i<14;i++) {
					Card CurrentC; 
					CurrentC = new Card(Suit.values()[j],i); 
					Cards.add(CurrentC); 
					
				 }
				
				if(shuff) {};
			}
		}
	
	
	//gets card at index specified 
	
	public Card getCard(int index) {
		return Cards.get(index); 
		}
	
	// returns the size of the deck 
	public int getDeckSize() { 
		return Cards.size(); 
		}
	
	//gets and removes the top card from deck 
	public Card getTopCard() {
		return Cards.pop(); 
		
		}
	}
