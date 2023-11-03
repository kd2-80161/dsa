import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueues<T> {
    private Queue<T> queue1;
    private Queue<T> queue2;

    public StackUsingQueues() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    public void push(T value) {
        // Add the new element to the empty queue (either queue1 or queue2).
        if (queue1.isEmpty()) {
            queue2.offer(value);
        } else {
            queue1.offer(value);
        }
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty.");
        }

        Queue<T> nonEmptyQueue = queue1.isEmpty() ? queue2 : queue1;
        Queue<T> emptyQueue = queue1.isEmpty() ? queue1 : queue2;

        // Move all elements except the last one from the non-empty queue to the empty queue.
        while (nonEmptyQueue.size() > 1) {
            emptyQueue.offer(nonEmptyQueue.poll());
        }

        // Retrieve and return the last element from the non-empty queue.
        return nonEmptyQueue.poll();
    }

    public T top() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty.");
        }

        Queue<T> nonEmptyQueue = queue1.isEmpty() ? queue2 : queue1;

        // Move all elements except the last one from the non-empty queue to the other queue.
        Queue<T> tempQueue = new LinkedList<>();
        while (nonEmptyQueue.size() > 1) {
            tempQueue.offer(nonEmptyQueue.poll());
        }

        // Retrieve and return the last element from the non-empty queue.
        T top = nonEmptyQueue.poll();

        // Move the elements back to the original queue.
        while (!tempQueue.isEmpty()) {
            nonEmptyQueue.offer(tempQueue.poll());
        }

        return top;
    }

    public boolean isEmpty() {
        return queue1.isEmpty() && queue2.isEmpty();
    }

    public int size() {
        return queue1.size() + queue2.size();
    }

    public static void main(String[] args) {
        StackUsingQueues<Integer> stack = new StackUsingQueues<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top element: " + stack.top());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Top element: " + stack.top());
    }
}

