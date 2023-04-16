package Personagens.Inimigos;

import Personagens.Jogador;

public abstract class Inimigo {

    private Integer vida;
    private Integer dano;

    public Inimigo(Integer vida, Integer dano) {
        this.vida = vida;
        this.dano = dano;
    }

    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }

    public Integer getDano() {
        return dano;
    }

    public void setDano(Integer dano) {
        this.dano = dano;
    }

    public abstract void atk(Jogador jogador);
}

