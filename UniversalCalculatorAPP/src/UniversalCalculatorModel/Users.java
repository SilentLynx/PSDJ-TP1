/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UniversalCalculatorModel;

import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.HashMap;

/**
 *
 * @author gcama
 */
public class Users implements Serializable
{   
    private HashMap<String, User> usersMap;
    private String currentUser;
    
    public Users()
    {
        this.usersMap = new HashMap<>();
        this.currentUser = "";
    }
    
    public Users(HashMap<String, User> map)
    {
        map.values().stream().forEach((u) -> {
            this.usersMap.put(u.getEmail(), u.clone());
        });   
        this.currentUser = "";
    }
    
    public Users(Users u)
    {
        this.usersMap = u.getUsersMap();
    }
    
    public void addUser(String email, User u) throws FileNotFoundException
    {
        this.usersMap.put(email, u.clone());
        System.out.println(this.usersMap.size());
    }

    public HashMap<String, User> getUsersMap() 
    {
        return this.usersMap;
    } 
    
    public void setCurrentUser(String username)
    {
        this.currentUser = username;
    }
    
    public String getCurrentUser()
    {
        return this.currentUser;
    }
    
    public User getUser(String username)
    {
        return this.usersMap.get(username);
    }
}
