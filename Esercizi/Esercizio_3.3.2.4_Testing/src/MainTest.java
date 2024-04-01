import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.Assert.assertEquals;
@Nested
class MainTest {
    private Main testing = new Main();

    @Test
    void testAnnoDellaData() {
        String result = testing.annoDellaData(OffsetDateTime.parse("2023-03-01T13:00:00Z"));
        assertEquals("2023", result);
    }
    @Test
    void meseDellaData() {
        String result = testing.meseDellaData(OffsetDateTime.parse("2023-03-01T13:00:00Z"));
        assertEquals("marzo", result );
    }
    @Test
    void giornoDellaData() {
        String result = testing.giornoDellaData(OffsetDateTime.parse("2023-03-01T13:00:00Z"));
        assertEquals("01", result);
}

    @Test
    void settDellaData() {
        String result = testing.settDellaData(OffsetDateTime.parse("2023-03-01T13:00:00Z"));
        assertEquals("WEDNESDAY", result);
    }
}
