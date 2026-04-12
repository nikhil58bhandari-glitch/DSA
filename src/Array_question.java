import java.util.Scanner;
import java.util.Arrays;

  /* // Q1-: Swaping values in array-:

 public class Array_question {
    public static void main(String[] args) {
        int [] arr = {1,3,4,5,6,7,8};
        swap(arr, 1, 3);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] =  temp;
    }
}
*/

 /*  // Q2-: Maximum values in an array-:

   public class Array_question{
       public static void main(String[] args) {
           int [] arr = {12,32,23,34,45,65,87};
           System.out.println(maxrange(arr, 1,4));
           System.out.println(max(arr));
       }

    static int maxrange(int[] arr, int start, int end){
        int maxval = arr[start];
        for(int i = start; i <= end; i++){
            if(arr[i] > maxval){
                maxval = arr[i];
            }
        }
        return maxval;
    }

       static int max(int[] arr){
           int maxval = arr[0];
       for(int i = 0; i < arr.length; i++){
           if(arr[i] > maxval){
               maxval = arr[i];
           }
       }
       return maxval;
       }
   }
   */
 /*
  // Q3-: Reversing an Array-:
   public class Array_question {
      public static void main(String[] args) {
          int[] arr = {12, 23, 34, 45, 56, 67, 78};
         // swap(arr, 0, 6);
          reverse(arr);
          System.out.println(Arrays.toString(arr));
      }

      static void reverse(int[] arr) {
          int start = 0;
          int end = arr.length - 1;

          while (start < end) {
              // swap
              swap(arr, start, end);
              start++;
              end--;
          }
      }

      static void swap(int[] arr, int index1, int index2) {
          int temp = arr[index1];
          arr[index1] = arr[index2];
          arr[index2] = temp;
      }
  }
*/

// Maximum Points You Can Obtain from Cards
class Solution {
    public int maxScore(int[] nums, int k) {
        int n = nums.length;

        int lsum = 0;
        int rsum = 0;

        // Step 1: take first k elements (all from left)
        for (int i = 0; i < k; i++) {
            lsum += nums[i];
        }

        int maxsum = lsum;

        int rindex = n - 1;

        // Step 2: move from left to right
        for (int i = k - 1; i >= 0; i--) {
            lsum -= nums[i];        // remove from left
            rsum += nums[rindex];   // add from right
            rindex--;

            maxsum = Math.max(maxsum, lsum + rsum);
        }

        return maxsum;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        int k = 3;
        System.out.println(Arrays.toString(arr));

        Solution obj = new Solution();
        System.out.println(obj.maxScore(arr, k));
    }
}
