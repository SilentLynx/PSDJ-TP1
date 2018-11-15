/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UniversalCalculatorController;

import UniversalCalculatorModel.Model;
import UniversalCalculatorView.View;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Controller 
{
    private Model model;
    private View view;
    
    public void setModel(Model model) 
    {
        this.model = model;
    }

    public void setView(View view) 
    {
        this.view = view;
    }

    public void startFlow() 
    {
        try {
            this.model.loadState();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        view.openLoginPage();
    }
    
    public void login(String username, String password)
    {
        if(this.model.login(username, password))
        {
            this.view.openMainPage();
        }
        else
        {
            System.out.println("User não existe");
        }
    }
    
    public void exit() throws FileNotFoundException
    {
        this.model.saveState();
    }
    
}
