public class SumShape {
    public static double sum(Shape2D[] list) {
        double total = 0;
        for(int i = 0;i < list.length;i++) {
            // 將輸入圖形的面積加總
            total = total + list[i].area();
        }
        return total;
    }
}
