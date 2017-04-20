// 繼承Shape2D做面積計算及存取字串為其名稱
// RegularOctagon八角形
public class RegularOctagon extends Shape2D {
    private double length;
    private String name;
    public RegularOctagon(double l, String y) {
        length = l;
        name = y;
    }
    public double area() {
        return (2 * Math.sqrt(2) + 2) * length * length;
    }
      public String nickname() {
        return name;
    }
}
