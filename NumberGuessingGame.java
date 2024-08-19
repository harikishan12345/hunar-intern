import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        // Create a random number generator
        Random random = new Random();
        
        // Generate a random number between 1 and 100
        int numberToGuess = random.nextInt(100) + 1;
        
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Variable to store the user's guess
        int userGuess = 0;
        
        // Variable to store the number of attempts
        int numberOfAttempts = 0;
        
        // Display an introductory message explaining the rules of the game
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Rules of the Game:");
        System.out.println("1. I have selected a random number between 1 and 100.");
        System.out.println("2. Your goal is to guess the number.");
        System.out.println("3. I will tell you if your guess is too high, too low, or correct.");
        System.out.println("4. Keep guessing until you find the correct number.");
        System.out.println("Good luck!");

        // Loop until the user guesses the correct number
        while (userGuess != numberToGuess) {
            // Prompt the user to enter a guess
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            numberOfAttempts++;
            
            // Core game logic: Compare the user's guess with the target number
            if (userGuess < numberToGuess) {
                System.out.println("Your guess is too low. Try again!");
            } else if (userGuess > numberToGuess) {
                System.out.println("Your guess is too high. Try again!");
            } else {
                System.out.println("Congratulations! You guessed the number in " + numberOfAttempts + " attempts.");
            }
        }
        
        // Close the scanner
        scanner.close();
    }
}

