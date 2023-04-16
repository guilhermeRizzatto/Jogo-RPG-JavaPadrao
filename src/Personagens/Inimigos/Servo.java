package Personagens.Inimigos;

import Personagens.Jogador;

public class Servo {

    private Integer vida;
    private Integer dano;

    public Servo(Integer vida , Integer dano){
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

    public void atkInimigo(Jogador jogador){
        jogador.setVida(jogador.getVida() - getDano());
    }

    @Override
    public String toString(){
        return "Servo: " + "\n"
                + "Vida: " + vida + "\n"
                + "Dano por ataque: " + dano + "\n";
    }
}
