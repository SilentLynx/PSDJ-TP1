package UniversalCalculatorModel;

import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class Model
{
    private Users users;
    private String currentUser;
    
    public Model() throws FileNotFoundException
    {
        loadState();
    }
    
    public Model(Model m){
        this.users = m.getUsers();
    }

    public Users getUsers() {
        return users;
    }
    
    public void loadState() 
    {
        try {
            this.users = new Users();
            this.users = UniversalCalculatorData.loadUsers("Users");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Model.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void saveState() throws FileNotFoundException
    {
        UniversalCalculatorData.saveUsers("Users", this.users);
    }
    
    public void registarUtilizador(String username, String email, String password) 
    {
        try {
            User novoUser = new User(username,email,password);
            this.users.addUser(email, novoUser);
            saveState();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Model.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean login(String username, String password) 
    {
        boolean ret = false;
        
        if(this.users.getUsersMap().containsKey(username))
        {
            String pass = this.users.getUsersMap().get(username).getPassword();
            if(pass.equals(password))
            {
                ret = true;
                this.currentUser = username;
            }          
        }
        return ret;
    }
    
    public void editContact(String numTelm, String email, String nome)
    {
       this.users.getUser(this.currentUser).editContact("Editar",numTelm,email,nome);
    }
    
    public void adicionarContact(String numTelm, String email, String nome)
    {
       System.out.println("User " + this.currentUser);
       this.users.getUser(this.currentUser).editContact("Adicionar",numTelm,email,nome);
    }
    
    public void removerContact(String numTelm, String email, String nome)
    {      
       this.users.getUser(this.currentUser).editContact("Remover",numTelm,email,nome);
    }
    
    //Calculo da diferenca de Anos
    public String diferencaAnos(Date data1, Date data2){
        
        LocalDate date1 = data1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate date2 = data2.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        
        Period resultado = Period.between(date1, date2);
        
        return Integer.toString(resultado.getYears());
    }
    
    //Calculo da diferenca de Meses
    public String diferencaMeses(Date data1, Date data2){
        
        LocalDate date1 = data1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate date2 = data2.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        
        long resultado = ChronoUnit.MONTHS.between(date1, date2);
        
        return Long.toString(resultado);
    }
    
    //Calculo de diferenca de Dias
    public String diferencaDias(Date data1, Date data2){
        
        LocalDate date1 = data1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate date2 = data2.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        
        long resultado = ChronoUnit.DAYS.between(date1, date2);
        
        return Long.toString(resultado);
    }
    
    //Somar Dias, Semanas, Meses e Anos a uma Data
    public String somaDateTime(Date data1, int dias, int semanas, int meses, int anos){
        
        LocalDate date1 = data1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        
        LocalDate resultado = date1.plusDays(dias).plusWeeks(semanas).plusMonths(meses).plusYears(anos);
        
        return resultado.toString();
    }
    
    //Subtrair Dias, Semanas, Meses e Anos a uma Data
    public String subtraiDateTime(Date data1, int dias, int semanas, int meses, int anos){
        
        LocalDate date1 = data1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        
        LocalDate resultado = date1.minusDays(dias).minusWeeks(semanas).minusMonths(meses).minusYears(anos);
        
        return resultado.toString();
    }
    
    public List<Slot> reunioesParaODia()
    {
        List<Slot> list = new ArrayList<>();
        
        LocalDateTime hoje = LocalDateTime.now();
        
        User u = this.users.getUser(this.currentUser);
        list = u.getReunioesParaDia(hoje);
        
        return list;
    }
    
    public String timeZoneCalc(Date o, LocalTime t, int offsetFrom, int offsetTo, boolean check)
    {
        return TimeZone.calcular(o, t,offsetFrom ,offsetTo, check);
    }
    
    public List<Contacto> getContactosToView()
    {
        List<Contacto> contactos = new ArrayList<>();
        
        contactos = this.users.getUser(this.currentUser).getContactos();
        
        return contactos;
    }
    
    public void addReuniao(Date o, String nome, String local, LocalTime hora, int tamSlot, int numSlots)
    {
         LocalDate date = o.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
         LocalDateTime diaHora = LocalDateTime.of(date, hora);
         LocalTime fim = hora.plusMinutes(numSlots*tamSlot);
        
         this.users.getUser(this.currentUser).addReuniaoUser(diaHora, hora, fim, nome, local);
         List<Slot> size = this.users.getUser(this.currentUser).getReunioesParaDia(diaHora);
         System.out.println("Tamanho " + size.size());
    }
}
