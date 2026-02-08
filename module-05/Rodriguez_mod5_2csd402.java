//Carolina Rodriguez 
//CSD 402 Module 5.2
//This program defines methods to locate the largest and smallest elements in 2D arrays of both int and double types. 

//Resources:
//Module_05_Arrays_Symmetrical_Examples.zip
//W3Schools.com. (n.d.). Java multi‑dimensional arrays.http://w3schools.com/java/java_arrays_multi.asp
//W3Schools.com. (n.d.). Java methods – return values.https://www.w3schools.com/java/java_methods_return.asp
//W3Schools.com. (n.d.). Java method overloading.https://www.w3schools.com/java/java_methods_overloading.asp


public class Rodriguez_mod5_2csd402 {

    // Array methods for int and double arrays
    public static int[] locateLargest(double[][] arrayParam) { //method to locate largest element in double array
        double largest = arrayParam[0][0]; //array parameter to find largest element in double array can also be named differently as long as it is used consistently within the method
        int row = 0, col = 0; //where to start looking for largest element in double array

        for (int i = 0; i < arrayParam.length; i++) { //row loop
            for (int j = 0; j < arrayParam[i].length; j++) { //column loop

                if (arrayParam[i][j] > largest) {
                    largest = arrayParam[i][j];
                    row = i; //update row and column of largest element
                    col = j;
                }
            }
        }
        return new int[] {row, col}; //returning double row and column of largest element
    }

    public static int[] locateLargest(int[][] arrayParam) { 
        int largest = arrayParam[0][0];
        int row = 0, col = 0;

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {

                if (arrayParam[i][j] > largest) {
                    largest = arrayParam[i][j];
                    row = i; 
                    col = j;
                }
            }
        }
        return new int[] {row, col}; //returning row and column of largest element
    }

    public static int[] locateSmallest(double[][] arrayParam) {
        double smallest = arrayParam[0][0];
        int row = 0, col = 0;

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {

                if (arrayParam[i][j] < smallest) {
                    smallest = arrayParam[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        return new int[] {row, col}; //returning double row and column of smallest element
    }

    public static int[] locateSmallest(int[][] arrayParam) {
        int smallest = arrayParam[0][0];
        int row = 0, col = 0;

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                
                if (arrayParam[i][j] < smallest) {
                    smallest = arrayParam[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        return new int[] {row, col}; //returning row and column of smallest element
    }
    public static void main(String[] args) {

        // int 2D array
        int[][] intNumbers = {
            {12, 5, 9}, //row 0
            {10, 20, 15}, //row 1
            {7, 50, 3} //row 2
        //column 0, column 1, column 2
        };

        // Double 2D array(Decimal)
        double[][] doubleNumbers = {
            {5.9, 3.2, 10.9},
            {10.1, 17.7, 30.3},
            {80.8, 45.4, 61.6}
        };

        // Find single largest in int and double arrays
        int[] largestDouble = locateLargest(doubleNumbers);
        int[] largestInt = locateLargest(intNumbers);

        System.out.println("Largest double array at: row " + largestDouble[0] + ", column " + largestDouble[1]); // first element row and second element column of largest element in double array
        System.out.println("Largest int array at: row " + largestInt[0] + ", column " + largestInt[1]);

        // Find single smallest in  int and double arrays
        int[] smallestDouble = locateSmallest(doubleNumbers);
        int[] smallestInt = locateSmallest(intNumbers);

        System.out.println("Smallest double array at: row " + smallestDouble[0] + ", column " + smallestDouble[1]);
        System.out.println("Smallest int array at: row " + smallestInt[0] + ", column " + smallestInt[1]);

    }
}



