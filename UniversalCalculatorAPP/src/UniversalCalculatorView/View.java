package UniversalCalculatorView;

import UniversalCalculatorController.Controller;
import java.io.FileNotFoundException;

public class View 
{
    Controller control = new Controller();
    private MainPageView mainPageView;
    private AgendaView agendaView;
    private ContactEdit contactEdit;
    private ContactosView contactosView;
    private DateCalculatorView dateCalcView;
    private LoginPageView loginView;
    private RegisterUserPageView registUser;
    private ReuniaoEditView reuniaoEdit;
    private TimeZoneView timezoneView;

    public View()
    {
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
        this.contactosView.myFrame.setVisible(true);
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
    
    public void registarUtilizador(String username, String email, String password) throws FileNotFoundException
    {
        control.registarUtilizador(username, email, password);
    }
    
    public void verificaLogin(String username, String password) throws FileNotFoundException
    {
        //System.out.println("Verifica Login da View!");
        control.login(username, password);
    }
}
