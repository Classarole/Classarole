package domain;

import junit.framework.TestCase;

public class LoginTest extends TestCase {
    
    public void testEquals() {
        System.out.println("Testing Equals(): ");
        Login login1 = new Login();
        Login login2 = new Login();
        login1.setId(1);
        login1.setUsername("wwanless");
        login1.setPassword("password");
        login1.setAcceptTerms(true);
        login2.setId(2);
        login2.setUsername("emcaleer");
        login2.setPassword("password");
        login2.setAcceptTerms(true);
        assertTrue(login1.equals(login1));
        assertFalse(login1.equals(login2));
        login2.setId(1);
        login2.setUsername("wwanless");
        assertTrue(login1.equals(login2));
        System.out.println("     Account 1: " + login1);
        System.out.println("     Account 2: " + login2);
        System.out.println("Equals() Passed!\n");
    }

    public void testValidate() {
        System.out.println("Testing Validate(): ");
        Login login = new Login();
        login.setId(1);
        login.setUsername("emcaleer");
        login.setPassword("password");
        login.setAcceptTerms(true);
        assertTrue("expected true", login.validate());
        System.out.println("    Account: " + login);
        System.out.println("    Validated?: " + login.validate());
        login.setId(0);
        login.setUsername(null);
        login.setPassword(null);
        login.setAcceptTerms(false);
        assertFalse("expected false", login.validate());
        System.out.println("    Account: " + login);
        System.out.println("    Validated?: " + login.validate());
        System.out.println("Validate() Passed!\n");
    }
}
