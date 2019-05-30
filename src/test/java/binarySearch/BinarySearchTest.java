package binarySearch;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test
    public void testSomeBinaryMethod() {
        BinarySearch classUnderTest = new BinarySearch();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someBinaryMethod());
    }

    @Test
    public void testBinarySearchWithValue() {
        BinarySearch binarySearchClass = new BinarySearch();

        int[] inputArray = new int[]{22, 33, 44, 55, 66, 77, 88, 99};

        assertTrue("Returns the 3rd index in the array.",
                binarySearchClass.binarySearch(inputArray, 55) == 3);
    }

    @Test
    public void testBinarySearchWithNoValue(){
        BinarySearch binarySearchClass = new BinarySearch();
        int[] inputArray = new int[]{22, 33, 44, 55, 66, 77, 88, 99};

        assertTrue("Returns the -1 in the array.",
                binarySearchClass.binarySearch(inputArray, 85) == -1);

    }
}
