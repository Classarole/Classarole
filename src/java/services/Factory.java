package services;

public class Factory {
    public IAccountSvc getAccountSvc() {
        return new AccountSvcSioImpl();
    }
    public ILoginSvc getLoginSvc() {
        return new LoginSvcSioImpl();
    }
    public IReviewSvc getReviewSvc() {
        return new ReviewSvcSioImpl();
    }
}
