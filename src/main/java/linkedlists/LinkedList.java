package linkedlists;

import java.util.NoSuchElementException;

public class LinkedList {

    private Node head;
    private Node tail;
    private int size;

    // insertFirst
    public void insertAtFirst(int val) {
        Node node = new Node(val);
        if (isEmpty()) {
            head = tail = node;
        } else {
            node.next = head;
            head = node;
        }
        size++;
    }

    // insertAtEnd
    public void insertAtEnd(int val) {
        Node node = new Node(val);
        if (isEmpty()) { // List is empty
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    // indexOf
    public int indexOf(int val) {
        int index = 0;
        Node current = head;
        while (current != null) {
            if (current.value == val) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    // deleteFirst
    public void deleteFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        if (head == tail) {
            head = tail = null;
        } else {
            Node second = head.next;
            head.next = null;
            head = second;
        }
        size--;
    }

    // deleteLast
    public void deleteLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        if (head == tail) {
            head = tail = null;
        } else {
            Node lastButOne = getPrevious(tail);
            tail = lastButOne;
            tail.next = null;
        }
        size--;
    }

    private Node getPrevious(Node node) {
        Node current = head;
        while (current != null) {
            if (current.next == node) return current;
            else
                current = current.next;
        }
        return null;
    }

    // contains
    public boolean contains(int val) {
        return indexOf(val) != -1;
    }

    public int length() {
        return size;
    }

    private boolean isEmpty() {
        return head == null;
    }

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

}
