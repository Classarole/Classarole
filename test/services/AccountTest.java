package services;
import domain.*;
import junit.framework.Test;
import junit.framework.TestCase;

public class AccountTest extends TestCase {
    public void testCreate() throws ClassaroleSvcException {
        Factory fac = new Factory();
        IAccountSvc ias = fac.getAccountSvc();
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
        Account result = ias.create(account);
        assertNotNull(result);
    }

    public void testRetrieve() throws ClassaroleSvcException {
        Factory fac = new Factory();
        IAccountSvc ias = fac.getAccountSvc();
        Account account = new Account();
        account.setId(1);
        Account result = ias.retrieve(1);
        assertNotNull(result);
    }

    public void testUpdate() throws ClassaroleSvcException {
        Factory fac = new Factory();
        IAccountSvc ias = fac.getAccountSvc();
        Account account = new Account();
        Login login = new Login();
        login.setUsername("wwanlwess");
        login.setPassword("password");
        login.setAcceptTerms(true);
        account.setId(1);
        account.setEmail("wwanless@regis.edu");
        account.setFirstName("Wolfgang");
        account.setLastName("Wanless");
        account.setSchool("Regis University");
        account.setStudentId(2192232);
        account.setLogin(login);
        Account result = ias.update(account);
        assertNotNull(result);
    }

    public void testDelete() throws ClassaroleSvcException {
        Factory fac = new Factory();
        IAccountSvc ias = fac.getAccountSvc();
        Account account = new Account();
        Login login = new Login();
        login.setUsername("wwanlwess");
        login.setPassword("password");
        login.setAcceptTerms(true);
        account.setId(1);
        account.setEmail("wwanless@regis.edu");
        account.setFirstName("Wolfgang");
        account.setLastName("Wanless");
        account.setSchool("Regis University");
        account.setStudentId(2192232);
        account.setLogin(login);
        //int size = ias.getSize();
        Account result = ias.create(account);
        assertNotNull(result);
        //int newsize = its.getSize();
        Account account2 = ias.delete(account);
        assertNotNull(account2);
    }
}
