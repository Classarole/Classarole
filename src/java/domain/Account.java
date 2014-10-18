package domain;

public class Account extends DomainAbs{
    private Login login;
    private String firstName;
    private String lastName;
    private String email;
    private String school;
    private int studentId;

//set and get firstName
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

//set and get lastName
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

//set and get email
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

//set and get school
    public String getSchool() {
        return school;
    }
    public void setSchool(String school) {
        this.school = school;
    }

//set and get studentId
    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

//set and get login
    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }
    
    public boolean validate () {
        if (!(super.validate())) {
            return false;
        }
        if (getFirstName() == null) {
            return false;
        }  
        if (getLastName() == null) {
            return false;
        }
        if (getEmail() == null) {
            return false;
        }  
        if (getSchool() == null) {
            return false;
        }
        if (getStudentId() == 0) {
            return false;
        }  
        if (getLogin() == null) {
            return false;
        }
        return true;
    }
    
    @Override
    public boolean equals (Object obj) {
        if (this==obj){
            return true;
        }
        if(!(obj instanceof Account)) {
            return false;
        }
        Account account = (Account)obj;
        if(account.id != id) {
            return false;
        }
        return true;
    }
    
}
