import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

//        SYNTEX-:
        /*
       switch(expression)
       cases
        case one:
        // do something
        break;
        case two:
        // do something
        break;
        default:
        // do something
        }
        */

        Scanner in = new Scanner(System.in);
        //String fruit = in.next();
        int empID = in.nextInt();
        String department = in.next();

//        if (fruit.equals("mango")){
//            System.out.println("King of fruits ");
//        }
//
//        if(fruit.equals("apple")){
//            System.out.println("a sweet red fruit ");
//        }
/*
        switch (fruit){
            case "Mango":
                System.out.println("King of fruit");
                break;

            case "Apple":
                System.out.println("A sweet red fruit");
                break;

            case "Orange":
                System.out.println("round fruit");
                break;

            case "Grapes":
                System.out.println("Small fruit");
                break;

            default:
                System.out.println("Please enter the valid fruit");
        }

 */
        // we can write it like this as well
//        switch(fruit){
//            case"Mango" ->  System.out.println("King of fruit");
//            case "Apple" -> System.out.println("A sweet red fruit");
//            case "Orange" -> System.out.println("round fruit");
//            case "Grapes" -> System.out.println("Small fruit");
//            default -> System.out.println("Please enter the valid fruit");
//        }

//        switch(empID){
//            case 1:
//                System.out.println("Nikhil Bhandari");
//                break;
//            case 2:
//                System.out.println("Rahul Bisht");
//                break;
//            case 3:
//                System.out.println("Vivek Chauhan");
//                break;
//            case 4:
//                switch(department){
//                    case "CS":
//                        System.out.println("Coumpter Science");
//                        break;
//                    case "ME":
//                        System.out.println("Mechanical Department");
//                        break;
//                    case "IT":
//                        System.out.println("IT Department");
//                        break;
//                    default:
//                        System.out.println("No department ");
//                }
//                break;
//            default:
//                System.out.println("Enter correct ID");
//        }

        // Better way to write
        switch(empID){
            case 1 -> System.out.println("Nikhil Bhandari");
            case 2 -> System.out.println("Rahul Bisht");
            case 3 -> System.out.println("Vivek Chauhan");
            case 4 -> {
                System.out.println("Anish");
                switch(department){
                    case "CS" -> System.out.println("Coumpter Science");
                    case "ME" -> System.out.println("Mechanical Department");
                    case "IT" -> System.out.println("IT Department");
                    default -> System.out.println("No department ");
                }
            }
            default -> System.out.println("Enter correct ID");
        }
    }
}
