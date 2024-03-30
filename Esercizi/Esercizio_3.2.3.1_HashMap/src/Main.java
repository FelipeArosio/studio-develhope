import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        HashMap<String, Integer> firstMap = new HashMap<>();

        firstMap.put("One", 1);
        firstMap.put("Two", 2);
        firstMap.put("Three", 3);
        firstMap.put("Four", 4);

        System.out.println("First Map: ");
        for(Map.Entry<String, Integer> element : firstMap.entrySet())
            System.out.println("element: " + element);

        HashMap<String, Integer> secondMap = new HashMap<>(Map.of("One", 1, "Two", 2, "three", 3));
        System.out.println("Second Map: ");
        for(Map.Entry<String, Integer> element : secondMap.entrySet())
            System.out.println("element: " + element);

        HashMap<String, Integer> thirdMap = new HashMap<>(Map.ofEntries(
                new AbstractMap.SimpleEntry<String, Integer>("One", 1),
                new AbstractMap.SimpleEntry<String, Integer>("Two", 2),
                new AbstractMap.SimpleEntry<String, Integer>("Three", 3)
        ));

        System.out.println("Third Map: ");
        for(Map.Entry<String, Integer> element : thirdMap.entrySet()) {
            System.out.println("Element: " + element);
        }

    }
}