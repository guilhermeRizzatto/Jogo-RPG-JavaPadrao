package Personagens.Inimigos;

import Personagens.Jogador;

public class Servo extends Inimigo{

    public Servo(Integer vida , Integer dano){
        super(vida, dano);
    }

    @Override
    public void atk(Jogador jogador) {

    }


    @Override
    public String toString(){
        return "Servo: " + "\n"
                + "Vida: " + getVida() + "\n"
                + "Dano por ataque: " + getDano() + "\n";
    }
}
