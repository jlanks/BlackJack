package core;

import junit.framework.TestCase;


public class BlackJackTest extends TestCase{
	//========================================
	//TESTS FOR THE CARD CLASS 
	//========================================
	/**/
	/*
	public void test_getCNum() {
		
		Card threeClubs = new Card(Suit.C,1);
		assertEquals("Ace",threeClubs.getCNum());
		}

	public void test_getSuit() {
		 
		Card threeClubs = new Card(Suit.C,3);
		if(Suit.C == threeClubs.getSuit()) 
			assertEquals("C",threeClubs.getSuit().toString());
		
		}
	
	public void test_getCardInfo() {
		
		Card threeClubs = new Card(Suit.C,3);
		assertEquals("Suit:C Number:3", threeClubs.getCardInfo()) ;
		 
		}
	
	public void test_toString() {
		
		Card threeClubs = new Card(Suit.C,1);
		assertEquals("Ace of C",threeClubs.toString()) ; 
		
		}
	//========================================
	//BIG TESTS FOR THE DECK CLASS 
	//========================================
	
	public void test_ForAllCards() {
		//Create a Deck
		
		Deck JackBlack = new Deck(false); 
		
		//First check if the size of the deck is correct
		assertEquals(52,JackBlack.getDeckSize()); 
		
		//loop that cycles through deck with checks ->
		//to see if every card of every suit is there
		
		//Contains what the Current card in the deck should be
		Card CurrentC, DeckCard; 
		
		// loops through suits 
		
		for(int j=0;j<4;j++) {
			
		// loops through numbers
			
			for(int i =1;i<14;i++) {
			
				CurrentC = new Card(Suit.values()[j],i); 
				DeckCard = JackBlack.getTopCard(); 
				
			 	assertEquals(CurrentC.getCNum(),DeckCard.getCNum()); 
			 	assertEquals(CurrentC.getSuit() ,DeckCard.getSuit());
			}
		}
		
	}
	
	
	//========================================
	//SMALLER TESTS FOR THE DECK CLASS 
	//========================================
	
	//making sure Card is being assigned correct values
	
	
	public void test_CorrectCardAssignment() {
		// i = suit      j = card number 
		int i, j;   i=1;   j=3; 
		
		Card CurrentC; 
		
		//assigning card variables 
		CurrentC = new Card(Suit.values()[i],j); 
		
		//testing assignment was a success 
		assertEquals("3",CurrentC.getCNum());
		assertEquals(Suit.H,CurrentC.getSuit());
		
	}
	
	public void test_ForFullDeck() {
		//Create a Deck
		
		Deck JackBlack = new Deck(false); 
		
		//First check if the size of the deck is correct
		assertEquals(52,JackBlack.getDeckSize()); 
	//testing to ensure decks are being created properly
	}
	
	public void test_DeckCreation() {
		
		//creating a deck, not shuffled
		Deck JackBlack = new Deck(false);
		
		Card CurrentC; 
		
		//making the 3 of clubs
		CurrentC = JackBlack.getCard(50);   
		
		//testing to see if the first card is correct 
		assertEquals("Queen",CurrentC.getCNum());
		assertEquals(Suit.S,CurrentC.getSuit());
		
		}
	
	
	// compare shuffled deck with an in order 
	// deck to see if they are the same. 
	// take different indexes and compare values. 
	*/
	public void test_Shuffle() {
		//non shuffled
		Deck JackBlack = new Deck(false);
		
		// printing non shuffled deck
		System.out.printf(JackBlack.getCard(0).getCardInfo());
		//Shuffling deck
		
		JackBlack.Shuffle();
		// deck is now shuffled
		
		
		assertNotSame(false,JackBlack); 
		
		System.out.printf(JackBlack.getCard(0).getCardInfo());
		
			
		}
	
	
	
	
	
	
	
	
	
}
