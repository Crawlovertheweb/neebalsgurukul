package neebalgurul.day1;

import java.util.Scanner;

public class Bound {

	public static void main(String[] args) 
	{
		
	//3. Input the lower bound and upper bound then print all the Fibonacci numbers within the
	//	bound
	//	Test case : Input lower =5 and upper= 40

	//	Output: 5 8 13 21 34	
		        int a=0,b=1,c;
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter the upper bound");
		        int upper = sc.nextInt();
		        System.out.println("Enter the lower number");
		        int lower = sc.nextInt(); 
		        if(lower==a)
		        {
		        	System.out.println(" "+a);
		        }
		        if(lower<=b)
		        {
		        	System.out.println(" "+b);
		        }
		        for (; true;)
		        {
		            c=a+b;
		            a=b;
		            b=c;
		            if(lower<=c && upper>=c)
		            {
		            	System.out.println(" "+c);
		            }
		            else if(upper<c){
		            	break;
		            }
		        }
		    }
		
   
   
	}


