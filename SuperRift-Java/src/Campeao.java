public class Campeao{
    private String nomeCampeao;
    private String codigoCarta;
    private String funcao;
    private Atributos atributos;

    public Campeao(String nomeCampeao, String codigoCarta, String funcao, Atributos atributos){
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

    public boolean isCartaAs() {
        return this.cartaAs = (codigoCarta != null && codigoCarta.length() >= 2 && codigoCarta.charAt(1) == 'A');
    }

    public boolean isSuperTrunfo() {
        return this.supertrunfo = (nomeCampeao != null && nomeCampeao.equals("Puro");
}

