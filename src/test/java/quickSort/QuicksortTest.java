package quickSort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class QuicksortTest {

    @Test
    public void testQuickSortSuccess(){
        int[] arr = {10, 7, 8, 9, 1, 5};
        int[] expected = {1, 5, 7, 8, 9, 10};
        int n = arr.length;

        assertTrue("Should be equal", Arrays.equals(expected, Quicksort.sort(arr, 0, n-1)));
    }

    @Test
    public void testQuickSortEmptyArray(){
        int[] arr = {};
        int[] expected ={};
        int n = arr.length;

        assertTrue("Should be equal", Arrays.equals(expected, Quicksort.sort(arr, 0, n-1)));

    }

    @Test
    public void testQuickSortWithDuplicateValues(){
        int[] arr = {10, 10, 10, 10, 7, 8, 9, 1, 5};
        int[] expected ={1, 5, 7, 8, 9, 10, 10, 10, 10};
        int n = arr.length;

        assertTrue("Should be equal", Arrays.equals(expected, Quicksort.sort(arr, 0, n-1)));

    }

}