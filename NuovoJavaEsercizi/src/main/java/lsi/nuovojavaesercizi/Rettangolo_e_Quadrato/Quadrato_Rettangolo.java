/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lsi.nuovojavaesercizi.Rettangolo_e_Quadrato;

import lsi.nuovojavaesercizi.Quadrato.Quadrato;
import lsi.nuovojavaesercizi.Rettangolo.Rettangolo;

/**
 *
 * @author lui12
 */
public class Quadrato_Rettangolo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Quadrato quadrato = new Quadrato(3);
        Rettangolo rettangolo = new Rettangolo(10,30);
        quadrato.stampaDettagli();
        quadrato.dammiDettagli();// il metodo non stampa nulla poichè è un return di una stringa "gettata"/presa dal metodo stampaDettagli
        
        rettangolo.stampaDettagli();
        
        Quadrato quadrato2 = new Quadrato(10);
        quadrato2.stampaDettagli();
        Rettangolo rettangolo2 = new Rettangolo(20,50);
        rettangolo2.stampaDettagli();
        
        
     
    }
    
}
