/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lsi.nuovojavaesercizi.EsercizioNazioni;

/**
 *
 * @author lui12
 */
public class Nazione {
    String nazione;
    Citta capitale;                                                             // dichiarazione della Tipologia del metodo Citta con variabile nominata capitale
    int popolazione;
    Nazione(String nazione, Citta capitale,int popolazione ){                   //inserimento variabili con Tipologia del metodo Citta e valore citta
        this.nazione = nazione;
        this.capitale = capitale;                                             // capitale del metodo Citta(?)
        this.popolazione = popolazione;
    }
    public void stampaDatiNazione(){                                          //metodo che permette la produzione a video
        System.out.println(mostraDati());
    }
    private String mostraDati(){ //anche con la key private funzione.              //inserimento dei dati e dello stampaggio, insieme a return per ridarlo alla classe stampaDatiNaz.
        return "La Nazione "+ nazione+
                "\n ha come capitale "+ capitale.nomeCitta+
                "\n e conta come popolazione "+ popolazione;
                
    }
}
