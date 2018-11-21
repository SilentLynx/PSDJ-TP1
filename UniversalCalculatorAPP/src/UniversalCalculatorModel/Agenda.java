package UniversalCalculatorModel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Agenda 
{
    private HashMap<LocalDate, Slot> slots;
    private HashMap<Integer, Contacto> contactos;

    public Agenda(HashMap<LocalDate, Slot> slots, HashMap<Integer, Contacto> contactos) {
        this.slots = slots;
        this.contactos = contactos;
    }

    public HashMap<LocalDate, Slot> getSlots() {
        return slots;
    }

    public void setSlots(HashMap<LocalDate, Slot> slots) {
        this.slots = slots;
    }

    public HashMap<Integer, Contacto> getContactos() {
        return contactos;
    }

    public void setContactos(HashMap<Integer, Contacto> contactos) {
        this.contactos = contactos;
    }
    
    public List<Contacto> getContactosList()
    {
        List<Contacto> lista = new ArrayList<>();
        
        this.contactos.values().stream().forEach((c) -> {
            lista.add(c);
        });
        
        return lista;
    }
    
    
}
