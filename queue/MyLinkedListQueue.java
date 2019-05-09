package queue;

public class MyLinkedListQueue {

    Node bottom;
    Node top;

    public void push(int value) {
        Node newNode = new Node(value);
        if (bottom == null) {
            bottom = newNode;
            top = newNode;
        } else {
            top.next = newNode;
            top = top.next;
        }
    }

    public void show() {
        Node n = bottom;
        while (n != null) {
            System.out.print(n.info + " ");
            n = n.next;
        }
        System.out.println();
    }

    public int peek() {
        return bottom.info;
    }

    public int pop() {
        int value = bottom.info;
        bottom = bottom.next;
        return value;
    }
}
