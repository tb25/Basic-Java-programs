/**
 * Created by ty on 2/24/17.
 */
public class Car
{
    int maxSpeed;
    double mpg ;
    char condition = 'A';
    String make;
    String color;
    boolean enginerunning;

    public Car(int howFast, double gasMileage, char howNice, String make,
               String color, boolean onOrOff)
    {
        this.maxSpeed = howFast;
        this.condition = howNice;
        this.mpg = gasMileage;
        this.make  = make;
        this.color = color;
        this.enginerunning = onOrOff;
    }

    public void printStats()
    {
        System.out.println("This car goes: " + maxSpeed + " MPH\n"
        + "it gets "+ mpg+" miles per gallon\n");
    }

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

    public static void main(String[] args) {


        Car myLambo = new Car(250, 25.3, 'B', "Lambo", "Red", false);

        myLambo.printStats();

        myLambo.carCrash();
        myLambo.printStats();

        myLambo.tuneUp();
        myLambo.printStats();

    }

}

