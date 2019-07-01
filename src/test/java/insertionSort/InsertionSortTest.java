package insertionSort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class InsertionSortTest {

    //“Happy Path” - Expected outcome
    @Test
    public void testSuccessfulHappyPath(){
        int[] expected = new int[]{1,2,3,4,7};
        int[] numList = new int[]{4,3,2,1,7};
        InsertionSort.insertionSort(numList);
        assertTrue("Should return ordered array list",  Arrays.equals(expected,numList));
    }

    @Test
    public void testReverseArray(){
        int[] expected = new int[]{1,2,3,4,5,6,7,8,9,10};
        int[] numList = new int[]{10,9,8,7,6,5,4,3,2,1};
        InsertionSort.insertionSort(numList);
        assertTrue("Should return ordered array list",  Arrays.equals(expected,numList));
    }

    // Expected failure
    @Test
    public void testEmptyArrayInsertionSort(){
        int[] expected = new int[]{};
        int[] numList = new int[]{};
        InsertionSort.insertionSort(numList);
        assertTrue("Should return",  Arrays.equals(expected,numList));
    }

    // Edge Case (if applicable/obvious)
    @Test
    public void testArrayWithOneValue(){
        int[] expected = new int[]{1};
        int[] numList = new int[]{1};
        InsertionSort.insertionSort(numList);
        assertTrue("Should return false",  Arrays.equals(expected,numList));
    }

}