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
/*
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
 */


// Q6-> Peak Index in Mountain Array->
/*
class Mountain{
    public static void main(String[] args) {

    }
    public int peakIndexInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start < end){
         int mid = start + (end - start) / 2;

         if(arr[mid] > arr[mid + 1]){
             // you are in dec part of array
             // this may be the ans, but look at left
             // this is why end != mid - 1
             end = mid;
         } else{
             // you are in asc part of array
             start = mid + 1; // because we know that mid+1 element > mid element
         }
        }
        // in the end, start == end and pointing to the largest number becouse of the 2 checks above
        // start and end are always trying to find max element in the above 2 checks
        // hence, when they are pointing to just one  element, that os the max one because that is what the checks says
        // more elaboration : at every point of the start and end, they have the  best possible answer till that time.
        // and if we are saying that only one itme is remining, hence cuz of above line that is the best possible ans.

        return start ; // or return end as both are =.
    }
}
 */

// Q7-:  Find in Mountain Array -:
/*
class Mountain {
    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 7, 6, 4, 2};

        Mountain obj = new Mountain();
        System.out.println(obj.search(arr, 6));
    }

    int search(int[] arr, int target) {

        int peak = peakIndexInMountainArray(arr);

        int firstTry = orderAgnosticBS(arr, target, 0, peak);
        if(firstTry != -1){
            return firstTry;
        }
        return orderAgnosticBS(arr, target,peak + 1, arr.length -1);
    }

    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

     static int orderAgnosticBS(int [] arr, int target, int start, int end) {

    boolean isAsc = arr[start] < arr[end];

    while (start <= end) {
        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if(isAsc){
            if(target < arr[mid]){
                end = mid - 1;
            } else{
                start = mid + 1;
            }
        } else {
            if(target < arr[mid]){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
}
    return -1;
}
}
 */

// Q8 -:  Search in Rotated Sorted Array->

class rotatedArray{
    public static void main(String[] args) {
int [] arr = {4,5,6,7,0,1,2};
        System.out.println(findPivot(arr));
    }

    static  int search(int [] nums, int target){
        int pivot = findPivot(nums);

        // if you did not find the array ,it means the array is not rotated
        if(pivot == -1){
            // just do normal binary search
            return binarySearch(nums, target, 0,nums.length -1);
        }
        // if pivot is found, you have found 2 asc sorted array-:
        if(nums[pivot] == target){
            return pivot;
        }
        if(target >= nums[0]){
            return binarySearch(nums, target,0,pivot);
        }
        return binarySearch(nums, target,pivot + 1, nums.length -1);
    }

    static int binarySearch(int [] nums, int target , int start, int end ){
        while(start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return 0;
            }
            if (target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
          int mid = start + (end - start) / 2 ;

          // 4 case over here-:
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            if(arr[mid] <= arr[start]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
}













