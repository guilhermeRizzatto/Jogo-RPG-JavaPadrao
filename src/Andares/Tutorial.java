package Andares;

import Itens.PocaoDeDano;
import Itens.PocaoDeVida;
import Personagens.Inimigos.Inimigo;
import Personagens.Inimigos.Servo;
import Personagens.Jogador;
import Personagens.Vendedor;
import Program.UI;


import java.util.Scanner;


public class Tutorial {

    private Jogador jogador;
    private Inimigo servo;
    private final Vendedor vendedor = new Vendedor();

    public Tutorial(Jogador jogador){
        this.jogador = jogador;
        servo = new Servo(10, 2);
    }

    public void primeiraCena(Scanner sc){
        UI.clearScreen();
        System.out.println("Bem vindo ao tutorial");
        System.out.println();
        System.out.println("Aqui iremos te ensinar a atacar os inimigos, usar os itens e comprá-los");
        System.out.println();
        System.out.println("* Aperte a tecla ENTER para continuar *");
        sc.nextLine();
        UI.clearScreen();
        System.out.println("Você sera enviado a uma torre de 10 andares, e o seu objetivo é chegar até o seu ultimo andar");
        System.out.println("Derrotando todos os inimigos que aparecerem em cada andar");
        System.out.println();
        System.out.println("Você precisará ser forte, a cada andar os inimigos vão ficando cada vez mais fortes!!");
        System.out.println();
        System.out.println("* Aperte a tecla ENTER para continuar *");
        sc.nextLine();
        UI.clearScreen();
        System.out.println("Ah... quase me esqueci, sempre vá preparado para o próximo andar, você pode encontrar o Boss!");
        System.out.println();
        System.out.println("Se prepare caso o encontre, ele é o um dos mais fortes, e comanda todos abaixo do seu andar");
        System.out.println();
        System.out.println("* Aperte a tecla ENTER para continuar *");
        sc.nextLine();
        UI.clearScreen();
    }

    public void segundaCena(Scanner sc){
        System.out.println("Um inimigo a frente!!");
        System.out.println();
        System.out.println("Sempre que trombar com um inimigo, você precisa matá-lo, para poder continuar em frente");
        System.out.println();
        System.out.println("*IMPORTANTE* As batalhas funcionam por turno, ou seja, uma ação sua e uma do inimigo em seguida, não é possível fazer duas ações seguidas");
        System.out.println();
        System.out.println("Toda batalha aparecerá este hud para te auxiliar durante a batalha: ");
        UI.statusBatalha(jogador, servo);
        System.out.println("*IMPORTANTE* Sempre compare as suas estatisticas com a do inimigo");
        System.out.println();
        System.out.println("Me parece que ele é mais forte que você... mas tente matá-lo");
        System.out.println();
        System.out.println("* Aperte a tecla ENTER para continuar *");
        sc.nextLine();
        UI.clearScreen();

    }

