// 繼承Shape2D做面積計算及存取字串為其名稱
// Square
public class Square extends Shape2D {
    private double length;
    private String name;
    public Square(double l, String o) {
        length = l;
        name = o;
    }
    public double area() {
        return length * length;
    }
      public String nickname() {
        return name;
    }
}
