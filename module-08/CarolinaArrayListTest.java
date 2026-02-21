//Carolina Rodriguez
//CSD 420 Module 8.2 Assignment
//This program prompts the user to input integers until they enter 0, then it finds and displays the largest integer using an ArrayList and a method to determine the maximum value.

//Resources:
// GeeksforGeeks. (2025, July 23). Finding maximum element of Java ArrayList. GeeksforGeeks.https://www.geeksforgeeks.org/java/finding-maximum-element-of-java-arraylist/
//OpenAI. (2025). ChatGPT (February version) [large language model]. OpenAI. https://chat.openai.com/
//W3Schools. (n.d.). Java ArrayList.https://www.w3schools.com/java/java_arraylist.asp    
//W3Schools. (n.d.). Java ArrayList add() method.https://www.w3schools.com/java/ref_arraylist_add.asp
//W3Schools. (n.d.). Java Math max() method.https://www.w3schools.com/java/ref_math_max.asp

import java.util.ArrayList;
import java.util.Scanner;

public class CarolinaArrayListTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //scanner for user input
        ArrayList numbers = new ArrayList(); // ArrayList to store integers 

        System.out.println("Input integers. (Type 0 to Exit) Please press enter after each number:");

        int number = -1; // start with a value not 0

        while (number != 0) { // loop until user inputs 0
            number = scanner.nextInt();
            numbers.add(number); // add the number to the ArrayList
        }

        int largest = max(numbers); // call the max method to find the largest number

        System.out.println("The largest number is: " + largest);
        scanner.close();
    }

    public static int max(ArrayList list) { //method to find the largest number in the ArrayList
        if (list.isEmpty()) {
            return 0; //no numbers were entered, return 0 or you could throw an exception
        }

        int largest = (int) list.get(0); // initialize largest with the first element of the list
        for (int i = 1; i < list.size(); i++) {
            int current = (int) list.get(i);
            if (current > largest) { // compare current number with largest
                largest = current;
            }
        }

        return largest;
    }
}