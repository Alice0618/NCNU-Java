// 菱形
import java.util.Scanner;
public class Diamond {
    public static void main(String[] argv) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            printNChar(n-i, ' ');
            printNChar(2*i-1, '*');
            System.out.println();
        }
        for (int i = n-1; i >= 1; i--) {
            printNChar(n-i, ' ');
            printNChar(2*i-1, '*');
            System.out.println();
        }
    }
    public static void printNChar(int n, char c) {
        for (int i = 1; i <= n; i++)
            System.out.print(c);
    }
}
