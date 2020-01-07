package linkedlists;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.insertAtEnd(60);
        list.insertAtEnd(50);
        list.insertAtEnd(70);

////        list.reverse();
////        System.out.println(Arrays.toString(list.toArray()));
//        System.out.println(list.getKthFromEnd(1));
//        System.out.println(list.getKthFromEnd(2));
//        System.out.println(list.getKthFromEnd(4));
//        System.out.println(list.getKthFromEnd(0));


        System.out.println(list.middle());
    }
}
