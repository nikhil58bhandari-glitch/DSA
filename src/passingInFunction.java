import java.util.Scanner;
import java.util.Arrays;


class passingInFunction {
    public static void main(String[] args) {
        int[] num = {11, 28, 32, 43, 51, 67, 86};
        System.out.println(Arrays.toString(num));
        change(num);
        System.out.println(Arrays.toString(num));
    }
    static void change(int[] arr){
        arr[0] = 99;
    }
}
