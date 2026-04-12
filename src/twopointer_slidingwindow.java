import java.util.Arrays;
import java.util.Scanner;

 /* // Q1-: Most Consecutive ones-
// Longest subarray with at most k zeros:

class Consecutive_ones {
    public int longestOnes(int[] nums, int k) {
        int l = 0;
        int r = 0;
        int zero = 0;
        int maxLength = 0;

        // Better solution-
        while (r < nums.length) {

            // Step 1: expand window
            if (nums[r] == 0) {
                zero++;
            }

            // Step 2: shrink window if invalid
            while (zero > k) {
                if (nums[l] == 0) {
                    zero--;
                }
                l++;
            }

            // Step 3: update answer
            if (zero <= k);
            int length = r - l + 1;
            maxLength = Math.max(maxLength, length);

            // Step 4: move right pointer
            r++;
        }

        return maxLength;
    }
    // For testing
    public static void main(String[] args) {
        Consecutive_ones obj = new Consecutive_ones();

        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;

        int result = obj.longestOnes(nums, k);
        System.out.println("Max consecutive ones: " + result);
    }
}
*/

// Q2-:  Longest Substring Without Repeating Characters-

class Substring {
    public int longestNonRepeatingSubstring(String s) {

      int[] hash = new int[256];
      Arrays.fill(hash, -1);

        int n = s.length();
        int l = 0, r = 0;
        int maxlength = 0;

        while(r < n ){
            char ch = s.charAt(r);

            if(hash[ch] != -1){

                if(hash[ch] >= l){
                    l = hash[ch] + 1;
                }
            }
           int length = r - l + 1;
            maxlength = Math.max(length,maxlength);

            hash[ch] = r;
            r++;
        }
        return maxlength;
    }

    public static void main(String[] args) {
        Substring obj = new Substring();

        String str = "aaabbbccc";
        System.out.println(obj.longestNonRepeatingSubstring(str));
    }
}

