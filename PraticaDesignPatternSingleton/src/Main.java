public class Main {

    private static MioFatabase db;
    public static MioFatabase getDb(){
        if (db == null) {
            db = new MioFatabase();
        }
        return db;
    }
    public static void main(String[] args) {

        System.out.println("Hello world!");

        MioFatabase localDb = getDb();
    }
}