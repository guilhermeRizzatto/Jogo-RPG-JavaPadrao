package Personagens.Inimigos;

import Personagens.Jogador;

public class Boss extends Inimigo {

    public Boss(Integer vida, Integer dano) {
        super(vida, dano);
    }

    @Override
    public void atk(Jogador jogador) {

    }


    @Override
    public String toString(){
        return "Boss: " + "\n"
                + "Vida: " + getVida() + "\n"
                + "Dano por ataque: " + getDano() + "\n";
    }
}
