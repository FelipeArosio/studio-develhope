public class AnimalFactory {

    public static Animale getAnimale(String tipo, String nome) {
        Animale animale = null;

        switch (tipo) {
            case "gatto" -> animale = new Gatto(nome);
            case "cane" -> animale = new Cane(nome);
            case "maiale" -> animale = new Maiale(nome);
        }
        return animale;
    }
}
