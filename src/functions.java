import java.util.Scanner;

       /*
        return_type name (){
        // body
        return statement;
        */

public class functions {
    public static void main(String[] args) {
       // sum();

   /*    String message = greet();
        System.out.println(message);    */

//        int ans = sum(20, 30);
//        System.out.println(ans);
        String personalised = mygreet("Nikhil Bhandari");
        System.out.println(personalised);
    }
    /*
        // Q1-: take input of 2 numbers and print the sum
        Scanner in = new Scanner(System.in);
        System.out.print("enter 1st number-: ");
        int num1 = in.nextInt();
        System.out.print("enter 2nd number-: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;

        System.out.println("sum of number - " + sum);
*/
    /*
      return the value
    static void sum(){
            Scanner in = new Scanner(System.in);
            System.out.print("Enter first number - ");
            int num1 = in.nextInt();
            System.out.print("Enter second number - ");
            int num2 = in.nextInt();

            int sum =  num1 + num2;
        System.out.println("sum of the numvber - " + sum);
*/

    /*   static String greet() {
           String greeting = "how r you ";
           return greeting;
       }      */

    // Argguments - pass the value of the number when you are calling the methods in main()

//    static  int sum (int a, int b){
//        int sum = a + b;
//        return sum;

        static String mygreet (String name){
            String message = "Hello " + name;
            return message;
        }
    }

