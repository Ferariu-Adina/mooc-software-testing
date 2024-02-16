package tudelft.caesarshift;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CaesarShiftCipherTest {
	
	@Test
	public void stringAndPositiveShift() {
		CaesarShiftCipher chiper = new CaesarShiftCipher();
		String result = chiper.caesarShiftCipher("abc", 3);
		assertEquals("def", result);
	}
	
	@Test
	public void stringAndNegativeShift() {
		CaesarShiftCipher chiper = new CaesarShiftCipher();
		String result = chiper.caesarShiftCipher("abc", -3);
		assertEquals("xyz", result);
	}
	
	@Test
	public void endStringAndPositiveShift() {
		CaesarShiftCipher chiper = new CaesarShiftCipher();
		String result = chiper.caesarShiftCipher("xyz", 3);
		assertEquals("abc", result);
	}
	
	@Test
	public void endStringAndNegativeShift() {
		CaesarShiftCipher chiper = new CaesarShiftCipher();
		String result = chiper.caesarShiftCipher("xyz", -3);
		assertEquals("uvw", result);
	}

}
