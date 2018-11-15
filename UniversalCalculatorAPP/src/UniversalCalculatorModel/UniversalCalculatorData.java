/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UniversalCalculatorModel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author gcama
 */
public class UniversalCalculatorData 
{
    
    public static void saveUsers(String nomeFicheiro, Users users) throws FileNotFoundException
    {
       try
       {
           File file = new File(nomeFicheiro);
           FileOutputStream fos = new FileOutputStream(file);
           ObjectOutputStream oos = new ObjectOutputStream(fos);
           
           oos.writeObject(users);
           oos.flush();
           oos.close();
           fos.close();
       }
       catch(Exception e)
       {
       }        
    }
    
    public static Users loadUsers(String nomeFicheiro, Users users) throws FileNotFoundException
    {       
       try
       {
           File toRead = new File(nomeFicheiro);
            try (FileInputStream fis = new FileInputStream(toRead); 
                    ObjectInputStream ois = new ObjectInputStream(fis)) {
                
                users = (Users)ois.readObject();
                
            }
       }
       catch(IOException | ClassNotFoundException e)
       {
       } 
       
       return users;
    }
}
