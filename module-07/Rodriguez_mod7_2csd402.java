// Carolina Rodriguez
// CSD-402 Module 7.2 Assignment    
//Fan class with collection and single object display methods.

//Resources:
//jsquared21. (n.d.). Fan.java [Source code]. GitHub.https://github.com/jsquared21/Intro-to-Java-Programming/blob/master/Exercise_09/Exercise_09_08/Fan.java
//OpenAI. (2025). ChatGPT (February version) [large language model]. OpenAI. https://chat.openai.com/
//W3Schools. (n.d.). Java ArrayList. W3Schools.https://www.w3schools.com/java/java_arraylist.asp
//W3Schools.(n.d.).Java constants(final).https://www.w3schools.com/java/java_variables_final.asp


import java.util.ArrayList;

public class Rodriguez_mod7_2csd402 {
    
    public static void main(String[] args) {

        // Create a collection of Fan objects
        ArrayList<Fan> fanList = new ArrayList<>();

        // Add different Fan instances
        fanList.add(new Fan()); 
        fanList.add(new Fan(Fan.FAST, true, 10, "Blue"));
        fanList.add(new Fan(Fan.MEDIUM, true, 8, "Red"));
        fanList.add(new Fan(Fan.SLOW, false, 12, "Green"));

        // Display all fans using collection method
        System.out.println("---- All Fans ----");
        displayFans(fanList);

        // Display a single fan using single object method
        System.out.println("\n---- Single Fan ----");
        displaySingleFan(fanList.get(1));
    }

    // Method that takes a collection of Fan instances
    public static void displayFans(ArrayList<Fan> fans) {
        for (Fan fan : fans) {
            displaySingleFan(fan);
            System.out.println("---------------------");
        }
    }

    // Method that takes a single Fan instance
    public static void displaySingleFan(Fan fan) {
        System.out.println("Fan Status: " + (fan.isOn() ? "ON" : "OFF"));
        System.out.println("Speed: " + fan.getSpeed());
        System.out.println("Radius: " + fan.getRadius());
        System.out.println("Color: " + fan.getColor());
    }
}


class Fan {

    // Final variables for fan speeds
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Instance variables
    private int speed;
    private boolean on;
    private int radius;
    private String color;

    // No-arg constructor
    public Fan() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6;
        this.color = "White";
    }

    // Constructor with arguments
    public Fan(int speed, boolean on, int radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() { //Getter returns
        return speed; }  //getting the fans final speed, no change in value 

    public void setSpeed(int speed) { //Setter changes
        this.speed = speed; } //setting the fans speed, can change value

    public boolean isOn() { 
        return on; }

    public void setOn(boolean on) { 
        this.on = on; }

    public int getRadius() { 
        return radius; }

    public void setRadius(int radius) { 
        this.radius =  radius; }

    public String getColor() { 
        return color; }
    public void setColor(String color) { 
        this.color = color; 
    }
}
