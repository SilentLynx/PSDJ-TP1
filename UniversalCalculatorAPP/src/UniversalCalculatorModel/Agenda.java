package UniversalCalculatorModel;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Agenda implements Serializable
{
    private HashMap<LocalDateTime, Slot> slots;
    private List<Contacto> contactos;

    public Agenda(HashMap<LocalDateTime, Slot> slots, List<Contacto> contactos) {
        this.slots = slots;
        this.contactos = contactos;
    }

    public Agenda() 
    {
        this.slots = new HashMap<>();
        this.contactos = new ArrayList<>();
    }

    public HashMap<LocalDateTime, Slot> getSlots() {
        return this.slots;
    }

    public void setSlots(HashMap<LocalDateTime, Slot> slots) {
        this.slots = slots;
    }

    public List<Contacto> getContactos() {
        return this.contactos;
    }

    public void setContactos(List<Contacto> contactos) {
        this.contactos = contactos;
    }
    
    public List<Contacto> getContactosList()
    {
        List<Contacto> lista = new ArrayList<>();
        
        this.contactos.stream().forEach((c) -> {
            lista.add(c);
        });
        
        return lista;
    }
       
    public void addSlot(LocalDateTime diaHora, LocalTime horaInicio, LocalTime horaFim, String nome, String local)
    {
        Slot s = new Slot(nome, local, horaInicio, horaFim);
        
        this.slots.put(diaHora, s.clone());
    }
    
    public void removeSlot(LocalDateTime diaHora)
    {
        this.slots.remove(diaHora);
    }
        
    public void addContact(String numTelm, String nome, String email)
    {
        Contacto c = new Contacto(numTelm, nome, email);
        
        this.contactos.add(c);
    }
    
    public void removeContact(Contacto c)
    {
        this.contactos.remove(c);
    }
    
    public HashMap<LocalDateTime, Slot> getSlotsPDia(LocalDateTime hoje)
    {
        HashMap<LocalDateTime, Slot> map = new HashMap<>();
        
        this.slots.keySet().stream().filter((key) -> (key.toLocalDate().isEqual(hoje.toLocalDate()) || key.toLocalDate().isAfter(hoje.toLocalDate()))).forEach((key) -> {
            Slot s = this.slots.get(key);
            map.put(key,s);
        });
        
        return map;
    }
        
    
    
}
