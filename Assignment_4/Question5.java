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

    public Node findNode(int targetData) {
        Node current = head;
        while (current != null) {
            if (current.data == targetData) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void insertAfter(int targetData, int newData) {
        Node newNode = new Node(newData);
        Node targetNode = findNode(targetData);
        if (targetNode != null) {
            newNode.next = targetNode.next;
            targetNode.next = newNode;
        } else {
            System.out.println("Target node not found.");
        }
    }

    public void insertBefore(int targetData, int newData) {
        Node newNode = new Node(newData);
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.data == targetData) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != targetData) {
            current = current.next;
        }

        if (current.next != null) {
            newNode.next = current.next;
            current.next = newNode;
        } else {
            System.out.println("Target node not found.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(4);

        System.out.println("Original Linked List:");
        list.display();

        list.insertAfter(2, 5);
        System.out.println("Linked List after inserting 5 after 2:");
        list.display();

        list.insertBefore(3, 6);
        System.out.println("Linked List after inserting 6 before 3:");
        list.display();
    }
}

