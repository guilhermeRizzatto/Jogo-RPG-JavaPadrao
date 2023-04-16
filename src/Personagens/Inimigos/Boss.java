package Personagens.Inimigos;

public class Boss extends Servo {

    public Boss(Integer vida, Integer dano) {
        super(vida, dano);
    }


    @Override
    public String toString(){
        return "Boss: " + "\n"
                + "Vida: " + getVida() + "\n"
                + "Dano por ataque: " + getDano() + "\n";
    }
}