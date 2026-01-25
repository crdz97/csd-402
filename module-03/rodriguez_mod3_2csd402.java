//Carolina Rodriguez
//CSD 402 Module 3 Assignment 2
//Program to print a pyramid of numbers with an @ symbol at a specific column.

//Resources: 
//KevinG. (2019, Aug 01). Intro to Java Chapter 05 — Display a Number Pyramid [Video]. YouTube.https://www.youtube.com/watch?v=ykGoNW8XW5M
//KunalKushwaha. (2021, Sep 11). Solve Any Pattern Question With This Trick! [Video]. YouTube.https://www.youtube.com/watch?v=lsOOs5J8ycw

public class rodriguez_mod3_2csd402 {

    public static void main(String[] args) {
        int rows = 7;
        int numWidth = 3; // width for each number
        int atColumn = 40; // column where @ will be placed

        for (int i = 1; i <= rows; i++) {
            int num = 1;

            // Leading spaces for pyramid
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("   "); // 3 spaces
            }

            // Increasing numbers left side of pyramid
            for (int j = 1; j <= i; j++) {
                System.out.printf("%-3d", num);
                num *= 2;
            }

            // Decreasing numbers, right side of pyramid.
            num /= 4;
            for (int j = 1; j < i; j++) {
                System.out.printf("%-3d", num);
                num /= 2;
            }

            // Calculate current cursor position
            int currentLength = (rows - i) * 3 + (i * 2 - 1) * numWidth;

            // Print spaces to reach the @ column
            for (int s = currentLength; s < atColumn; s++) {
                System.out.print(" ");
            }

            // Print the @
            System.out.println("@");
        }
    }
}



        