package mypackage;

public class MyArrays {

    public static void ArraysInitialization() {
        String[] names;
        names = new String[3];

        String[] surnames = new String[3];

        names[0] = "Vania";
        System.out.println(names[0]);

        int[] ages = {12, 3, 4, 7};

        System.out.println("Size of ages array is: " + ages.length + " values");
    }
}
