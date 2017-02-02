import java.util.Scanner;
public class Car {

    int number, weight;
    String name;

    public Car(int number, int weight, String name) {
        this.number = number;
        this.weight = weight;
        this.name = name;
    }

    public void addWeight(int add) {
        this.weight = this.weight + add;
    }

    public static void main(String[] argv) {
        Scanner input = new Scanner(System.in);

        // method 1
        // int n = input.nextInt();
        // int w = input.nextInt();
        // String name = input.next();
        // Car car1 = new Car(n, w, name);

        // method 2
        Car car1 = new Car(input.nextInt(), input.nextInt(), input.next());
        System.out.println(car1.name + " is " + car1.weight + " KG, and car id is: " + car1.number);
        car1.addWeight(input.nextInt());
        System.out.println("After added: " + car1.name + " is " + car1.weight + " KG");
    }
}
