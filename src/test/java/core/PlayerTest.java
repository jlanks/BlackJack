package core;
import junit.framework.TestCase;

public class PlayerTest extends TestCase {
	/*
	// testing if a players name is stored and correct. 
	
	public void test_getPlayerName() {
			// testing creating a player using constructor 
			Player Julian = new Player("Julian");
			//testing correct name is assigned and function working 
			assertEquals("Julian",Julian.getName());
		}
		
	// testing dealing a player a card
		
	public void test_Deal() {
			// making a deck
			Deck JackBlack = new Deck(false);
			// making a player
			Player Julian = new Player("Julian");
			// dealing a player the top card
			Julian.deal(JackBlack.getTopCard()); 
			//System.out.printf(Julian.getCard(0).getCardInfo()); 
			// testing ... 
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
			// creating a player
			Player Julian = new Player("Julian");
			// creating deck
			Deck JackBlack = new Deck(false);
			// dealing cards to player
			Julian.deal(JackBlack.getTopCard()); 
			Julian.deal(JackBlack.getTopCard()); 
			Julian.deal(JackBlack.getTopCard()); 
			assertEquals(3,Julian.getNumc());
			// clearing hand after cards have been added
			Julian.ClearHand(); 
			// testing
			assertEquals(0,Julian.getNumc());
			}

	// testing getting the players hand of cards

	public void test_getHC() {
			// making player
			Player Julian = new Player("Julian");
			// making deck
			Deck JackBlack = new Deck(true);
			// dealing hand to player
			Julian.deal(JackBlack.getTopCard()); 
			Julian.deal(JackBlack.getTopCard()); 
			Julian.deal(JackBlack.getTopCard()); 
			// getting the card at the third spot in array
			Julian.getCard(2);
			// printing card to console to check
			System.out.printf(Julian.getCard(2).getCardInfo()); 
			// testing 
			assertNotSame(null,Julian.getCard(2));
			}
	
	// testing getting the players total value of cards 
	
	public void test_getSum() {
			// making player
			Player Julian = new Player("Julian");
			// making deck
			Deck JackBlack = new Deck(false);
			// dealing hand to player
			Julian.deal(JackBlack.getTopCard()); 
			Julian.deal(JackBlack.getTopCard()); 
			Julian.deal(JackBlack.getTopCard()); 
			// testing
			//System.out.println(Julian.getSum());
			assertEquals(15,Julian.getSum()); 
			}
	
	// testing printing name to the console for UI
	
	public void test_printHand() {
			// making player
			Player Julian = new Player("Julian");
			// making deck
			Deck JackBlack = new Deck(false);
			// dealing hand to player
			Julian.deal(JackBlack.getTopCard()); 
			Julian.deal(JackBlack.getTopCard()); 
			Julian.deal(JackBlack.getTopCard());
			// testing printing
			Julian.showboth(false)
			Julian.showboth(true);
			// testing
			assertEquals(false, Julian.showboth(false));
			assertEquals(true, Julian.showboth(true));
			}
	
	*/
	// Dealing and winning with black jack
	public void test_winbj() {
		
		// make a deck
		Deck JackBlack = new Deck(false);
		// make player
		Player Julian = new Player("Julian");
		// make dealer
		Player Dealer = new Player("Dealer");
		
		// make a black jack hand and give to dealer but not player
		
		Card Ace = new Card(Suit.D,1);
		Card jack = new Card(Suit.D,10);
		
		Dealer.addCard_TEMP(Ace);
		Dealer.addCard_TEMP(jack);
		
		// give player the ace and 2 of clubs
		Julian.deal(JackBlack.getTopCard());
		Julian.deal(JackBlack.getTopCard());
		
		assertEquals("Dealer Wins with:\n "
				+    "Ace of D &\n "
				+    "10 of D\n",
					 Dealer.checkScore());
		
		// make a black jack hand and give to player but not dealer 
		assertEquals("Julian Wins with:\n "
				+    "Ace of D &\n "
				+    "10 of D\n",
					 Julian.checkScore());
		
		// make a black jack hand and give to dealer and player
		assertEquals("Dealer Wins with:\n "
				+    "Ace of D &\n "
				+    "10 of D\n",
					 Dealer.checkScore());
		
	}
	
	public void test_playerloop() {
		
				// make a deck
				Deck JackBlack = new Deck(true); // deck is shuffled
				// make player
				Player Julian = new Player("Julian");
				// make dealer
				Player Dealer = new Player("Dealer");
				// deals first cards and will print for the user
				 
				Dealer.gamesetup(Julian,JackBlack);
				//tests confirming each player has been delt 2 cards 
				assertEquals(2,Dealer.getNumc());
				assertEquals(2,Julian.getNumc());
				
				
		
		
		
	}
	
	public void test_dealerloop() {
		
		
	}
		

}
