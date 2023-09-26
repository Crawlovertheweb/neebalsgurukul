package LeetCode;

import java.util.Stack;

public class BaseBall 
{
	static  int basketball(String []s)
	{
		Integer topel =null;
		Integer secondtopel = null;
        Stack<Integer> stack = new Stack<Integer>();
        for(String op:s)
        {
        	switch(op.toCharArray()[0])
        	{
        	case 'C' : stack.pop();
        	break;
        	case 'D' : topel = stack.peek();
        	stack.push(2*topel);
        	break;
        	case '+' : topel = stack.pop();
        	secondtopel = stack.peek();
        	stack.push(topel);
        	stack.push(topel+secondtopel);
        	break;
        	default:stack.push(Integer.parseInt(op));
        	break;
        	}
        }
	int ans =0;
	while(!stack.isEmpty())
	{
		ans =  ans + stack.pop();
	}
	return ans;
	
	}

	public static void main(String[] args)
	{
	String []s = {"1","C"};
	int result =  basketball(s);
	System.out.println("the result is " +result);
	

	}

}
