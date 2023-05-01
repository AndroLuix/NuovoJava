/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lsi.nuovojavaesercizi.Pagella;
import java.util.Arrays;

/**
 *
 * @author lui12
 */
public class Pagella {
    Studente studente;
    String [][] voto; 
    public Pagella(Studente studente, String[][]voto){
        this.studente= studente;
         this.voto = voto;
    }
    private String inserisciDati(){
        return "La Pagella dell'alunno: " +studente.datiStudente()+
                "\n Ha i seguenti voti nelle materie";
    }
    public void stampaDati(){
        System.out.println(inserisciDati());
       for (int i = 0; i < voto.length ; i++){
            System.out.println(Arrays.toString(voto[i]));
            
       }
    }
}
