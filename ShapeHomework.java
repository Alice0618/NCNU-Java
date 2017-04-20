/*
*學號:104213018
*姓名:蔣青嵐
*/
import java.util.Scanner;
public class ShapeHomework {
    public static void main (String[] argv) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();//做n次圖形設定
        Shape2D[] x = new Shape2D[n];
        for(int i=0;i<n;i++) {
            String s = input.next();//輸入字串s
            if (s.equals("Circle")) {//若字串為Circle 
                String t = input.next();//輸入字串t為此Circle的名稱
                int r = input.nextInt();//輸入半徑r
                x[i] = new Circle(r, t);//執行Circle
            }
            else if(s.equals("Rectangle")) {//若字串為Rectangle
                String u = input.next();//輸入字串u為此Rectangle的名稱
                int l = input.nextInt();//輸入長l
                int w = input.nextInt();//輸入寬w
                x[i] = new Rectangle(l, w, u);//執行Rectangle
                
            }
            else if(s.equals("Triangle")) {//若字串為Triangle
                String v = input.next();//輸入字串v為此Triangle的名稱
                int b = input.nextInt();//輸入底b
                int h = input.nextInt();//輸入高h
                x[i] = new Triangle(b, h, v);//執行Triangle
            }
            else if(s.equals("Square")) {//若字串為Square
                String o = input.next();//輸入字串o為此Square的名稱
                int l = input.nextInt();//輸入邊長l
                x[i] = new Square(l, o);
            }
            else if(s.equals("Trapezoid")) {//若字串為Trapezoid
                String e = input.next();//輸入字串e為此Trapezoid的名稱
                int u = input.nextInt();//輸入上底u
                int d = input.nextInt();//輸入下底d
                int h = input.nextInt();//輸入高h
                x[i] = new Trapezoid(u, d, h, e);//執行Trapezoid
            }
            else if(s.equals("RegularOctagon")) {//若字串為RegularOctagon
                String y = input.next();//輸入字串y為此RegularOctagon的名稱
                int l = input.nextInt();//輸入邊長l
                x[i] = new RegularOctagon(l, y);//執行RegularOctagon
            }
        }
        Range.range(x);//排序
        for(int j=0;j<x.length;j++) {
            System.out.println(x[j].nickname()+" "+x[j].area());//印出名稱及面積
        }
        System.out.println();//空一行
        System.out.println(SumShape.sum(x));//印出面積總和
    }
}