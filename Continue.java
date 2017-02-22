import java.lang.*;
import java.util.Scanner;

public class Continue {

    // continue
    public static void test(int x) {
        // 奇數
        for(int i = 0; i < x; i++) {
            if(i % 2 == 0) {
                continue;
            }
            if(i > 30) {
                break;
            }
            System.out.println(i);
        }
    }

    public static void main(String[] argv) {
        test(100);
    }
}
