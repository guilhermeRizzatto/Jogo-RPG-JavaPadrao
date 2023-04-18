package Program;

import Andares.Tutorial;
import Personagens.Inimigos.Inimigo;
import Personagens.Inimigos.Servo;
import Personagens.Jogador;

import java.util.Scanner;

public class Aplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Jogador jogador = new Jogador();

        Tutorial tutorial = new Tutorial(jogador);
        tutorial.primeiraCena(sc);
        tutorial.segundaCena(sc);
        tutorial.terceiraCena(sc);
        tutorial.quartaCena(sc);

        sc.close();
    }
}
