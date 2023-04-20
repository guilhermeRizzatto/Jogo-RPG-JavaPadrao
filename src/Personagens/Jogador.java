package Personagens;

import Itens.Item;
import Personagens.Inimigos.Inimigo;

import java.util.ArrayList;
import java.util.Random;

public class Jogador {

    private Integer vida;
    private Integer dano;
    private Double dinheiro;
    private ArrayList inventario = new ArrayList<>();

    public Jogador() {
        vida = new Random().nextInt(14) + 7;
        dano = new Random().nextInt(6) + 1;
        dinheiro = 0.0;
    }

    //Para uso apenas no tutorial
    public Jogador(Integer vida, Integer dano) {
        this.vida = vida;
        this.dano = dano;
        dinheiro = 0.0;
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
        System.out.println("Inventário: ");
        if(inventario.isEmpty()){
            System.out.println("vazio");
        }
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
        if(p == null){
            throw new PersonagemException("Erro: este item não existe");
        }
        p.uso(jogador);
        removerItem(p);
    }

    private Item pegarItem(int n){
        Item item = null;
        for (int i = 0; i < inventario.size(); i++) {
            if (n - 1 == i) {
                item = (Item) inventario.get(i);
            }
        }
        return item;
    }

    public void atkJogador(Inimigo inimigo){
        if(danoCritico()){
            System.out.println("DANO CRITICO");
            inimigo.setVida(inimigo.getVida() - (getDano() + 2));
        }
        else{
            inimigo.setVida(inimigo.getVida() - getDano());
        }
    }

    private boolean danoCritico(){
        int critico = new Random().nextInt(15) + 1;
        return critico == 5;
    }

    @Override
    public String toString(){
        return "Jogador: " +"\n"
                + "Vida: " + vida + "\n"
                + "Dano por ataque: " + dano + "\n"
                + "Dinheiro: " + dinheiro;
    }
}
