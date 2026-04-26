import java.util.*;

// Q1-: Search in Range ->
/*
 class Linearsearch_prob {
     public static void main(String[] args) {

         int [] arr = {12,22,42,54,65,76,86,63,36};
         int k = 63;
         System.out.println(SearchInRange(arr, k, 2,7));
     }

     static int SearchInRange(int [] arr, int k, int start, int end){
         if (arr.length == 0){
             return -1;
         }
         for(int i = start; i <= end; i++){
             if(arr[i] == k){
                 return i;
             }
         }
         return -1;
     }
}
*/

// Q2-: Minimum Number ->
/*
class linearSearch{
    public static void main(String[] args) {

        int[] arr = {2,-2,-5,5,4,-1,6,-7,-4};
        System.out.println(min(arr));
    }

    // Assume arr.length != 0
    // return the minimum value in the array

    static int min(int [] arr){
        if (arr.length == 0) return -1;

        int ans = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;

    }
}
 */

// Q3-: Search in 2D Arrays ->
/*
class Search{
    public static void main(String[] args) {

        int [][] arr = {
                {23,54,52},
                {32,1,58,75,5},
                {76,42}
        };
        int target = 42;
        int [] ans = SearchIn2Darray(arr, target); // format of return value {row ,col}
        System.out.println(Arrays.toString(ans));
    }

    static int[] SearchIn2Darray(int [][] arr, int target){
        if(arr.length == 0) return new int[] {-1,-1};

        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){

                if(arr[row][col] == target){
                    return new int[] {row, col};
                }
            }
        }
 return new int []{-1,-1};
    }
}
 */

// Q4-: Give an array nums of integers, return how many of them contain an even number of digits.
/*
class evenDigit {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums));
        System.out.println(digits(-54432));
    }

    static int findNumbers(int[] nums) {

        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    // function to check whether a numbers contains even digit or not
    static boolean even(int num) {
        int numbersOfDigit = digits(num);
        /*
        if(numbersOfDigit % 2 == 0){
        return true;
        }
        return false;
         */
/*
        return numbersOfDigit % 2 == 0;
    }

    // count numbers of digit in the numbers

    static int digit2(int num){
    if(num < 0){
    num = num * -1;
    }
    return (int)(Math.log10(num)) + 1;
    }

    static int digits(int num) {

        if(num < 0){
            num = num * -1;
        }
        if(num == 0){
            return 1;
        }
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;   // num /= 10;
        }
        return count;
    }
}
*/

// Q5-:  Max Wealth->

class MaxWealth{
    public static void main(String[] args) {
        int [][] accounts = {
                {1,2,3},
                {3,2,1}
        };

        System.out.println(maximumWealth(accounts));

    }
    public static int maximumWealth(int[][] accounts){
       // person = row
        // account = colums
        int ans = Integer.MIN_VALUE;
        for(int person = 0; person < accounts.length; person++){
           // when you start an new colum, take a new sum for that row
           int sum = 0;

            for(int account = 0; account < accounts[person].length; account++ ){
                sum += accounts[person][account];
            }
            // now we have sum of account of person
            // check with overall ans
            if(sum > ans){
                ans = sum;
            }
        }
        return ans;
    }
}







