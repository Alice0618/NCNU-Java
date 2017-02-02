// 三角形
import java.util.Scanner;
public class Hello {
    public static void main(String[] argv) {
        Scanner input = new Scanner(System.in);
        System.out.println("*");
        int i;
        int n = input.nextInt();
        int result = 1;
        for (i=1; i <= n; i++) {
            result = result + 1;
            System.out.println("*");
        }
    }
}
