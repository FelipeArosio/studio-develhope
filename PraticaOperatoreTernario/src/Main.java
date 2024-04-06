public class Main {
    public static void main(String[] args) {
        int number = 5;
/*         String message = "";

       if (number < 5) {
            message = "minore di 5";
        } else {
            message = "maggiore o uguale a 5";
        }*/

        final String message = number < 5
                ? "minore di 5"
                : "maggiore o uguale a 5";

        System.out.println(message);
    }
}