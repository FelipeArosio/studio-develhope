public class Gatto extends Animale {

    @Override
    public String toString() {
        return "Gatto{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public Gatto (String nome) {
        super(nome);
    }
}
