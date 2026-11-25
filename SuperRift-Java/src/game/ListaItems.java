package game;

import model.Atributos;
import model.Item;

import java.util.ArrayList;
import java.util.List;

public class ListaItems {

    public List<Item> criarItens() {
        List<Item> itens = new ArrayList<>();

        // Itens de Dano Físico
        itens.add(new Item("Gume do Infinito", new Atributos(8, 0, 0, 0, 0)));
        itens.add(new Item("Lembranças de Dominik", new Atributos(7, 0, 0, 0, 0)));
        itens.add(new Item("Sedenta por Sangue", new Atributos(6, 0, 3, 0, 0)));
        itens.add(new Item("Mata-Kraken", new Atributos(5, 0, 0, 0, 0)));

        // Itens de Poder Mágico
        itens.add(new Item("Capuz de Rabadon", new Atributos(0, 8, 0, 0, 0)));
        itens.add(new Item("Cajado do Vazio", new Atributos(0, 7, 0, 0, 0)));
        itens.add(new Item("Zhonyas", new Atributos(0, 5, 0, 3, 0)));
        itens.add(new Item("Perdição de Lich", new Atributos(2, 5, 0, 0, 0)));

        // Itens de Armadura/Vida
        itens.add(new Item("Coração Congelado", new Atributos(0, 0, 0, 8, 0)));
        itens.add(new Item("Armadura de Espinhos", new Atributos(0, 0, 2, 5, 0)));
        itens.add(new Item("Presságio de Randuin", new Atributos(0, 0, 3, 6, 0)));
        itens.add(new Item("Coração de Aço", new Atributos(0, 0, 8, 0, 0)));

        // Itens de Resistência Mágica/Vida
        itens.add(new Item("Força da Natureza", new Atributos(0, 0, 2, 0, 7)));
        itens.add(new Item("Semblante Espiritual", new Atributos(0, 0, 5, 0, 4)));
        itens.add(new Item("Máscara Abissal", new Atributos(0, 3, 3, 0, 3)));
        itens.add(new Item("Jak'Sho, o Inconstante", new Atributos(0, 0, 2, 4, 4)));

        return itens;
    }
}