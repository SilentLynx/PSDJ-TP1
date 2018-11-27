package UniversalCalculatorModel;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author gcama
 */
public class User implements Serializable
{   
    private String nome;
    private String email;
    private String password;
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
        this.agenda = new Agenda();
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

    public void editContact(String option,String numTelm, String email, String nome) 
    {
        Contacto c = new Contacto(numTelm,email,nome);
        
        if(option.equals("Editar"))
        {
            this.agenda.removeContact(c);
            this.agenda.addContact(numTelm, nome, email);
        }
        else
        {
            if(option.equals("Adicionar"))
            {
                this.agenda.addContact(numTelm, nome, email);
            }
            else
            {
                this.agenda.removeContact(c);

            }
        }
    }
    
    public List<Slot> getReunioesParaDia(LocalDateTime diaHora)
    {
        List<Slot> lista = new ArrayList<>();
        HashMap<LocalDateTime, Slot> slotsM = new HashMap<>();
        slotsM = this.agenda.getSlotsPDia(diaHora);
        
        lista = slotsM.values().stream().collect(Collectors.toList());
        
        return lista;
        
    }
    
    public void editSlot()
    {
        
    }
    
    public User clone()
    {
        return new User(this);
    }
}
