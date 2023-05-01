/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lsi.nuovojavaesercizi.triangolo;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author lui12
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    Scanner tastiera = new Scanner(System.in).useLocale(Locale.ITALY);
        
    
     System.out.println(" inserisci la base  del triangolo:");
   
    double base = tastiera.nextDouble();
    //tastiera.nextLine();
    
    System.out.println("Inserisci i dati del tringolo: \n inserisci l'altezza del triangolo :");
    
    double altezza = tastiera.nextDouble(); 
    //tastiera.nextLine();
    
         
        
        CalcolaArea triangolo = new CalcolaArea(base, altezza);
        triangolo.stampaDati();
                
    }
    
}
