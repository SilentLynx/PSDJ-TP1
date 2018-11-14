
package universalcalculatorapp;

import UniversalCalculatorController.Controller;
import UniversalCalculatorModel.Model;
import UniversalCalculatorView.View;

public class UniversalCalculatorAPP 
{

    public static void main(String[] args) 
    {
        Model model = new Model();
        View view = new View();
        Controller control = new Controller();
        
        control.setModel(model);  
        control.setView(view);
        control.startFlow();
    }
    
}
