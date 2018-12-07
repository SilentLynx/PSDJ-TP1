package UniversalCalculatorModel;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

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
        this.agenda = new Agenda();
    }

    public User(User u)
    {
        this.nome = u.getNome();
        this.email = u.getEmail();
        this.password = u.getPassword();
        this.agenda = u.getAgenda();
    }
    
    private Agenda getAgenda() 
    {
        return this.agenda;
    }
    
    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public String getEmail() 
    {
        return email;
    }

    public void setEmail(String email) 
    {
        this.email = email;
    }

    public String getPassword() 
    {
        return password;
    }

    public void setPassword(String password) 
    {
        this.password = password;
    }

    public void editContact(String option,String numTelm, String email, String nome) 
    {        
        if(option.equals("Adicionar"))
        {
             this.agenda.addContact(numTelm, nome, email);
        }
        else
        {
            this.agenda.removeContact(nome,numTelm,email);
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
    
    public List<Contacto> getContactos()
    {
        return this.agenda.getContactosList();
    }
    
    public void addReuniaoUser(LocalDateTime data, LocalTime inicio, LocalTime fim, String nome, String local)
    {
        this.agenda.addSlot(data, inicio, fim, nome, local);
    }
    
    public void apagaReuniaoUser(LocalDateTime data, String nome, LocalTime fim)
    {
        this.agenda.removeSlot(data,nome,fim);
    }
    
    public User clone()
    {
        return new User(this);
    }
}