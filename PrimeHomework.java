// 運用兩種不同找質數的方法(測試法、刪去法), 求出在某一個數字底下有多少個質數, 以及兩種方法所花費的時間
import java.util.Scanner;
public class PrimeHomework{
    // 判斷是否為質數
    public static boolean isPrime(int n){
        for (int i = 2;i*i <= n;i++){
            if (n%i==0)
                return false;
        }
        return true;
    }
    // 測試法
    public static int prime(int n){
        int counter = 0;
        for(int i=2;i<=n;i++){
            if(isPrime(i))
                counter++;
        }
        return counter;
    }
    // 刪除法
    public static int p2(int n){
        // the default value of boolean array is false
        boolean[] deleted = new boolean[n];
        int counter=0;
        for (int i=2;i<n;i++){
            // find a primes
            if(!deleted[i]){
                counter++;
                for(int j=2*i;j<n;j=j+i)
                    deleted[j]=true;
            }
        }
        return counter;
    }
    public static void main(String[] argv){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        // 測試前時間
        long starTime=System.currentTimeMillis();
        int j=prime(n);
        // 測試後時間
        long endTime=System.currentTimeMillis();
        // 刪除前時間
        long staTime=System.currentTimeMillis();
        int i=p2(n);
        // 刪除後時間
        long enTime=System.currentTimeMillis();
        System.out.println("測試法  "+j+"個  "+(endTime-starTime)+"ms");
        System.out.println("刪除法  "+i+"個  "+(enTime-staTime)+"ms");
    }
}
