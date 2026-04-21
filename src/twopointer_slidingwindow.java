import java.util.Arrays;
import java.util.Scanner;
import java.util.HashMap;

  // Q1-: Most Consecutive ones-
// Longest subarray with at most k zeros:
/*
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
/*
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
 */

// Q3-: Fruit into Baskets-:
              // max length subarray with at most 2 type of numbers-
/*
class fruit_basket {
    public int totalFruits(int[] fruits, int k) {
        int l = 0 , r = 0;
        int maxlength = 0;
       HashMap<Integer, Integer> map = new HashMap<>();

        while(r < fruits.length) {
            // add current fruit
            map.put(fruits[r], map.getOrDefault(fruits[r], 0) + 1);

        if(map.size() > k) {
            while (map.size() > k) {
                map.put(fruits[l], map.get(fruits[l]) - 1);

                if (map.get(fruits[l]) == 0) {
                    map.remove(fruits[l]);
                }
                l++;
            }
        }
            if (map.size() <= k){
                maxlength = Math.max(maxlength , r - l + 1);
            }
            r++;
            }
            return maxlength;
        }

    public static void main(String[] args) {
        int [] fruit = {1,2,3,2,2};
        int k = 2;
        fruit_basket obj = new fruit_basket();
        System.out.println(obj.totalFruits(fruit, k));
    }
    }
*/

// Q4-: Longest Substring with at most k Distinct Characters
/*
class substring{
    public int kDistinctChar(String s, int k) {
        int l = 0, r = 0;
        int maxlength = 0;
         HashMap<Character, Integer> map = new HashMap<>();

        while (r < s.length()) {

            // add character
            char ch = s.charAt(r);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            // shrink window
           // while(map.size() > k){  // for better solution
                if(map.size() > k){   // for optimal solution

                char leftChar = s.charAt(l);
                map.put(leftChar, map.get(leftChar) - 1);

                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }
                    l++;
                }
            // update answer
            if(map.size() <= k) {
                maxlength = Math.max(maxlength, r - l + 1);
            }
                r++;
        }
        return maxlength;
    }

    public static void main(String[] args) {
       String s = "aababbcaacc";
       int k = 2;


        substring obj = new substring();
        System.out.println(obj.kDistinctChar(s, k));
    }
    }
*/

// Q5-: Number of Substrings Containing All Three Characters-:
/*
class SubstringABC {

    public int numberOfSubstrings(String s) {
        int[] count = new int[3]; // index 0 -> 'a', 1 -> 'b', 2 -> 'c'
        int l = 0, r = 0;
        int ans = 0;
        int n = s.length();

        while (r < n) {

            // add current character
            count[s.charAt(r) - 'a']++;

            // check if window contains a, b, c
            while (count[0] > 0 && count[1] > 0 && count[2] > 0) {

                // count all substrings starting from l
                ans += (n - r);

                // shrink window
                count[s.charAt(l) - 'a']--;
                l++;
            }

            r++;
        }

        return ans;
    }

    public static void main(String[] args) {
        String s = "abcabc";

        SubstringABC obj = new SubstringABC();
        System.out.println(obj.numberOfSubstrings(s)); // Output: 10
    }
}
*/

// Q6-: Longest Repeating Character Replacement-
/*
class LongestRepeatingChar {

    public int characterReplacement(String s, int k) {
        int[] count = new int[26]; // for A-Z
        int l = 0, r = 0;
        int maxFreq = 0;
        int maxLength = 0;

        while (r < s.length()) {

            // add current character
            count[s.charAt(r) - 'A']++;

            // track most frequent character
            maxFreq = Math.max(maxFreq, count[s.charAt(r) - 'A']);

            // if window is invalid → shrink
            while ((r - l + 1) - maxFreq > k) {
                count[s.charAt(l) - 'A']--;
                l++;
            }

            // update answer
            maxLength = Math.max(maxLength, r - l + 1);

            r++;
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;

        LongestRepeatingChar obj = new LongestRepeatingChar();
        System.out.println(obj.characterReplacement(s, k)); // Output: 4
    }
}
 */


// Q7-:  Binary Subarrays With Sum / Count subarray sum equals k

class BinarySubarray {
    public int atMost(int[] nums, int goal) {

        if(goal < 0) return 0;

        int l = 0;
        int sum = 0;
        int count = 0;

        for (int r = 0; r < nums.length; r++) {
        //    sum  += nums[r];
            sum +=  (nums[r] % 2);

            while(sum > goal){
                sum = sum - (nums[l] % 2);
                l = l+1;
            }
            count = count + (r - l + 1);
        }
        return count;
    }

    public int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums, goal) - atMost(nums, goal - 1);

    }
    public static void main(String[] args) {
    //    int [] nums = {1, 1, 0, 1, 0, 0, 1};
        int [] nums = {1, 1, 2, 1, 1};
        int goal = 3;

        BinarySubarray obj = new BinarySubarray();
        System.out.println(obj.numSubarraysWithSum(nums, goal));
    }
}