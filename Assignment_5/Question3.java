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

class DoublyLinearLinkedList {
    private Node head;
    private Node tail;

    public DoublyLinearLinkedList() {
        head = null;
        tail = null;
    }

    public void insertFront(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void insertRear(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    public int deleteFront() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return -1; // Error value
        }
        int data = head.data;
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        return data;
    }

    public int deleteRear() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return -1; // Error value
        }
        int data = tail.data;
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        return data;
    }

    public int getFront() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return -1; // Error value
        }
        return head.data;
    }

    public int getRear() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return -1; // Error value
        }
        return tail.data;
    }

    public boolean isEmpty() {
        return head == null;
    }
}

public class Main {
    public static void main(String[] args) {
        DoublyLinearLinkedList deque = new DoublyLinearLinkedList();

        deque.insertFront(1);
        deque.insertRear(2);
        deque.insertFront(3);
        deque.insertRear(4);

        System.out.println("Front element: " + deque.getFront());
        System.out.println("Rear element: " + deque.getRear());

        System.out.println("Deleted front element: " + deque.deleteFront());
        System.out.println("Deleted rear element: " + deque.deleteRear());
    }
}

