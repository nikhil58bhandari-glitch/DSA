import java.util.*;

 public class linear_search {
     public static void main(String[] args) {
         int[] arr = {12, 33, 31, 42, 54, 64, 74, 22};
         int target = 74;

         int ans = linearSearch(arr, target);
         System.out.println(ans);

     }
     // Search in the array: return the index if the item found
     // otherwise if the item not found return -1,

     static int linearSearch(int[] arr, int target){
         if (arr.length == 0) {
             return -1;
         }
         // run the for loop
         for (int i = 0; i < arr.length; i++) {
             // check the element at every index if it is = target
             if (arr[i] == target) {
                 return i;

             }
         }
         return -1;
     }
 }
