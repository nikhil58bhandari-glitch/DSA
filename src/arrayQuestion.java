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

// Q4-> 1470-: Shuffle the Array-
/*
class shuffleArray{
    public int[] shuffle(int[] nums, int n){

        int [] ans = new int[2 * n];
        int index = 0;

        for(int i = 0; i < n; i++ ){

            ans[index++] = nums[i];
            ans[index++] = nums[i + n];
        }
        return ans;
    }
}
 */

// Q5-> 1431-: Kids with the Greatest Number of Candies-:
/*
class candies {
    public List<Boolean> kidwithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();

        int max = candies[0];

        // find maximum candy
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }

        // check every kid
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max) {
                ans.add(true);
            } else {
                ans.add(false);
            }
        }
        return ans;
    }
}
 */

