package mypackage;

public class TypesOfVariables {

    public static void PrintTypesOfVariables() {
        byte a = 5; // -128 to 127
        short b = -100; // -32768 to 32767
        int c;
        c = 1000000;
        long d = -1223498767;

        double doubleOne = 12.5;
        float floatOne = 150.32F;

        boolean isExist = false;
        boolean isGreatThanZero = 1 + 2 > 0;

        String hello = "Hello";
        String world = "world";
        String hw =  hello + " " + world;

        char symbA = 'a';

        System.out.println("Byte a = " + a);
        System.out.println("Double  doubleOne = " + doubleOne);
        System.out.println(isExist);
        System.out.println(hw);
    }
}
