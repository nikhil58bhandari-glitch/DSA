import java.util.*;

/*
  class linear_search {
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
//         for (int i = 0; i < arr.length; i++) {
//             // check the element at every index if it is = target
//             if (arr[i] == target) {
//                 return i;

         // for each loop
         for (int num : arr){
             if (num == target){
                 return num;

             }
         }
         // this line will execute if none of the return statements above have executed
         // hence the target not found
         return -1;
     }
 }
 */

//  Q-: Search in String -

class searchInString {
    public static void main(String[] args) {

        String name = "nikhil";
        char target = 'k';
        System.out.println(Search(name, target));
    }

    static boolean Search(String str, char target) {

        if (str.length() == 0) {
            return false;
        }

//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == target) {
//                return true;

        for(char ch : str.toCharArray()){
            if(ch == target){
                return true;
            }
        }
        return false;
    }
}





