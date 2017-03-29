class Node {
    int value;
    Node next;
}
public class LLQueue {
    Node head, tail;
    public void add(int x) {
        Node tmp = new Node();
        tmp.value = x;
        if(tail != null) {
            tail.next = tmp;
            tail = tmp;
        } else {
            head = tail = tmp;
        }
    }
    public int delete() {
        int result = head.value;
        head = head.next;
        if(head == null) {
            tail = null;
        }
        return result;
    }
    public boolean isEmpty() {
        return head == null;
    }
}
