//Carolina Rodriguez
//CSD 402 Module 6.2    
//This program defines a class named Fan with final variables for fan speeds, instance variables for the fan's state, and methods to get and set these variables. 
// It also includes a toString method to display the fan's information. 
// The main method creates two Fan objects, one using the default constructor and another using an argument constructor, and prints their details.

//Resources:
//jsquared21. (n.d.). Fan.java [Source code]. GitHub.https://github.com/jsquared21/Intro-to-Java-Programming/blob/master/Exercise_09/Exercise_09_08/Fan.java
//Module_06_Objects and Classes_Examples.zip
////OpenAI. (2025). ChatGPT (February version) [large language model]. OpenAI. https://chat.openai.com/
//W3Schools.(n.d.).Java constants(final).https://www.w3schools.com/java/java_variables_final.asp

public class Rodriguez_mod6_2csd402 {
    public static void main(String[] args) {

    // Fans inside main
        Fan fan1 = new Fan(); //default constructor for fan1
        System.out.println("----Default for Fan----");
        System.out.println(fan1); 
        System.out.println();

    // Fan using argument constructor
        Fan fan2 = new Fan(Fan.FAST, true, 10, "Blue"); //argument constructor for fan2
        System.out.println("----Changes to Fan 2----");
        System.out.println(fan2);
        System.out.println();
    }
}


class Fan {

// Final variables for fan speeds
    final int STOPPED = 0;
    final int SLOW = 1;
    final int MEDIUM = 2;
    final static int FAST = 3;

// Instance variables for the fan
    private int speed;
    private boolean on;
    private int radius;
    private String color;

// No-arg constructor, default values for the fan
    public Fan() {

        this.speed = STOPPED;
        this.on = false;
        this.radius = 6;
        this.color = "White";
    }

// Constructor with arguments to set the fans values
    public Fan(int speed, boolean on, int radius, String color) {

        this.speed = speed; //setting the fans speed
        this.on = on;//setting the fans on or off
        this.radius = (int) radius; //setting the fans radius
        this.color = color; //setting the fans color
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
        this.color = color; }

    // toString method
    public String toString() {
        if (on) {
            return "Fan is ON\n"
                    + "Speed: " + speed + "\n"
                    + "Radius: " + radius + "\n"
                    + "Color: " + color;
        } else {
            return "Fan is OFF\n"
                    + "Radius: " + radius + "\n"
                    + "Color: " + color;
        }
    }
}


