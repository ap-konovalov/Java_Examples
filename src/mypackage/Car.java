package mypackage;

public class Car {
    int width;
    int length;
    int weight;
    int maxWeight;
    String colour;
    int speed;
    int maxSpeed;

    // Create constant
    final String country = "Russia";

    static int carAgeStatic;
    static void staticMethod()
    {
        System.out.println("Static method");
    }


    public Car(){
        System.out.println("New car created");
    }

    public Car(String colour){
        this.colour = colour;
        System.out.println("New " + colour + " car created");
    }

    public void addWeight(int weight) {
        this.weight += weight;
        System.out.println("Current weight = " + this.weight);
    }

    public void drive(int speed) {
        if (weight <= maxWeight) {
            this.speed = speed;
        } else {
            System.out.println("Cannot drive! Weight is too large!");
        }
    }
}
