package stack;

public class Main {
    public static void main(String[] args) {

        MyArrayStack ms = new MyArrayStack();
        ms.push(7);
        ms.push(11);
        ms.push(12);
        ms.showStack();
        System.out.println(ms.peek());
        ms.push(6);
        ms.push(1);
        ms.push(3);
        ms.push(7);
        ms.push(8);
        ms.push(1);
        ms.showStack();
        System.out.println(ms.peek());
        System.out.println(ms.pop());
        ms.showStack();
        System.out.println(ms.pop());
        ms.showStack();

        MyLinkedListStack ms1 = new MyLinkedListStack();
        ms1.push(2);
        ms1.push(4);
        ms1.push(1);
        ms1.push(6);
        ms1.push(5);
        ms1.show();
        System.out.println(ms1.peek());
        System.out.println(ms1.pop());
        ms1.show();
        System.out.println(ms1.peek());;
        System.out.println(ms1.peek());;
        ms1.push(3);
        ms1.show();
        System.out.println(ms1.pop());
        ms1.show();
    }

}
