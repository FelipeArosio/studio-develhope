/*
* Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
* Crea un secondo oggetto data da questa stringa 2024-03-01T13:00:00Z
* Verificare che la prima data è precedente alla seconda
* Verificare che la seconda data è successiva alla prima
* Verificare che le due date sono uguali ad ora
* Stampa il risultato     */

import java.time.LocalDateTime;
import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {

        OffsetDateTime data1 = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime data2 = OffsetDateTime.parse("2024-03-01T13:00:00Z");

        boolean controloDataPre = data1.isBefore(data2);
        System.out.println("La prima data è precedente alla seconda: " + controloDataPre);

        boolean controloDataSuc = data2.isAfter(data1);
        System.out.println("La seconda data è successiva alla prima: " + controloDataSuc);


}