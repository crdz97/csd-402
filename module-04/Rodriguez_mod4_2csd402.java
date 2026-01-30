//Carolina Rodriguez
//CSD 402 Module 4 Assignment 2 
//Program to calculate and show/print the average of arrays using overloaded methods.

//Resources:
// Module_04_Arrays_Methods_Examples.zip
//W3Schools. (n.d.). Java how to find the average of array elements. W3Schools.https://www.w3schools.com/java/java_howto_calculate_avg_array.asp
//W3Schools. (n.d.). Java method overloading. W3Schools.https://www.w3schools.com/java/java_methods_overloading.asp#gsc.tab=0
//OpenAI. (2025). ChatGPT (January 30 version) [Large language model]. OpenAI. https://chat.openai.com/
public class Rodriguez_mod4_2csd402{

    // Average is sum of all numbers divided by count of numbers
    // Methods
    public static short average(short[] array) { 
        short sum = 0;
        for (short num : array) { //For each short num in array, do; 
            sum += num; //same as sum = sum + num
        }
        return (short) (sum / array.length); //sum of all divided by length is count of numbers in array
    }

    public static int average(int[] array) {
        int sum = 0; //can also do loop
        for (int i = 0; i < array.length; i++) { // starts at 0, continues while i is less than length of array, increments i by 1
            sum += array[i];// accesses each element in the array
        }
        return (int) (sum / array.length);
    }

    public static long average(long[] array) {
        long sum = 0;
        for (long num : array) {
            sum += num;
        }
        return (long) sum / array.length;
    }

    public static double average(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }
    public static void main(String[] args) {

        //Arrays
        short[] shortArray = {3, 6, 9, 12, 15}; //5
        int[] intArray = {10, 20, 30, 40}; //4
        long[] longArray = {200L, 300L}; //2
        double[] doubleArray = {2.5, 3.5, 4.5};//3
    
    
        System.out.println("---- Average Overload Method Test Results ----\n"); //Title

        System.out.print("short[] values: ");
        showArray(shortArray); //Call showArray method to print the short array
        System.out.println("Average: " + average(shortArray) + "\n"); //Call average method for short array and print the result

        System.out.print("int[] values: ");
        showArray(intArray);
        System.out.println("Average: " + average(intArray) + "\n");

        System.out.print("long[] values: ");
        showArray(longArray); 
        System.out.println("Average: " + average(longArray) + "\n");

        System.out.print("double[] values: ");
        showArray(doubleArray);
        System.out.println("Average: " + average(doubleArray));
    }
    // Print array 
     public static void showArray(short[] array) {
        for (short num : array) { //For each short num in array, do the following
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    public static void showArray(int[] array) {
        
        for (int num : array) { //For each integer num in array, do the following
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void showArray(long[] array) {
        for (long num : array) { //For each long num in array, do the following
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void showArray(double[] array) {
        for (double num : array) { //For each double num in array, do the following
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
    
