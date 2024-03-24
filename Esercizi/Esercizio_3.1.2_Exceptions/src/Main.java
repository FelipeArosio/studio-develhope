public class Main {
    public static void main(String[] args) {

        char value = 'a';
        checkCharIsNumber(value);
    }

    public static void checkCharIsNumber(char value) {
        if(Character.isDigit(value)) {
            System.out.println("Il carattere è un numero: " + value);
            } else {
            throw new ArithmeticException("Il carattere non è un numero: " + value);
        }
    }
}