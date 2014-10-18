package services;
import domain.*;
import java.io.*;
import java.util.*;

public class LoginSvcSioImpl implements ILoginSvc {
    private final String filename = "somefilename";
    private ObjectInputStream getInputStream() throws Exception{
        return new ObjectInputStream(new FileInputStream (filename));
    }
    private ObjectOutputStream getOutputStream() throws Exception{
        return new ObjectOutputStream(new FileOutputStream (filename));
    }
    
    @Override
    public Login create(Login login) throws ClassaroleSvcException {
        try{
            List<Login> logins = new ArrayList<Login>();
            try {
                ObjectInputStream ois = getInputStream();
                logins = (List<Login>) ois.readObject();
                ois.close();
            } catch (Exception e){ 
                System.out.println("Login Created Successfully");
            }
            if (logins == null) {
                logins = new ArrayList<Login>();
            }
            logins.add(login);
            ObjectOutputStream oos = getOutputStream();
            oos.writeObject(logins);
            oos.flush();
            oos.close();
        } catch (Exception e){
            throw new ClassaroleSvcException("Error in Services: LoginSvcSioImpl: create: Cannot Create Login", e);
        }
        return login;
    }

    @Override
    public Login retrieve(int id) throws ClassaroleSvcException {
        try {
            ObjectInputStream ois = getInputStream ();
            List<Login> logins = (List<Login>)ois.readObject();
            ois.close();
            Iterator<Login> iterator = logins.iterator();
            while (iterator.hasNext()){
                Login login = iterator.next();
                if (login.getId() == id){
                    return login;
                }
            }
        } catch (Exception e){
            throw new ClassaroleSvcException("Error in Services: LoginSvcSioImpl: retrieve: Login Does Not Exist", e);
        }
        return null;
    }

    @Override
    public Login update(Login login) throws ClassaroleSvcException {
        try {
            ObjectInputStream ois = getInputStream ();
            List<Login> logins = (List<Login>)ois.readObject();
            ois.close();
            int id = login.getId();
            Iterator<Login> iterator = logins.iterator();
            while (iterator.hasNext()){
                Login l = iterator.next();
                if (login.getId() == id){
                    logins.add(login);
                    logins.remove(l);
                    break;
                }
            }
            ObjectOutputStream oos = getOutputStream();
            oos.writeObject(logins);
            oos.flush();
            oos.close();
        } catch (Exception e){
            throw new ClassaroleSvcException("Error in Services: LoginSvcSioImpl: update: Login Does Not Exist", e);
        }
        return login;
    }

    @Override
    public Login delete(Login login) throws ClassaroleSvcException {
        try {
            ObjectInputStream ois = getInputStream ();
            List<Login> logins = (List<Login>)ois.readObject();
            ois.close();
            logins.remove(login);
            ObjectOutputStream oos = getOutputStream();
            oos.writeObject(logins);
            oos.flush();
            oos.close();
        } catch (Exception e){
            throw new ClassaroleSvcException("Error in Services: LoginSvcSioImpl: delete: Login Does Not Exist", e);
        }
        return login;
    }
}
