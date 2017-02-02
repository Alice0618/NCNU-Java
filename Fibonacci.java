// 費式數列
import java.util.Scanner;
public class Fibonacci {
    // 使用遞迴完成尋找費氏數列
    public static long fnum(long n) {
        if(n < 2)
            return n;
        else
            return fnum(n - 1) + fnum(n - 2);
    }
    // 加總函式
    public static long sum(long n) {
        int s = 0;
        if(n == 0)
            return 0;
        if(n > 0){
            for(int i = 0; i <= n; i ++){
                s += fnum(i);
            }
        }
        return s;
    }
    public static void main(String[] argv) {
        Scanner input = new Scanner(System.in);
        System.out.print("請輸入你要找的數:");
        long n = input.nextLong();
        System.out.println("第 " + n +"個數為: " +fnum(n));
        System.out.println("總共的值: " + sum(n));
    }
}
