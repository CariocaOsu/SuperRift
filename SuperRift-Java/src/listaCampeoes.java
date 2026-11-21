import java.util.ArrayList;
import java.util.List;
public class listaCampeoes {

    public List<Campeao> criarCampeoes() {
        List<Campeao> campeoes = new ArrayList<>();


            Atributos atributosKaisa = new Atributos(70, 60, 40, 40, 20);
            Atributos atributosYasuo = new Atributos(70, 60, 40, 40, 20);
            Atributos atributosNami = new Atributos(70, 60, 40, 40, 20);
            Atributos atributosSett = new Atributos(70, 60, 40, 40, 20);
            Atributos atributosAhri = new Atributos(70, 60, 40, 40, 20);
            Atributos atributosTahmKench = new Atributos(70, 60, 40, 40, 20);
            Atributos atributosPoro = new Atributos(1, 1, 1, 1, 1);

            campeoes.add( new Campeao("Kai'sa", "1A", "Atirador", atributosKaisa));
            campeoes.add( new Campeao("Yasuo", "2A", "Assasino", atributosYasuo));
            campeoes.add( new Campeao("Sett", "3A", "Lutador", atributosSett));
            campeoes.add( new Campeao("Ahri", "4A", "Mago", atributosAhri));
            campeoes.add( new Campeao("Tahm Kench", "5A", "Tanque", atributosTahmKench));
            campeoes.add( new Campeao("Nami", "6A", "Suporte", atributosNami));
            campeoes.add( new Campeao("Poro", "ST", "Super Trunfo", atributosPoro));

            return campeoes;
        }
    }
