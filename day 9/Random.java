package neebalgurukul.day9;

public class Random
{
    public static void main(String[] args) {
        int min = 50; // Minimum value (inclusive)
        int max = 100; // Maximum value (inclusive)

        // Create a Random object
        java.util.Random random = new java.util.Random();

        // Generate a random number within the specified range
        int randomNumber = random.nextInt(max - min + 1) + min;

        // Output the generated random number
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Random Number: " + randomNumber);
    }
}

