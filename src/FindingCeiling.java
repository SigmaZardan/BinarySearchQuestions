public class FindingCeiling {

    public static void main(String[] args){

        // finding the ceiling of a number
        // given array is sorted in ascending order
        int[] arr ={ 2,2,5,12,13,14,16,18};
        int result = ceiling(arr,18);
        if(result < arr.length-1){
            System.out.println("There is no item greater than or equal to the target.");
        }
        else{
            System.out.println(result);
        }



    }


    static int ceiling(int[] arr, int target){

        if(target > arr[arr.length-1]){
            return -1;
        }
        int start = 0;
        int end = arr.length -1;
        while(start <= end){

            int mid = start + (end - start) / 2;

           if(target == arr[mid]){
               return mid;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                end = start -1;
           }
        }


        return start;

    }
}
