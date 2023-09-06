package neebalgurul.day1;

import java.util.Scanner;

public class Pat4 {

	public static void main(String[] args) 
	{
	//problem 	4) * * * * * * * * * *
//	* *
//	* *
//	* *
//	* * * * * * * * * *
 	Scanner sc = new Scanner(System.in);
 	System.out.println("Enter the value of n");
	int n =  sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if(j==i) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}
			if(i==1||i==n) {
				for(int k=1;k<=8;k++) {
					System.out.print(" *");
				}
			}
			else {
				for(int k=1;k<=8;k++) {
					System.out.print("  ");
				}
			}
			System.out.print(" *");
			System.out.println();
		}
	}

}
