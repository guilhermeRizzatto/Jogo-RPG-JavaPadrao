package Itens;

import Personagens.Jogador;

public class PocaoDeDano extends Item {

    private Integer dano;

    public PocaoDeDano(Integer dano, Double preco) {
        super(preco);
        if(dano == 0){
            throw new ItemException("Erro ao criar poção de dano: deve ter um dano acima de 0");
        }
        this.dano = dano;
    }

    public Integer getDano() {
        return dano;
    }

    public void setDano(Integer dano) {
        this.dano = dano;
    }

    @Override
    public void uso(Jogador jogador) {
        jogador.setDano(jogador.getDano() + dano);
    }

    @Override
    public String toString(){
        return "Poção de dano: "
                + getDano()
                + " pontos de dano por ataque";

    }
}
