import java.lang.*;
import java.util.Scanner;

public class Recursion {

    // 遞迴
    public static void test(int x) {
        // 印出 n~1
        if(x <= 0) {
            return;
        }
        System.out.println(x);
        test(x - 1);

        // // 印出 1~n
        // if(x <= 0) {
        //     return;
        // }
        // test(x - 1);
        // System.out.println(x);
    }

    public static void main(String[] argv) {
        test(5);
    }
}
