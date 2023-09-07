package neebalgurul.day1;

import java.util.Scanner;

public class Day3_Assignment4_Problem6 
{

	public static void main(String[] args) 
	{
		int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        n = sc.nextInt();
        int[] profits = new int[n];

        System.out.println("Enter the numbers you want to add to the array:");
        for (int i = 0; i < n; i++) {
            profits[i] = sc.nextInt();
        }
		       
		        int year = 2001;
		        
		        for (int i = 0; i < profits.length - 1; i++) {
		            if (profits[i] > profits[i + 1]) {
		                year += i + 1; 
		  
		                System.out.println("declined profit in the Year " + year + ": " + profits[i + 1]); 
		                break;
		            }		    
	}

	}
}


