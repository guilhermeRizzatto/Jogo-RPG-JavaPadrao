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
        System.out.println();
    }

    public void venderItem(Jogador jogador, int s){
        Item item = retornaItem(s);
        if (item.getPreco() > jogador.getDinheiro()){
            throw new PersonagemException("Erro: dinheiro insuficiente");
        }
        else{
            jogador.setDinheiro(jogador.getDinheiro() - item.getPreco());
            jogador.adicionarItem(item);
        }
    }

    private Item retornaItem(int s) {
        for (int i = 0; i < itens.size(); i++) {
            if (s - 1 == i) {
                return itens.get(i);
            }
        }
        throw new PersonagemException("Erro: este item não existe");
    }


    @Override
    public String toString(){
        return "Olá sou o vendedor, o que deseja comprar?";
    }

}
