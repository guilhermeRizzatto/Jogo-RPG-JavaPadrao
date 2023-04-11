package Personagens;

import Itens.Item;
import Itens.PocaoDeDano;
import Itens.PocaoDeVida;

import java.util.ArrayList;

public class Jogador {

    private Integer vida;
    private Integer dano;
    private Double dinheiro;
    private ArrayList inventario;

    public Jogador() {
        vida = 10;
        dano = 1;
        dinheiro = 0.0;
        inventario = new ArrayList<>();
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

    public Double getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(Double dinheiro) {
        this.dinheiro = dinheiro;
    }

    public ArrayList getInventario() {
        return inventario;
    }

    public void mostrarInventario(){
        for (int i = 0; i < inventario.size(); i++){
            System.out.println((i+1) + " - " + inventario.get(i));
        }
    }

    public void adicionarItem(Item item){
        inventario.add(item);
    }

    public void removerItem(Item item){
        inventario.remove(item);
    }

    public void usarItem(Jogador jogador, int n){
        Item p = pegarItem(n);
                if(p instanceof PocaoDeVida){
                    jogador.setVida(jogador.getVida() + ((PocaoDeVida) p).getVida());
                }
                if(p instanceof PocaoDeDano){
                    jogador.setDano(jogador.getDano() + ((PocaoDeDano) p).getDano());
                }
            }

    public Item pegarItem(int n){
        for (int i = 0; i < inventario.size(); i++) {
            if (n - 1 == i) {
                return (Item) inventario.get(i);
            }
        }
        return null;
    }

    public void atkJogador(Jogador jogador , Inimigo inimigo){
        inimigo.setVida(inimigo.getVida() - jogador.getDano());
    }

    @Override
    public String toString(){
        return "Jogador: " +"\n"
                + "Vida: " + vida + "\n"
                + "Dano por ataque: " + dano + "\n"
                + "Dinheiro: " + dinheiro;
    }
}
