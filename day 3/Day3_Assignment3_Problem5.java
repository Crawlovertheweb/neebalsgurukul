package neebalgurul.day1;

import java.util.Scanner;


public class Day3_Assignment3_Problem5 {

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

System.out.println(" ");
        int min = a[0];
        int minIndex = 0;
        for(int j=0; j<a.length; j++)
        {
        	if(min > a[j])
        	{
        		min = a[j];
        		minIndex =j;
        	}
        }
        System.out.println("minimum is :"+min);
        System.out.println("index value is:"+minIndex);
    
    }
}
