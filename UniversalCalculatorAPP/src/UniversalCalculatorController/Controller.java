package UniversalCalculatorController;

import UniversalCalculatorModel.Contacto;
import UniversalCalculatorModel.Model;
import UniversalCalculatorModel.Slot;
import UniversalCalculatorView.View;
import java.io.FileNotFoundException;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Controller
{
    private Model model;
    private View view;

    public Controller() throws FileNotFoundException {
        this.model = new Model();
    }
    
    // Métodos set
    public void setModel(Model model) 
    {
        this.model = model;
    }

    public void setView(View view) 
    {
        this.view = view;
    }
    ///////////////////////////////////////////////////
    
    // Start Flow da aplicação
    public void startFlow() 
    {
        view.openLoginPage();
    }
    ///////////////////////////////////////////////////
    
    // Parte Controlador respectiva à Calculadora de tempos
    public String controllerToModelAnos(Date data1, Date data2){
        return model.diferencaAnos(data1, data2);
    }
    
    public String controllerToModelMeses(Date data1, Date data2){
        return model.diferencaMeses(data1, data2);
    }
    
    public String controllerToModelDias(Date data1, Date data2){
        return model.diferencaDias(data1, data2);
    }
    
    public String controllerToModelSomaDateTime(Date data, int dias, int semanas, int meses, int anos){
        return model.somaDateTime(data, dias, semanas, meses, anos);
    }
    
    public String controllerToModelSubtraiDateTime(Date data, int dias, int semanas, int meses, int anos){
        return model.subtraiDateTime(data, dias, semanas, meses, anos);
    }
    ///////////////////////////////////////////////////
    
     
    // Métodos do calculo de tempo por zona UTC
    public String controllerToModelTimeZone(Date o, LocalTime t, int offsetFrom, int offsetTo, boolean check)
    {
        return model.timeZoneCalc(o, t, offsetFrom, offsetTo, check);
    }
    ///////////////////////////////////////////////////
   
    // Métodos da agenda
    // Contactos
    public void addContact(String nome, String telf, String email)
    {
        model.adicionarContact(telf, email, nome);
    }
    
    public void deleteContact(String nome, String telf, String email)
    {
        this.model.removerContact(telf, email, nome);
    }
    
    public List<Contacto> contactosToView()
    {
        return this.model.getContactosToView();
    }
    
    // Reuniões
    public void addReuniaoToModel(Date o, String nome, String local, LocalTime hora, int tamSlot, int numSlots)
    {
        this.model.addReuniao(o, nome, local, hora, tamSlot, numSlots);
    }
    
    public void deleteReuniaoToModel(Date o, String nome, LocalTime inicio, LocalTime fim)
    {
        this.model.deleteReuniaoModel(o, nome, inicio, fim);
    }
        
    public List<Slot> reunioesToView()
    {
        return this.model.reunioesParaODia();
    }
    ///////////////////////////////////////////////////
    
    // Métodos de controlo dos utilizadores
    public void login(String username, String password, View views) throws FileNotFoundException
    {
        View v = views;
        if(model.login(username, password))
        {
            v.openMainPage();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Username ou password errada");
        }
    }
    
    public void registarUtilizadorController(String username, String email, String password) throws FileNotFoundException
    { 
        model.registarUtilizador(username, email, password);
    }
    
     public void exit() 
    {
        try {
            this.model.saveState();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    ///////////////////////////////////////////////////
}
