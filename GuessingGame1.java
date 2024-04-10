import java.util.Random;
import java.util.Scanner;

public class GuessingGame1 {
    Scanner scanner = new Scanner(System.in);
    private int number; // Number chosen by the computer
    private int selectNumber; // Number we choose
    private int countGuess = 0; // Number of attempts

    // Method to set up the game by choosing a random number
    public void setup(){
        Random random = new Random();
        number = random.nextInt(101); // Generates a random number between 0 and 100
    }

    // Method to accept the user's guess and provide feedback
    public String acceptGuess(){

        System.out.println("\nGuess the number:"); // Prompts the user to guess the number
        selectNumber = scanner.nextInt();
        countGuess += 1; // Increments the count of attempts

        if(selectNumber < 0 || selectNumber > 100){
            System.out.println("\nPlease put numbers between 1 and 100:");
            return acceptGuess();
        }
        else if(selectNumber > number){
            System.out.println("Lower");
            return acceptGuess();
        }else if (selectNumber < number){
            System.out.println("Higher");
            return acceptGuess();
        }else{
            return "Correct guess! Your countGuess was: " + countGuess;
        }
    }

    // Main method to run the game
    public static void main(String[] args) {
        GuessingGame1 game = new GuessingGame1(); // Creates an instance of the GuessingGame class
        game.setup(); // Sets up the game by choosing a random number
        System.out.println(game.acceptGuess()); // Prints the game result by accepting the user's guesses
        
    }

}