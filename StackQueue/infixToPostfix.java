import java.util.*;

public class infixToPostfix {

    public static String infixToPost(String infix) {
        Stack<String> operator = new Stack<>();
        List<String> postfix = new ArrayList<>();
        for (String current : infix.split(" ")) {
            if (current.equals("(")) {
                operator.push(current);
            } else if (current.equals(")")) {
                while (!operator.empty() && !operator.peek().equals("(")) {
                    postfix.add(operator.pop());
                }
                operator.pop(); // Discard the "("
            } else if (isOperator(current)) {
                while (!operator.empty() && hasLowerPrecedence(current, operator.peek())) {
                    postfix.add(operator.pop());
                }
                operator.push(current);
            } else {
                postfix.add(current);
            }
        }
        while (!operator.empty()) {
            postfix.add(operator.pop());
        }
        return String.join(" ", postfix);
    }

    // cek jika kedudukan dari operator di stack lebih tinggi dari current
    public static boolean hasLowerPrecedence(String current, String stack) {
        if (stack.equals("(") || stack.equals(")")) {
            return false;
        }
        return (current.equals("+") || current.equals("-")) && (stack.equals("*") || stack.equals("/"));
    }

    // to check if the character is an operator
    public static boolean isOperator(String op) {
        return List.of("+", "-", "*", "/", "^").contains(op);
    }

    // evaluate postfix expression
    public static int evaluated(String post) {
        Stack<Integer> stack = new Stack<>();
        for (String component : post.split(" ")) {
            if (isNumeric(component)) {
                // jka komponennya angka, akan di push ke stack dan di parse ke integer karena
                // inputnya berupa string
                stack.push(Integer.parseInt(component));
            } else {
                int num1 = stack.pop();
                int num2 = stack.pop();
                switch (component) {
                    case "+" -> stack.push(num2 + num1);
                    case "-" -> stack.push(num2 - num1);
                    case "*" -> stack.push(num2 * num1);
                    case "/" -> stack.push(num2 / num1);
                    case "%" -> stack.push(num2 % num1);
                }
            }
        }
        return stack.pop();
    }

    public static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException error) {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("1. Infix to Postfix");
        System.out.println("2. Evaluate Postfix");

        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();
        switch (choice) {

            case 1:
                System.out.println("Enter the infix expression: ");
                sc.nextLine();
                String infix = sc.nextLine();

                System.out.println("The postfix expression is: ");
                System.out.println(infixToPost(infix));
                break;
            case 2:
                System.out.println("Enter the postfix expression: ");
                sc.nextLine();
                String postfix = sc.nextLine();

                System.out.println("The evaluated expression is: ");
                System.out.println(evaluated(postfix));
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}