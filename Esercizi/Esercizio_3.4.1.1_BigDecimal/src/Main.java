/*
- Scrivi un programma Java dove imposti 2 BigDecimal e 1 operazione aritmetica (Addizione, sottrazione, moltiplicazione e divisione, min e max) definita in un enum
- Crei un metodo per calcolare l'operazione richiesta e e ritorni il risultato.
- Il tipo di operazione, i due dati in input e il risultato dovranno essere stampati a schermo */

import java.math.BigDecimal;

public class Main {

    public enum OperazioneAritimetica {

        ADDIZIONE,
        SOTTRAZIONE,
        MOLTIPLICAZIONE,
        DIVISIONE,
        MIN,
        MAX
    }

    public static BigDecimal calcoloOperazione (BigDecimal numero1, BigDecimal numero2, OperazioneAritimetica operazione) throws Exception{
        BigDecimal risultato = BigDecimal.ZERO;

        switch (operazione) {
            case ADDIZIONE -> {
                risultato = numero1.add(numero2);
            }
            case SOTTRAZIONE -> {
                risultato = numero1.subtract(numero2);
            }
            case MOLTIPLICAZIONE -> {
                risultato = numero1.multiply(numero2);
            }
            case DIVISIONE -> {
                if(numero2.compareTo(BigDecimal.ZERO) != 0) {
                    risultato = numero1.divide(numero2, 2, BigDecimal.ROUND_HALF_UP);
                } else {
                    throw new Exception("Errore: Divisione per zero!");
                }
            break;
            }
            case MIN -> {
                risultato = numero1.min(numero2);
                break;
            }
            case MAX -> {
                risultato = numero1.max(numero2);
            }

        }
        return risultato;
    }

    public static void main (String[] args) throws Exception {
        BigDecimal numero1 = new BigDecimal("10.5");
        BigDecimal numero2 = new BigDecimal("2.5");
        OperazioneAritimetica operazione = OperazioneAritimetica.MOLTIPLICAZIONE;

        BigDecimal risultato = calcoloOperazione(numero1, numero2, operazione);

        System.out.println("Numero 1: " + numero1);
        System.out.println("Numero 2: " + numero2);
        System.out.println("Operazione: " + operazione);
        System.out.println("Risultato: " + risultato);

    }
}