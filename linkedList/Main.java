package linkedList;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        MyLinkedList ml = new MyLinkedList();
        System.out.println(ml.getSize());
        ml.add(5);
        ml.add(7);
        ml.add(12);
        ml.add(6);
        ml.add(3);
        ml.add(5);
        System.out.println(ml.getSize());
        ml.show();
        System.out.println(ml.getAt(3));
        ml.showIO(ml.start);
        ml.showNotIO(ml.start);
    }
}
