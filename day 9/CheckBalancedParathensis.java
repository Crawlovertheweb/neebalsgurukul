package neebalgurukul.day9;

import java.util.Scanner;

public class CheckBalancedParathensis 
{

	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=input.next();
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='(') {
				count++;
			}else if(s.charAt(i)==')') {
				count--;
				if(count<0) {
					System.out.println("False");
					break;
				}
				
			}
		}
		if(count==0)
		{
			System.out.println("True");
		}
		
		
	}

}
