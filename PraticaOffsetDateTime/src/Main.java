import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        OffsetDateTime adesso = OffsetDateTime.now();
        System.out.println("adesso " + adesso);

        OffsetDateTime oggi = adesso.plusDays(1).minusHours(1);

        String dateStringAdesso = adesso.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
        System.out.println("dateString: " + dateStringAdesso);

        String dateStringOggi = oggi.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
        System.out.println("dateString: " + dateStringOggi);

    }
}