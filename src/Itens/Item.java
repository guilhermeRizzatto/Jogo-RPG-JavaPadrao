package Itens;

public abstract class Item {

    private Double preco;
    public Item(Double preco){
        this.preco = preco;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
