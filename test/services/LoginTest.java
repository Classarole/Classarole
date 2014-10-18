/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import domain.Login;
import junit.framework.TestCase;

/**
 *
 * @author Erin
 */
public class LoginTest extends TestCase {
    
    public LoginTest(String testName) {
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
     * Test of create method, of class LoginSvcSioImpl.
     */
    public void testCreate() throws Exception {
        System.out.println("create");
        Login login = null;
        LoginSvcSioImpl instance = new LoginSvcSioImpl();
        Login expResult = null;
        Login result = instance.create(login);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retrieve method, of class LoginSvcSioImpl.
     */
    public void testRetrieve() throws Exception {
        System.out.println("retrieve");
        int id = 0;
        LoginSvcSioImpl instance = new LoginSvcSioImpl();
        Login expResult = null;
        Login result = instance.retrieve(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class LoginSvcSioImpl.
     */
    public void testUpdate() throws Exception {
        System.out.println("update");
        Login login = null;
        LoginSvcSioImpl instance = new LoginSvcSioImpl();
        Login expResult = null;
        Login result = instance.update(login);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class LoginSvcSioImpl.
     */
    public void testDelete() throws Exception {
        System.out.println("delete");
        Login login = null;
        LoginSvcSioImpl instance = new LoginSvcSioImpl();
        Login expResult = null;
        Login result = instance.delete(login);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
