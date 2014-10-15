package services;

public class Factory {
    public IAccountSvc getAccountSvc() {
        return new AccountSvcSioImpl();
    }
}
