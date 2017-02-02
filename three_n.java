import java.util.Scanner;
public class three_n {
    public static int fun(int n) {
        int add = 1;
        while (n != 1) {
            add = add + 1;
            if(n % 2 == 1) {
                n = 3 * n + 1;
            } else {
                n = n / 2;
            }
        }
        return add;
    }
    public static void main(String[] argv) {
        Scanner input = new Scanner(System.in);
        int tmp = 0;
        int sta = input.nextInt();
        int end = input.nextInt();
        // scanf("%d %d", &sta, &end);
        for(int i = sta; i <= end; i++) {
            if(fun(i) > tmp) {
                tmp = fun(i);
            }
        }
        System.out.print(sta + " " + end + " " + tmp);
        // printf("%d %d %d", sta, end, tmp);
    }
}
