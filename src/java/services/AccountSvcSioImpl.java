package services;
import domain.*;
import java.io.*;
import java.util.*;

import domain.Account;

public class AccountSvcSioImpl implements IAccountSvc {
    private final String filename = "somefilename";
    private ObjectInputStream getInputStream() throws Exception{
        return new ObjectInputStream(new FileInputStream (filename));
    }
    private ObjectOutputStream getOutputStream() throws Exception{
        return new ObjectOutputStream(new FileOutputStream (filename));
    }
    
    @Override
    public Account create(Account account) throws ClassaroleSvcException {
        try{
            List<Account> accounts = new ArrayList<Account>();
            try {
                ObjectInputStream ois = getInputStream();
                accounts = (List<Account>) ois.readObject();
                ois.close();
            } catch (Exception e){ 
                System.out.println("Account Created Successfully");
            }
            if (accounts == null) {
                accounts = new ArrayList<Account>();
            }
            accounts.add(account);
            ObjectOutputStream oos = getOutputStream();
            oos.writeObject(accounts);
            oos.flush();
            oos.close();
        } catch (Exception e){
            throw new ClassaroleSvcException("Error in Services: AccountSvcSioImpl: create: Cannot Create Account", e);
        }
        return account;
    }

    @Override
    public Account retrieve(int id) throws ClassaroleSvcException {
        try {
            ObjectInputStream ois = getInputStream ();
            List<Account> accounts = (List<Account>)ois.readObject();
            ois.close();
            Iterator<Account> iterator = accounts.iterator();
            while (iterator.hasNext()){
                Account account = iterator.next();
                if (account.getId() == id){
                    return account;
                }
            }
        } catch (Exception e){
            throw new ClassaroleSvcException("Error in Services: AccountSvcSioImpl: retrieve: Account Does Not Exist", e);
        }
        return null;
    }

    @Override
    public Account update(Account account) throws ClassaroleSvcException {
        try {
            ObjectInputStream ois = getInputStream ();
            List<Account> accounts = (List<Account>)ois.readObject();
            ois.close();
            int id = account.getId();
            Iterator<Account> iterator = accounts.iterator();
            while (iterator.hasNext()){
                Account a = iterator.next();
                if (account.getId() == id){
                    accounts.add(account);
                    accounts.remove(a);
                    break;
                }
            }
            ObjectOutputStream oos = getOutputStream();
            oos.writeObject(accounts);
            oos.flush();
            oos.close();
        } catch (Exception e){
            throw new ClassaroleSvcException("Error in Services: AccountSvcSioImpl: update: Account Does Not Exist", e);
        }
        return account;
    }

    @Override
    public Account delete(Account account) throws ClassaroleSvcException {
        try {
            ObjectInputStream ois = getInputStream ();
            List<Account> accounts = (List<Account>)ois.readObject();
            ois.close();
            accounts.remove(account);
            ObjectOutputStream oos = getOutputStream();
            oos.writeObject(accounts);
            oos.flush();
            oos.close();
        } catch (Exception e){
            throw new ClassaroleSvcException("Error in Services: AccountSvcSioImpl: delete: Account Does Not Exist", e);
        }
        return account;
    }
}
