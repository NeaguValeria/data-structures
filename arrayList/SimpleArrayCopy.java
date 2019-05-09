package arrayList;

public class SimpleArrayCopy {

    public static void main(String[] args) {
        int[] a = {3,5,13};
        int[] b = new int[4];
        for(int i= 0; i < a.length; i++){
            b[i] = a[i];
        }
        a = b;
        for(int i = 0; i < b.length; i++){
            System.out.println(a[i]);
        }
    }
}
