import java.util.Scanner;

public class Sum {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a,b;
		while(true) {
			try {
				System.out.println("Enter the first Number:");
				a=Integer.parseInt(sc.nextLine());
				System.out.println("Enter the Second Number:");
				b=Integer.parseInt(sc.nextLine());
				int sum=a+b;
				System.out.println("Sum of "+a+" and "+b+" is "+sum);
				break;
			}catch(NumberFormatException e) {
				System.out.println("Invalid Input!!! \n Please try again");
			}
		}

	}

}
