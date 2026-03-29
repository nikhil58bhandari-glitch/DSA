 import java.util.Scanner;

public class functionsquestions {
    public static void main(String[] args) {


        /*   // Swap number code-
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b); */
 /*   //   Q1- Swap of two numbers-
        int a = 10;
        int b = 20;
        swap(a, b);
        System.out.println(a + " " + b);
    }
 static void swap(int num1 , int num2){
            int temp = num1;
            num1 = num2;
            num1 = temp;
            // this change will only be valid in this function scope only
*/

     /*  // Q2-: Prime Number-
       Scanner in = new Scanner(System.in);
       int num = in.nextInt();
       boolean ans = isPrime(num);
        System.out.println(ans);
        }

        static boolean isPrime(int num) {
            if (num <= 1) {
                return false;
            }
            int c = 2;
            while (c * c <= num) {
                if (num % c == 0) {
                    return false;
                }
                c++;
            }
            if (c * c > num) {
                return true;
            }
            return c * c > num;
*/

        //  Q3-: Print all the 3 digit armstrong numbers-
        Scanner in = new Scanner(System.in);
       // int n = in.nextInt();
       // System.out.println(isArmstrong(n));

        for (int i=  100; i < 1000; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }
       static boolean isArmstrong(int n) {
        int orignal = n;
        int sum = 0;

        while (n > 0){
            int rem = n % 10;
            n = n /10;
            sum = sum + rem*rem*rem;
        }
        return sum == orignal;
    }
        }


