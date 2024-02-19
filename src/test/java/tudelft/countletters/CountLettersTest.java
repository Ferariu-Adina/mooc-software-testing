package tudelft.countletters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountLettersTest {

    @Test
    public void multipleMatchingWords() {
        int words = new CountLetters().count("cats|dogs");
        Assertions.assertEquals(2, words);
    }

    @Test
    public void lastWordDoesNotMatch() {
        int words = new CountLetters().count("cats|dog");
        Assertions.assertEquals(1, words);
    }
    
    @Test
    public void oneSMatchingWord() {
        int words = new CountLetters().count("cats");
        Assertions.assertEquals(1, words);
    }
    @Test
    public void oneRMatchingWord() {
        int words = new CountLetters().count("car");
        Assertions.assertEquals(1, words);
    }
    
    @Test
    public void oneRAndOneSMatchingWords() {
        int words = new CountLetters().count("car|dogs");
        Assertions.assertEquals(2, words);
    }
    @Test
    public void oneRMatchingWordaAndOnenotMatching() {
        int words = new CountLetters().count("cats");
        Assertions.assertEquals(1, words);
    }
    
    @Test
    public void noMatchingWord() {
        int words = new CountLetters().count("cat|dog");
        Assertions.assertEquals(0, words);
    }
    

}