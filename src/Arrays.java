import java.util.Arrays;

import java.util.Scanner;

     /* Syntex-:
     datatype[] variable_name = new datatype[size];
     int [] rollnum = new int[5];
              or
     int [] rollnum = new int {2, 3, 4, 5, 6, 7};
     */

class Array {
    public static void main(String[] args) {
       // int[] arr; // declaration of array. rollnum is getting defined in the stack
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
      //  arr = new int[5];// initialisation: actually here object is being created in the memory (heap)
        arr[0] = 34;
        arr[1] = 43;
        arr[2] = 54;
        arr[3] = 45;
        arr[4] = 55;

       // System.out.println(arr[0]);
        //  String[] arr = new String[4];
        //   System.out.println(arr[0]); // null


        // input using for loops-
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }
//
//        System.out.println(Arrays.toString(arr));

//        // output
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//
//        // for-each loop
//        for (int j : arr) { // for every element in array, print the element
//            System.out.print(arr[j] + " "); // here j represent element of the array
//        }

        // aaray of objects
        String [] str = new String[4];
        for(int i = 0; i < str.length; i++){
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));

        // modify
        str[1] = "nikhil";
        System.out.println(Arrays.toString(str));
        }
    }

