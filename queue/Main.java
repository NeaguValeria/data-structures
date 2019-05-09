package queue;

public class Main {
    public static void main(String[] args) {
         MyLinkedListQueue mq = new MyLinkedListQueue();
         mq.push(3);
         mq.push(4);
         mq.push(1);
         mq.push(8);
         mq.show();
        System.out.println(mq.peek());
        System.out.println(mq.pop());
        mq.show();
        mq.push(4);
        mq.push(1);
        System.out.println(mq.pop());

        MyArrayQueue mq1 = new MyArrayQueue();

        mq1.push(2);
        mq1.push(5);
        mq1.push(1);
        mq1.push(7);
        mq1.push(5);
        mq1.push(5);
        mq1.push(10);
        mq1.push(4);
        mq1.push(12);

        mq1.show();

        mq1.peek();
        mq1.pop();
        mq1.peek();
        mq1.push(7);
        mq1.push(9);
        mq1.pop();
    }
}
