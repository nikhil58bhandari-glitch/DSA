import java.util.Arrays;
import java.util.Scanner;

public class twoDArray {
    public static void main(String[] args) {
        /*
        1 3 4
        2 3 5
        6 5 4
         */
      // int [][] arr = new int [3][];
        // int [][] arr = new int [row] [col];
       Scanner in = new Scanner(System.in);

//        int [][] arr = {
//                {1, 2, 3}, // 0th index
//                {4, 5}, // 1st index
//                {6, 7, 8, 9 }   // 2nd index -> arr2d[2] = {6, 7, 8, 9}
//        };
//
//        for(int i = 0; i < arr.length; i++){

        int[][] arr = new int [3][3];
            System.out.println(arr.length); // number of rows

            // INPUT
            for(int row = 0; row < arr.length ; row++){

                // for each col in every row
                for(int col = 0; col< arr[row].length; col++){
                    arr[row][col] = in.nextInt();
                }
            }

            //output
//        for(int row = 0; row < arr.length ; row++){
//
//            // for each col in every row
//            for(int col = 0; col< arr[row].length; col++){
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }
//        }

        // output
//        for(int row = 0; row < arr.length ; row++){
//            System.out.println(Arrays.toString(arr[row]));
//        }

// inhence fir loop-:
        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
    }
    }

