
// Scopeing -> where we can access out variable
public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "nikhil";

        {
            a = 78; // already initialize outside the block in the same in the same method, hence you cannot initialise agian
            a = 100; // reassign the origin ref variable to some other value

            System.out.println(a);
            int c = 90;
            name = "nikku";
            System.out.println(name);
            // value initialised in this block, will remain in the block
        }
        int c = 999;
        System.out.println(a);
        System.out.println(name);
        //  System.out.println(c);   cannot use outside the block

            // Scoping in for loop
            for (int  i= 0; i < 4; i++){
                System.out.println(i);
                int num = 90;
              //  int a = 10;
                a = 1000;
            }
            System.out.println(a);

        }

    static void random(int marks){
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}
