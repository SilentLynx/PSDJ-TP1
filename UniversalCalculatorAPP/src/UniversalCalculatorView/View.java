package UniversalCalculatorView;

import UniversalCalculatorController.Controller;
import UniversalCalculatorModel.Contacto;
import java.io.FileNotFoundException;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

public class View 
{
    Controller control;
    private MainPageView mainPageView;
    private final AgendaView agendaView;
    private ContactEdit contactEdit;
    private ContactosView contactosView;
    private DateCalculatorView dateCalcView;
    private LoginPageView loginView;
    private RegisterUserPageView registUser;
    private ReuniaoEditView reuniaoEdit;
    private TimeZoneView timezoneView;

    public View() throws FileNotFoundException
    {
        this.control = new Controller();
        this.agendaView = new AgendaView();
        this.contactEdit = new ContactEdit();
        this.contactosView = new ContactosView();
        this.dateCalcView = new DateCalculatorView();
        this.registUser = new RegisterUserPageView();
        this.timezoneView = new TimeZoneView();
        this.reuniaoEdit = new ReuniaoEditView();
        this.loginView = new LoginPageView();
        this.mainPageView = new MainPageView();
    }
   
    public void openDateCalcView()
    {
        this.dateCalcView.setView(this);
        this.dateCalcView.myFrame.setVisible(true);
    }
    
    public void openTimeZoneView()
    {        
        this.timezoneView.setView(this);
        this.timezoneView.myFrame.setVisible(true); 
    }
    
    public void openReuniaoEdit()
    {        
        this.reuniaoEdit.setView(this);
        this.reuniaoEdit.myFrame.setVisible(true);
    }
    
    public void openMainPage()
    {
        this.mainPageView.setView(this);
        this.mainPageView.myFrame.setVisible(true);       
    }
    
    public void openContactView()
    {
        this.contactosView.setView(this);
        List<Contacto> lista = this.control.contactosToView();
        this.contactosView.myFrame.setVisible(true);
        this.contactosView.preencheTabela(lista);
    }
    
    public void openContactEdit()
    {
        this.contactEdit.setView(this);
        this.contactEdit.myFrame.setVisible(true);
    }
    
    public void openLoginPage()
    {
        this.loginView.setView(this);
        this.loginView.myFrame.setVisible(true);
    }
    
    public void openRegisterPage()
    {
        this.registUser.setView(this);
        this.registUser.myFrame.setVisible(true);
    }
    
    public void openAgendaViewPage()
    {
        this.agendaView.setView(this);
        this.agendaView.myFrame.setVisible(true);
    }
    
    public void openDateTime()
    {
        this.dateCalcView.setView(this);
        this.dateCalcView.myFrame.setVisible(true);
    }
    
    public String viewToControllerAnos(Date data1, Date data2){
        return control.controllerToModelAnos(data1, data2);
    }
    
    public String viewToControllerMeses(Date data1, Date data2){
        return control.controllerToModelMeses(data1, data2);
    }
    
    public String viewToControllerDias(Date data1, Date data2){
        return control.controllerToModelDias(data1, data2);
    }
    
    public String viewToControllerSomaDateTime(Date data, int dias, int semanas, int meses, int anos){
        return control.controllerToModelSomaDateTime(data, dias, semanas, meses, anos);
    }
    
    public String viewToControllerSubtraiDateTime(Date data, int dias, int semanas, int meses, int anos){
        return control.controllerToModelSubtraiDateTime(data, dias, semanas, meses, anos);
    }
    
    public String viewToControllerTimeZone(Date o, LocalTime t, int offsetFrom, int offsetTo, boolean check)
    {
        return control.controllerToModelTimeZone(o,t,offsetFrom,offsetTo,check);
    }
    
    public void registarUtilizador(String username, String email, String password) throws FileNotFoundException
    {
        control.registarUtilizadorController(username, email, password);
    }
    
    public void verificaLogin(String username, String password) throws FileNotFoundException
    {
        control.login(username, password, this);
    }
    
    public void addContactToController(String nome, String telf, String email)
    {
        System.out.println("Hello");
        control.addContact(nome,telf,email);
    }
    
    public void reloadTableContacts()
    {
        List<Contacto> lista = this.control.contactosToView();
        this.contactosView.preencheTabela(lista);
    }
    
    public void addReuniaoToController(Date o, String nome, String local, LocalTime hora, int tamSlot, int numSlots)
    {
        
    }
}
