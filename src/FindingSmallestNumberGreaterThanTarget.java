//https://leetcode.com/problems/find-smallest-letter-greater-than-target/

import java.sql.SQLOutput;

public class FindingSmallestNumberGreaterThanTarget {

    public static void main(String[] args ){

        char[] arr = {'e','e','e','e','e','e','e','n'};
        char answer = ceiling(arr,'e');
        System.out.println(answer);


    }


    static char ceiling(char[] arr, char target){
        int start = 0 ;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end - start)/2;


//           if(target > arr[mid] || target == arr[mid]){
//                start = mid + 1;
//            }
//            else {
//                end = mid -1;


            if(target < arr[mid]){
                end = mid -1 ;
            }
            else {
                start = mid +1;
            }
        }


      return arr[start % arr.length];
    }

}
