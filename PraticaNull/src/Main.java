public class Main {
    public static void main(String[] args) {

        Boolean userConsent = null;

        try {
            if (userConsent == true) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        } catch (Exception e) {
            System.out.println("Manca il valore");
        }

        System.out.println("Hello world!");
    }
}