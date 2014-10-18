package domain;

import junit.framework.TestCase;

public class ReviewTest extends TestCase {
    
    public void testEquals() {
        System.out.println("Testing Equals(): ");
        Review review1 = new Review();
        Review review2 = new Review();
        review1.setId(1);
        review1.setCourse("MT415");
        review1.setTeacher("Dr. Patnott");
        review1.setScoreOverall(3);
        review1.setScoreEase(3);
        review1.setScoreHomework(5);
        review1.setScoreBook(5);
        review1.setReviewTitle("This course requires a lot of instruction");
        review1.setReview("This course has a lot of components that build on eachother, so it is crucial you understand every chapter. Unfornately Dr. Patnott's new style is to have the student teach themselves, I do not think this is a very good tactic for what this course requires.");
        review2.setId(2);
        review2.setCourse("MT415");
        review2.setTeacher("Dr. Patnott");
        review2.setScoreOverall(1);
        review2.setScoreEase(2);
        review2.setScoreHomework(4);
        review2.setScoreBook(4);
        review2.setReviewTitle("This course requires a lot of instruction");
        review2.setReview("This course has a lot of components that build on eachother, so it is crucial you understand every chapter. Unfornately Dr. Patnott's new style is to have the student teach themselves, I do not think this is a very good tactic for what this course requires.");
        assertTrue(review1.equals(review1));
        assertFalse(review1.equals(review2));
        review2.setId(1);
        review2.setScoreOverall(3);
        review2.setScoreEase(3);
        review2.setScoreHomework(5);
        review2.setScoreBook(5);
        assertTrue(review1.equals(review2));
        System.out.println("     Review 1: " + review1);
        System.out.println("     Review 2: " + review2);
        System.out.println("Equals() Passed!\n");
    }

    public void testValidate() {
        System.out.println("Testing Validate(): ");
        Review review = new Review();
        review.setId(1);
        review.setCourse("MT415");
        review.setTeacher("Dr. Patnott");
        review.setScoreOverall(3);
        review.setScoreEase(3);
        review.setScoreHomework(5);
        review.setScoreBook(5);
        review.setReviewTitle("This course requires a lot of instruction");
        review.setReview("This course has a lot of components that build on eachother, so it is crucial you understand every chapter. Unfornately Dr. Patnott's new style is to have the student teach themselves, I do not think this is a very good tactic for what this course requires.");
        assertTrue("expected true", review.validate());
        System.out.println("    Review: " + review);
        System.out.println("    Validated?: " + review.validate());
        review.setId(0);
        review.setCourse(null);
        review.setTeacher(null);
        review.setScoreOverall(0);
        review.setScoreEase(0);
        review.setScoreHomework(0);
        review.setScoreBook(0);
        review.setReviewTitle(null);
        review.setReview(null);
        assertFalse("expected false", review.validate());
        System.out.println("    Review: " + review);
        System.out.println("    Validated?: " + review.validate());
        System.out.println("Validate() Passed!\n");
    }
}
