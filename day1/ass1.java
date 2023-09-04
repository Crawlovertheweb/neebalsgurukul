package neebalgurul.day1;

import java.util.Scanner;

public class ass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
      System.out.println("Enter the milliseconds you want to check: ");
      long milliseconds = sc.nextLong();
      
      // Calculate seconds, minutes, and hours
      long seconds = (milliseconds / 1000) % 60;
      long minutes = (milliseconds / (1000 * 60)) % 60;
      long hours = (milliseconds / (1000 * 60 * 60)) % 24;

      System.out.println(hours + ":" + minutes + ":" + seconds);

	}

}
