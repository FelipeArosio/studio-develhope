import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

    }
    OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
    public String annoDellaData (OffsetDateTime data) {
        String annoData = data.format(DateTimeFormatter.ofPattern("yyyy",Locale.ITALY));
        System.out.println("Anno: " + annoData);
        return annoData;
    }
    public String meseDellaData (OffsetDateTime data) {
        String meseData = data.format(DateTimeFormatter.ofPattern("MMMM",Locale.ITALY));
        System.out.println("Mese: " + meseData);
        return meseData;
    }

    public String giornoDellaData (OffsetDateTime data) {
        String giornoData = data.format(DateTimeFormatter.ofPattern("dd",Locale.ITALY));
        System.out.println("Giorno: " + giornoData);
        return giornoData;
    }

    public String settDellaData (OffsetDateTime data) {
        String settData = String.valueOf(data.getDayOfWeek());
        System.out.println("Giorno della settimana: " + settData);
        return settData;
    }
}