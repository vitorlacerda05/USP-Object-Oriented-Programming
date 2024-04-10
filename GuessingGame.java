// Vitor Antonio de Almeida Lacerda - 12544761
// Felipe Oliveira Carvalho - 14613879

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    Scanner scanner = new Scanner(System.in);
    private int number; // Number chosen by the computer
    private int selectNumber; // Number we choose
    private int countGuess = 0; // Number of attempts

    // Method to set up the game by choosing a random number
    public void setup(){
        Random random = new Random();
        number = random.nextInt(101); // Generates a random number between 0 and 100
    }

    public void feedback(){
        if (selectNumber == number) {
            System.out.println("Correct guess!");
        } else if (selectNumber < number) {
            System.out.println("Higher");
        } else {
            System.out.println("Lower");
        }
    }

    public void printCountGuess(){
        System.out.println("Your countGuess was: " + countGuess);
    }

    // Method to accept the user guess and provide feedback
    public void acceptGuess(){
        boolean correctGuess = false;

        while (!correctGuess) {
            System.out.println("\nGuess the number:"); // Prompts the user to guess the number
            selectNumber = scanner.nextInt();
            countGuess++; // Increments the count of attempts

            if (selectNumber < 0 || selectNumber > 100) {
                System.out.println("\nPlease put numbers between 0 and 100:");
            } else {
                feedback();
                if (selectNumber == number) {
                    correctGuess = true;
                }
            }
        }
        printCountGuess();
    }

    // Main method to run the game
    public static void main(String[] args) {
        GuessingGame game = new GuessingGame(); // Creates an instance of the GuessingGame class
        game.setup(); // Sets up the game by choosing a random number
        game.acceptGuess(); // Starts the game by accepting the user's guesses
    }
}
