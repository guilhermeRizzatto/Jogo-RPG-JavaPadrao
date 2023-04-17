package Program;

import Personagens.Inimigos.Inimigo;
import Personagens.Jogador;

public class UI {
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void statusBatalha(Jogador jogador , Inimigo inimigo){
        System.out.printf("%-25s%s%n","Jogador:","Inimigo:");
        System.out.printf("%s%-20d%s%d%n","Vida:",jogador.getVida(),"Vida:", inimigo.getVida());
        System.out.printf("%s%-20d%s%d%n","Dano:",jogador.getDano(),"Dano:", inimigo.getDano());
        System.out.printf("%s%.2f%n","Dinheiro:",jogador.getDinheiro());
        System.out.println();
    }
}
