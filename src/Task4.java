import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        int randomNumber = random.nextInt(10) + 1;
        int userInput = 0;
        boolean valid = false;

        do {
            System.out.println("Guess the number (1 to 10): ");
            try {
                userInput = scan.nextInt();

                if (userInput >= 1 && userInput <= 10) {
                    valid = true;
                } else {
                    System.out.println("The guess you entered is invalid. Please try again.");
                }

            } catch (InputMismatchException) {
                System.out.println("Please enter an integar between 1 and 10. Please try again.");
                scan.nextLine();
            }
        } while (!valid);
        System.out.println("The random number was: " + randomNumber);

        if (userInput == randomNumber) {
            System.out.println("Correct! You have guessed the right number!");
        } else if (userGuess > randomNumber) {
            System.out.println("Your guess was too high! It was greater than the random number.");
        } else {
            System.out.println("Your guess was too low! It was less than the random number.");
        }
    }
}
