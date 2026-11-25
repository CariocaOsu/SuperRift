package personagens;

public class Grompe extends Personagem {
    public Grompe(){
        super("Grompe");
    }

    @Override
    public void poderPersonagem() {
        System.out.println("Uma vez por partida, o Grompe pode descartar a carta do proprio monte a qualquer momento antes de equipar o item.");
    }
}
