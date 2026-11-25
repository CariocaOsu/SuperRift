package personagens;

public class LoboTrevoguari extends Personagem {
    public LoboTrevoguari() {
        super("Lobo Trevoguari");
    }

    @Override
    public void poderPersonagem() {
        System.out.println("Uma vez por partida, o Lobo pode descartar a carta do proprio monte e puxar a proxima carta uma vez por jogo.");
    }
}

