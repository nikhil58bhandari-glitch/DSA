import java.util.Scanner;

       /*
        return_type name (){
        // body
        return statement;
        */

public class functions {
    public static void main(String[] args) {
        sum();
    }
//        // Q1-: take input of 2 numbers and print the sum
//        Scanner in = new Scanner(System.in);
//        System.out.print("enter 1st number-: ");
//        int num1 = in.nextInt();
//        System.out.print("enter 2nd number-: ");
//        int num2 = in.nextInt();
//        int sum = num1 + num2;
//
//        System.out.println("sum of number - " + sum);

    static void sum(){
            Scanner in = new Scanner(System.in);
            System.out.print("Enter first number - ");
            int num1 = in.nextInt();
            System.out.print("Enter second number - ");
            int num2 = in.nextInt();

            int sum =  num1 + num2;
        System.out.println("sum of the numvber - " + sum);
        }

}
