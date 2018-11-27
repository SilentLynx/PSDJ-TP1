/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UniversalCalculatorController;

import UniversalCalculatorModel.Model;
import UniversalCalculatorView.View;
import java.io.FileNotFoundException;

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
        model.loadState();
        view.openLoginPage();
    }
    
    public void registarUtilizador(String username, String email, String password) throws FileNotFoundException
    { 
        Model model = new Model();
        model.registarUtilizador(username, email, password);
    }
    
    public void login(String username, String password) throws FileNotFoundException
    {
        Model model = new Model();
        View view = new View();
        if(model.login(username, password))
        {
            view.openMainPage();
            model.setCurrentUser(username);
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
