package tudelft.ghappy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GHappyTest {
	
	@Test
	public void onlyOneG() {
		GHappy ghappy = new GHappy();
		boolean result = ghappy.gHappy("xxgxx");
		assertEquals(false, result);
	}
	
	@Test
	public void twoG() {
		GHappy ghappy = new GHappy();
		boolean result = ghappy.gHappy("xxggxx");
		assertEquals(true, result);
	}
	
	@Test
	public void oneHappyGandoneNot() {
		GHappy ghappy = new GHappy();
		boolean result = ghappy.gHappy("xxggyygxx");
		assertEquals(false, result);
	}
	@Test
	public void twoHappyG() {
		GHappy ghappy = new GHappy();
		boolean result = ghappy.gHappy("xxggxxgg");
		assertEquals(true, result);
	}
}
