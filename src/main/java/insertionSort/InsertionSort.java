package insertionSort;

public class InsertionSort {
    public static int[] insertionSort(int[] arr){

        for(int i = 1; i < arr.length; i++){
            //initial start for j at index 0
            int j = i - 1;
            int temp = arr[i];
            while( j >= 0 && temp < arr[j]){
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = temp;
        }
        return arr;
    }
}
