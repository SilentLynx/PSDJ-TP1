package UniversalCalculatorModel;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

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

    // Métodos de get e set
    public HashMap<LocalDateTime, Slot> getSlots() 
    {
        HashMap<LocalDateTime, Slot> slot = new HashMap<>();
        slot = this.slots;
        return slot;
    }

    public void setSlots(HashMap<LocalDateTime, Slot> slot) {
        this.slots = slot;
    }

    public List<Contacto> getContactos() 
    {
        List<Contacto> lista = new ArrayList<>();
        lista = this.contactos;
        return lista;
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
    ///////////////////////////////////////////////////
    
    // Método Para adicionar reunião
    public void addSlot(LocalDateTime diaHora, LocalTime horaInicio, LocalTime horaFim, String nome, String local)
    {
        LocalDate dat = diaHora.toLocalDate();
        Slot s = new Slot(nome, local, dat, horaInicio, horaFim);
        System.out.println("Nome na agenda: " + nome);
        this.slots.put(diaHora, s.clone());
    }
    
    // Método para remover reunião
    public void removeSlot(LocalDateTime diaHora, String nome, LocalTime fim)
    {
        Slot s = this.slots.get(diaHora);
        
        if(s.getNomeSlot().equals(nome) && s.getFim().equals(fim))
        {
            this.slots.remove(diaHora);
        }
    }
        
    // Método para adicionar contacto
    public void addContact(String numTelm, String nome, String email)
    {
        Contacto c = new Contacto(numTelm, nome, email);
        
        this.contactos.add(c.clone());
    }
    
    // Método para remover Contacto
    public void removeContact(String nom, String numT, String email)
    {
        List<Contacto> lista = this.contactos.stream()
                                 .filter(c -> !(c.getNome().equals(nom) && c.getNumTelm().equals(numT) && c.getEmail().equals(email)))
                                 .collect(Collectors.toList());
        
        this.setContactos(lista);
    }
    
    // Método para obter as reuniões que ainda não ocorreram (a partir do dia de hoje)
    public HashMap<LocalDateTime, Slot> getSlotsPDia(LocalDateTime hoje)
    {
        HashMap<LocalDateTime, Slot> map = new HashMap<>();
        
        this.slots.keySet().stream().filter((key) -> (key.toLocalDate().isEqual(hoje.toLocalDate()) || key.toLocalDate().isAfter(hoje.toLocalDate()))).forEach((key) -> {
            Slot s = this.slots.get(key).clone();
            map.put(key,s);
        });
        
        return map;
    }
}
