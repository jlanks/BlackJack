package core;

import junit.framework.TestCase;

public class BlackJackTest extends TestCase{
	
	public void test_getCNum() {
		
		Card threeClubs = new Card(C,3);
		assertEquals("3",threeClubs.getCNum());
		}

	public void test_getSuit() {
		
		Card threeClubs = new Card(C,3);
		assertEquals("C",threeClubs.getSuit());
		}
	
	public void test_getCardInfo() {
		
		Card threeClubs = new Card();
		assertEquals("Suit:Clubs Number:3",threeClubs.getCardInfo());
		}
	public void test_toString() {
		
		Card threeClubs = new Card();
		assertEquals("3 of Clubs",threeClubs.toString());
		}
}
