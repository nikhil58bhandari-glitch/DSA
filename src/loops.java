import java.util.Scanner;

public class loops {
    public static void main(String [] arges) {

        Scanner input = new Scanner(System.in);
        //int n = input.nextInt();

        //        int a = 1;
        // if loop

//        if (a ==1){
//            System.out.println("hello wolrd");


//         for loop
        /*
        syntex-:
        for (initialisation; condition; increment/decrement){
        // body
        }

        for (int count = 1; count != 5; count++){
            System.out.println(count);
        }
       */

        // Q1. print number from 1 to 5
//        for (int num = 1 ; num <= 5 ; num++){
//            System.out.println(num);
//        }

        // Q2. print number from1 to n
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        for ( int num = 1 ; num <= n; num++){
//            System.out.println("hello wolrd");
//        }


//        while loop
        /*
        syntex-:
        while (condition) {
        //body
        }

       int count = 1;
        while (count <= 5){
            System.out.println(count);
            count++;
        }
*/

//     do while loop
        /*
        syntex-:

         do {
          // body
         }while (condition);


        int a = 1;
         do {
             System.out.println(a);
             n++;
         }
         while (n <= 5);
*/


//   Q3-: find the largest of the 3 number

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
//      int max = a;
//      if(b > max){
//          max = b;
//      }
//      if (c > max){
//          max = c;
  //  }
        int max = Math.max(c, Math.max(a,b));

        System.out.println(max);
    }
}
