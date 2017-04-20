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
public class ScoreAdjustmentSystem{
    public static void show(int n, Student[] all) {
        double total = 0;
        double avg = 0;
        for(int i = 0; i < n; i++) {
            total += all[i].getScore();
        }
        avg = total / n;
        System.out.println("Class average: " + avg);
        System.out.println("flunked:");
        for(int i = 0; i < n; i++) {
            if(all[i].getScore() < 60) {
                System.out.println(all[i].getId() + " " + all[i].getScore());
            }
        }
    }
    // 全體加分
    public static void bonus(Student[] all, int x) {
        double newScore = 0;
        for(int i = 0; i < all.length; i++) {
            newScore = all[i].getScore() + x;
            if(newScore > 100) {
                newScore = 100;
            }
            all[i].setScore(newScore);
        }
    }
    // 線性加分
    // y = a * x + b
    public static void line(Student[] all, double a, double b) {
        double newScore = 0;
        for(int i = 0; i < all.length; i++) {
            newScore = all[i].getScore() * a + b;
            if(newScore > 100) {
                newScore = 100;
            }
            all[i].setScore(newScore);
        }
    }
    // 根號加分
    public static void bonusSqrt(Student[] all) {
        double newScore = 0;
        for(int i = 0; i < all.length; i++) {
            newScore = Math.sqrt(all[i].getScore()) * 10;
            if(newScore > 100) {
                newScore = 100;
            }
            all[i].setScore(newScore);
        }
    }
    public static void main(String[] argc){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Student[] all = new Student[n];
        for (int i = 0; i < n; i++) {
            all[i] = new Student(input.next(), input.nextInt());
        }
        show(n, all);
        while(true) {
            String command = input.next();
            if(command.equals("全體")) {
                // 加幾分
                int x = input.nextInt();
                bonus(all, x);
            } else if(command.equals("線性")) {
                double a = input.nextDouble();
                double b = input.nextDouble();
                line(all, a, b);
            } else if(command.equals("根號")) {
                bonusSqrt(all);
            } else if(command.equals("end")) {
                break;
            }
            show(n, all);
        }
    }
}
