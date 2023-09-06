package neebalgurul.day1;

import java.util.Scanner;

public class Pat3 {

	public static void main(String[] args) 
	{
		
//problem 3
		Scanner sc = new Scanner(System.in);
	System.out.println("enter the no");
	int n = sc.nextInt();
			
		
for (int i = 1; i <=n; i++) {

			

		    for (int j = n; j >= 1; j--) {

		    	

		    	if(i==j) {

		    		System.out.print(j);

		    	}

		        

		    	else {

		    		System.out.print(" ");

		    	}

		    }



		    for (int j = 2; j <= n; j++) {

		    	if(i==j)

		    	System.out.print(j);

		    	else

		    		System.out.print(" ");

		    }



		    System.out.println();

		}

		

		for (int i = 4; i >=1; i--) {

		    for (int j = n; j >= 1; j--) {

		    	if(i==j)

		        System.out.print(j);

		    	else

		    		System.out.print(" ");

		    }



		    for (int j = 2; j <= n; j++) {

		    	if(i==j)

		    	System.out.print(j);

		    	else

		    		System.out.print(" ");

		    }



		    System.out.println();

		}
     
	}

}
