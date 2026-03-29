public class Ovarloading {
    public static void main(String[] args) {
        fun(54);
        fun("nikhil");
    }

    static  void fun(int a){
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println(name);



    }
}
