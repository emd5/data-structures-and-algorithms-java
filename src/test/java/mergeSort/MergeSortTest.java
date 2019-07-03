package mergeSort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MergeSortTest {

    //test happy path
    @Test
    public void testMergeSortWorks(){
        int[] arr= {45,12,9,20};
        int[] result= MergeSort.mergeSort(arr);
        int[] expected = {9,12,20,45};
        assertTrue("Should be equal", Arrays.equals(expected,result));
    }

    //test empty array
    @Test
    public void testMergeSortEmptyArray(){
        int[] arr= {};
        int[] result= MergeSort.mergeSort(arr);
        int[] expected = {};
        assertTrue("Should be equal", Arrays.equals(expected,result));
    }

    //Test with duplicate values
    @Test
    public void testMergeWithDuplicateValues(){
        int[] arr= {45,12,9,20,12,44,12,55,100,44};
        int[] result= MergeSort.mergeSort(arr);
        int[] expected = {9,12,12,12,20,44,44,45,55,100};
        assertTrue("Should be equal", Arrays.equals(expected,result));
    }

}