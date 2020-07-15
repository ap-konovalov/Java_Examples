package mypackage;

// class dog inherits from animal
public class Dog extends Animal {

    private int weigh;

    // getter
    public int getWeigh() {
        return weigh;
    }

    // setter
    public void setWeigh(int weigh) {
        this.weigh = weigh;
    }

    public void sit() {
        System.out.println("The dog is sitting");
        pub = 1;
        protect = 3;
        withoutMod = 4;
    }

}
