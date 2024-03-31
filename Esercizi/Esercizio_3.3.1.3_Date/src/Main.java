/*
* Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
* ottieni l'anno
* ottieni il mese
* ottieni il giorno
* ottieni il giorno della settimana
* Stampa i risultati sulla console    */

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        String annoData = data.format(DateTimeFormatter.ofPattern("yyyy"));
        System.out.println("Anno: " + annoData);

        String meseData = data.format(DateTimeFormatter.ofPattern("MMMM"));
        System.out.println("Mese: " + meseData);

        String giornoData = data.format(DateTimeFormatter.ofPattern("dd"));
        System.out.println("Giorno: " + giornoData);

        String settData = String.valueOf(data.getDayOfWeek());
        System.out.println("Giorno della settimana: " + settData);
    }
}