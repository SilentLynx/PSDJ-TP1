package UniversalCalculatorModel;

import java.io.FileNotFoundException;

public class Model 
{
    private Users users;
    
    public Model()
    {
        this.users = new Users();
    }
    
    public void loadState() throws FileNotFoundException 
    {
        this.users = UniversalCalculatorData.loadUsers("Users", this.users);
    }
    
    public void saveState() throws FileNotFoundException
    {
        UniversalCalculatorData.saveUsers("Users", this.users);
    }

    public boolean login(String username, String password) 
    {
        boolean ret = false;
        
        if(this.users.getUsersMap().containsKey(username))
        {
            String pass = this.users.getUsersMap().get(username).getPassword();
            if(pass.equals(password))
            {
                ret = true;
            }          
        }
        
        return ret;
    }
    
    
}
