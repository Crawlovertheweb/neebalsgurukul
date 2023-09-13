package neebalgurukul.day9;

import java.util.Scanner;

public class Countwords {

	public static void main(String[] args)
	{
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter a sentence: ");
		        String input = scanner.nextLine();

		        int wordCount = countWords(input);

		        System.out.println("Number of words: " + wordCount);
		    }

		    public static int countWords(String sentence) {
		        if (sentence == null || sentence.isEmpty()) {
		            return 0;
		        }

		        // Split the sentence into words using whitespace as the delimiter
		        String[] words = sentence.split("\\s+");

		        // Count and return the number of words
		        return words.length;
		    }
		}

	
