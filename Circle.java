// 繼承Shape2D做面積計算及存取字串為其名稱
// Cirale
public class Circle extends Shape2D {
    private double radius;
    private String name;
    private static final double PI = 3.141592654;
    public Circle(double r, String t) {
        radius = r;
        name = t;
    }
    public double area() {
        return PI * radius *radius;
    }
    public String nickname() {
        return name;
    }
}
