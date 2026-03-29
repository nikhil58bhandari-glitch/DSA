import java.util.Arrays;

public class varArgs {
    public static void main(String[] args) {
    //fun ( 2, 3, 41, 54, 36);
        fun();

        multiple(2,5,"Nikhil", "nikku","bhandari");
    }

    static void multiple(int a, int b, String ...v){
        System.out.println();
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
