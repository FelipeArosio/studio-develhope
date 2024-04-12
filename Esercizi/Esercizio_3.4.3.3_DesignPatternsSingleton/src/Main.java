public class Main {
    public static void main(String[] args) {

        User user1 = User.getInstance();

        System.out.println("Informazioni Utente 1:");
        user1.printInfo();

        user1.setNome("Felipe");
        user1.setEta(27);

        System.out.println("Nuova Informazioni Utente 1:");
        user1.printInfo();

        User user2 = User.createUser("Gabriel", 27);
        user2.printInfo();
    }
}