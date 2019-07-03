package mergeSort;

public class MergeSort {

        public static void main(String[] args){

            int[] arr= {45,12,9,20};
            for(int a: arr){
                System.out.println(a);
            }
            System.out.println("==================");
            int[] res= mergeSort(arr);
            for(int a: res){
                System.out.println(a);
            }
        }


        public static int[] mergeSort(int[] arr){
            return  sortArr(arr,0,arr.length-1);
        }

        private static int[] sortArr(int[] arr,int left,int right){
            if(left>=right)return  arr;

            int mid=(left+right)/2;
            sortArr(arr,left,mid);
            sortArr(arr,mid+1,right);
            return  merge(arr,left,mid,right);

        }

        private static int[] merge(int[] arr, int left, int mid, int right){
            int[] tmp = new int[arr.length];
            int r1 = mid + 1;
            int tIndex = left;
            int cIndex=left;

            while(left <=mid && r1 <= right) {
                if (arr[left] <= arr[r1])
                    tmp[tIndex++] = arr[left++];
                else
                    tmp[tIndex++] = arr[r1++];
            }

            while (left <=mid) {
                tmp[tIndex++] = arr[left++];
            }

            while ( r1 <= right ) {
                tmp[tIndex++] = arr[r1++];
            }
            while(cIndex<=right){
                arr[cIndex]=tmp[cIndex];
                cIndex++;
            }
            return arr;
        }
}



