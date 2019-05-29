/*
 * This Java source file was generated by the Gradle 'init' task.
 */

package arrayShift;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayShiftTest {

    @Test
    public void shiftArray_testEmptyArray() {
        ArrayShift arrayShiftMethod = new ArrayShift();
        int[] inputArray = new int[]{};
        int[] expectedArr = new int[]{3};

        assertArrayEquals("Test empty array",
                expectedArr,
                arrayShiftMethod.arrayShift(inputArray,3));
    }

    @Test
    public void shiftArray_testArrayWithOneValue(){
        ArrayShift arrayShiftMethod = new ArrayShift();
        int[] inputArray = new int[]{1};
        int[] expectedArr = new int[]{1,2};

        assertArrayEquals("Test an array with one value",
                expectedArr,
                arrayShiftMethod.arrayShift(inputArray,2));
    }

    @Test
    public void shiftArray_testEvenIndexArray(){
        ArrayShift arrayShiftMethod = new ArrayShift();

        int[] inputArray = new int[]{1, 2, 4, 5};
        int[] expectedArr = new int[]{1, 2, 3, 4, 5};

        assertArrayEquals("Test even indexed array",
                expectedArr,
                arrayShiftMethod.arrayShift(inputArray,3));


    }
}
