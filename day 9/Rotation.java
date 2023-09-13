package neebalgurukul.day9;

import java.util.Scanner;

public class Rotation {

	public static void main(String[] args) 
	{
		 Scanner input=new Scanner(System.in);
    	 System.out.println("Enter First String");
    	 String s=input.next();
    	 System.out.println("Enter Second String");
    	 String s1=input.next();
    	 int i=0;
    	 while(i<s.length()/2) {
    		 String s3=s.substring(0, s.length()-1);
    		 char s2=s.charAt(s.length()-1);
    		 s=s2+s3;
    		 i++;
    	 }
    	 System.out.println(s.equals(s1));
	}

}
