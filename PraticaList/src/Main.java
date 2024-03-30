import java.util.*;

public class Main {
    public static void main(String[] args) {
        Articolo articolo1 = new Articolo ("Pizza", 1.50);
        Articolo articolo2 = new Articolo ("Coca Cola", 0.50);
        Articolo articolo3 = new Articolo ("Tiramisu", 1.00);

        List<Articolo> lista1 = Arrays.asList(articolo1, articolo2, articolo3);

        System.out.println("Lista 1: " + lista1);

        List<Articolo> lista2 = new ArrayList<>();
        lista2.add(articolo1);
        lista2.add(articolo2);
        lista2.add(articolo3);

        System.out.println("Lista 2: " + lista2 );
        System.out.println("Lista 2 [0]: " + lista2.get(0) );

        System.out.println("Lista 2: " + lista2 );



        lista2.sort(Comparator.comparing(Articolo::getNome) );
        System.out.println("lista2 ordinata = " + lista2);

        lista2.sort(new Comparator<Articolo>() {
            @Override
            public int compare(Articolo o1, Articolo o2) {
                return o1.prezzo.compareTo(o2.prezzo);
            }
        });
        System.out.println("lista2 ordinata = " + lista2);








    }
}