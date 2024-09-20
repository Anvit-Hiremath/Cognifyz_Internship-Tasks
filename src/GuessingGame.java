import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        int secretNumber = (int) (Math.random() * 100) + 1;
        int attempts = 0;
        int maxAttempts = 5;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I've chosen a random number between 1 and 100.");

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess == secretNumber) {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                break;
            } else if (guess < secretNumber) {
                System.out.println("Your guess is too low.");
            } else {
                System.out.println("Your guess is too high.");
            }
        }

        if (attempts == maxAttempts) {
            System.out.println("Sorry, you ran out of attempts. The secret number was " + secretNumber);
        }

        scanner.close();
    }
}