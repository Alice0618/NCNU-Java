// 與 Stack一起
public class testStack{
    public static void main(String[] argv) {
        Stack s;
        s = new Stack();
        for(int i = 1; i < 50; i++) {
            s.push(i);
        }
        while(!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
