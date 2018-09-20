package core;

import java.util.ArrayList;

public class Player {
	
	// players name 
	private String pName; 
	// total of players cards
	private int CurrentTotal = 0; 
	// players hand
	private ArrayList<Card> hand = new ArrayList<Card>(); 
	//one line methods and constructors 
	
	// constructor 
	public Player(String Name) {
		// assigning players name
		pName = Name;
		}
	
	// name get method
	public String getName() {
		//returning players name
		return pName; 
	}

	public void deal(Card dcard) { 
		if(hand.size() < 3) {
			hand.add(dcard);
			System.out.printf("Delt "+ pName + " " + dcard.toString());
		}
		
		//if() {}
		//if(this.getSum() + dcard.getValue() == 21 &&) {
			
		//	hand.add(dcard);
			//System.out.println("");
		//}
		 
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
	public void ClearHand() {
		hand.clear();
	}
	public Card getCard(int i) {

		return hand.get(i); 
	}
	public int getSum() {
		int total = 0;
		int size = hand.size(); 
		int sizenm = 0; 
		
		while(size > sizenm) {
			
			if(hand.get(sizenm).getValue() == 1 && total + 11 <22) {
				total += 11;
				sizenm ++; 
			}else if(hand.get(sizenm).getValue() == 1 && total + 11 >21) {
				total+=1;
				sizenm ++; 
				 }
			
			total += hand.get(sizenm).getValue(); 
			
			//System.out.println(total);
			sizenm ++;
			
			}
		 CurrentTotal = total; 
		 return total; 
		}
	}
	
	
	
	
