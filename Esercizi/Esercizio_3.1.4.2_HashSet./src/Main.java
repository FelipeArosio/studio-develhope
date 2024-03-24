import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        // Chiamiamo la funzione per ottenere un HashSet riempito
        HashSet<String> names = creaHashSet();

        // Creiamo un oggetto dello stesso tipo inserito nell'HashSet e lo popoliamo
        HashSet<String> newName = new HashSet<>(names);
        newName.add("Artur");

        // Verifichiamo se l'elemento è parte del Set e stampiamo il risultato
        if (verificaPresenza(names, "Artur")) {
            System.out.println("L'elemento è presente nel names.");
        } else {
            System.out.println("L'elemento non è presente nel names.");
        }
    }

    // Funzione per creare e riempire un HashSet
    public static HashSet<String> creaHashSet() {
        HashSet<String> names = new HashSet<>();
        names.add("Gabriel");
        names.add("Felipe");
        names.add("Miguel");
        return names;
    }

    // Funzione per verificare la presenza di un elemento in un HashSet
    public static boolean verificaPresenza(HashSet<String> names, String elemento) {
        return names.contains(elemento);
    }
}
