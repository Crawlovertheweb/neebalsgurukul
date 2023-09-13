package neebalgurukul.day9;

import java.util.Scanner;

public class CamelCase {

	public static void main(String[] args) 
	{
			Scanner input=new Scanner(System.in);
			System.out.println("Enter the String");
			String s=input.next();
			int count=1;
			char[] ch = s.toCharArray();
			for(char chh : ch) {
		         if(chh >='A' && chh <='Z') {
		            count++;
			}
			}
			System.out.println(count);
	}

}
