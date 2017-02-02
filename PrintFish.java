// 印魚
import java.util.Scanner;
public class PrintFish {
    public static void main(String[] argv) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        // 印出上半圖形
        for(int i = 1; i <= n; i++){
            // 印出魚身體
            print(3 * (n - i),' ');
            print(3 * (2 * i - 1),'*');
            // 印出魚尾巴
            print((n - i) + 3 * (n - i),' ');
            print((i - 1),'*');
            System.out.println();
        }
        // 印出下半圖形
        for(int i = n - 1; i >= 1; i--){
            // 印出魚身體
            print(3 * (n-i),' ');
            print(3 * (2 * i - 1),'*');
            // 印出魚尾巴
            print((n - i) + 3 * (n - i),' ');
            print((i - 1),'*');
            System.out.println();
        }
    }
    public static void print(int n, char c) {
        for (int i = 1; i <= n; i++)
            System.out.print(c);
    }
}
