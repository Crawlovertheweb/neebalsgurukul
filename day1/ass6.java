package neebalgurul.day1;

import java.util.Scanner;

public class ass6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number which you want to check");
         int no = sc.nextInt();
         int temp = no;
         int d1,d2,d3;
         d1 = no/100;
         d2 = (no%100)/10;
         d3= no%10;
         int check = (int) ((int) Math. pow(d1,3) + Math.pow(d2,3) + Math.pow(d3,3));
         if(check == temp)
         {
        	System.out.println("Armstrong number"); 
         }
         else
         {
        	 System.out.println("not armstrong number");
         }
	}

}
