package mypackage;

public class Animal {

    String name;
    String colour;

    public int pub;
    private int priv;
    protected int protect;
    int withoutMod;

    public void walk(String place) {
        System.out.println("We are walking in " + place);

        pub = 1;
        priv = 2;
        protect = 3;
    }

    public void sound() {
        System.out.println("Hello");
    }
}
