package neebalgurul.day1;

import java.util.Scanner;

public class day8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
      // Input name and units consumed

      System.out.print("Enter The Name: ");

      String name = scanner.nextLine();

      System.out.print("Enter the Units Consumed: ");

      int units = scanner.nextInt();
      double bill = 0;

      if (units <= 100) {

          bill = units * 4;

      } 

      else if (units <= 300) {

          bill = 100 * 4 + (units - 100) * 5;

      } 

      else {

          bill = 100 * 4 + 200 * 5 + (units - 300) * 10;

      }

      double amount=bill;

      double surcharge = 0;

      if (amount > 1000) {

          surcharge = 0.05 * amount;

      }

      double gst = 0.18 * (amount + surcharge);

      double totalAmount = amount + surcharge + gst;

      System.out.println("Name: " + name);

      System.out.println("Units Consumed: " + units);

      System.out.println("Amount: " + totalAmount);
	}

}
