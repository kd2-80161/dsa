class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {
    private Node head;

    public SinglyLinkedList() {
        head = null;
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void bubbleSort() {
        if (head == null || head.next == null) {
            return; // List is empty or has only one element, so it's already sorted
        }

        boolean swapped;
        Node current;
        Node previous = null;

        do {
            swapped = false;
            current = head;

            while (current.next != null) {
                if (current.data > current.next.data) {
                    int temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    swapped = true;
                }
                previous = current;
                current = current.next;
            }
        } while (swapped);

        // Update the head if necessary (if the first element was swapped)
        if (previous == null) {
            head = current;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.insertAtEnd(4);
        list.insertAtEnd(2);
        list.insertAtEnd(7);
        list.insertAtEnd(1);
        list.insertAtEnd(5);

        System.out.println("Original Linked List:");
        list.display();

        list.bubbleSort();

        System.out.println("Sorted Linked List using Bubble Sort:");
        list.display();
    }
}

