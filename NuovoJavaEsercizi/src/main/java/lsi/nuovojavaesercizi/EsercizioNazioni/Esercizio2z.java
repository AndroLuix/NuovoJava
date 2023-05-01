/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lsi.nuovojavaesercizi.EsercizioNazioni;

/**
 *
 * @author lui12
 */
public class Esercizio2z {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Citta capitale = new Citta("Roma");
        Nazione italia= new Nazione("Italia", capitale, 65_000_000);
        
        System.out.println("La Nazione "+italia.nazione+
                ", ha come capitale "+italia.capitale.nomeCitta+
                " ed ha come numero di abitanti "+italia.popolazione);
        
        Citta capitale1 = new Citta("Francoforte");
        Nazione germania= new Nazione("Germania", capitale1, 70_000_000);
        germania.stampaDatiNazione();
        System.out.println();
        
        Citta capitaleFrancia = new Citta ("Parigi");
        Nazione francia = new Nazione ("Francia", capitaleFrancia, 68_000_000);
        francia.stampaDatiNazione();
          System.out.println();
          
        
        Citta capitaleSpagna = new Citta("Barcellona");
        Nazione spagna = new Nazione("Spagna",capitaleSpagna,52_000_000);
        spagna.stampaDatiNazione();
        
        
                
        
    }
    
}
