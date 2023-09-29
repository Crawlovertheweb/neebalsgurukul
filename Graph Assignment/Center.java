package LeetCode;

public class Center 
{
	public static int center(int edge[][])
	{
		int a = edge[0][0];
		int b = edge[0][1];
		int c = edge[1][0];
		int d= edge[1][1];
		if(a==c||a==d)
		{
			return a;
			
		}
		if(b==c || b==d)
		{
			return b;
		}
		return 0;
		
	}

	public static void main(String[] args)
	{
		int edge[][] = {
                
                {1, 2},
                { 2, 3},
                {4, 2}
        };
		int result = center (edge);
		System.out.println(result);

	}

}
