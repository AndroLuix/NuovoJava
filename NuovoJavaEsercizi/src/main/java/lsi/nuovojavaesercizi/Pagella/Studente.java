/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lsi.nuovojavaesercizi.Pagella;

/**
 *
 * @author lui12
 */
public class Studente {
    String nome; 
    String cognome;
    String classe;
    Studente(String nome, String cognome, String classe){
        this.nome = nome;
        this.cognome = cognome;
        this.classe = classe;
    }
    
    public String datiStudente(){
        return nome+" "+cognome+ "\n Classe " +classe;
    }
    
}
