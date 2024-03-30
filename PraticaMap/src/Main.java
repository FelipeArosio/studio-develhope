import java.util.*;

public class Main {
    public static void main(String[] args) {
        Articolo articolo1 = new Articolo("Pizza", 1.50);
        Articolo articolo2 = new Articolo("Coca Cola", 0.50);
        Articolo articolo3 = new Articolo("Tiramisu", 1.00);

/*
        Map<String, Articolo> articoliCategorizzati = new HashMap<>();
        articoliCategorizzati.put("Cibo", articolo1);
        articoliCategorizzati.put("Bibita", articolo2);
        articoliCategorizzati.put("Dolce", articolo3);
        System.out.println("Articoli categorizzati: " + articoliCategorizzati);
        }

        Map<String, Articolo> articoliCategorizzati2 = Map.of("Cibo", articolo1, "Bibita", articolo2, "Dolce", articolo3);
        System.out.println("articoli categorizzati 2: " + articoliCategorizzati2);*/

        Map<String, Articolo> articoliCategorizzati3 = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("Cibo", articolo1),
                new AbstractMap.SimpleEntry<>("Bibita", articolo2),
                new AbstractMap.SimpleEntry<>("Dolce", articolo3)

        );
        System.out.println("articoli Categorizzati 3: " + articoliCategorizzati3);

        articoliCategorizzati3.remove("Dolce");
        System.out.println("Dolce: " + articoliCategorizzati3.get("Dolce"));

    }
}












