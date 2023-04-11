package Itens;

public class PocaoDeVida extends Item {

    private Integer vida;

    public PocaoDeVida(Integer vida, Double preco) {
        super(preco);
        this.vida = vida;
    }

    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }

    @Override
    public String toString(){
        return "Poção de vida: "
                + getVida()
                + " pontos de vida";

    }
}
