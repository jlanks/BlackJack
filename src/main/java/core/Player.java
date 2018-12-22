package core;

import java.util.ArrayList;

public class Player {
	
	
	//if the player is done hitting
	
	// players name 
	private String pName; 
	
	// total of players cards
	private int CurrentTotal = 0; 
	
	// players hand
	private Hand hand; 
	
	// booleans 
	private boolean DoneTurn = false; 
	private boolean DealerStatus = false;
	
	//one line methods and constructors 
	
	// constructor 
	public Player(String Name) {
		
		// assigning players name
		pName = Name;
		// instantiating the hand 
		hand = new Hand(); 
		}
	
	public Player(String Name, boolean dealer) {
		// assigning players name
		pName = Name;
		// dealer if true
		DealerStatus = dealer;
		}
	
	// name get method
	public String getName() {
		//returning players name
		return pName; 
	}

	public void deal(Card dcard) { 
		if(hand.size() < 2) {
			hand.add(dcard);
			System.out.printf("Delt "+ pName + " " + dcard.toString() + "\n");
		}
		
		
		else if(this.hand.getSum() + dcard.getValue() == 21) {
		
			hand.add(dcard);
		    System.out.println(this.pName + "has 21 pts");
		}
		 
	}
	
	public void addCard_TEMP(Card acard) {
		
		hand.add(acard); 
	}
	
	/*
	// Dealing method
	//parameter should be popped card from main deck
	//being used. card is then added to players hand.
	//if the card makes the hand 21, set total to 21 
	//if the dealer gets a black jack, he wins
	//if the player gets a blackjack and dealer does not, player wins
	public void deal(Card dcard) { 
		if(hand.size() < 3) {
			hand.add(dcard);
		}
		if() {}
		if(this.getSum() + dcard.getValue() == 21 &&) {
			
			hand.add(dcard);
			System.out.println("");
		}
		 
		}
	
	*/
	
	
	public int getNumc() {
		
		return hand.size(); 
	}
	
	
	
	
	
	
	
	


}

 
	
	
	
	
