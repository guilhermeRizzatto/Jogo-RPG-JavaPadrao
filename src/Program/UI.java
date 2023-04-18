package Program;

import Personagens.Inimigos.Inimigo;
import Personagens.Jogador;

import java.io.IOException;

public class UI {

    public static void clr(){
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            }
            else {
                System.out.print("\033\143");
            }
        } catch (IOException | InterruptedException ex) {}
    }


    public static void statusBatalha(Jogador jogador , Inimigo inimigo){
        System.out.println();
        System.out.printf("%-25s%s%n","Jogador:","Inimigo:");
        System.out.printf("%s%-20d%s%d%n","Vida:",jogador.getVida(),"Vida:", inimigo.getVida());
        System.out.printf("%s%-20d%s%d%n","Dano:",jogador.getDano(),"Dano:", inimigo.getDano());
        System.out.printf("%s%.2f%n","Dinheiro:",jogador.getDinheiro());
        System.out.println();
        jogador.mostrarInventario();
        System.out.println();
    }
}
