package personagens;

public abstract class Personagem {
    private String nome;

    public Personagem(String nome) {
        this.nome = nome;
    }

    public String getNomePersonagem() {
        return nome;
    }

    public abstract void poderPersonagem();
}
