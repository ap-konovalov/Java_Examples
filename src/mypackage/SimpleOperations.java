package mypackage;

public class SimpleOperations {
    public static void SimpleOperationsExamples() {
        int a = 1;
        int c;
        c = a;

        System.out.println(c);

        System.out.println("Variable a = 1; in sout do a++ and print value: " + a++);
        System.out.println("After just print a: " + a);

        int b = 9;
        System.out.println("Sqrt 9 = " + Math.sqrt(9));
    }

    public static void StringOperations() {
        String hello = "Hello";
        System.out.println("String == \"Hello\" => str.equals(\"Hello\"); result = " + hello.equals("Hello"));

        String text = "Text";
        String textBold = "TEXT";
        System.out.println("Equals \"Text\"==\"TEXT\" with ignore case result = " + text.equalsIgnoreCase(textBold));
        System.out.println("charAt(1) in \"Text\" result = " + text.charAt(1));
        System.out.println("indexOf(\"x\") in \"Text\" result = " + text.indexOf("x"));
        System.out.println("\"Text\" contains \"xt\" result = " + text.contains("xt"));
        System.out.println("\"Text\" startsWith \"Te\" result = " + text.startsWith("Te"));
        System.out.println("\"Text\" endsWith \"xt\" result = " + text.endsWith("xt"));
        System.out.println("\"Text\" substring(1,3) result = " + text.substring(1,3));
        System.out.println("\"Text\" concat(text) result = " + text.concat(text));

        String goodbye = "Goodbye,world";
        String[] stringWithSplit = goodbye.split(",");
        System.out.println(stringWithSplit[1]);

        // %s - string ; %d - int
        String welcome = "My name is %s !  I am %d years old";
        int age = 30;
        String name = "Ivan";

        System.out.println("Formatted string:");
        System.out.println(String.format(welcome,name,age));

        String myAge = "30";
        int myAgeInteger = Integer.parseInt(myAge);
        System.out.println("My age = " + myAgeInteger);
    }
}
