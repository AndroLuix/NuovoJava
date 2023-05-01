/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lsi.nuovojavaesercizi.ContattiTelefonici;

/**
 *
 * @author lui12
 */
public class VediContatti {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Contatti contatto1 = new Contatti("Luigi", 555_555_000);
        Contatti contatto2 = new Contatti("Michele", 555_556_000);
        Contatti contatto3 = new Contatti("Scuola", 555_002_000, "Via Marconi, 1");
        
        contatto1.stampaDati();
        contatto2.stampaDati();
        contatto3.stampaDati();
        System.out.println();
        
        System.out.println("Elenco contatti");
        Rubrica rubrica = new Rubrica();
        rubrica.contatto4.stampaDati();
        rubrica.contatto5.stampaDati();
        rubrica.contatto6.stampaDati();
        
    }
    
}

