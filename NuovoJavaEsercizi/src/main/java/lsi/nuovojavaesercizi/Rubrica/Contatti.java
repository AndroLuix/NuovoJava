/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lsi.nuovojavaesercizi.Rubrica;

/**
 *
 * @author lui12
 */
public class Contatti {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.err.println("Elenco Contatti");
        System.err.println();
        RubricaTelefonica rubcrica = new RubricaTelefonica();
        //creazione dell'arraylist nella classe Rubrica Telefonica
        //richiamo della variante dell'oggetto "rubrica". 
        
      //  rubcrica.contatti[0].stampaDati();
        
        //creiamo il clico for per stampare tutti gli elenchi telefonici.
        for(int i = 0; i < rubcrica.contatti.length ; i++){
            rubcrica.contatti[i].stampaDati();
        }
                
        
    }
    
}
