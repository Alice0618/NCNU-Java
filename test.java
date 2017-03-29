import java.lang.*;
import java.util.Scanner;

public class test {
    int x; // object variable
    // static y; // class variable
    public static void main(String[] argv) {
        // call by value
        int x = 0; // local variable
        test(0);
        System.out.println(x);
    }

    public static void test(int x) {
        x = 5;
        // System.out.println(x);
    }
}
