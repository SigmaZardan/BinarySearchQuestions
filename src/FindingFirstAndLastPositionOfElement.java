//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

import java.util.Arrays;

public class FindingFirstAndLastPositionOfElement {

    public static void main(String[] args) {

        int[] arr = {7,7,7,7,7,7,7,8,8,10};
        int[] answer = findFirstAndLastPosition(arr,7 );
        System.out.println(Arrays.toString(answer));
    }

    static int[] findFirstAndLastPosition(int[] numbers, int target) {

       int start = 0;
       int end = numbers.length -1 ;

      int firstPosition = search(numbers, target,true);
      int secondPosition = search(numbers, target, false);


       return new int[] { firstPosition, secondPosition};
    }

    static int search(int[] numbers,int target, boolean searchFirstPosition){

        int start = 0;
        int end = numbers.length -1;
        int ans = -1;

        while(start <= end ){

            int mid = start + (end - start) /2 ;
            if(target < numbers[mid]){
                end = mid -1;
            }
            else if(target > numbers[mid]){
                start = mid +1;
            }
            else {
                ans = mid;
                if(searchFirstPosition){
                    end = mid -1;
                }
                else {
                    start = mid +1;
                }

            }



        }

   return ans ;

    }


}
