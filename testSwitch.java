import java.lang.*;
import java.util.Scanner;

public class testSwitch {
    
    // switch
    public static void test(int x) {
        // switch為判斷不同 case
        // 也可寫成多個 if else
        switch(x) {
            case 1:
                System.out.println("1");
                // 結束此 case，不跑後續 case
                break;
            case 2:
                System.out.println("2");
                break;
            default:
                System.out.println("not 1 nor 2");
        }
    }

    public static void main(String[] argv) {
        test(1);
    }
}
