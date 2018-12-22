package core;

import java.util.LinkedList;

public class Hand {
	
	// hand of a player
	LinkedList<Card>  hand; 
	
	public Hand() {
		hand = new LinkedList<Card>();	
	}
	
	public void add(Card c) {
		
		hand.add(c); 
	}
	
	public int size() {
		
		return this.hand.size();
	}
	
	public Card remove(int i) {
		
		return this.hand.remove(i); 
	}
	
	public String toString() {
		String temp = ""; 
		for(Card c:hand) {
			temp += c.toString() + "\n"; 
		}
		return temp; 
				
	}
	public int containsAce() {
		int total = 0; 
		for(Card c: this.hand) {
			if(c.getValue() == 1) {
				total += 1; 
			}
		}
		
		return total; 
	}
	
	public int[] indexOfAce() {
		int size = this.containsAce();
		if(size == 0)
			return null; 
		int[] indexes = new int[size];  
		if(size)
		
		
		return indexes; 
		
	}
	
	// ****** need to account for jacks values being either 1 or 11
	// ****** finish index return 		
	public int getSum() {
			
			int total = 0; 
			
			
			
			for(Card c: this.hand) {
				
				total += c.getValue(); 
			}
			
			
			return total; 
	}

}
