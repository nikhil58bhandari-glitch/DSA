import java.util.*;

// Q1-: Ceiling of a Number->
/*
// ceiling -: smallest element  on array greater or equal to target
 class binary_Search_prob {
    public static void main(String[] args) {

        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        System.out.println(ceilingnum(arr,target));

    }

    static int ceilingnum(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            }
            if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return start;
    }
}
 */

// Q2-> floor of a Number-:
// floor -: greatest number less than equal to target

 class floor{
    public static void main(String[] args) {
        int [] arr = {2,3,5,7,9,12,25,26,28,30};
        int target = 24;

        System.out.println(floornumb(arr, target));
    }
    static int floornumb(int [] arr, int target){
        int start = 0;
        int end   = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return end;
    }
}


