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