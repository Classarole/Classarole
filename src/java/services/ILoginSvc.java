package services;
import domain.*;

public interface ILoginSvc {
    public Login create (Login login) throws ClassaroleSvcException;
    public Login retrieve (int id) throws ClassaroleSvcException;
    public Login update (Login login) throws ClassaroleSvcException;
    public Login delete (Login login) throws ClassaroleSvcException;
}
