// 正N邊形碎型
import java.lang.*;
public class FractalPolygon {
    public static Pen p = new Pen();
    public static void fractalLine(int x, int y, double h, double r) {
        if(h <= 1) {
            // 起點
            p.flyTo(x, y);
            // 接續點
            p.runTo(x, y);
            return;
        }
        fractalLine(x, y, h / 3, r);
        // X的下一個座標
        int nextX = x + (int)(h/3 * Math.cos(Math.toRadians(r)));
        // Y的下一個座標
        int nextY = y + (int)(h/3 * Math.sin(Math.toRadians(r)));
        fractalLine(nextX, nextY, h/3, r - 60);
        nextX = nextX + (int)(h/3 * Math.cos(Math.toRadians(r - 60)));
        nextY = nextY + (int)(h/3 * Math.sin(Math.toRadians(r - 60)));
        fractalLine(nextX, nextY, h/3, r + 60);
        nextX = x + (int)(h/3 * 2 * Math.cos(Math.toRadians(r)));
        nextY = y + (int)(h/3 * 2 * Math.sin(Math.toRadians(r)));
        fractalLine(nextX, nextY, h/3, r);
    }
    // (x,y)為中心,h為半徑之正n邊形
    public static void fractalPolygon(int x, int y, int h, int n) {
        double 等分角 = 360.0/n;
        // 算出n個頂點座標
        double 邊長 = 2 * h * Math.sin(Math.toRadians(等分角/2));
        for(int i = 0;i < n;i++) {
            // 算頂點的X座標位置
            int topX = (int)(x + h * Math.cos(Math.toRadians(i * 等分角 - 90)));
            // 算頂點的Y座標位置
            int topY = (int)(y + h * Math.sin(Math.toRadians(i * 等分角 - 90)));
            fractalLine(topX, topY, 邊長, (i + 0.5) * 等分角);
        }
    }
    public static void main (String[] argv) {
        fractalPolygon(350, 350, 250, 3);
    }
}
