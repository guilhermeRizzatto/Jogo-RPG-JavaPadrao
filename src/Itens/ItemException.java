package Itens;

public class ItemException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public ItemException(String msg){
        super(msg);
    }
}
