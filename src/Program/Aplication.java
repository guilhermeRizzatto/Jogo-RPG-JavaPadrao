package Program;

import Andares.Tutorial;

import java.util.Scanner;

public class Aplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Tutorial tutorial = new Tutorial();

        tutorial.primeiraCena(sc);
        tutorial.segundaCena(sc);
        tutorial.terceiraCena(sc);
        tutorial.quartaCena(sc);

        sc.close();

    }
}
