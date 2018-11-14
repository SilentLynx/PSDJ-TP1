package UniversalCalculatorModel;

import java.io.Serializable;

/**
 *
 * @author gcama
 */
public class User implements Serializable
{   
    private String nome;
    private String email;
    private String password;
    private String utc;
    private Agenda agenda;
        
    public static User of (String nome, String email, String password)
    {
        return new User(nome, email,password);
    }
    
    public User()
    {
        this.nome = "";
        this.email = "";
        this.password = "";
    }
    
    public User(String nome, String email, String password)
    {
        this.nome = nome;
        this.email = email;
        this.password = password;
    }

    public User(User u)
    {
        this.nome = u.getNome();
        this.email = u.getEmail();
        this.password = u.getPassword();
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public User clone()
    {
        return new User(this);
    }
}
