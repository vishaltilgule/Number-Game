package CodeSoft_Task;
import java.util.*;
import java.util.random.*;

	
	import java.util.Random;
	import java.util.Scanner;

	public class Number_Game {
	    public static void playGame() {
	        Scanner sc = new Scanner(System.in);
	        Random random = new Random();
	        int upperLimit = 100;
	        int lowerLimit = 1;
	        int Score = 0;
	        int maxAttempt = 3;
	        int rounds;
	        int totalRounds = 4;

	        System.out.println("|| Welcome to Number_Game ||");

	        for (rounds = 1; rounds <= totalRounds; rounds++) {
	            int random_num = random.nextInt(upperLimit - lowerLimit + 1) + lowerLimit;

	            System.out.printf("Round %d%n", rounds);
	            System.out.printf("The number is between %d and %d.%n", lowerLimit, upperLimit);
	            System.out.printf("You have %d attempts to guess the number.%n", maxAttempt);

	            for (int attempt = 1; attempt <= maxAttempt; attempt++) {
	                System.out.print("Enter your guess: ");
	                int userGuess = sc.nextInt();

	                if (userGuess > random_num) {
	                    System.out.println("Sorry, that's too high. Please try again.");
	                } else if (userGuess < random_num) {
	                    System.out.println("Sorry, that's too low. Please try again.");
	                } else {
	                    System.out.println("Congratulations, your guess is correct!");
	                    Score++;
	                    break;
	                }

	                if (attempt == maxAttempt) {
	                    System.out.println("You've used all your attempts.");
	                }
	            }

	            if (rounds < totalRounds) {
	                System.out.print("Do you want to play again? (yes/no): ");
	                String playAgain = sc.next().toLowerCase();
	                if (!playAgain.equals("yes")) {
	                    System.out.printf("Thanks for playing! You won %d round%s.%n", Score, (Score != 1) ? "s" : "");
	                    break;
	                }
	            }
	        }
	    }

	    public static void main(String[] args) {
	        playGame();
	    }
	}
	