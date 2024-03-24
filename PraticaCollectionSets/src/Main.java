<<<<<<< HEAD
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> insieme1 = new HashSet<String>(Arrays.asList("1", "2", "3"));
        insieme1.add("4");
        System.out.println("insieme 1: " + insieme1);

//        for(String element: insieme1) {
//            System.out.println("Insieme 1 element: " + element);
//            }
//        }

        Iterator<String> iterator = insieme1.iterator();
        while(iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("Insieme 1 element: " + element);

            if (element == "3") {
                iterator.remove();
            }
        }

        System.out.println("insieme 1: " + insieme1);

        Set<String> insieme2 = new HashSet<String>();
        insieme2.add("1");
        insieme2.add("2");
        insieme2.add("3");
        insieme2.remove("2");
        System.out.println("insieme 2: " + insieme2);
=======
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
>>>>>>> origin/main
    }
}