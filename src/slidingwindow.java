import java.util.Arrays;
import java.util.Scanner;
import java.util.HashMap;

// Q1-: Maximum Sum Subarray of size k-:

class maxsubarray {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int l = 0, r = 0;
        int sum = 0;
        int maxSum = 0;

        while (r < arr.length){
            sum = sum + arr[r];

            if(r - l + 1 == k){
                maxSum = Math.max(maxSum, sum);

                sum = sum - arr[l];
                l++;
            }
            r++;
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int [] arr = {100,200,300,400};
        int k = 2;

        maxsubarray obj = new maxsubarray();
        System.out.println(obj.maxSubarraySum(arr, k));
    }
}
