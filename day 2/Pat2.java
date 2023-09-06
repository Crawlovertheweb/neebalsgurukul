package neebalgurul.day1;

import java.util.Scanner;

public class Pat2 {

	public static void main(String[] args) 
	{
//		2. A
//		C B
//		E D C
//		G F E D
//		I H G F E
//		G F E D
//		E D C
//		C B
//		A	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value of n");
	int n = sc.nextInt();
	for(int i=1; i<=n; i++)
	{
	for(int j=i*2-1; j>=i; j--)
	{
	System.out.print((char)(j+64));
	}
	System.out.println(" ");
	}
	for(int i=n; i>=1; i--)
	{
	for(int j=i*2-1; j>=i; j--)
	{
	System.out.print((char)(j+64));
	}
	System.out.println(" ");
	}
	}

}
