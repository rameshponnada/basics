package linkedlists;


public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        System.out.println(list.contains(30));
        System.out.println(list.contains(40));
        list.deleteLast();
        System.out.println(list.contains(30));
        System.out.println(list.contains(40));
        list.deleteLast();
        System.out.println(list.contains(30));
        System.out.println(list.contains(40));

    }
}
