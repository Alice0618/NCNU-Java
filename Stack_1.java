public class Stack_1{
    // private表示只有這個 class的程式碼可以存取
    // 所以 testStack若有 s.top，則無法在 testStack中讀取
    private String[] data = new String[100];
    private int top = 0;
    public void push(String x) {
        data[top++] = x;
    }
    public String pop() {
        return data[--top];
    }

    public String peek() {
        return data[top - 1];
    }

    // 檢查 top是否為空的
    public boolean isEmpty() {
        return top <= 0;
    }
}
