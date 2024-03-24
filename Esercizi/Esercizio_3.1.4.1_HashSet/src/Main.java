import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        int setSize = readNameSet().size();
        System.out.println("La grandezza del set è: " + setSize + ", gli elementi sono " + readNameSet());
    }

    private static HashSet<String> readNameSet() {
        HashSet<String> nameSet = new HashSet<String>(Arrays.asList("Felipe", "Gabriel","Miguel", "Artur"));
        return nameSet;
    }
}