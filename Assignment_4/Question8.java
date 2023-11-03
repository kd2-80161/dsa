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

    public void insertInSortedOrder(int data) {
        Node newNode = new Node(data);

        if (head == null || head.data >= data) {
            // If the list is empty or the new value is smaller than the head's value,
            // insert at the beginning.
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null && current.next.data < data) {
                current = current.next;
            }
            // Insert after the current node to maintain sorted order.
            newNode.next = current.next;
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
}

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.insertInSortedOrder(4);
        list.insertInSortedOrder(2);
        list.insertInSortedOrder(7);
        list.insertInSortedOrder(1);
        list.insertInSortedOrder(5);

        System.out.println("Linked List with Values Inserted in Sorted Order:");
        list.display();
    }
}

