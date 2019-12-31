package linkedlists;

import java.util.NoSuchElementException;

public class LinkedList {

    private Node head;
    private Node tail;
    private int size;

    // insertFirst
    // head -> 10 -> tail
    public void insertAtFirst(int val) {
        Node node = new Node(val);
        if(isEmpty()){
            head=tail = node;
        }else{
            node.next = head;
            head=node;
        }
    }

    // insertAtEnd
    // head->10->20->30->tail.
    public void insertAtEnd(int val) {
        Node node = new Node(val);
        if (isEmpty()) { // List is empty
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    // indexOf
    public int indexOf(int val){
        int index =0;
        Node current = head;
        while(current!=null){
            if(current.value==val){
                return index;
            }
            current= current.next;
            index++;
        }
        return -1;
    }

    // deleteFirst
    public void deleteFirst(){
        // 10 -> 20 -> 30
        if(isEmpty()){
            throw  new NoSuchElementException();
        }
        if(head == tail){
            head= tail =null;
            return;
        }
        Node second = head.next;
        head.next =null;
        head = second;
    }

    // deleteLast
    // contains
    public boolean contains(int val){
        return indexOf(val)!=-1;
    }


    private boolean isEmpty(){
        return head ==null;
    }

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

}
