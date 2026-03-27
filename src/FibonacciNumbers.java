 import java.util.Scanner;
/*
public class FibonacciNumbers {
    public static void main(String[] args) {


//    find the nth Fibonacci Number-:
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;

        while (count <= n){
            int temp = b;
            b  = b + a;
            a = temp;
            count++;
        }
        System.out.println(b);
*/

//     Q2-:  Counting Occurrences
       /*
        class countNums{
            public static void main(String[] args) {
             int n = 27477746;

             int count = 0;
             while(n > 0){
                 int rem = n % 10;
             if (rem == 7){
                 count ++;
             }
             n = n / 10;
             }
                System.out.println(count);
            }
    }
        */

//     Q3-:  REVERSE PROBLEM

 class reverse{
     public static void main(String[] args) {
         int  n =  245674;
         int ans = 0;
         while (n > 0){
             int rem = n % 10;
             n = n / 10;
             ans = ans * 10 + rem;
         }
         System.out.println(ans);
     }
 }

