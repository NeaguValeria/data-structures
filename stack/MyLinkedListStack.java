package stack;

public class MyLinkedListStack {
    Node bottom;
    Node top;

    public void push(int value) {
        Node newNode = new stack.Node(value);
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
        return top.info;
    }

    public int pop() {
        int value = top.info;
        if (top == bottom) {
            top = null;
            bottom = null;
        } else {
            Node n = bottom;
            while (n.next != top) {
                n = n.next;
            }
            top = n;
            top.next = null;
        }
        return  value;
    }
}
