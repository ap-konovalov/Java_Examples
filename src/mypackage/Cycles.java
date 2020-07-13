package mypackage;

public class Cycles {

    public static void CyclesExamples() {

        int[] array = new int[5];

        // for
        for (int i = 0; i < 5; i++) {
            array[i] = i * 2;
        }

        // foreach int number in array
        for (int number : array) {
            System.out.println(number);
        }

        // while
        int i = 0;
        while (i < 5) {
            System.out.println("while i < 5 print this. i = " + i);
            i++;
        }

        // do...while
        int b = 0;
        do {
            System.out.println("do: print this text while: b < 5. b = " + b);
            b++;
        } while (b < 5);
    }
}
