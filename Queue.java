public class Stack{
    int[] data = new int[1000];
    int top;
//    public Stack() {
 //   }
    public void push(int x) {
        data[top++] = x;
    }
    public int pop() {
        return data[--top];
    }
}
