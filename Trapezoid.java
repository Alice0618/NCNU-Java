// 繼承Shape2D做面積計算及存取字串為其名稱
// Trapezoid梯形
public class Trapezoid extends Shape2D {
    private double up, down, height;
    private String name;
    public Trapezoid(double u, double d, double h, String e) {
        up = u;
        down = d;
        height = h;
        name = e;
    }
    public double area() {
        return (up + down)* height / 2;
    }
      public String nickname() {
        return name;
    }
}
