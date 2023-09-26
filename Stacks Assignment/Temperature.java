package LeetCode;

import java.util.Stack;

public class Temperature 
{
public static int[] Temperature(int[] temp)
{
	Stack<Integer> h1 = new Stack<>();
	int n = temp.length;
	int [] r = new int[n];
	for(int idx = n-1; idx>=0; idx--)
	{
		while(!h1.isEmpty() && temp[idx]>= temp[h1.peek()])
			
		{
	    h1.pop();
		}
		
		if(!h1.isEmpty())
		{
			r[idx] = h1.peek() - idx;
		}
	h1.push(idx);	
	}
	return r;
}

public static void main(String[] args)
{
	int[] temp = {30,40,50,60};
    int[] result = Temperature(temp);

    for (int t : result) {
        System.out.print(t + " ");
    }
	
}


}
