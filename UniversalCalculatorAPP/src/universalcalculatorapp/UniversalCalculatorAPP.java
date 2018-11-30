
package universalcalculatorapp;

import UniversalCalculatorController.Controller;
import UniversalCalculatorModel.Model;
import UniversalCalculatorView.View;
import java.io.FileNotFoundException;

public class UniversalCalculatorAPP 
{ 

    public static void main(String[] args) throws FileNotFoundException 
    {
        Model model = new Model();
        View view = new View() {};
        Controller control = new Controller();

        control.setModel(model);
        control.setView(view);
        control.startFlow();
    }
    
}
