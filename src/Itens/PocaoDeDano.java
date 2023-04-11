package Itens;

public class PocaoDeDano extends Item {

    private Integer dano;

    public PocaoDeDano(Integer dano, Double preco) {
        super(preco);
        this.dano = dano;
    }

    public Integer getDano() {
        return dano;
    }

    public void setDano(Integer dano) {
        this.dano = dano;
    }

    @Override
    public String toString(){
        return "Poção de dano: "
                + getDano()
                + " pontos de dano por ataque";

    }
}
