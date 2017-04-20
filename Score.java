import java.lang.*;
import java.util.Scanner;
class Student {
    private String id;
    private double score;

    public Student(String id, double score) {
        this.id = id;
        this.score = score;
    }
    public String getId(){
        return id;
    }
    public double getScore(){
        return score;
    }
    // 分數重置
    public void setScore(double newScore){
        score = newScore;
    }
}
public class Score{
    // 印出名單及成績
    public static void print(Student[] list) {
        System.out.println("Class average: "+getAvg(list));
        flunked(list);
    }
    // 算平均
    public static double getAvg(Student[] list) {
        double sum = 0;
        for(int i = 0; i < list.length; i++) {
            sum += list[i].getScore();
        }
        double avg = sum / list.length;
        return avg;
    }
    // 檢查成績
    public static void flunked(Student[] list) {
        System.out.println("flunked:");
        for(int i = 0; i < list.length; i++) {
            if(list[i].getScore() < 60) {
                System.out.println(list[i].getId() + " " + list[i].getScore());
            }
        }
    }
    // 全體加分
    public static void bonus(Student[] list, int x) {
        double newScore = 0;
        for(int i = 0; i < list.length; i++) {
            newScore = list[i].getScore() + x;
            if(newScore > 100) {
                newScore = 100;
            }
            list[i].setScore(newScore);
        }
    }
    // 線性加分
    public static void line(Student[] list, double a, double b) {
        double newScore = 0;
        for(int i = 0; i < list.length; i++) {
            newScore = list[i].getScore() * a + b;
            if(newScore > 100) {
                newScore = 100;
            }
            list[i].setScore(newScore);
        }
    }
    // 根號加分
    public static void bonusSqrt(Student[] list) {
        double newScore = 0;
        for(int i = 0; i < list.length; i++) {
            newScore = Math.sqrt(list[i].getScore()) * 10;
            if(newScore > 100) {
                newScore = 100;
            }
            list[i].setScore(newScore);
        }
    }
    public static void main(String[] argc){
        Scanner input = new Scanner(System.in);
        // n個學生
        int n = input.nextInt();
        // 輸入每個學生的學號，成績
        Student[] list = new Student[n];
        for (int i = 0; i < n; i++) {
            list[i] = new Student(input.next(), input.nextDouble());
        }
        print(list);
        while(true) {
            String command = input.next();
            if(command.equals("全體")) {
                // 加幾分
                int x = input.nextInt();
                bonus(list, x);
            } else if(command.equals("線性")) {
                double a = input.nextDouble();
                double b = input.nextDouble();
                line(list, a, b);
            } else if(command.equals("根號")) {
                bonusSqrt(list);
            } else if(command.equals("end")) {
                break;
            }
            print(list);
        }
    }
}
