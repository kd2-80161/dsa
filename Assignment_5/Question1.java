class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoublyCircularLinkedList {
    private Node head;

    public DoublyCircularLinkedList() {
        head = null;
    }

    public void addNodeAtPosition(int data, int position) {
        Node newNode = new Node(data);
        if (head == null) {
            newNode.next = newNode;
            newNode.prev = newNode;
            head = newNode;
        } else {
            Node current = head;
            int count = 1;
            while (count < position - 1 && current.next != head) {
                current = current.next;
                count++;
            }
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }
    }

    public void deleteNodeAtPosition(int position) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = head;
        int count = 1;
        while (count < position && current.next != head) {
            current = current.next;
            count++;
        }

        if (count < position) {
            System.out.println("Position not found");
            return;
        }

        Node prevNode = current.prev;
        Node nextNode = current.next;

        if (current == head) {
            head = nextNode;
        }

        prevNode.next = nextNode;
        nextNode.prev = prevNode;
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = head;
        do {
            System.out.print(current.data + " <-> ");
            current = current.next;
        } while (current != head);

        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        DoublyCircularLinkedList list = new DoublyCircularLinkedList();

        list.addNodeAtPosition(1, 1);
        list.addNodeAtPosition(2, 2);
        list.addNodeAtPosition(3, 3);
        list.addNodeAtPosition(4, 4);

        list.display();

        list.deleteNodeAtPosition(2);
        list.display();
    }
}

