/*
* Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
* aggiungi un anno
* sottrai un mese
* aggiungi 7 giorni
* Stampa il risultato localizzata per l'Italia   */

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        String piuAnnoData = String.valueOf(data.plusYears(1).format(DateTimeFormatter.ofPattern("yyyy", Locale.ITALY)));
        System.out.println("Nuovo Anno: " + piuAnnoData);

        String menoMeseData = String.valueOf(data.minusMonths(1).format(DateTimeFormatter.ofPattern("MMMM", Locale.ITALY)));
        System.out.println("Nuovo Mese: " + menoMeseData);

        String piuGiorniData = String.valueOf(data.plusDays(7).format(DateTimeFormatter.ofPattern("dd", Locale.ITALY)));
        System.out.println("Nuovo Giorno: " + piuGiorniData);
    }
}