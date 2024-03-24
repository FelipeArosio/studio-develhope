public class Main {
    public static void main(String[] args) {

        Integer value = 10;
        divideBy(value);
    }

    public static void divideBy(Integer value) {
        try {
            int result = value / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }
    }
}