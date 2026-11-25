package game;

import model.Atributos;
import model.Cartas;

import java.util.ArrayList;
import java.util.List;

public class ListaCartas {

    public static List<Cartas> criarCartas() {
        List<Cartas> campeoes = new ArrayList<>();


        Atributos atributosKaisa = new Atributos(84, 34, 52, 46, 28);
        Atributos atributosJinx = new Atributos(88, 18, 48, 44, 24);
        Atributos atributosXayah = new Atributos(82, 22, 54, 50, 26);
        Atributos atributosAshe = new Atributos(78, 28, 50, 45, 30);
        Atributos atributosYunara = new Atributos(85, 30, 52, 48, 27);

        // ASSASSINOS
        Atributos atributosYasuo = new Atributos(85, 20, 45, 38, 32);
        Atributos atributosZed = new Atributos(91, 15, 42, 36, 30);
        Atributos atributosKatarina = new Atributos(25, 88, 40, 34, 35);
        Atributos atributosTalon = new Atributos(87, 15, 44, 38, 28);
        Atributos atributosYone = new Atributos(84, 28, 46, 36, 32);

        // LUTADORES
        Atributos atributosSett = new Atributos(82, 18, 76, 40, 30);
        Atributos atributosJax = new Atributos(78, 32, 70, 42, 32);
        Atributos atributosCamille = new Atributos(80, 20, 68, 39, 28);
        Atributos atributosOlaf = new Atributos(84, 15, 74, 38, 29);
        Atributos atributosFiora = new Atributos(86, 18, 66, 37, 27);

        // MAGOS
        Atributos atributosAhri = new Atributos(22, 86, 36, 46, 52);
        Atributos atributosOrianna = new Atributos(20, 84, 34, 48, 54);
        Atributos atributosZoe = new Atributos(18, 90, 30, 44, 50);
        Atributos atributosVeigar = new Atributos(16, 94, 32, 45, 52);
        Atributos atributosHwei = new Atributos(19, 88, 33, 46, 55);
        Atributos atributosSyndra = new Atributos(21, 91, 35, 47, 51);

        // TANQUES
        Atributos atributosTahmKench = new Atributos(28, 30, 90, 62, 54);
        Atributos atributosChoGath = new Atributos(26, 34, 94, 60, 52);
        Atributos atributosNautilus = new Atributos(24, 28, 86, 65, 50);
        Atributos atributosShen = new Atributos(30, 26, 84, 63, 55);
        Atributos atributosNasus = new Atributos(33, 25, 88, 61, 53);

        // SUPORTES
        Atributos atributosNami = new Atributos(18, 56, 76, 46, 82);
        Atributos atributosLulu = new Atributos(20, 58, 74, 48, 80);
        Atributos atributosSoraka = new Atributos(15, 54, 80, 44, 85);
        Atributos atributosRakan = new Atributos(24, 50, 82, 52, 76);

        // SUPER TRUNFO
        Atributos atributosPoro = new Atributos(1, 1, 1, 1, 1);

            // ATIRADORES
            campeoes.add( new Cartas("Kai'sa", "1A", "Atirador", atributosKaisa));
            campeoes.add( new Cartas("Jinx", "1B", "Atirador", atributosJinx));
            campeoes.add( new Cartas("Xayah", "1C", "Atirador", atributosXayah));
            campeoes.add( new Cartas("Ashe", "1D", "Atirador", atributosAshe));
            campeoes.add( new Cartas("Yunara", "1E", "Atirador", atributosYunara));


            // ASSASINOS
            campeoes.add( new Cartas("Yasuo", "2A", "Assassino", atributosYasuo));
            campeoes.add( new Cartas("Zed", "2B", "Assassino", atributosZed) );
            campeoes.add( new Cartas("Katarina", "2C", "Assassino", atributosKatarina) );
            campeoes.add( new Cartas("Talon", "2D", "Assasino", atributosTalon) );
            campeoes.add( new Cartas("Yone", "2E", "Assassino", atributosYone) );

            // LUTADORES
            campeoes.add( new Cartas("Sett", "3A", "Lutador", atributosSett) );
            campeoes.add( new Cartas("Jax", "3B", "Lutador", atributosJax) );
            campeoes.add( new Cartas("Camille", "3C", "Lutador", atributosCamille) );
            campeoes.add( new Cartas("Olaf", "3D", "Lutador", atributosOlaf) );
            campeoes.add( new Cartas("Fiora", "3E", "Lutador", atributosFiora) );

            // MAGOS
            campeoes.add ( new Cartas("Ahri", "4A", "Mago", atributosAhri) );
            campeoes.add ( new Cartas("Orianna", "4B", "Mago", atributosOrianna) );
            campeoes.add ( new Cartas("Zoe", "4C", "Mago", atributosZoe) );
            campeoes.add ( new Cartas("Veigar", "4D", "Mago", atributosVeigar) );
            campeoes.add ( new Cartas("Hwei", "4E", "Mago", atributosHwei) );
            campeoes.add ( new Cartas("Syndra", "4F", "Mago", atributosSyndra) );

            // TANQUES
            campeoes.add( new Cartas("Tahm Kench", "5A", "Tanque", atributosTahmKench));
            campeoes.add ( new Cartas("Cho Gath", "5B", "Tanque", atributosChoGath));
            campeoes.add( new Cartas("Nautilus", "5C", "Tanque", atributosNautilus));
            campeoes.add ( new Cartas("Shen", "5D", "Tanque", atributosShen));
            campeoes.add ( new Cartas("Nasus", "5E", "Tanque", atributosNasus));

            // SUPORTES
            campeoes.add( new Cartas("Nami", "6A", "Suporte", atributosNami));
            campeoes.add( new Cartas("Lulu", "6B", "Suporte", atributosLulu));
            campeoes.add( new Cartas("Soraka", "6C", "Suporte", atributosSoraka));
            campeoes.add ( new Cartas("Rakan", "6F", "Suporte", atributosRakan));

            // SUPER TRUNFO (VENCE TODAS, MENOS OS "As")
            campeoes.add( new Cartas("Poro", "ST", "Super Trunfo", atributosPoro));

            return campeoes;
        }
    }
