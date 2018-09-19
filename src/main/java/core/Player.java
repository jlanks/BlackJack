package core;

import java.util.ArrayList;

public class Player {
	
	// players name 
	private String pName; 
	
	// players hand
	private ArrayList<Card> hand = new ArrayList<Card>(); 
	//one line methods and constructors 
	public Player(String Name) {
		pName = Name;
		
		}
	public String getName() {
		return pName; 
	}
	public void deal(Card dcard) { 
		hand.add(dcard); 
		
		
		
		
		
	}
	public int getNumc() {
		return hand.size(); 
	}
	public void ClearHand() {
		hand.clear();
	}
	public Card getCard(int i) {

		return hand.get(i); 
	}

}
