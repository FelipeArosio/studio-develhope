import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        // Chiamiamo la funzione per ottenere un HashSet riempito
        HashSet<String> set = creaHashSet();

        // Creiamo un oggetto dello stesso tipo inserito nell'HashSet e lo popoliamo
        HashSet<String> nuovoSet = new HashSet<>(set);
        nuovoSet.add("ElementoAggiunto");

        // Scorriamo il set e verifichiamo se ogni elemento è uguale all'oggetto creato ed eliminiamolo se lo è
        Iterator<String> iterator = nuovoSet.iterator();
        while (iterator.hasNext()) {
            String elemento = iterator.next();
            if (elemento.equals("ElementoAggiunto")) {
                iterator.remove();
            }
        }

        // Svuotiamo l'HashSet
        set.clear();

        // Verifichiamo se l'HashSet è vuoto e stampiamo il risultato
        if (set.isEmpty()) {
            System.out.println("L'HashSet è vuoto.");
        } else {
            System.out.println("L'HashSet non è vuoto.");
        }
    }

    // Funzione per creare e riempire un HashSet
    public static HashSet<String> creaHashSet() {
        HashSet<String> set = new HashSet<>();
        set.add("Elemento1");
        set.add("Elemento2");
        set.add("Elemento3");
        return set;
    }
}
