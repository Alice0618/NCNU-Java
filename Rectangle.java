public class Rectangle extends Shape2D {
    private double width, height;
    private String name;
    public Rectangle(double w, double h, String u) {
        width = w;
        height = h;
        name = u;
    }
    //override area()defined in Shape2D
    public double area() {
        return width * height;
    }
    public String nickname() {
        return name;
    }
}//繼承Shape2D做面積計算及存取字串為其名稱