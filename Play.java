// 車車在一個賽地(10 * 10方格)上移動的位置
import java.util.*;
class Car {
    private String name;
    private int pointX = 0;
    private int pointY = 0;
    // 設定車子名字
    public Car(String name) {
        this.name = name;
    }
    // 取得點Ｘ及點Ｙ位置
    public int[] getPoints() {
        int[] get = new int[2];
        get[0] = pointX;
        get[1] = pointY;
        return get;
    }
    // 設定點Ｘ及點Ｙ位置
    public void setPoints(int X, int Y) {
        pointX = X;
        pointY = Y;
    }
    // 回傳車子名子
    public String getName() {
        return name;
    }
    // 車子移動到 X , Y
    public void go(int X, int Y) {
        // 計算移動的步數
        int nextX = X - pointX;
        int nextY = Y - pointY;
        if(nextX > 0)
            System.out.println("向右走  走"+ nextX +"步");
        if(nextX < 0)
            System.out.println("向左走  走"+ Math.abs(nextX) +"步");
        if(nextY > 0)
            System.out.println("向下走  走"+ nextY +"步");
        if(nextY < 0)
            System.out.println("向上走  走"+ Math.abs(nextY) +"步");
        setPoints(X, Y);
    }
}
public class Play {
    public static void main (String[] argv) {
        Scanner input = new Scanner(System.in);
        System.out.print("輸入車名:");
        Car b = new Car(input.next());
        for(;;) {
            System.out.print("請輸入指令:");
            String c = input.next();
            // 移動車子
            if(c.equals("go")) {
                int x = input.nextInt();
                int y = input.nextInt();
                // 檢查是否超出棋盤範圍
                if(0 <= x && x < 10 && 0 <= y && y < 10)
                    b.go(x, y);
                else
                    System.out.println("超出棋盤範圍");
            }
            // 列出當前所在位置
            else if(c.equals("list")) {
                System.out.println(b.getName()+"  在("+b.getPoints()[0]+","+b.getPoints()[1]+")");
            }
            // 結束
            else if(c.equals("end")) {
                System.out.println("離開......");
                break;
            }
            else
                System.out.println("指令無效，重新輸入");
        }
    }
}
