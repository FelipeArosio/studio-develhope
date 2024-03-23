public class Main {
    public static void main(String[] args) {

        try {
            String test = "1";
            if (test.equals("1")) {
                throw new ArithmeticException("1");
            }
        } catch (ArithmeticException e) {
            System.out.println("C'è stato un errore ArithmeticException: " + e);
        } catch (Exception e) {
            System.out.println("C'è stato un errore: " + e);
        } finally {
            System.out.println("Finita la gestione di errori");
        }

        System.out.println("Hello world!");
    }
}