package mypackage;

public class ConditionalStatements {
    public static void StatementsExamples() {

        int i = 10;

        if (i > 10) {
            System.out.println("i > 10");
        }
        else if (i == 5) {
            System.out.println("i = 5");
        }
        else {
            System.out.println("i < 10 && i != 5");
        }

        switch (i){
            case 1:
                System.out.println("i = 1");
                break;
            case 10:
                System.out.println("i = 10");
                break;
            default:
                System.out.println("i != 1 and i != 10");
                break;
        }
    }
}
