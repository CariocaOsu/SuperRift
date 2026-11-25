package model;

import personagens.Personagem;

public class Jogador {
    private String nomeJogadores;
    private Personagem personagem;

    public Jogador(String nomeJogadores, Personagem personagem) {
        this.nomeJogadores = nomeJogadores;
        this.personagem = personagem;
    }

    public String getNomeJogadores() {
        return nomeJogadores;
    }

    public Personagem getPersonagem() {
        return personagem;
    }

    public void exibirMensagem() {
        if (personagem == null) {
            System.out.println("Nao foi possivel escolher o personagem.");
        } else {
            System.out.println("Personagem: " + personagem.getNomePersonagem());
        }
    }
}
