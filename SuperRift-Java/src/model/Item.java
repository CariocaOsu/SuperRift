package model;

public class Item {
    private String nomeItem;
    private Atributos atributos;

    public Item( String nomeItem, Atributos atributos){
        this.nomeItem = nomeItem;
        this.atributos = atributos;
    }

    public String getNomeItem(){
        return nomeItem;
    }

    public Atributos getAtributos() { return atributos; }
    }


