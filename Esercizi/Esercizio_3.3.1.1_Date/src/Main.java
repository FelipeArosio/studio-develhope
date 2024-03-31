/*
* Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
* Formatta la data ottenuta in FULL, MEDIUM e SHORT
* Stampa le varie versioni  */

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {

        ZonedDateTime stringDate = OffsetDateTime.parse("2002-03-01T13:00:00Z").toZonedDateTime();

        String stringDateLong = stringDate.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG));
        System.out.println("Data nel formato 'Long': " + stringDateLong);

        String stringDateMedium = stringDate.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
        System.out.println("Data nel formato 'Medium': " + stringDateMedium);

        String stringDateShort = stringDate.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT));
        System.out.println("Data nel formato 'Short': " + stringDateShort);
    }
}