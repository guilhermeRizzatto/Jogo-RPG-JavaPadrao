package Personagens;

public class Inimigo {

    private Integer vida;
    private Integer dano;

    public Inimigo(Integer vida , Integer dano){
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

    public void atkInimigo(Inimigo inimigo , Jogador jogador){
        jogador.setVida(jogador.getVida() - inimigo.getDano());
    }

    @Override
    public String toString(){
        return "Inimigo: " + "\n"
                + "Vida: " + vida + "\n"
                + "Dano por ataque: " + dano + "\n";
    }
}
