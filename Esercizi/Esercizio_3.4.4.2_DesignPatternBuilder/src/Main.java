public class Main {
    public static void main(String[] args) {

        Builder builder1 = new Builder();
        builder1.setFirstName("Felipe");
        builder1.setLastName("Arosio");

        Person person1 = builder1.build();
        System.out.println("Persona 1: " + person1);

        Builder builder2 = new Builder();
        builder2.setFirstName("Gabriel");
        builder2.setLastName("Prates");
        builder2.setAge(27);
        builder2.setAddress("Vital brasil rodrigues aguiar, 655, Parque das Nações - Limeira - SP");

        Person person2 = builder2.build();
        System.out.println("Persona 2: " + person2);
    }
}