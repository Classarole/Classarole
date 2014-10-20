package services;
import domain.*;
import junit.framework.TestCase;

public class LoginTest extends TestCase {
    public void testCreate() throws ClassaroleSvcException {
        Factory fac = new Factory();
        ILoginSvc ils = fac.getLoginSvc();
        Login login = new Login();
        login.setUsername("emcaleer");
        login.setPassword("password");
        login.setAcceptTerms(true);
        Login result = ils.create(login);
        assertNotNull(result);
    }

    public void testRetrieve() throws ClassaroleSvcException {
        Factory fac = new Factory();
        IAccountSvc ias = fac.getAccountSvc();
        Login login = new Login();
        login.setId(1);
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
        account.setLogin(login);
        Account result = ias.update(account);
        assertNotNull(result);
    }

    public void testDelete() throws ClassaroleSvcException {
        Factory fac = new Factory();
        ILoginSvc ils = fac.getLoginSvc();
        Login login = new Login();
        login.setUsername("wwanlwess");
        login.setPassword("password");
        login.setAcceptTerms(true);
        Login result = ils.create(login);
        assertNotNull(result);
        Login result2 = ils.delete(login);
        assertNotNull(result2);
    }
}
