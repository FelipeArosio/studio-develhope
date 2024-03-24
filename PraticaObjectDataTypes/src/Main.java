public class Main {
    public static void main(String[] args) {
        String numero = "123456";
        int numero1 = 123;
        Integer numero2 = Integer.parseInt(numero);
        Integer numero3 = new Integer(123);
        Integer numero4 = Integer.valueOf(123);

        System.out.println("numero 1: " + numero1);
        System.out.println("numero 2: " + numero2);
        System.out.println("numero 3: " + numero3);
        System.out.println("numero 4: " + numero4);
    }
}