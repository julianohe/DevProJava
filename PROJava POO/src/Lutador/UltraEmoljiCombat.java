package Lutador;

import Lutador.Luta;
import Lutador.Lutador;

public class UltraEmoljiCombat {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];

    l[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);
    l[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14,2, 3);
    l[2] = new Lutador("Pedro", "EUA", 25, 1.70f, 82.4f, 12, 2, 1);
    l[3] = new Lutador("Salvador", "Inglaterra", 34, 1.80f, 80.4f, 13, 0, 2);
    l[4] = new Lutador("Felipe", "Horlando", 33, 1.70f, 120.3f, 5, 4, 2);
    l[5] = new Lutador("Douglas", "Mexico",22 , 1.85f,105.8f , 12, 2, 4);

    Luta ABA = new Luta();
    ABA.marcarLuta (l[1],l[2]);
    ABA.lutar();

    }
}
