package mypackage;

public class Car {
    int height;
    int width;
    int length;
    int weight;
    int maxWeight;
    String colour;
    int speed;
    int maxSpeed;

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
