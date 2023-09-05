package neebalgurul.day1;

import java.util.Scanner;

public class Quadrant {

	public static void main(String[] args) 
	{
//		2.
//		Write a program to accept a coordinate point in a XY coordinate system
//		and determine in which quadrant the coordinate point lies.
//		Test Case: Input : x=0 y=5
//		Output : Y axis
//		Input : x=5 y=5
//		Output : Ist Quadrant
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the point  of x and y");
		int x1 = sc.nextInt();
		int y1= sc.nextInt();
		if(x1>0 && y1>0)
		{
			System.out.println("The point lies in the 1st quadrant");
		}
		else if(x1<0 && y1<0)
		{
			System.out.println("the point lies in the third quadrant.");
		}
		
		else if(x1<0 && y1>0)
		{
			System.out.println("the point lies in the second quadrant");
		}
		else if (x1==0 && y1==0)
		{
			System.out.println("origin");
		}
		else if (x1>0 && y1==0)
		{
			System.out.println("x-axis");
		}
		else if(x1==0 && y1>0)
		{
			System.out.println("y-axis");
		}
		else
		{
			System.out.println("the point lies in the fourth quadrant");
		}
	}

}
