package mypackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapCollection {

    public static void MapCollectionExample() {

        Map<Integer, String> colorMap = new HashMap<>();

        colorMap.put(1, "black");
        colorMap.put(2, "red");
        colorMap.put(3, "white");

        System.out.println("Map.get(1) result: " + colorMap.get(1));
        System.out.println("Map.size() result: " + colorMap.size());

        System.out.println("map.containsKey(2) ? " + colorMap.containsKey(2));
        System.out.println("map.containsValue(\"white\") ? " + colorMap.containsValue("white"));

        Set<Integer> keys = colorMap.keySet();
        Iterator<Integer> iterator = keys.iterator();

        while (iterator.hasNext()) {
            System.out.println(colorMap.get(iterator.next()));
        }

        // rewrite value in 2 key value pair
        colorMap.put(2, "black");

        colorMap.clear();
    }
}
