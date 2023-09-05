package neebalgurul.day1;

import java.util.Scanner;

public class Fibonacci 
{

	public static void main(String[] args)
	{
		//4) Print first 10 even fibonacii numbers	
    int n1=0,n2 =1,n3;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the fibonacci number");
    int n =sc.nextInt();
    for(int i=2;i<=n; i++)
    {
    	n3 = n1+n2;
    	if(n3%2==0)
    	{
    		System.out.print(" "+n3);
    	}
    	n1= n2;
    	n2=n3;
    	}
    	
    }
	}


