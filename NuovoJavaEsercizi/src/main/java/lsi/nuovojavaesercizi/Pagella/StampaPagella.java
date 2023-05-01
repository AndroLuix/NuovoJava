/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lsi.nuovojavaesercizi.Pagella;

/**
 *
 * @author lui12
 */
public class StampaPagella {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Studente studente1 = new Studente("Michele", "Rossi", "Classe 5B");
        //studente1.datiStudente();

        String[][] tabVoti = {
            {"Italiano", "7"}, 
            {"Algebra", "8"},
            {"Storia","6"},{"Inglese","6"},
            {"Scienze Motorie","8"},{"Musica","6"},
            {"Arte","7"}
                };
            
        Pagella pagella1 = new Pagella(studente1, tabVoti);
        pagella1.stampaDati();
        
        String[][] tabVotiS2 = {
            {"Italiano", "9"}, 
            {"Algebra", "6"},
            {"Storia","6"},{"Inglese","6"},
            {"Scienze Motorie","6"},{"Musica","9"},
            {"Arte","9"}
                };
        Studente studente2 = new Studente("Michele", "Ferrari", "Classe 5A");
        Pagella pagella2 = new Pagella(studente2, tabVotiS2);
        pagella2.stampaDati();
        
        
    }

}
