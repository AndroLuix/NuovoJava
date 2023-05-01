/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lsi.nuovojavaesercizi.Persona;

/**
 *
 * @author lui12
 */
public class Principale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona persona1 = new Persona("Luigi","Iadicola",24);
        Persona persona2 = new Persona ("Roberta","Cesarino",30);
        persona1.stampaDettagli();
        persona2.stampaDettagli();
        
        persona2.saluta(persona1);
        
    }
    
}
