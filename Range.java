public class Range {
    public static void range(Shape2D[] x) {
        // 氣泡排序法
        for(int i = 0;i < x.length;i++) {
            for(int j = i + 1;j < x.length;j++) {
                if(x[i].area() > x[j].area()) {
                    Shape2D tmp = x[i];
                    x[i] = x[j];
                    x[j] = tmp;
                }
            }
        }
    }
}
