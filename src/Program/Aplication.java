package Program;

import Andares.Andar1;
import Personagens.Jogador;
import Personagens.Vendedor;

import java.util.Scanner;


public class Aplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Jogador jogador = new Jogador();

        jogador.setDinheiro(300.00);
        Vendedor vendedor = new Vendedor();
        UI.clearScreen();
        System.out.println(jogador);

        System.out.println();
        System.out.println(vendedor);
        System.out.println();
        vendedor.mostrarItens();
        int s = sc.nextInt();
        vendedor.venderItem(vendedor,jogador,s);
        System.out.println();

        System.out.println(jogador);
        jogador.mostrarInventario();
        System.out.println();
        int n = sc.nextInt();
        jogador.usarItem(jogador,n);

        System.out.println();
        System.out.println(jogador);



    }
}