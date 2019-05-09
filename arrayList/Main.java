package arrayList;

public class Main {

    public static void main(String[] args) {
        //apelare contructor (new arrayList.MyArray)
        MyArray ma = new MyArray();
        ma.showArray();//apelare metoda care apeleaza
        //apelare metoda add
        ma.add(5);
        ma.showArray();
        ma.add(5);
        ma.showArray();
        ma.add(5);
        ma.showArray();
        ma.add(5);
        ma.showArray();
        ma.add(2);
        ma.showArray();
        ma.add(5);
        ma.showArray();
        ma.add(5);

        ma.showArray();
        System.out.println(ma.getAt(7));
        ma.showArray();

        ma.removeAt(5);
        ma.showArray();
    }
}
