package personagens;

public class Acuaminas extends Personagem {
    public Acuaminas() {
        super("Acuaminas");
    }

    @Override
    public void poderPersonagem() {
        System.out.println("Uma vez por partida, pode olhar o monte de outro jogador que escolher antes de todos compararem as suas cartas.");
    }
}
