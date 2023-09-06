package neebalgurul.day1;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) 
	{
//		1. 5
//		4 5
//		3 4 5
//		2 3 4 5
//		1 2 3 4 5		
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the number");
  int n =sc.nextInt();
  for(int i=5; i>=1; i--)
  {
for(int j=i;j<=5;j++) {
	System.out.print(j);
}
	  System.out.println(" ");
  }
   
    }
	}


