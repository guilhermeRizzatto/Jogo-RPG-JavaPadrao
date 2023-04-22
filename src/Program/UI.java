package Program;

import Andares.Tutorial;
import Personagens.Inimigos.Inimigo;
import Personagens.Jogador;

import java.io.IOException;
import java.util.Scanner;

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

    public static void menu(Scanner sc){
        UI.clr();
        String s;
        do {
            System.out.println();
            System.out.println("MENU: ");
            System.out.println();
            System.out.printf("%-25s%s%n", "1 - Jogar Torre", "2 - Jogar Tutorial");
            System.out.printf("%-25s%n", "0 - Sair");
            System.out.println();

            s = sc.nextLine();

            switch (s){
                case "1":
                    System.out.println();
                    System.out.println("Em produção...");
                    System.out.println();
                    System.out.println(" * aperte ENTER para voltar * ");
                    sc.nextLine();
                    UI.clr();
                    break;
                case "2":
                    Tutorial tutorial = new Tutorial();
                    tutorial.primeiraCena(sc);
                    tutorial.segundaCena(sc);
                    tutorial.terceiraCena(sc);
                    tutorial.quartaCena(sc);
                    break;
                case "0":
                    System.out.println();
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println();
                    System.out.println("Opção inválida");
                    System.out.println();
                    System.out.println(" * aperte ENTER para voltar * ");
                    sc.nextLine();
                    UI.clr();
            }
        }while(!s.equals("0"));
    }
}
