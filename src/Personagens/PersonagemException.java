package Personagens;

public class PersonagemException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public PersonagemException(String msg){
        super(msg);
    }
}
