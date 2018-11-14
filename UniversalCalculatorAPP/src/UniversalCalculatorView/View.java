package UniversalCalculatorView;

public class View 
{
    public void openMainPage()
    {
        MainPageView main = new MainPageView();
        main.myFrame.setVisible(true);       
    }
    
    public void openLoginPage()
    {
        LoginPage page = new LoginPage();
        page.setVisible(true);
    }
    
    public void openRegisterPage()
    {
        RegistUserPage page = new RegistUserPage();
        page.setVisible(true);
    }

  
}
