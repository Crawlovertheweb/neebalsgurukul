package neebalgurul.day1;

import java.util.Scanner;

public class Day3_Assignment3_Problem1 
{

	public static void main(String[] args) 
	{
		
		int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Enter the numbers you want to add to the array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
		for(int i=0, j=n-1; i<j;i++, j--)
		{
			int temp =a[i];
			  a[i]= a[j];
			 a[j] = temp;
		}
		for(int i: a)
		{
		System.out.println("Reverse array is :");	
		System.out.println(i);				
	}
	}
	}
        
        	
        
	
