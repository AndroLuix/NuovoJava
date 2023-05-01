/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lsi.nuovojavaesercizi.Libro;

/**
 *
 * @author lui12
 */
public class Libro {
    String nomeLibro;
    String autore;
    String casaEditrice;
    int numeroPagine;
    
    public Libro(String libro, String autore, String casaEditrice, int numeroPagine){
        this.nomeLibro=libro;
        this.autore = autore;
        this.casaEditrice=casaEditrice;
        this.numeroPagine = numeroPagine;
    } 
    public void stampaDati(){
        System.out.println(mostraDati());
    }
    private String mostraDati(){
        return "Nome del libro: "+ nomeLibro +
                "\n autore: "+ autore+
                "\n casa editrice: "+ casaEditrice+
                "\n numero di pagine: "+numeroPagine;
    }
    
}
