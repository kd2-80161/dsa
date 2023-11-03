import java.util.Stack;

public class MaxStack {
    private Stack<Integer> mainStack;
    private Stack<Integer> maxStack;

    public MaxStack() {
        mainStack = new Stack<>();
        maxStack = new Stack<>();
    }

    public void push(int value) {
        mainStack.push(value);
        if (maxStack.isEmpty() || value >= maxStack.peek()) {
            maxStack.push(value);
        }
    }

    public int pop() {
        if (mainStack.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        if (mainStack.peek() == maxStack.peek()) {
            maxStack.pop();
        }
        return mainStack.pop();
    }

    public int getMax() {
        if (maxStack.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return maxStack.peek();
    }

    public boolean isEmpty() {
        return mainStack.isEmpty();
    }

    public int size() {
        return mainStack.size();
    }

    public static void main(String[] args) {
        MaxStack maxStack = new MaxStack();

        maxStack.push(3);
        maxStack.push(5);
        maxStack.push(2);
        maxStack.push(7);
        maxStack.push(1);

        System.out.println("Maximum value in the stack: " + maxStack.getMax());

        maxStack.pop();
        maxStack.pop();

        System.out.println("Maximum value in the stack after two pops: " + maxStack.getMax());
    }
}