    public void terceiraCena(Scanner sc){
        UI.statusBatalha(jogador,servo);
        System.out.println("Aperte a seguinte tecla para atacar, quando a opção ataque estiver disponível");
        System.out.println();
        System.out.println("*IMPORTANTE* O seu ataque tem chance de causar um dano critico, ou seja o seu dano atual + 2");
        System.out.println();
        System.out.println("T - Atacar");
        System.out.println();
        while (readInput(sc) != 't'){
            System.out.println("Digite T");
        }
        jogador.atkJogador(servo);
        servo.atk(jogador);
        UI.statusBatalha(jogador, servo);
        System.out.println();
        System.out.println("Agora continue atacando até matá-lo");
        System.out.println();
        System.out.println("* Aperte a tecla ENTER para continuar *");
        sc.nextLine();

        for(int i = 1; i < 4; i++) {
            UI.clearScreen();
            UI.statusBatalha(jogador, servo);
            System.out.println("T - Atacar");
            while (readInput(sc) != 't') {
                System.out.println("Digite T");
            }
            jogador.atkJogador(servo);
            servo.atk(jogador);
            System.out.println();
            System.out.println("* Aperte a tecla ENTER para continuar *");
            sc.nextLine();
        }

        System.out.println("Parece que você vai morrer... adicionamos 2 itens no seu inventário para que você possa usar");
        System.out.println("Uma poção de vida que irá restaura-lá para 10 pontos de vida e uma de dano que irá aumenta-lo para 3 de dano por ataque");
        System.out.println();
        System.out.println("* Aperte a tecla ENTER para continuar *");
        sc.nextLine();
        UI.clearScreen();
        jogador.adicionarItem(new PocaoDeVida(10, 0.0));
        jogador.adicionarItem(new PocaoDeDano(3, 0.0));
        System.out.println("Agora preste atenção no seu inventário");
        System.out.println();
        System.out.println(jogador);
        System.out.println();
        jogador.mostrarInventario();
        System.out.println();
        System.out.println("Aperte o número do item que deseja usar");
        jogador.usarItem(jogador,sc.nextInt());
        System.out.println();
        System.out.println(jogador);
        System.out.println();
        jogador.mostrarInventario();
        System.out.println();
        System.out.println("Novamente, aperte o número do item que restou");
        jogador.usarItem(jogador,sc.nextInt());
        System.out.println();
        System.out.println("* Aperte a tecla ENTER para continuar *");
        sc.nextLine();
        UI.clearScreen();
        System.out.println(jogador);
        System.out.println();
        System.out.println("Veja que sua vida aumentou, e o seu dano por ataque também");
        System.out.println();
        System.out.println("agora ataque novamente o inimigo");
        System.out.println();
        System.out.println("* Aperte a tecla ENTER para continuar *");
        sc.nextLine();
        UI.clearScreen();

        while(servo.getVida() > 0){
            UI.statusBatalha(jogador, servo);
            System.out.println("T - Atacar");
            System.out.println();
            while (readInput(sc) != 't') {
                System.out.println("Digite T");
            }
            jogador.atkJogador(servo);
            servo.atk(jogador);
            System.out.println();
            System.out.println("* Aperte a tecla ENTER para continuar *");
            sc.nextLine();
            UI.clearScreen();
        }

        UI.statusBatalha(jogador, servo);
        System.out.println("Otimo você conseguiu matá-lo");
        System.out.println();
        System.out.println("Você ganhou: 5.0 moedas");
        jogador.setDinheiro(5.0);
        System.out.println();
        System.out.println("*IMPORTANTE* Ao matar qualquer inimigo, você receberá moedas");
        System.out.println();
        System.out.println("* Aperte a tecla ENTER para continuar *");
        sc.nextLine();
        UI.clearScreen();
    }

    public void quartaCena(Scanner sc){
        System.out.println(jogador);
        System.out.println();
        System.out.println("Ao final de todo andar, você irá encontrar o vendedor, ele que irá vender os itens que podem te ajuda durante as batalhas");
        System.out.println();
        System.out.println("Você tem pouco dinheiro, então iremos adicionar 300.00 para você poder comprar algo");
        jogador.setDinheiro(jogador.getDinheiro() + 300.00);
        System.out.println();
        System.out.println(jogador);
        System.out.println();
        System.out.println("*IMPORTANTE* Sempre fique de olho no seu dinheiro, você só consegue comprar algum item caso tenha dinheiro suficiente");
        System.out.println();
        System.out.println("* Aperte a tecla ENTER para continuar *");
        sc.nextLine();
        UI.clearScreen();
        System.out.println(jogador);
        System.out.println();
        System.out.println(vendedor);
        System.out.println();
        vendedor.mostrarItens();
        System.out.println();
        System.out.println("Digite o número do item que deseja comprar");
        vendedor.venderItem(jogador, sc.nextInt());
        sc.nextLine();
        System.out.println();
        System.out.println("* Aperta a tecla ENTER para continuar *");
        sc.nextLine();
        UI.clearScreen();
        System.out.println();
        System.out.println("O item é adicionado no seu inventário, e o valor do item comprado é debitado da quantia de dinheiro da qual você possui automaticamente");
        System.out.println();
        System.out.println(jogador);
        jogador.mostrarInventario();
        System.out.println();
        System.out.println("Pronto, você finalizou o tutorial, agora irá ser colocado no primeiro andar, com os seus atributos resetados");
        System.out.println();
        System.out.println("BOA SORTE");
        System.out.println();
        System.out.println("* Aperte a tecla ENTER para continuar *");
        sc.nextLine();
        UI.clearScreen();
    }

    private char readInput(Scanner sc){
        return sc.nextLine().charAt(0);
    }

}

