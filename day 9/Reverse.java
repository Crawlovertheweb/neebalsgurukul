package neebalgurukul.day9;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args)
	{
			Scanner input=new Scanner(System.in);
			System.out.println("Enter the String name");
			String s=input.nextLine();
			String s1="";
			String s2="";
			String c[]=s.split(" ");
			for(int i=c.length-1;i>=0;i--) {
				s1=s1+c[i]+" ";
			}
			System.out.println(s1);
		}
	}


