package services;
import domain.*;

public interface IAccountSvc {
    public Account create (Account account) throws ClassaroleSvcException;
    public Account retrieve (int id) throws ClassaroleSvcException;
    public Account update (Account account) throws ClassaroleSvcException;
    public Account delete (Account account) throws ClassaroleSvcException;
}
