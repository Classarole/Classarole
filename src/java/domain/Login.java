package domain;

public class Login extends DomainAbs {
    private boolean acceptTerms = false;
    private String username;
    private String password;

//set and get acceptTerms
    public boolean getAcceptTerms() {
        return acceptTerms;
    }
    public void setAcceptTerms(boolean acceptTerms) {
        this.acceptTerms = acceptTerms;
    }
    
//set and get username
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

//set and get password
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
    public boolean validate () {
        if (!(super.validate())) {
            return false;
        }
        if (getUsername() == null) {
            return false;
        }  
        if (getPassword() == null) {
            return false;
        }
        if (getAcceptTerms() == false) {
            return false;
        } 
        return true;
    }
    
    @Override
    public boolean equals (Object obj) {
        if (this==obj) {
            return true;
        }
        if(!(obj instanceof Login)) {
            return false;
        }
        Login login = (Login)obj;
        if(login.id != id) {
            return false;
        }
        return true;
    }    
}
