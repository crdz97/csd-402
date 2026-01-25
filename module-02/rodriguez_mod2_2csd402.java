//Carolina Rodriguez
//CSD 402 Module 2 Assignment 2     
//Program to play Rock-Paper-Scissors against the computer.

//Resources
//GeeksforGeeks. (2025, April 24). Generating random numbers in Java. GeeksforGeeks.https://www.geeksforgeeks.org/java/generating-random-numbers-in-java/
//W3Schools. (n.d.). Java case keyword. W3Schools.https://www.w3schools.com/java/ref_keyword_case.asp
//CodingWithJohn. (2019, April 21). Create Rock Paper Scissors in Java in 10 Minutes [Video]. YouTube.https://www.youtube.com/watch?v=DyqMglmrido 


import java.util.Random;
import java.util.Scanner;

public class rodriguez_mod2_2csd402{
    public static void main(String[] args) {

        // Create Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Create Random object for computer choice
        Random random = new Random();

        // Generate random computer choice (1, 2, or 3)
        int computerChoice = random.nextInt(3) + 1;

        // Print game instructions
        System.out.println("Let's play Rock-Paper-Scissors!");
        System.out.println("Enter your choice:");
        System.out.println("1 - Paper");
        System.out.println("2 - Rock");
        System.out.println("3 - Scissors");
        int userChoice = scanner.nextInt();

        // Display choices
        System.out.println("You chose: " + choiceToString(userChoice));
        System.out.println("Computer chose: " + choiceToString(computerChoice));

        // Determine winner
        if (userChoice == computerChoice) {
            System.out.println("It's a tie!");
        } 
        else if ((userChoice == 1 && computerChoice == 3) ||
                   (userChoice == 2 && computerChoice == 1) ||
                   (userChoice == 3 && computerChoice == 2)) {
            System.out.println("You win!");
        }
        else {
            System.out.println("Computer wins!");
        }

        // Close the scanner
        scanner.close();
    }

    // Case to convert number to Rock, Paper, or Scissors
    public static String choiceToString(int choice) {
        switch (choice) {
            case 1:
                return "Rock";
            case 2:
                return "Paper";
            case 3:
                return "Scissors";
            default:
                return "Invalid choice";
        }
    }
}
