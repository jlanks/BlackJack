package core;

import junit.framework.TestCase;

public class BlackJackTest extends TestCase{
	
	public void test_getCNum() {
		
		Card threeClubs = new Card(Suit.C,3);
		assertEquals(3,threeClubs.getCNum());
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
		
		Card threeClubs = new Card(Suit.C,3);
		assertEquals("3 of C",threeClubs.toString()) ; 
		
		}
}
