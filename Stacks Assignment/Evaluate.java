package LeetCode;

import java.util.Stack;

public class Evaluate 
{
		public static int exp(String[] tokens) {
			Stack<Integer> stack = new Stack<>();
			for (String token : tokens) {
				if (isoperator(token)) {
					int operand2 = stack.pop();
					int operand1 = stack.pop();
					int result = operation(token, operand1, operand2);
					stack.push(result);
				} else {
					stack.push(Integer.parseInt(token));
				}
			}
			return stack.pop();
		}

		private static int operation(String token, int operand1, int operand2) {
			switch(token)
			{
			case "+":
					return operand1 + operand2;
			case "-":
					return operand1 - operand2;
			case "*":
					return operand1 * operand2;
			case "/":
				 	return operand1 / operand2;
			default:	 	
				 	return 0;
			}
			
		}

		private static boolean isoperator(String token) {
			return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
		}

		public static void main(String[] args)
		{
			String token[]={"2","1","+","3","*"};
			int result=exp(token);
			System.out.println(result);

		}
}
