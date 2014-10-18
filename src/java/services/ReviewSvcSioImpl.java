package services;
import domain.*;
import java.io.*;
import java.util.*;

public class ReviewSvcSioImpl implements IReviewSvc {
    private final String filename = "somefilename";
    private ObjectInputStream getInputStream() throws Exception{
        return new ObjectInputStream(new FileInputStream (filename));
    }
    private ObjectOutputStream getOutputStream() throws Exception{
        return new ObjectOutputStream(new FileOutputStream (filename));
    }
    
    @Override
    public Review create(Review review) throws ClassaroleSvcException {
        try{
            List<Review> reviews = new ArrayList<Review>();
            try {
                ObjectInputStream ois = getInputStream();
                reviews = (List<Review>) ois.readObject();
                ois.close();
            } catch (Exception e){ 
                System.out.println("Review Created Successfully");
            }
            if (reviews == null) {
                reviews = new ArrayList<Review>();
            }
            reviews.add(review);
            ObjectOutputStream oos = getOutputStream();
            oos.writeObject(reviews);
            oos.flush();
            oos.close();
        } catch (Exception e){
            throw new ClassaroleSvcException("Error in Services: ReviewSvcSioImpl: create: Cannot Create Review", e);
        }
        return review;
    }

    @Override
    public Review retrieve(int id) throws ClassaroleSvcException {
        try {
            ObjectInputStream ois = getInputStream ();
            List<Review> reviews = (List<Review>)ois.readObject();
            ois.close();
            Iterator<Review> iterator = reviews.iterator();
            while (iterator.hasNext()){
                Review review = iterator.next();
                if (review.getId() == id){
                    return review;
                }
            }
        } catch (Exception e){
            throw new ClassaroleSvcException("Error in Services: ReviewSvcSioImpl: retrieve: Review Does Not Exist", e);
        }
        return null;
    }

    @Override
    public Review update(Review review) throws ClassaroleSvcException {
        try {
            ObjectInputStream ois = getInputStream ();
            List<Review> reviews = (List<Review>)ois.readObject();
            ois.close();
            int id = review.getId();
            Iterator<Review> iterator = reviews.iterator();
            while (iterator.hasNext()){
                Review r = iterator.next();
                if (review.getId() == id){
                    reviews.add(review);
                    reviews.remove(r);
                    break;
                }
            }
            ObjectOutputStream oos = getOutputStream();
            oos.writeObject(reviews);
            oos.flush();
            oos.close();
        } catch (Exception e){
            throw new ClassaroleSvcException("Error in Services: ReviewSvcSioImpl: update: Review Does Not Exist", e);
        }
        return review;
    }

    @Override
    public Review delete(Review review) throws ClassaroleSvcException {
        try {
            ObjectInputStream ois = getInputStream ();
            List<Review> reviews = (List<Review>)ois.readObject();
            ois.close();
            reviews.remove(review);
            ObjectOutputStream oos = getOutputStream();
            oos.writeObject(reviews);
            oos.flush();
            oos.close();
        } catch (Exception e){
            throw new ClassaroleSvcException("Error in Services: ReviewSvcSioImpl: delete: Review Does Not Exist", e);
        }
        return review;
    }
}
