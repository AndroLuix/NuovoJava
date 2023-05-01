/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lsi.nuovojavaesercizi.Libro;

/**
 *
 * @author lui12
 */
public class DescrizioneLibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Libro libro1 = new Libro("Programmare con Java", "Luigi Iadicola","Oracle", 200);
            libro1.stampaDati();
             Libro libro2 = new Libro("Programmare con Java Avanzato", "Luigi Iadicola","Oracle", 200);
            libro1.stampaDati();
            
            Libreria libreria = new Libreria(libro1, libro2);
            libreria.stampaDati();
            
    }
    
}
