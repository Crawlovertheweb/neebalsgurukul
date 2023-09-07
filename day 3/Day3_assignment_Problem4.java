package neebalgurul.day1;

import java.util.Scanner;

public class Day3_assignment_Problem4 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the numbers you want to add to the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
				
		        int totaltime = 0;
		        
		        for (int i = 0; i < arr.length - 1; i += 2) {
		            int time1 = arr[i];
		            int time2 = arr[i + 1];
		            int minutes1 = (time1 / 100) * 60 + (time1 % 100);
		            int minutes2 = (time2 / 100) * 60 + (time2 % 100);
		            totaltime += minutes2 - minutes1;
		        }
		        
		        int h = totaltime / 60;
		        int m = totaltime % 60;

		        System.out.println("Running time: " + h + " hr " + m + " min");
	}

}
