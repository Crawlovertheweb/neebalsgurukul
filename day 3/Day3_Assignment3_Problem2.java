package neebalgurul.day1;

import java.util.Scanner;

public class Day3_Assignment3_Problem2 
{

	public static void main(String[] args) 
	{		int n;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the number of elements");
	        n = sc.nextInt();
	        int[] arr = new int[n];

	        System.out.println("Enter the numbers you want to add to the array:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }
			
			int totaldays=arr.length;
			int presentdays=0;
			double attper=0;
			
			for(int i=0;i<totaldays;i++) {
				if(arr[i]==1) {
					presentdays=presentdays+1;
				}
			}
			attper=(double)presentdays/totaldays*100;
			
			System.out.println("Total Days: " + totaldays);
	        System.out.println("Present Days: " + presentdays);
	        System.out.println("Attendance Percentage: " + attper + "%");
	}

}
