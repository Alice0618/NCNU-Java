// import java.lang.*;

public class Eval{
    private static String[] operators = new String[]{"+","-","*","/","%","^","fun", ",","("};
    private static int[] isp = new int[]{3, 3, 4, 4, 4, 5, 6, 1, 0};
    private static int[] icp = new int[]{3, 3, 4, 4, 4, 5, 6, 2, 100};
    //找出String對應到的索引位置
    public static int opid(String x) {
        // if(x.charAt(0) >= '0' && x.charAt(0) <= '9') {
        //     return -1;
        // }
        if(x.length() > 1 && (x.charAt(0) == '+' || x.charAt(0) == '-')) {
            return -1;
        }
        if((x.charAt(0) >= 'A' && x.charAt(0) <= 'Z') || (x.charAt(0) >= 'a' && x.charAt(0) <= 'z')) {
            return 6;
        }
        for(int i = 0; i < operators.length; i++) {
            if(x.equals(operators[i])) {
                return i;
            }
        }
        return -1;
    }
    // public static void output(String op,Stack_1 num){
    //     System.out.print(num.pop()+" ");
    //     System.out.print(num.pop()+" ");
    //     System.out.print(op+" ");
    // }

    public static void cal(String op, Stack_1 number) {
        if(op.equals("+")) {
            number.push(Double.toString(Double.valueOf(number.pop())+Double.valueOf(number.pop())));
            // Interger.valueOf("123"); // 字串轉整數
            // Interger.toString(123); // 整數轉字串
        } else if(op.equals("-")) {
            double b = Double.valueOf(number.pop());
            double a = Double.valueOf(number.pop());
            number.push(Double.toString(a - b));
        } else if(op.equals("*")) {
            number.push(Double.toString(Double.valueOf(number.pop())*Double.valueOf(number.pop())));
        } else if(op.equals("/")) {
            double b = Double.valueOf(number.pop());
            double a = Double.valueOf(number.pop());
            number.push(Double.toString(a / b));
        } else if(op.equals("%")) {
            double b = Double.valueOf(number.pop());
            double a = Double.valueOf(number.pop());
            number.push(Double.toString(a % b));
        } else if(op.equals("^")) {
            double b = Double.valueOf(number.pop());
            double a = Double.valueOf(number.pop());
            number.push(Double.toString(power(a, b)));
        } else if(op.equals("expp")) {
            double c = Double.valueOf(number.pop());
            double b = Double.valueOf(number.pop());
            double a = Double.valueOf(number.pop());
            number.push(Double.toString(expp(a, b, c)));
        } else if(op.equals("reverse")) {
            // 若遇小數則強制轉型成整數型態
            double tmp = Double.valueOf(number.pop());
            int x = (int)tmp;
            number.push(Integer.toString(reverse(x)));
            // number.push(Integer.toString(reverse(Integer.valueOf(number.pop()))));
        } else if(op.equals("factorial")) {
            // int b = Integer.valueOf(number.pop());
            // int a = Integer.valueOf(number.pop());
            number.push(Double.toString(factorial(Double.valueOf(number.pop()))));
        }
    }

    // function_x ^ (m / n)
    // (x ^ (1 / n)) ^ m
    public static double power(double x, double n) {
        // x的 n次方為 x乘以自己 n次
        // 1 * (x ^ n)
        int i;
        double result = 1;
        for(i = 0; i < n; i++) {
            result = result * x;
        }
        return result;
    }
    // 再作 x ^ (1/ n)
    public static double root(double x, double n) {
        double left, right, mid;
        if(x >= 1) {
            left = 1;
            right = x;
        } else {
            left = 0;
            right = x;
        }
        mid = (left + right) / 2;
        while(mid > left && mid < right) {
            if(power(mid, n) > x) {
                right = mid;
            } else if(power(mid, n) < x) {
                left = mid;
            } else {
                return mid;
            }
            mid = (left + right) / 2;
        }
        return mid;
    }
    public static double expp(double x,double n,double m) {
        return power(root(x, n), m);
    }

    // function_階乘
    public static double factorial(double n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    // function_Reverse
    public static int reverse(int a) {
        int b, sum = 0;
        while(a != 0) {
            b = a % 10;
            sum = sum * 10 + b;
            a = a / 10;
        }
        return sum;
    }

    public static void eval(String[] data){
        Stack_1 number = new Stack_1();
        Stack_1 op = new Stack_1();
        String y;
        for(int i=0; i<data.length; i++){
            //read in next data x
            String x = data[i];
            if(x.equals(")")){
                while(!op.isEmpty() && !(y=op.pop()).equals("(")){
                    cal(y, number);
                }
            } else if(opid(x)==-1){
                //x is a number
                number.push(x);
            } else{
                //x is a operator
                while(!op.isEmpty() && isp[opid(op.peek())] >= icp[opid(x)]){
                    cal(op.pop(), number);
                }
                op.push(x);
            }
        }
        while(!op.isEmpty()){
            cal(op.pop(), number);
        }
        System.out.println(number.pop());
    }

    public static void main(String[] argv){
        String[] data1 = {"4","*","(","2","+","3",")","+","3","^","2"};
        String[] data2 = {"199","%","10","-","(","-1",")","+","expp","(","5",",","2",",","3",")"};
        String[] data3 = {"reverse","(","200",")","*","factorial","(","5",")","/","(","10","%","6",")","-","8"};
        String[] data4 = {"4","-","reverse","(","123",")","/","6","+","37","%","3","+","45","+","factorial","(","0",")"};
        String[] data5 = {"expp", "(", "factorial", "(", "reverse", "(", "21", ")", ")", ",", "2", "+", "3", ",", "2", ")"};
        eval(data1);
        eval(data2);
        eval(data3);
        eval(data4);
        eval(data5);
    }
}
