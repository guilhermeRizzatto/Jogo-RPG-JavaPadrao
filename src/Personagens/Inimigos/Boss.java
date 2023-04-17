package Personagens.Inimigos;

import Personagens.Jogador;

public class Boss extends Inimigo {

    private final Integer metadeVida = getVida() / 2;

    public Boss(Integer vida, Integer dano) {
        super(vida, dano);
    }

    @Override
    public void atk(Jogador jogador) {
        if (getVida() > metadeVida){
            jogador.setVida(jogador.getVida() - getDano());
        }
        else {
            jogador.setVida(jogador.getVida() - (getDano() * 2));
        }
    }

    @Override
    public String toString(){
        return "Boss: " + "\n"
                + "Vida: " + getVida() + "\n"
                + "Dano por ataque: " + getDano() + "\n";
    }
}
