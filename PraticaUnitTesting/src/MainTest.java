import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private Main testing = new Main();

    @org.junit.jupiter.api.Test
    void sum_di_due_integer() {
        Integer result = testing.sum(1,2);
        assertEquals(3, result, "Somma di 1 + 2 dovrebbe essere 3");
    }

    @org.junit.jupiter.api.Test
    void sum_di_integer_negativo() {
        Integer result = testing.sum(-1,2);
        assertEquals(1, result, "Somma di -1 + 2 dovrebbe essere 1");
    }

    @org.junit.jupiter.api.Test
    void multiply_di_due_integer() {
        Integer result = testing.multiply(1,2);
        assertEquals(2, result, "Multiplicazione di 1 * 2 dovrebbe essere 2");
    }

    @org.junit.jupiter.api.Test
    void sum_di_null_e_integer() {
        Integer result = testing.sum(null,2);
        assertNull(result,"Se uno dei parametri è null, risultato è null");
    }

    @org.junit.jupiter.api.Test
    void multiply_con_null() {
        Integer result = testing.multiply(null,2);
        assertNull(result, "Se uno dei parametri è null, risultato è null");
    }
}