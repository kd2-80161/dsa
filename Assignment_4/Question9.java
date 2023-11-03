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

    public int findMax() {
        if (head == null) {
            System.out.println("List is empty.");
            return Integer.MIN_VALUE; // Return a sentinel value
        }

        int max = head.data;
        Node current = head;
        while (current != null) {
            if (current.data > max) {
                max = current.data;
            }
            current = current.next;
        }

        return max;
    }

    public int findMin() {
        if (head == null) {
            System.out.println("List is empty.");
            return Integer.MAX_VALUE; // Return a sentinel value
        }

        int min = head.data;
        Node current = head;
        while (current != null) {
            if (current.data < min) {
                min = current.data;
            }
            current = current.next;
        }

        return min;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
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

        System.out.println("Linked List:");
        list.display();

        int max = list.findMax();
        System.out.println("Maximum value in the list: " + max);

        int min = list.findMin();
        System.out.println("Minimum value in the list: " + min);
    }
}

