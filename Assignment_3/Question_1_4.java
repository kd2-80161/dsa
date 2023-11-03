import java.util.Stack;

public class InfixToPrefixConversion {
    public static String infixToPrefix(String infixExpression) {
        StringBuilder prefix = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        infixExpression = new StringBuilder(infixExpression).reverse().toString();

        for (char c : infixExpression.toCharArray()) {
            if (Character.isDigit(c)) {
                prefix.insert(0, c);
            } else if (c == ')') {
                stack.push(c);
            } else if (c == '(') {
                while (!stack.isEmpty() && stack.peek() != ')') {
                    prefix.insert(0, stack.pop());
                }
                stack.pop(); // Remove the ')'
            } else {
                while (!stack.isEmpty() && getPrecedence(stack.peek()) >= getPrecedence(c)) {
                    prefix.insert(0, stack.pop());
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            prefix.insert(0, stack.pop());
        }

        return prefix.toString();
    }

    private static int getPrecedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return 0; // Lower precedence for other characters
        }
    }

    public static void main(String[] args) {
        String infixExpression = "2+3*5";
        String prefixExpression = infixToPrefix(infixExpression);
        System.out.println("Infix to Prefix Conversion: " + prefixExpression);
    }
}

