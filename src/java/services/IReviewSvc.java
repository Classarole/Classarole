package services;
import domain.*;

public interface IReviewSvc {
    public Review create (Review review) throws ClassaroleSvcException;
    public Review retrieve (int id) throws ClassaroleSvcException;
    public Review update (Review review) throws ClassaroleSvcException;
    public Review delete (Review review) throws ClassaroleSvcException;
}
