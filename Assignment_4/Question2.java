class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyCircularLinkedList {
    private Node tail;

    public SinglyCircularLinkedList() {
        tail = null;
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            tail = newNode;
            tail.next = tail;
        } else {
            newNode.next = tail.next;
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void display() {
        if (tail == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = tail.next;
        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != tail.next);

        System.out.println(" (Tail)");
    }

    public boolean isEmpty() {
        return tail == null;
    }
}

public class Main {
    public static void main(String[] args) {
        SinglyCircularLinkedList list = new SinglyCircularLinkedList();

        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);

        System.out.println("Circular Linked List:");
        list.display();
    }
}

