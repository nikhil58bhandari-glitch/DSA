import java.util.*;

// Q1-> 1920- : Build Array from Permutation-
/*
 class permutation {
     public int[] buildArray(int[] nums) {
         // create new array ans
         int [] ans = new int[nums.length];
         // loop through each index
         for(int i = 0; i < nums.length; i++){
             // do two jumps
             ans[i] = nums[nums[i]];
         }
         return ans;
     }
 }
 */

 // Q2-> 1929 -: Concatenation of Array-
/*
class concationation{
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int [] ans = new int[2 * n];
        for(int i = 0; i < nums.length; i++){
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        return ans;
    }
}
 */

// Q3-> 1480-: Running Sum of 1D Array-
/*
class runningSum{
    public int[] runningSum(int[] nums) {

        int n = nums.length;
        int [] ans = new int[n];
        ans[0] = nums[0];

        for(int i = 1; i < n; i++){
            ans[i] = ans[i - 1] + nums[i];
        }
        return ans;
    }
}
 */

//


