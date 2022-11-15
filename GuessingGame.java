import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;


public class GuessingGame {
    public GuessingGame() {
        System.out.println("Welcome to the Guessing Game");
        System.out.println("Enter your name:");

        Scanner nameInput = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Your name is " + nameInput.next());

        Random rand = new Random();
        int number = rand.nextInt(100);
        int tries = 0;

        while (true) {
            int guess;
            try {
                guess = input.nextInt();
            } catch (InputMismatchException e) {
                String wrong_input = input.nextLine();
                System.out.println("That's not an number, try again");
                continue;
            }
            if (guess < 1 || guess > 100) {
                System.out.println(guess + " is out of range, try again");
                continue;
            }
            if (guess < number) {
                System.out.println("Your guess is too low, try again.");
            } else if (guess > number) {
                System.out.println("Your guess is too high, try again.");
            } else {
                System.out.println("Well done " + name);
                System.out.println("You found my number in " + tries + " tries!");
                break;
            }
        }
    }
}