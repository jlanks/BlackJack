package core;

import static org.junit.Assert.*;

import org.junit.Test;

public class HandTest {

	//@Test
	public void Add_Remove_Test() {
		
		Hand hand = new Hand(); 
		
		Card c1 = new Card(Suit.C,1);
		Card c2 = new Card(Suit.D,4);
		
		hand.add(c1);
		hand.add(c2);
		
		assertEquals(2,hand.size());
		
		System.out.println(hand.toString());
		
		hand.remove(0); 
		assertEquals(1,hand.size());
	}
	
	@Test
	public void Check_Sum_Test() {
		
		Hand hand = new Hand(); 
		
		Card c1 = new Card(Suit.C,10);
		Card c2 = new Card(Suit.D,10);
		Card c3 = new Card(Suit.D,1);
		
		hand.add(c1);
		hand.add(c2);
		hand.add(c3);
		hand.add(c3);
		
		assertEquals(4,hand.size());
		assertEquals(2,hand.containsAce());
		assertEquals(22,hand.getSum());
		System.out.println(hand.toString());
		
		
		
	}
	
	@Test
	public void Indexof_Test() {
		
		Hand hand = new Hand(); 
		
		Card c1 = new Card(Suit.C,10);
		Card c2 = new Card(Suit.D,10);
		Card c3 = new Card(Suit.D,1);
		
		hand.add(c1);
		hand.add(c2);
		hand.add(c3);
		hand.add(c3);
		
		assertEquals(4,hand.size());
		assertEquals(2,hand.indexOfAce().length);
		assertEquals(22,hand.getSum());
		System.out.println(hand.toString());
		
		
		
	}

}
