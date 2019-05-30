package binarySearch;

public class BinarySearch {

    public boolean someBinaryMethod() {
        return true;
    }


    public int binarySearch(int[] inputArray, int inputValue) {
        int beginIndex = 0;
        int endIndex = inputArray.length - 1;

        while (beginIndex <= endIndex) {

            int middleIndex = beginIndex + (endIndex - beginIndex) / 2;

            if (inputArray[middleIndex] == inputValue) {
                return middleIndex;
            }
            else if (inputArray[middleIndex] > inputValue) {
                endIndex = middleIndex - 1;
            }
            else {
                beginIndex = middleIndex + 1;
            }
        }
        return -1;
    }
}
