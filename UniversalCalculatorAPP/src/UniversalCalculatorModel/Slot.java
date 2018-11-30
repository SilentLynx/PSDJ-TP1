package UniversalCalculatorModel;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

public class Slot implements Serializable
{
    private String nomeSlot;
    private String local;
    private LocalDate data;
    private LocalTime inicio;
    private LocalTime fim;

    public Slot(String nomeSlot, String local, LocalDate dat, LocalTime inicio, LocalTime fim) 
    {
        this.nomeSlot = nomeSlot;
        this.local = local;
        this.data = dat;
        this.inicio = inicio;
        this.fim = fim;
    }

    public Slot(Slot s)
    {
        this.nomeSlot = s.getLocal();
        this.local = s.getLocal();
        this.data = s.getData();
        this.inicio = s.getInicio();
        this.fim = s.getFim();
    }
        
    public String getNomeSlot() {
        return this.nomeSlot;
    }

    public void setNomeSlot(String nomeSlot) {
        this.nomeSlot = nomeSlot;
    }

    public String getLocal() {
        return this.local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public LocalTime getInicio() {
        return inicio;
    }

    public void setInicio(LocalTime inicio) {
        this.inicio = inicio;
    }

    public LocalTime getFim() {
        return fim;
    }

    public void setFim(LocalTime fim) {
        this.fim = fim;
    }
    
    public LocalDate getData() 
    {
        return this.data;
    }
    
    public void editSlot(String nomeSlot, String local, LocalDate dat, LocalTime inicio, LocalTime fim)
    {
        this.nomeSlot = nomeSlot;
        this.local = local;
        this.data = dat;
        this.inicio = inicio;
        this.fim = fim;
    }
    
    @Override
    public String toString() {
        return "Slot{" + "nomeSlot=" + nomeSlot + ", local=" + local + ", inicio=" + inicio + ", fim=" + fim + '}';
    }
    
    public Slot clone()
    {
        return new Slot(this);
    }
}
