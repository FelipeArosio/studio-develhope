public class Main {
    public static void main(String[] args) {
        Integer numeratore = null;
        Integer denominatore = 5;

        try {
            verificaNullability(numeratore, denominatore);
            int risultato = numeratore / denominatore;
            System.out.println("Il risultato della divisione è: " + risultato);
        } catch (NullPointerException e) {
            System.out.println("Errore: " + e.getMessage());
        }

        numeratore = 10;
        denominatore = null;

        try {
            verificaNullability(numeratore, denominatore);
            int risultato = numeratore / denominatore;
            System.out.println("Il risultato della divisione è: " + risultato);
        } catch (NullPointerException e) {
            System.out.println("Errore: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }

    public static void verificaNullability(Integer numeratore, Integer denominatore) {
        if (numeratore == null || denominatore == null) {
            throw new NullPointerException("Numeratore o denominatore sono null.");
        }
    }
}
