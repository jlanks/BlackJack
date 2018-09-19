package core;
import junit.framework.TestCase;

public class PlayerTest extends TestCase {
	
	// testing if a players name is stored and correct. 

		public void test_getPlayerName() {
		
			Player Julian = new Player("Julian");
			
			//testing correct name is assigned and function working 
			
			assertEquals("Julian",Julian.getName());
		
			}
		
		// testing dealing a player a card
		
		public void test_Deal() {
			// making a deck
			Deck JackBlack = new Deck(false);
			Player Julian = new Player("Julian");
			Julian.deal(JackBlack.getTopCard()); 
		
			//System.out.printf(Julian.getCard(0).getCardInfo()); 
			assertEquals("Ace",Julian.getCard(0).getCNum());
			assertEquals(51,JackBlack.getDeckSize());
			
			}
		
	// testing getting the number of cards

	
	public void test_Numcards() {
			// creating player and deck
			Player Julian = new Player("Julian");
			Deck JackBlack = new Deck(false);
			// dealing 2 cards
			Julian.deal(JackBlack.getTopCard());
			Julian.deal(JackBlack.getTopCard());
		
		
			// testing to see if player has 2 cards in hand
			assertEquals(2,Julian.getNumc());
			}
	
	// tests clearing players hand
	
	public void test_ClearHand() {
		
		Player Julian = new Player("Julian");
		Deck JackBlack = new Deck(false);
		Julian.deal(JackBlack.getTopCard()); 
		Julian.deal(JackBlack.getTopCard()); 
		Julian.deal(JackBlack.getTopCard()); 
		assertEquals(3,Julian.getNumc());
		Julian.ClearHand(); 
	
		assertEquals(0,Julian.getNumc());
	}


	
	// testing getting the players hand of cards

	public void test_getHC() {
		
		Player Julian = new Player("Julian");
		Deck JackBlack = new Deck(true);
		Julian.deal(JackBlack.getTopCard()); 
		Julian.deal(JackBlack.getTopCard()); 
		Julian.deal(JackBlack.getTopCard()); 
		
		Julian.getCard(2);  
		System.out.printf(Julian.getCard(2).getCardInfo()); 
		assertNotSame(null,Julian.getCard(2));

		}
	public void test_getSum() {
		
		
		
		
	}
	/*
	*/

}
