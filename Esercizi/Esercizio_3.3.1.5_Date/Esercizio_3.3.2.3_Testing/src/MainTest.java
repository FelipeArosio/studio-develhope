import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MainTest {

    private Main testing = new Main();

    @Test
    void testFormatOffsetDateTime() {
        String dateTimeString = "2023-03-01T13:00:00Z";
        String expectedFormattedDate = "01 marzo 2023";
        String actualFormattedDate = testing.formatOffsetDateTime(dateTimeString);
        assertEquals(expectedFormattedDate, actualFormattedDate,"Deve stampare 01 marzo 2023 ");
    }
}
