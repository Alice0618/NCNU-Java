// 三角形
import java.util.Scanner;
public class Hello {
    public static void main(String[] argv) {
        Scanner input = new Scanner(System.in);
        // System.out.println("Hello World");
        // int i, j;
        int n = input.nextInt();
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
              System.out.print("*");
            }
            System.out.println();
        }
    }
}
