package core;
import junit.framework.TestCase;

public class PlayerTest {
	
	// testing if a players name is stored and correct. 

		public void test_getPlayerName() {
		
			Player Julian = new Player(Julian);
			
			//testing correct name is assigned and function working 
			
			assertEquals("Julian",Julian.getName());
		
			}
		
		// testing dealing a player a card
		
		public void test_Deal() {
			
			Player Julian = new Player(Julian);
			Julian.deal(); 
		
		
			assertEquals(1,Julian.numCards());
			
			}
		
	// testing getting the number of cards

	
	public void test_Numcards() {
			// creating player
			Player Julian = new Player(Julian);
			// dealing 2 cards
			Julian.deal();
			Julian.deal();
		
		
			// testing to see if player has 2 cards in hand
			assertEquals(2,Julian.numCards());
			}

	// tests clearing players hand
	
	public void test_ClearHand() {
		
		Player Julian = new Player(Julian);
		Julian.deal(); 
		Julian.deal(); 
		Julian.deal(); 
		
		Julian.ClearHand(); 
	
		assertEquals(0,Julian.numCards());
	}



	// testing getting the players hand of cards

	public void test_getHC() {
		
		Player Julian = new Player(Julian);
		Julian.deal(); 
		Julian.deal(); 
		Julian.deal(); 
		
		Julian.getHand().getCard(2);  
	
		assertNotSame(null,Julian.getHand().getCard(2));

		}

	

}
