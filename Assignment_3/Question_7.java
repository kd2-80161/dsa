import java.util.Stack;

public class QueueUsingStacks<T> {
    private Stack<T> stack1;  // For enqueue operation
    private Stack<T> stack2;  // For dequeue operation

    public QueueUsingStacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void enqueue(T value) {
        stack1.push(value);
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty.");
        }

        // If stack2 is empty, transfer elements from stack1 to stack2.
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        // Pop the front element from stack2.
        return stack2.pop();
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty.");
        }

        // If stack2 is empty, transfer elements from stack1 to stack2.
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        // Peek at the front element in stack2 without removing it.
        return stack2.peek();
    }

    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public int size() {
        return stack1.size() + stack2.size();
    }

    public static void main(String[] args) {
        QueueUsingStacks<Integer> queue = new QueueUsingStacks<>();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Front element: " + queue.peek());
        System.out.println("Dequeued element: " + queue.dequeue());
        System.out.println("Front element: " + queue.peek());
    }
}

