package mypackage;

public class Main {

    public static void main(String[] args) {
//        TypesOfVariables.PrintTypesOfVariables();
//
//        MyArrays.ArraysInitialization();
//
//        SimpleOperations.SimpleOperationsExamples();
//        SimpleOperations.StringOperations();
//
//        ConditionalStatements.StatementsExamples();

//        Cycles.CyclesExamples();
//        ListCollection.ListsExamples();

//        SetCollection.SetExample();

//        MapCollection.MapCollectionExample();

        System.out.println("Method getSum result: " + Methods.getSum(3, 2));
        System.out.println("Method getSum overload result: " + Methods.getSum(3, 2, 5));
        Methods.showSum(3, 2, 5);

        int[] array = new int[]{2, 3, 4};

        System.out.println("Array sum: " + Methods.getSum(array));

    }
}
