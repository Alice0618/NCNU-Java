public class Stack{
    // private表示只有這個 class的程式碼可以存取
    // 所以 testStack若有 s.top，則無法在 testStack中讀取
    private int[] data = new int[1000];
    private int top = 0;
    public void push(int x) {
        data[top++] = x;
    }
    public int pop() {
        return data[--top];
    }

    // 檢查 top是否為空的
    public boolean isEmpty() {
        return top <= 0;
    }
}
