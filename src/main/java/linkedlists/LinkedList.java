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

    // reverse
    public void reverse() {
        if (isEmpty()) {
            return;
        }
        Node previous = head;
        Node current = head.next;

        while (current != null) {
            Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        tail = head;
        tail.next = null;
        head = previous;
    }

    // getKth ELement from End
    public int getKthFromEnd(int k) {
        if (isEmpty())
            throw new IllegalStateException();

        Node a = head, b = head;
        for (int i = 0; i < k - 1; i++) {
            b = b.next;
            if (b == null) {
                throw new IllegalArgumentException();
            }
        }

        while (b != tail) {
            a = a.next;
            b = b.next;
        }
        return a.value;
    }

    public int length() {
        return size;
    }

    private boolean isEmpty() {
        return head == null;
    }

    public int[] toArray() {
        int[] arr = new int[size];
        Node current = head;
        int index = 0;
        while (current != null) {
            arr[index++] = current.value;
            current = current.next;
        }
        return arr;
    }

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "{" + value + " -->" + next + "}";
        }
    }

}
