package tudelft.chocolate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ChocolateBagsBeforeBoundaryTest {
   @Test
   public void totalIsTooBig() {
	   ChocolateBags bags = new ChocolateBags();
	   int result = bags.calculate(1, 1, 10);
	   Assertions.assertEquals(-1, result);
   }
   
   @Test
   public void onlyBigBars() {
	   ChocolateBags bags = new ChocolateBags();
	   int result = bags.calculate(3, 3, 10);
	   Assertions.assertEquals(0, result);
   }
   
   @Test
   public void smallAndBigBars() {
	   ChocolateBags bags = new ChocolateBags();
	   int result = bags.calculate(2, 3, 17);
	   Assertions.assertEquals(2, result);
   }
   
   @Test
   public void onlySmallBars() {
	   ChocolateBags bags = new ChocolateBags();
	   int result = bags.calculate(3, 3, 3);
	   Assertions.assertEquals(3, result);
   }
   
}
