package UniversalCalculatorModel;

import java.io.Serializable;

public class Contacto implements Serializable
{   
    private String numTelm;
    private String nome;
    private String email;

    public static Contacto of (String numTelm, String nome, String email)
    {
        return new Contacto(numTelm,nome,email);
    }
    
    public Contacto(String numTelm, String nome, String email) {
        this.numTelm = numTelm;
        this.nome = nome;
        this.email = email;
    }
    
    public Contacto(Contacto c)
    {
        this.numTelm = c.getNumTelm();
        this.nome = c.getNome();
        this.email = c.getEmail();
    }
    
    // Métodos de get e set
    public String getNumTelm() {
        return numTelm;
    }

    public void setNumTelm(String numTelm) {
        this.numTelm = numTelm;
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
    ///////////////////////////////////////////////////
    
    @Override
    public String toString() {
        return "Contacto{" + "numTelm=" + numTelm + ", nome=" + nome + ", email=" + email + '}';
    }
    
    @Override
    public Contacto clone()
    {
        return new Contacto(this);
    }
    
    @Override
    public boolean equals(Object o)
    {
        boolean retorno = false;
        if(o==this)
        {
            retorno = true;
        }
        if(o == null || this.getClass() != o.getClass())
        {
            retorno = false;
        }
        Contacto c = (Contacto) o;
        return (c.getNome().equals(this.getNome()) && c.getNumTelm().equals(this.getNumTelm()) && c.getEmail().equals(this.getEmail()));
    }
}
