public class Main {
    public static void main(String[] args) {
        try {
            int numero = 11;
            int limiteMinimo = 1;
            int limiteMassimo = 10;
            boolean risultato = controllaRange(numero, limiteMinimo, limiteMassimo);
            System.out.println("Il numero è nel range: " + risultato);
        } catch (IllegalArgumentException e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }

    public static boolean controllaRange(int numero, int limiteMinimo, int limiteMassimo) {
        if (numero < limiteMinimo || numero > limiteMassimo) {
            throw new IllegalArgumentException("Il numero non è nel range specificato.");
        }
        return true;
    }
}
