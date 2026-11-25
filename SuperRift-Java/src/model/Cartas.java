package model;

public class Cartas{
    private String nomeCampeao;
    private String codigoCarta;
    private String funcao;
    private Atributos atributos;

    public Cartas(String nomeCampeao, String codigoCarta, String funcao, Atributos atributos){
    this.nomeCampeao = nomeCampeao;
    this.codigoCarta = codigoCarta;
    this.funcao = funcao;
    this.atributos = atributos;
    }

    public String getFuncao() {
        return funcao;
    }

    public Atributos getAtributos() {
        return atributos;
    }

    public String getCodigoCarta() {
        return codigoCarta;
    }

    public String getNomeCampeao() {
        return nomeCampeao;
    }

    public boolean isCartaAs() { // confere se a carta eh um A que derrota o supertrunfo{
        return codigoCarta != null
                && codigoCarta.length() >= 2
                && codigoCarta.charAt(1) == 'A';
    }

    // autenticacao do super trunfo
    public boolean isSuperTrunfo() {
        return "Poro".equals(nomeCampeao)
                &&  "ST".equals(codigoCarta)
                &&  "Super Trunfo".equals(funcao);
    }
}

