import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        long big1 = Long.MAX_VALUE;
        long big2 = Long.MAX_VALUE;
        long result = big1 * 10;
        BigInteger bigInt = BigInteger.valueOf(big1);
        BigInteger resultBig = bigInt.multiply(BigInteger.valueOf(10));

        double totale = 0;
        totale = totale + 3.4;
        totale = totale + 3.8;

        BigDecimal totaleBig = BigDecimal.valueOf(0);
        totaleBig = totaleBig.add(BigDecimal.valueOf(3.4));
        totaleBig = totaleBig.add(BigDecimal.valueOf(3.8));
        BigDecimal totaleScalde = totaleBig.setScale(2, RoundingMode.HALF_DOWN);

        System.out.println("result: " + result + ", resultbig: " + resultBig);
        System.out.println("result totale: " + totale);
        System.out.println("result totale Big: " + totaleBig);
        System.out.println("result totale Scaled: " + totaleScalde);
    }
}