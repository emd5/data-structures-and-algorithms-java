package repeatedWord;

import hashTable.HashTable;
import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.*;
import static repeatedWord.RepeatedWord.repeatedWord;

public class RepeatedWordTest {

    @Test
    public void testHappyPath(){
        assertEquals("Should return a", "a", repeatedWord("Once upon a time, there was a brave princess who"));
    }

    @Test
    public void testDuplicateWordsWithUpperCase(){
        assertEquals("Should return it", "it", repeatedWord("It was the best of times, it was the worst of times, it " +
                "was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season " +
                "of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing"));
    }

    @Test
    public void testDuplicateWordsWithCharacterAtEndOfWord(){
        assertEquals("Should return summer", "summer", repeatedWord("It was a queer, sultry summer, the summer they " +
                "electrocuted"));

    }

}
