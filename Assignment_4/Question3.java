class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class LinkedList {
    ListNode head;

    public LinkedList() {
        head = null;
    }

    public void append(int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode;
        } else {
            ListNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public ListNode findMiddle() {
        if (head == null) {
            return null; // Empty list
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);

        ListNode middleNode = list.findMiddle();

        if (middleNode != null) {
            System.out.println("The middle node is: " + middleNode.val);
        } else {
            System.out.println("The list is empty.");
        }
    }
}

