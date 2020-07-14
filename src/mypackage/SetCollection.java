package mypackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetCollection {

    public static void SetExample() {

        // Collection of unique elements
        Set<Integer> integerSet = new HashSet<>();

        integerSet.add(10);
        integerSet.add(11);
        integerSet.add(21);
        integerSet.add(77);

        System.out.println("Set size: " + integerSet.size());

        // this element already exists
        integerSet.add(10);

        integerSet.remove(77);

        System.out.println("Set size: " + integerSet.size());

        Iterator<Integer> integerIterator = integerSet.iterator();

        while (integerIterator.hasNext()) {
            System.out.println(integerIterator.next());
        }

        System.out.println("set contains 31 ? " + integerSet.contains(31));

        for (int i : integerSet) {
            System.out.println(i);
        }

        integerSet.clear();

    }
}
