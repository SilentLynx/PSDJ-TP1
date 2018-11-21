/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UniversalCalculatorModel;

/**
 *
 * @author gcama
 */
public class Contacto 
{   
    private int numTelm;
    private String nome;
    private String email;

    public Contacto(int numTelm, String nome, String email) {
        this.numTelm = numTelm;
        this.nome = nome;
        this.email = email;
    }
    
    public int getNumTelm() {
        return numTelm;
    }

    public void setNumTelm(int numTelm) {
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
    
    @Override
    public String toString() {
        return "Contacto{" + "numTelm=" + numTelm + ", nome=" + nome + ", email=" + email + '}';
    }
}
