package Itens;

import Personagens.Jogador;

public class PocaoDeVida extends Item {

    private Integer vida;

    public PocaoDeVida(Integer vida, Double preco) {
        super(preco);
        if(vida == 0){
            throw new ItemException("Erro ao criar poção de vida: deve ter a vida acima de 0");
        }
        this.vida = vida;
    }

    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }

    @Override
    public void uso(Jogador jogador) {
        jogador.setVida(jogador.getVida() + vida);
    }

    @Override
    public String toString(){
        return "Poção de vida: "
                + getVida()
                + " pontos de vida";

    }
}
