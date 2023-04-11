package Andares;

import Personagens.Inimigo;
import Personagens.Jogador;
import Program.UI;

import java.util.Scanner;


public class Andar1 {

    private Jogador jogador;
    private Inimigo inimigo;

    public Andar1(Jogador jogador){
        this.jogador = jogador;
        inimigo = new Inimigo(10, 2);
    }

    public void primeiraCena(){
        System.out.println("Você está no primeiro andar da torre");
        System.out.println();
        System.out.println("Talvez você encontre algum inimigo, então tome cuidado!");
        System.out.println();
        System.out.println("//Indo em frente...");
        System.out.println();
    }

    public void segundaCena(){
        System.out.println("Olá eu sou o seu guia nesses primeiros 3 andares");
        System.out.println();
        System.out.println("Você precisará ser forte! A cada andar os inimigos vão ficando cada vez mais fortes!!");
        System.out.println();
        System.out.println("Ah... quase me esqueci, sempre vá preparado para o próximo andar, você pode encontrar o Boss!");
        System.out.println();
        System.out.println("Se prepare caso o encontre, ele é o um dos mais fortes, e comanda todos abaixo do seu andar");
        System.out.println();
        System.out.println("Vamos enfrente...");
        System.out.println();
    }

    public void terceiraCena(){
        System.out.println("INIMIGO!!!");
        System.out.println();
        System.out.println("Se acalme! irei te ajudar nessa");
        System.out.println();
        System.out.println("O seu dano por ataque é de: " + jogador.getDano() + " e o do inimigo é de: " + inimigo.getDano());
        System.out.println();
        System.out.println("Me parece que ele é mais forte que você... mas tente matá-lo, eu irei te dar uma poção de vida e dano quando precisar");
        System.out.println();
    }

    public void quartaCena(){
        System.out.println("T - Atacar");
        System.out.println();
        System.out.println("Vai!!! ataque ele!! aperte T");
        Scanner sc = new Scanner(System.in);
        while (readInput(sc) != 't'){
            System.out.println("Digite T");
        }
        jogador.atkJogador(jogador, inimigo);
        inimigo.atkInimigo(inimigo, jogador);
        System.out.println("Você tirou: " + jogador.getDano() + " de vida dele, e perdeu:" + inimigo.getDano() + " de vida");
        System.out.println();
        System.out.println("Aperte qualquer tecla para continuar");
        sc.next();

        for(int i = 1; i < 4; i++) {
            UI.clearScreen();
            status();
            System.out.println("Ataque novamente!");
            System.out.println("T - Atacar");
            while (readInput(sc) != 't') {
                System.out.println("Digite T");
            }
            jogador.atkJogador(jogador, inimigo);
            inimigo.atkInimigo(inimigo, jogador);
            System.out.println();
        }

        System.out.println("Parece que você vai morrer... irei te ajudar!!");
        System.out.println("Irei te dar uma poção de vida que irá restaura-lá para 10 e uma de dano que irá aumenta-lo para 3 dano por ataque");
        System.out.println();
        System.out.println("Aperte qualquer tecla para continuar");
        sc.next();
        jogador.setVida(10);
        jogador.setDano(3);
        UI.clearScreen();
        System.out.println();
        System.out.println("Bom agora ataque novamente!!");

        while(inimigo.getVida() > 0){
            status();
            System.out.println("T - Atacar");
            System.out.println();
            while (readInput(sc) != 't') {
                System.out.println("Digite T");
            }
            jogador.atkJogador(jogador, inimigo);
            inimigo.atkInimigo(inimigo, jogador);
            System.out.println();
            UI.clearScreen();
        }
        status();
        System.out.println("Otimo você conseguiu matá-lo, vamos para o proximo andar!!");
        System.out.println("Próximo andar...");
    }

    public char readInput(Scanner sc){
        return sc.next().charAt(0);
    }

    public void status(){
        System.out.printf("%-25s%s%n","Jogador:","Inimigo:");
        System.out.printf("%s%-20d%s%d%n","Vida:",jogador.getVida(),"Vida:", inimigo.getVida());
        System.out.printf("%s%-20d%s%d%n","Dano:",jogador.getDano(),"Dano:", inimigo.getDano());
        System.out.printf("%s%.2f%n","Dinheiro:",jogador.getDinheiro());
        System.out.println();
    }

}
