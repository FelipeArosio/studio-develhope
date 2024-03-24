public class Main {
    public static void main(String[] args) {
        int[] numeri = {10, 5, 0, 8};

        try {
            eseguiOperazioni(numeri);
        } catch (ArithmeticException e) {
            System.out.println("Errore di divisione per zero: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Errore di indice non presente nell'array: " + e.getMessage());
        } finally {
            System.out.println("Esecuzione blocco finally.");
        }
    }

    public static void eseguiOperazioni(int[] array) {
        for (int i = 0; i < array.length; i++) {
            try {
                System.out.println("Risultato divisione: " + (array[i] / array[i + 1]));
            } catch (ArithmeticException e) {
                throw new ArithmeticException("Divisione per zero all'indice " + i);
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new ArrayIndexOutOfBoundsException("Indice non presente nell'array.");
            }
        }
    }
}
