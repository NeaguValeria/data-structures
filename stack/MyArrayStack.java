package stack;
//implementare pe array

public class MyArrayStack {

    public static final int SEGMENT = 8;
    int[] data;
    int size;
    MyArrayStack() {
        data = new int[SEGMENT];
        size = 0;
    }

    public void push(int value){
        if(data.length == size) {
            increaseCapasity();
        }
        data[size] = value;
        size++;
    }

    public void showStack() {
        System.out.println("size of Stack: " + size + "/" + data.length);
        for (int i = 0; i < size; i++) {
            System.out.print(data[i] + " " );
        }
        System.out.println();
    }

    public void increaseCapasity() {
        //facem array b de dim a
        int b[] = new int[data.length + SEGMENT];
        for (int i = 0; i < data.length; i++){
            b[i] = data[i];
        }
        data = b;
    }

    public  int peek(){
        return data[size - 1];
    }

    //eliminare element din stiva(folosim o var auxiliara in care pastram valoarea si o egalam cu 0)
    public int pop(){
        int value = data[size - 1];
        data[size - 1] = 0;
        size--;
        return value;
    }

}
