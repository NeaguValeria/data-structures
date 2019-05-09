package queue;

public class MyArrayQueue {
    public static final int SEGMENT = 8;
    public int[] data;
    public int size;

    public MyArrayQueue() {
        data = new int[SEGMENT];
    }

    public void increaseCapacity() {
        int[] b = new int[data.length + SEGMENT];
        for (int i = 0; i < data.length; i++) {
            b[i] = data[i];
        }
        data = b;
    }


    public void push(int val) {
        if (size < data.length) {
            this.data[size] = val;
            size++;
        } else {
            increaseCapacity();
            this.data[size] = val;
            size++;
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int pop() {
        int val = 0;
        // array nou cu un index mai mic decat array-u initial
        int[] aux = new int[data.length - 1];
        if (isEmpty()) {
            System.out.println("coada goala");
        } else {

            System.out.println("elementul " + data[0] + " a fost eliminat");
            //salvez elementul pe care il elimin pentru al returna mai jos
            val = data[0];
            //shiftez ultima pozitie la dreapta
            for(int i= 0; i<size; i++){
                data[i]=data[i+1];
            }
            size--;

            //copiez valorile in noul array fara ultima valoare
            for (int i = 0; i < size; i++) {
                aux[i] = data[i];
            }
            //copiez din nou in array-ul initial
            data = aux;
        }
        return val;
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("coada este goala");
        } else {
            System.out.println("head-ul este " + data[0]);
        }
    }

    public void show() {
        for (int i = 0; i < size; i++) {

            System.out.print(data[i] + " ");
        }
        System.out.println("\n");
    }
}
