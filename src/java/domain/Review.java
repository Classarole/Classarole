package domain;

public class Review extends DomainAbs {
    private String course;
    private String teacher;
    private int scoreOverall = 0;
    private int scoreEase = 0;
    private int scoreHomework = 0;
    private int scoreBook = 0;
    private String reviewTitle;
    private String review;

    //set and get course
    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }

    //set and get teacher
    public String getTeacher() {
        return teacher;
    }
    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    //set and get scoreOverall
    public int getScoreOverall() {
        return scoreOverall;
    }
    public void setScoreOverall(int scoreOverall) {
        this.scoreOverall = scoreOverall;
    }

    //set and get scoreEase
    public int getScoreEase() {
        return scoreEase;
    }
    public void setScoreEase(int scoreEase) {
        this.scoreEase = scoreEase;
    }

    //set and get scoreHomework
    public int getScoreHomework() {
        return scoreHomework;
    }
    public void setScoreHomework(int scoreHomework) {
        this.scoreHomework = scoreHomework;
    }

    //set and get scoreBook
    public int getScoreBook() {
        return scoreBook;
    }
    public void setScoreBook(int scoreBook) {
        this.scoreBook = scoreBook;
    }

    //set and get reviewTitle
    public String getReviewTitle() {
        return reviewTitle;
    }
    public void setReviewTitle(String reviewTitle) {
        this.reviewTitle = reviewTitle;
    }

    //set and get review
    public String getReview() {
        return review;
    }
    public void setReview(String review) {
        this.review = review;
    }
    
    public boolean validate () {
        if (!(super.validate())) {
            return false;
        }
        if (getCourse() == null) {
            return false;
        }  
        if (getTeacher() == null) {
            return false;
        }
        if (getScoreOverall() == 0) {
            return false;
        }  
        if (getScoreEase() == 0) {
            return false;
        }
        if (getScoreHomework() == 0) {
            return false;
        }  
        if (getScoreBook() == 0) {
            return false;
        }
        if (getReviewTitle() == null) {
            return false;
        }
        if (getReview() == null) {
            return false;
        }
        return true;
    }
    
    @Override
    public boolean equals (Object obj) {
        if (this==obj) {
            return true;
        }
        if(!(obj instanceof Review)) {
            return false;
        }
        Review review = (Review)obj;
        if(review.id != id) {
            return false;
        }
        return true;
    }
}
