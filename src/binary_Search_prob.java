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
/*
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
 */

//  Q3->  Smallest Letter -: LEETCODE
/*
class smallestlett{
    public static void main(String[] args) {


    }
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if(target < letters[mid]){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}
*/

// Q4-> First and Last Position in Sorted Array -: LEETCODE
/*
class firstandlastPosition {
    public static void main(String[] args) {

    }

    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};

        // check for first occurrence if target first-

        int start = search(nums,target,true);
        int end  = search(nums,target,false);

        ans[0] = start;
        ans[1] = end;

        return ans;
    }

    // this function just returns the index value of target-
    int search(int[] nums, int target, boolean findStartIndex) {

        int ans =-1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // potential ans found
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
 */

// Q5-> Position of an Element in Infinite Sorted Array-:
class infiniteElement{
    public static void main(String[] args) {

        int arr [] = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(ans(arr,target));
    }
    static  int ans(int[] arr, int target) {
        // first find the range
        // first start with a box of size 2
        int start = 0;
        int end = 1;

        // condition for the target to lie in the range
        while (target > arr[end]) {
            int temp = end + 1; // this is my new start

            // double the box value
            // end = previous end + sizeofbox *2
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return searchRange(arr,target, start, end);
    }

    static int searchRange(int[] arr, int target, int start, int end){

        while(start <= end){

            int mid = start  + (end - start) / 2;

            if(target < arr[mid]){
                end = mid - 1;
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








