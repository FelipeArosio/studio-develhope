public class Main {
    public static void main(String[] args) {

        int numero1 = 10;
        int numero2 = 5;
        char value1 = 'c';
        Integer intero1 = 20;
        Integer intero2 = 30;
        Character value2 = 'C';

        // ... e ne stampi la somma
        System.out.println(sommaInt(numero1,numero2));
        // ... lo stampi
        System.out.println(caratteri(value1));
        // ... e ne stampi la somma
        System.out.println(sommaInteger(intero1,intero2));
        // ... lo stampi
        System.out.println(caratteri2(value2));

        // Scrivere un un valore primitivo per int, double e char e fare autoboxing
        int AutoBoxInt1 = 10;
        Integer AutoBoxInt2 = AutoBoxInt1;
        double autoBoxDou1 = 20.5;
        Double autoBoxDou2 = autoBoxDou1;
        char autoBoxChar1 = 'a';
        Character autoBoxChar2 = autoBoxChar1;

        // Scrivere un oggetto per Integer, Double e Character e fare Unboxing
        Integer unBoxInte1 = 30;
        int unBoxInte2 = unBoxInte1;
        Double unBoxDoub1 = 40.5;
        double unBoxDoub2 = unBoxDoub1;
        Character unBoxCha1 = 'A';
        char unBoxCha2 = unBoxCha1;

        System.out.println("Autoboxing e Unboxing completati.");

    }

    // Scrivere una funzione che accetti in input 2 int...
    public static int sommaInt (int numero1, int numero2) {
        return numero1 + numero2;
    }
    // Scrivere una funzione che accetti in input 1 char...
    public static char caratteri(char value1) {
        return value1;
    }
    // Scrivere una funzione che accetti in input 2 Integer...
    public static Integer sommaInteger(Integer intero1, Integer intero2) {
        return intero1 + intero2;
    }
    // Scrivere una funzione che accetti in input 1 Character...
    public static Character caratteri2(Character value2) {
        return value2;
    }
}