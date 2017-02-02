// 將字串分組反轉
import java.util.*;
public class StringReverse {
    public static void main(String[] argv) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        // 宣告一空白字串,裝反轉後的字串
        String e = "";
        int n = input.nextInt();
        // 分群後剩餘的字元個數
        int t = s.length() % n;
        // 整除部分的索引值
        int r = s.length() - t;
        // 反轉整除部分
        for(int i = 0; i < r; i = i + n) {
            for(int p = i + n - 1; p >= i; p--) {
                e = e + s.charAt(p);
            }
        }
        // 反轉剩餘部分
        for(int a = s.length()-1; a > r-1; a--) {
            e = e + s.charAt(a);
        }
        System.out.println(e);
    }
}
