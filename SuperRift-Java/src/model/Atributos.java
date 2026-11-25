package model;

public class Atributos {
    private int danoDeAtaque;
    private int magia;
    private int vida;
    private int armadura;
    private int resistenciaMagica;

    public Atributos(int danoDeAtaque, int magia, int vida, int armadura, int resistenciaMagica){
        this.danoDeAtaque = danoDeAtaque;
        this.magia = magia;
        this.vida = vida;
        this.armadura = armadura;
        this.resistenciaMagica = resistenciaMagica;
    }

    public int getDanoDeAtaque(){
        return danoDeAtaque;
    }

    public int getMagia(){
        return magia;
    }

    public int getVida(){
        return vida;
    }

    public int getArmadura(){
        return armadura;
    }

    public int getResistenciaMagica(){
        return resistenciaMagica;
    }

    public void poderKruges(){
        this.armadura += 3;
        this.resistenciaMagica += 3;
    }
}
