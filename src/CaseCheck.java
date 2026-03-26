import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       char ch = in.next().trim().charAt(0);

//      String word = "hello";
//        System.out.println(word.charAt(2));
       // System.out.println(in.next().trim());

       if(ch >= 'a' && ch <= 'z') {
           System.out.println("lowwercase");
       }
       else {
           System.out.println("uppercase");
       }
        System.out.println(ch);
    }
}
