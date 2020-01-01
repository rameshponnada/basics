package linkedlists;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
 //       list.insertAtEnd(20);
//        list.insertAtEnd(30);
//        list.insertAtEnd(40);
//        list.insertAtEnd(60);

        list.reverse();
        System.out.println(Arrays.toString(list.toArray()));
    }
}
