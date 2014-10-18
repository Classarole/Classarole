package domain;

import junit.framework.TestCase;

public class AccountTest extends TestCase {
    
    public void testEquals() {
        System.out.println("Testing Equals(): ");
        Account account1 = new Account();
        Account account2 = new Account();
        Login login1 = new Login();
        Login login2 = new Login();
        login1.setUsername("wwanless");
        login1.setPassword("password");
        login1.setAcceptTerms(true);
        account1.setId(1);
        account1.setEmail("wwanless@regis.edu");
        account1.setFirstName("Wolfgang");
        account1.setLastName("Wanless");
        account1.setSchool("Regis University");
        account1.setStudentId(2192232);
        account1.setLogin(login1);
        login2.setUsername("emcaleer");
        login2.setPassword("password");
        login2.setAcceptTerms(true);
        account2.setId(2);
        account2.setEmail("emcaleer@regis.edu");
        account2.setFirstName("Erin");
        account2.setLastName("McAleer");
        account2.setSchool("Regis University");
        account2.setStudentId(1912374);
        account2.setLogin(login2);
        assertTrue(account1.equals(account1));
        assertFalse(account1.equals(account2));
        login2.setUsername("wwanless");
        account2.setId(1);
        account2.setEmail("wwanless@regis.edu");
        account2.setFirstName("Wolfgang");
        account2.setLastName("Wanless");
        account2.setStudentId(2192232);
        account2.setLogin(login2);
        assertTrue(account1.equals(account2));
        System.out.println("     Account 1: " + account1);
        System.out.println("     Account 2: " + account2);
        System.out.println("Equals() Passed!\n");
    }

    public void testValidate() {
        System.out.println("Testing Validate(): ");
        Account account = new Account();
        Login login = new Login();
        login.setUsername("emcaleer");
        login.setPassword("password");
        login.setAcceptTerms(true);
        account.setId(1);
        account.setEmail("emcaleer@regis.edu");
        account.setFirstName("Erin");
        account.setLastName("McAleer");
        account.setSchool("Regis University");
        account.setStudentId(1912374);
        account.setLogin(login);
        assertTrue("expected true", account.validate());
        System.out.println("    Account: " + account);
        System.out.println("    Validated?: " + account.validate());
        login = new Login();
        login.setUsername(null);
        login.setPassword(null);
        login.setAcceptTerms(false);
        account.setId(0);
        account.setEmail(null);
        account.setFirstName(null);
        account.setLastName(null);
        account.setSchool(null);
        account.setStudentId(0);
        account.setLogin(login);
        assertFalse("expected false", account.validate());
        System.out.println("    Account: " + account);
        System.out.println("    Validated?: " + account.validate());
        System.out.println("Validate() Passed!\n");
    }
}
