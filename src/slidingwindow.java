import java.util.Arrays;
import java.util.Scanner;
import java.util.HashMap;
import java.util.*;

// Q1-: Maximum Sum Subarray of size k-:
/*
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
*/

// Q2-: First Negative Number in every Window of Size K-:

class fasneg{

    public static int[] firstNegative(int[] arr, int k) {

        int n = arr.length;
        int[] result = new int[n - k + 1];

        int l = 0, r = 0;
        int idx = 0;

        Queue<Integer> q = new LinkedList<>();

        while (r < n) {

            // add negative element to queue
            if (arr[r] < 0) {
                q.add(arr[r]);
            }

            // window size reached
            if (r - l + 1 == k) {

                // check first negative
                if (!q.isEmpty()) {
                    result[idx] = q.peek();
                } else {
                    result[idx] = 0;
                }

                // remove outgoing element
                if (!q.isEmpty() && arr[l] == q.peek()) {
                    q.poll();
                }

                idx++;
                l++;
            }

            r++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;

        int[] ans = firstNegative(arr, k);

        System.out.println(Arrays.toString(ans));
    }
}