package Andares;

import Personagens.Inimigos.Inimigo;
import Personagens.Inimigos.Servo;
import Personagens.Jogador;
import Personagens.PersonagemException;
import Personagens.Vendedor;
import Program.UI;

import java.util.Scanner;

public class Andar1 {

    private static final Inimigo servo1 = new Servo(5,1);
    private static final Inimigo servo2 = new Servo(3,2);
    private static final Inimigo servo3 = new Servo(4,5);
    private static final Vendedor vendedor = new Vendedor();

    public static void runAndar(Jogador jogador, Scanner sc) {
        UI.clr();
        while (true) {
            System.out.println("Bem vindo ao primeiro andar da TORRE");
            System.out.println();
            System.out.println("Esperamos te encontrar vivo no final, BOA SORTE....");
            System.out.println();
            System.out.println("* Aperte a tecla ENTER para continuar *");
            sc.nextLine();
            UI.clr();
            while (servo1.getVida() > 0) {
                UI.statusBatalha(jogador, servo1);
                System.out.println("T - Atacar");
                System.out.println();
                while (true) {
                    try {
                        if (readInput(sc) == 't') {
                            break;
                        }
                        System.out.println("Erro: digite T");
                    } catch (StringIndexOutOfBoundsException e) {
                        System.out.println("Erro: digite novamente");
                        System.out.println();
                    }
                }
                jogador.atkJogador(servo1);
                servo1.atk(jogador);
                System.out.println();
                System.out.println("* Aperte a tecla ENTER para continuar *");
                sc.nextLine();
                UI.clr();
                if (jogador.getVida() <= 0) {
                    break;
                }
            }
            if (jogador.getVida() <= 0) {
                System.out.println("VOCÊ MORREU :(");
                System.out.println();
                System.out.println("* Aperte a tecla ENTER para continuar *");
                sc.nextLine();
                UI.clr();
                break;
            }
            System.out.println("INIMIGO DERROTADO : +5 MOEDAS");
            jogador.setDinheiro(5.0);
            System.out.println();
            System.out.println(jogador);
            System.out.println();
            System.out.println("* Aperte a tecla ENTER para continuar *");
            sc.nextLine();
            UI.clr();
            System.out.println("Tem mais 2 inimigos a sua espera, melhor se preparar...");
            System.out.println();
            System.out.println("* Aperte a tecla ENTER para continuar *");
            sc.nextLine();
            UI.clr();
            while (servo2.getVida() > 0) {
                UI.statusBatalha(jogador, servo2);
                System.out.println("T - Atacar");
                System.out.println();
                while (true) {
                    try {
                        if (readInput(sc) == 't') {
                            break;
                        }
                        System.out.println("Erro: digite T");
                    } catch (StringIndexOutOfBoundsException e) {
                        System.out.println("Erro: digite novamente");
                        System.out.println();
                    }
                }
                jogador.atkJogador(servo2);
                servo2.atk(jogador);
                System.out.println();
                System.out.println("* Aperte a tecla ENTER para continuar *");
                sc.nextLine();
                UI.clr();
                if (jogador.getVida() <= 0) {
                    break;
                }
            }
            if (jogador.getVida() <= 0) {
                System.out.println("VOCÊ MORREU :(");
                System.out.println();
                System.out.println("* Aperte a tecla ENTER para continuar *");
                sc.nextLine();
                UI.clr();
                break;
            }
            System.out.println("INIMIGO DERROTADO : +5 MOEDAS");
            jogador.setDinheiro(jogador.getDinheiro() + 5.0);
            System.out.println();
            System.out.println(jogador);
            System.out.println();
            System.out.println("* Aperte a tecla ENTER para continuar *");
            sc.nextLine();
            UI.clr();
            System.out.println("Agora só mais um...");
            System.out.println();
            System.out.println("* Aperte a tecla ENTER para continuar *");
            sc.nextLine();
            UI.clr();
            while (servo3.getVida() > 0) {
                UI.statusBatalha(jogador, servo3);
                System.out.println("T - Atacar");
                System.out.println();
                while (true) {
                    try {
                        if (readInput(sc) == 't') {
                            break;
                        }
                        System.out.println("Erro: digite T");
                    } catch (StringIndexOutOfBoundsException e) {
                        System.out.println("Erro: digite novamente");
                        System.out.println();
                    }
                }
                jogador.atkJogador(servo3);
                servo3.atk(jogador);
                System.out.println();
                System.out.println("* Aperte a tecla ENTER para continuar *");
                sc.nextLine();
                UI.clr();
                if (jogador.getVida() <= 0) {
                    break;
                }
            }
            if (jogador.getVida() <= 0) {
                System.out.println("VOCÊ MORREU :(");
                System.out.println();
                System.out.println("* Aperte a tecla ENTER para continuar *");
                sc.nextLine();
                UI.clr();
                break;
            }
            System.out.println("INIMIGO DERROTADO : +5 MOEDAS");
            jogador.setDinheiro(jogador.getDinheiro() + 5.0);
            System.out.println();
            System.out.println(jogador);
            System.out.println();
            System.out.println("Parabéns primeiros inimigos mortos, agora vá até o vendedor");
            System.out.println();
            System.out.println("* Aperte a tecla ENTER para continuar *");
            sc.nextLine();
            UI.clr();
            System.out.println(jogador);
            System.out.println();
            System.out.println(vendedor);
            System.out.println();
            while (true) {
                try {
                    vendedor.mostrarItens();
                    System.out.println();
                    System.out.println("Digite o número do item que deseja comprar");
                    vendedor.venderItem(jogador, sc.nextInt());
                    sc.nextLine();
                    System.out.println();
                    break;
                } catch (PersonagemException e) {
                    System.out.println(e.getMessage());
                    System.out.println();
                }
            }
            System.out.println();
            System.out.println("* Aperta a tecla ENTER para continuar *");
            sc.nextLine();
            UI.clr();
            System.out.println(jogador);
            jogador.mostrarInventario();
            System.out.println();
            System.out.println("* Aperta a tecla ENTER para continuar *");
            sc.nextLine();
            UI.clr();
            System.out.println("Primeiro andar concluído, vá para o próximo");
            System.out.println();
            System.out.println("* Aperta a tecla ENTER para continuar *");
            sc.nextLine();
            UI.clr();
            break;
        }
    }

    private static char readInput(Scanner sc){
        return sc.nextLine().charAt(0);
    }
}
