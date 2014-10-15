package services;

public class ClassaroleSvcException extends Exception {
    public ClassaroleSvcException(String msg, Exception e){
        super(msg, e);
    }
}
