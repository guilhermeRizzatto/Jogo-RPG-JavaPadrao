package Personagens;

import Itens.Item;
import Itens.PocaoDeDano;
import Itens.PocaoDeVida;

import java.util.ArrayList;
import java.util.List;

public class Vendedor {

    private List<Item> itens = new ArrayList();

    public Vendedor(){
        itens.add(new PocaoDeVida(3, 12.5));
        itens.add(new PocaoDeVida(6, 25.0));
        itens.add(new PocaoDeVida(10, 50.0));
        itens.add(new PocaoDeDano(3, 25.5));
        itens.add(new PocaoDeDano(6, 55.0));
        itens.add(new PocaoDeDano(10, 75.0));
        itens.add(new PocaoDeDano(15, 100.0));
    }

    public List<Item> getItens() {
        return itens;
    }

    public void mostrarItens(){
        for (int i = 0; i < itens.size(); i++){
            System.out.println((i+1) + " - " + itens.get(i) + ", preço: " + itens.get(i).getPreco());

        }
    }

    public void venderItem(Jogador jogador, int s){
        for (int i = 0; i < itens.size(); i++){
            if(s - 1 == i){
                    jogador.setDinheiro(jogador.getDinheiro() - itens.get(i).getPreco());
                    jogador.adicionarItem(itens.get(i));
                }
            }
    }


    @Override
    public String toString(){
        return "Olá sou o vendedor deste andar, o que deseja comprar?";
    }

}
