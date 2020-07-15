package mypackage;

public class BikeWithInterface implements Transport, Params {
    @Override
    public void go() {
        System.out.println("Riding");
    }

    @Override
    public void stop() {
        System.out.println("Stop!");
    }

    @Override
    public void setWeight(int weight) {
        System.out.println("Weight = " + weight);
    }
}
