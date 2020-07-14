package mypackage;

public class ExceptionsExamples {

    public static void devide(int a, int b) {
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Cannot be divided by zero!");
        } finally {
            System.out.println("Finally block witch doing always");
        }
    }

    // throws при создании метода указывает что он может выбросить исключение
    public static void writeAge(int age) throws IllegalArgumentException {

        if (age < 0) {
            throw new IllegalArgumentException("Age should be greater than 0");
        }

        System.out.println("Age is: " + age);
    }

}
