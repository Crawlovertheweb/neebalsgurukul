package neebalgurukul.day9;

import java.util.Scanner;

public class RemoveWhitespace {

	public static void main(String[] args) 
	{
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter a sentence: ");
		        String input = scanner.nextLine();

		        // Remove whitespace characters from the input string
		        String result = input.replaceAll("\\s", "");

		        System.out.println("Output: " + result);
		    }
		}


