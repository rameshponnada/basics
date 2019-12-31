package arrays;

public class Main {

    public static void main(String[] args) {
        Array a = new Array(3);
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(50);

        a.remove(50);
        a.add(20);
        a.remove(20);
        a.print();
        System.out.println(a.getSize());


    }
}
