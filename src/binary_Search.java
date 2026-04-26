import java.util.*;
/*
 1-> find the middle element
 2-> if target > mid => search in the right, else search in left
 3-> if middle element == target element == ans
 // Total comparisons in the worst case = O(logN)
  */

public class binary_Search {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,7,8};
        int target = 5;

        System.out.println(binarySearch(arr,target));
    }

    // return the index:
    static  int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        while(start <= end){
            // find the middle element
            // int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start  + (end - start) / 2;

            if(target < arr[mid]){
                end = mid -1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                // ans found
                return mid;
            }
        }
        return -1;
    }
}
