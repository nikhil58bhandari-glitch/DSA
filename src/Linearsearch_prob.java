import java.util.*;

// Q1-: Search in Range-

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
