/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lsi.nuovojavaesercizi.Persona;

/**
 *
 * @author lui12
 */
public class Persona {
    String nome;
    String cognome; 
    int eta; 
    Persona(String nome, String cognome, int eta){
        this.nome=nome;
        this.cognome=cognome;
        this.eta=eta;
    }
    public void stampaDettagli(){
       System.out.println( dettagli());
    }
    private String dettagli(){
        return
        this.nome +"  "+this.cognome +" ha "+this.eta+" anni";
    }
    void saluta(Persona personaDaSalutare){
        System.out.println(this.nome +" Sta salutando "+ personaDaSalutare.nome);
    }
}

