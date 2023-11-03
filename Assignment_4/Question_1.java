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
    private Node tail;

    public SinglyLinkedList() {
        head = null;
        tail = null;
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void delFirst() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        if (head == null) {
            tail = null;
        }
    }

    public void delLast() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            Node current = head;
            while (current.next != tail) {
                current = current.next;
            }
            tail = current;
            tail.next = null;
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public boolean isEmpty() {
        return head == null;
    }
}

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.addFirst(1);
        list.addFirst(2);
        list.addLast(3);
        list.addLast(4);

        System.out.println("Linked List:");
        list.display();

        list.delFirst();
        list.delLast();

        System.out.println("Linked List after deleting first and last:");
        list.display();
    }
}

