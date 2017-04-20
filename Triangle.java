// 繼承Shape2D做面積計算及存取字串為其名稱
// Triangle
public class Triangle extends Shape2D {
    private double base, height;
    private String name;
    public Triangle(double b, double h, String v) {
        base = b;
        height = h;
        name = v;
    }
    public double area() {
        return base * height / 2;
    }
    public String nickname() {
        return name;
    }
}
