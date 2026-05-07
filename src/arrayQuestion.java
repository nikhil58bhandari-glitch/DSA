import java.util.*;

// Q1-> 1920- : Build Array from Permutation-

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

