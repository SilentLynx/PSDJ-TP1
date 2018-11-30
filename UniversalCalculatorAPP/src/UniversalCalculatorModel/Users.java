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
    
    public Users()
    {
        this.usersMap = new HashMap<>();
    }
    
    public Users(HashMap<String, User> map)
    {
        map.values().stream().forEach((u) -> {
            this.usersMap.put(u.getEmail(), u.clone());
        });   
    }
    
    public Users(Users u)
    {
        this.usersMap = u.getUsersMap();
    }
    
    public void addUser(String email, User u) throws FileNotFoundException
    {
        this.usersMap.put(email, u.clone());
    }

    public HashMap<String, User> getUsersMap() 
    {
        HashMap<String, User> map = new HashMap<>();
        map = this.usersMap;
        
        return map;
    } 
    
    public User getUser(String username)
    {
        return this.usersMap.get(username);
    }
   
}
