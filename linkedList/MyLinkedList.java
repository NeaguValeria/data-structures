package linkedList;

public class MyLinkedList {
    Node start;

    public int getSize() {
        int size = 0;
        Node n = start;
        while (n != null) {
            size++;
            n = n.next;
        }
        return size;
    }

    public void show(){
        Node n = start;
        while (n != null){
            System.out.println(n.info + " ");
            n = n.next;
        }
        System.out.println();
    }

    public void add(int value) {
        Node newNode = new Node(value);
        if (start == null) {
            start = newNode;
        } else {
            Node n = start;
            while (n.next != null) {
                n = n.next;
            }
            n.next = newNode;
        }
    }

    public int getAt(int index){
        Node n = start;
        int nrNodes = 0;
        while(n != null && nrNodes < index){
            n = n.next;
            nrNodes++;
        }
        return (n.info);
    }

    public void showIO (Node n){
        if(n == null){
            return;
        }else{
            System.out.print(n.info + " ");
            showIO(n.next);
        }
    }

    public void showNotIO (Node n){
        if(n == null){
            return;
        }else{
            showNotIO(n.next);
            System.out.print(n.info + " ");
        }
    }


}
