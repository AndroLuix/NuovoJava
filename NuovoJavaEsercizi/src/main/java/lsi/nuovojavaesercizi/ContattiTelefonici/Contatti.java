/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lsi.nuovojavaesercizi.ContattiTelefonici;

/**
 *
 * @author lui12
 */
public class Contatti {
    String nome;
    String indirizzo;
    int numero;
     public Contatti(String nome, int contatto, String indirizzo){
        this.nome = nome;
        this.numero = contatto;
        this.indirizzo = indirizzo;
    }
    public Contatti(String nome, int contatto){
        this.nome = nome;
        this.numero = contatto;
    }
    public void stampaDati(){
        System.out.println(dammiDati());
    }
    String dammiDati(){
        
        return "Nome contatto "+nome+", numero "+numero+"  Indirizzo/Via:"+indirizzo;
    }
    
}
