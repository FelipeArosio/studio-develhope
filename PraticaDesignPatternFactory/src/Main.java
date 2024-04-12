public class Main {
    public static void main(String[] args) {
        String tipo = "cane";
        String nome = "Tom";
        Animale animale = AnimalFactory.getAnimale(tipo,nome);

        System.out.println("animale" + animale);
    }
}