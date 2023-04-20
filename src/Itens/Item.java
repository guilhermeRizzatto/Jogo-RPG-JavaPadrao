package Itens;

import Personagens.Jogador;

public abstract class Item {

    private Double preco;
    public Item(Double preco){
        if(preco < 0){
            throw new ItemException("Erro ao criar item: deve ter um preço acima ou igual a 0");
        }
        this.preco = preco;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public abstract void uso(Jogador jogador);
}
