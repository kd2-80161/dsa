import java.util.Stack;

public class PrefixEvaluation {
    public static int evaluatePrefix(String expression) {
        Stack<Integer> stack = new Stack<>();
        
        for (int i = expression.length() - 1; i >= 0; i--) {
            char c = expression.charAt(i);
            if (Character.isDigit(c)) {
                stack.push(Character.getNumericValue(c));
            } else {
                int operand1 = stack.pop();
                int operand2 = stack.pop();
                int result = performOperation(c, operand1, operand2);
                stack.push(result);
            }
        }

        return stack.pop();
    }

    private static int performOperation(char operator, int operand1, int operand2) {
        switch (operator) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                if (operand2 == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }

    public static void main(String[] args) {
        String prefixExpression = "+*235";
        int result = evaluatePrefix(prefixExpression);
        System.out.println("Result of prefix evaluation: " + result);
    }
}

