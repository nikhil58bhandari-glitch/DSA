import java.util.ArrayList;
import java.util.Scanner;

class arraysList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
        // symtex-
        ArrayList<integer> list = new ArrayList<>();
         */
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(10);

      // ADD-
//        list.add(67);
//        list.add(68);
//        list.add(69);
//        list.add(70);
//        list.add(71);
//        list.add(72);
//
//        //update-
//        list.set(0,99);
//        // remove-
//        list.remove(2);
//
//        System.out.println(list.contains(71));
//        System.out.println(list);

        //input
//        for(int i = 0; i < 5; i++){
//            list.add(in.nextInt());
//        }
//
//        // get item at any index
//        for(int i = 0; i < 5; i++){
//            System.out.print(list.get(i)); // pass index here, list[index] syntex not work here
//        }
//
//       System.out.println(list);

        // Multidimensional ArraysList-:

        // initialisation
        for(int i = 0; i < 3; i++){
            list.add(new ArrayList<>());
        }
        // add element
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                list.get(i).add(in.nextInt());
            }
        }
        System.out.println(list);
    }
}
