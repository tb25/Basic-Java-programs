import java.util.Scanner;

/**
 * Created by ty on 2/24/17.

 an algorithm for solving a problem is a sequence of steps that is unambiguous, executable, and terminating.
 a computer program is a sequence of instructions and decisions
 Programming is the act of designing and implementing computer programs


 */

// Class:
// Classes are fundamental building blocks of Java programs
// each class contains declartion of methods
// a class describes a set of objects with the same behavior

public class Car
{
    // a variable is a storge location with a name
    // when declaring, usually specify an inital value and TYPE of its value
    // variables start with lower case and use camel case ex: milesPerGallon
    // int for numbers without a decimal
    // instance variables are private
    private int maxSpeed = 763;
    // double for number with a decimal
    private double mpg = 11;
    private double totalMiles = 0;

    private char condition = 'A';
    // a String is a sequence of characters enclosed in quotation marks
    private String make;
    private String color;
    private boolean enginerunning;

    // Constructor:
    //
    public Car(int howFast, double gasMileage, double mileage, char howNice, String make,
               String color, boolean onOrOff)
    {
        this.maxSpeed = howFast;
        this.condition = howNice;
        this.mpg = gasMileage;
        this.totalMiles = mileage;
        this.make  = make;
        this.color = color;
        this.enginerunning = onOrOff;
    }

    // Methods:
    // each method contains a sequence of instructions that accesses the data of an object
    public void printStats()
    {
        System.out.println("This car goes: " + maxSpeed + " MPH\n"
                + "it gets "+ mpg+" miles per gallon\n");
    }

    // method with argument
    // an argument is a value that is supplied in a method call
    public void getConditionStatement(char condition){
        if (condition == 'A' || condition == 'B')
        {
            System.out.println("the car is in awesome condition dude!\n");
        }
    }

    // accessor method
    // return value is going to be of TYPE char
    public char getCondition(){
        char variable = condition;
        return variable;
    }

    // mutator methods:
    public void tuneUp()
    {
        condition = 'A';
        maxSpeed = 275;
        System.out.println("Got a tune up!\n");
    }
    public void carCrash()
    {
        condition = 'F';
        maxSpeed = 0;
        System.out.println("OH NO I CRASHED :( \n");
    }

    // loops
    // useless loop to see how they work
    public double howManyMiles(double milesEntered){

        // miles Entered by User = milesEntered
        for (int i = 0; i < milesEntered; i++){
            if(i == 10000){// 10,000
                System.out.println("new\n");
            }
            if(i == 500000){// 500,000
                System.out.println("old\n");
            }
            totalMiles++;
        }
        return totalMiles;
    }

    // Main:
    // every java application comes with a main method.
    // when the application starts, the instuctions in the main method execute
    public static void main(String[] args) {

        // Objects:
        // objects are entities in your program that you manipulate by calling methods
        // myLambo is the object
        Car myLambo = new Car(250, 25.3, 0,  'B', "Lambo", "Red", false);

        // a method is called by specifying the method and its arguments
        myLambo.printStats();

        //
        myLambo.getConditionStatement(myLambo.getCondition());

        myLambo.carCrash();
        myLambo.printStats();

        myLambo.tuneUp();
        myLambo.printStats();

        System.out.println("How many miles on your car? ");

        Scanner scan = new Scanner(System.in);
        double milesEntered = scan.nextDouble();
        myLambo.howManyMiles(milesEntered);

    }

}
/*
Be able to recognize objects, methods and classes

identify variable declarations and assignments

recognize arguments and return value of methods
 */

