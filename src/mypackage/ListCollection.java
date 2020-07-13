package mypackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListCollection {
    public static void ListsExamples() {

        List<Integer> prices = new ArrayList<>();

        prices.add(5);
        prices.add(10);

        System.out.println("list.get(1) - should return 1 element of list. Result: " + prices.get(1));

        int firstPrice = prices.get(0);

        prices.set(1, 123);
        System.out.println("Change list(1) value to 123. Command: list.set(1,123); Result: " + prices.get(1));

        // remove element by index
        prices.remove(1);

        System.out.println("Size of prices list = " + prices.size());

        prices.clear();
        System.out.println("Size after clear command = " + prices.size());

        prices.add(1);

        List<Integer> newPrices = new ArrayList<>();

        // Add all elements from other List
        newPrices.addAll(prices);

        // Remove all elements which contains in list "prices"
        newPrices.removeAll(prices);

        System.out.println("newPrices list isEmpty ? " + newPrices.isEmpty());

        newPrices.add(17);
        System.out.println("newPrices contains 17 ? " + newPrices.contains(17));

        newPrices.addAll(prices);

        System.out.println("newPrices containsAll elements from prices ? " + newPrices.containsAll(prices));

        newPrices.removeAll(prices);

        newPrices.add(21);

        Iterator<Integer> iterator = newPrices.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

//        System.out.println("Iterator.next = " + iterator.next());
//        System.out.println("Iterator.next = " + iterator.next());
//        System.out.println("Iterator.hasNext ? " + iterator.hasNext());

    }
}
