import java.util.Scanner;
public class StringEqual {
    public static void main(String[] argv) {
        String str = "Alice";
        Scanner input = new Scanner(System.in);
        while (true) {
            String cmd = input.next();
            if (str.equals(cmd)) {
                System.out.println("input is " + cmd + ", and it is same as " + str);
            } else {
                System.out.println("input is " + cmd + ", and it is not same as " + str);
            }
        }
    }
}
