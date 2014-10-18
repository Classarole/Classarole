/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import domain.Review;
import junit.framework.TestCase;

/**
 *
 * @author Erin
 */
public class ReviewTest extends TestCase {
    
    public ReviewTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of create method, of class ReviewSvcSioImpl.
     */
    public void testCreate() throws Exception {
        System.out.println("create");
        Review review = null;
        ReviewSvcSioImpl instance = new ReviewSvcSioImpl();
        Review expResult = null;
        Review result = instance.create(review);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retrieve method, of class ReviewSvcSioImpl.
     */
    public void testRetrieve() throws Exception {
        System.out.println("retrieve");
        int id = 0;
        ReviewSvcSioImpl instance = new ReviewSvcSioImpl();
        Review expResult = null;
        Review result = instance.retrieve(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class ReviewSvcSioImpl.
     */
    public void testUpdate() throws Exception {
        System.out.println("update");
        Review review = null;
        ReviewSvcSioImpl instance = new ReviewSvcSioImpl();
        Review expResult = null;
        Review result = instance.update(review);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class ReviewSvcSioImpl.
     */
    public void testDelete() throws Exception {
        System.out.println("delete");
        Review review = null;
        ReviewSvcSioImpl instance = new ReviewSvcSioImpl();
        Review expResult = null;
        Review result = instance.delete(review);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
