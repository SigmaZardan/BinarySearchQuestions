public class FindingFloor {

    public static void main(String[] args ){
        int[] arr = { 2,3,5 ,9,14,16,18};
        int answer = floor(arr, -23);
        if(answer < 0){
            System.out.println("There is no item less than or equal to the target.");
        }
        else{
            System.out.println(arr[answer]);
        }




    }





    static int floor(int[] arr , int target ){
        int start = 0;
        int end = arr.length -1 ;

        while(start <= end){

            int mid = start + (end - start )/2;

            if(target == arr[mid]){
                return mid;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else {
                end  = mid -1;
            }
        }


  return end;
    }
}
