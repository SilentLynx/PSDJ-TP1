package UniversalCalculatorModel;

import java.io.FileNotFoundException;

public class Model 
{
    private Users users;

    public void loadState() throws FileNotFoundException 
    {
        this.users = UniversalCalculatorData.loadUsers("Users", this.users);
    }
    
    public void saveState() throws FileNotFoundException
    {
        UniversalCalculatorData.saveUsers("Users", this.users);
    }
    
    
}
