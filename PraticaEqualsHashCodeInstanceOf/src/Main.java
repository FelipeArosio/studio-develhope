public class Main {
    public static void main(String[] args) {
        Articolo articolo1 = new Articolo ("Pizza", 1.50);
        Articolo articolo2 = new Articolo ("Pizza", 1.50);

        System.out.println("articolo 1: " + articolo1);
        System.out.println("articolo 2: " + articolo2);

        Boolean sonoUguali = articolo1.equals(articolo2);

        System.out.println("sono uguali? : " + sonoUguali);
    }
}