public class Main {
    public static void main(String[] args) {
        CarBuilder builder = new CarBuilder();
        builder.setColore("Branco");
        builder.setNumeroDiPorte(2);
        builder.setPropulsione("benzina");
        builder.setTipo("Sportiva");
        Car macchinaMia = builder.build();


        System.out.println("macchinaMia: " + macchinaMia);

        //Car macchinaMia2 = new Car(4,"Rosso","Diesel","SUV");
       // System.out.println("macchinaMia2: " + macchinaMia2);
    }
}