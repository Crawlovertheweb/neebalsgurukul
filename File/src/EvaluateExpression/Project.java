package EvaluateExpression;

import java.io.*;
import java.util.*;

public class Project {
    public static void main(String[] args) {
        try {
            FileReader f = new FileReader("D:\\Javacodes\\File\\src\\EvaluateExpression\\Expression.txt");
            BufferedReader br = new BufferedReader(f);
            String exp = br.readLine();
            br.close();

            if (exp != null && !exp.isEmpty()) {
                if (!Balanceexpression(exp)) {
                    write("Compile time error: Unbalanced parentheses");
                    return;
                }

                if (!validarithmeticoperator(exp)) {
                    write("Compile time error: Invalid operators");
                    return;
                }

                Scanner sc = new Scanner(System.in);

                Map<Character, Double> v = new HashMap<>();
                for (char c : exp.toCharArray()) {
                    if (Character.isAlphabetic(c) && !v.containsKey(c)) {
                        System.out.print("Enter value for variable " + c + ": ");
                        double value = sc.nextDouble();
                        v.put(c, value);
                    }
                }
                double result = evaluateexp(exp, v);
                write("Result: " + result);
            } else {
                System.out.println("exp is empty");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean Balanceexpression(String exp) {
        Stack<Character> stack = new Stack<>();
        for (char c : exp.toCharArray()) {
            if (c == '(') {
                stack.push('(');
            } else if (c == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static boolean validarithmeticoperator(String exp) {
        String operators = "+-*/";
        for (char c : exp.toCharArray()) {
            if (operators.contains(String.valueOf(c)) || Character.isAlphabetic(c)) {
                continue;
            } else if (c != ' ' && c != '(' && c != ')') {
                return false;
            }
        }
        return true;
    }

    public static double evaluateexp(String exp, Map<Character, Double> v) {
        Stack<Double> operandStack = new Stack<>();
        Stack<Character> operatorStack = new Stack<>();
        int i = 0;

        while (i < exp.length()) {
            char c = exp.charAt(i);

            if (Character.isWhitespace(c)) {
                i++;
                continue;
            }

            if (Character.isDigit(c) || c == '.') {
                StringBuilder operandBuilder = new StringBuilder();
                while (i < exp.length() && (Character.isDigit(c) || c == '.')) {
                    operandBuilder.append(c);
                    i++;
                    if (i < exp.length()) {
                        c = exp.charAt(i);
                    }
                }
                operandStack.push(Double.parseDouble(operandBuilder.toString()));
            } else if (Character.isAlphabetic(c)) {
                double variableValue = v.getOrDefault(c, 0.0);
                operandStack.push(variableValue);
                i++;
            } else if (isOperator(c)) {
                while (!operatorStack.isEmpty() && hasHigherPrecedence(c, operatorStack.peek())) {
                    double operand2 = operandStack.pop();
                    double operand1 = operandStack.pop();
                    char operator = operatorStack.pop();
                    operandStack.push(performOperation(operand1, operand2, operator));
                }
                operatorStack.push(c);
                i++;
            } else if (c == '(') {
                operatorStack.push(c);
                i++;
            } else if (c == ')') {
                while (!operatorStack.isEmpty() && operatorStack.peek() != '(') {
                    char operator = operatorStack.pop();
                    double operand2 = operandStack.pop();
                    double operand1 = operandStack.pop();
                    operandStack.push(performOperation(operand1, operand2, operator));
                }
                if (!operatorStack.isEmpty() && operatorStack.peek() == '(') {
                    operatorStack.pop();
                }
                i++;
            } else {
                System.err.println("Compile time error: Invalid character '" + c + "'");
                return 0.0;
            }
        }

        while (!operatorStack.isEmpty()) {
            char operator = operatorStack.pop();
            double operand2 = operandStack.pop();
            double operand1 = operandStack.pop();
            operandStack.push(performOperation(operand1, operand2, operator));
        }

        if (!operandStack.isEmpty()) {
            return operandStack.pop();
        } else {
            System.err.println("Compile time error: Empty exp");
            return 0.0;
        }
    }

    public static boolean hasHigherPrecedence(char op1, char op2) {
        int precedence1 = getPrecedence(op1);
        int precedence2 = getPrecedence(op2);
        return precedence1 > precedence2;
    }

    static int getPrecedence(char c) {
        switch (c) {
            case '*':
            case '/':
            case '%':
                return 4;
            case '+':
            case '-':
                return 3;
            case '(':
            case ')':
                return 2;
        }
        return 0;
    }

    public static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    public static double performOperation(double operand1, double operand2, char operator) {
        switch (operator) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                if (operand2 == 0) {
                    System.err.println("Compile time error: Division by zero");
                    System.exit(1);
                } else {
                    return operand1 / operand2;
                }
            default:
                System.err.println("Compile time error: Invalid operator '" + operator + "'");
                System.exit(1);
                return 0.0;
        }
    }

    public static void write(String message) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("Result.txt"));
            bw.write(message);
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
