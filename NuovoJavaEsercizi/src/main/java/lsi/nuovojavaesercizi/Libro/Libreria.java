/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lsi.nuovojavaesercizi.Libro;

/**
 *
 * @author lui12
 */
public class Libreria {
    Libro libroSpecifico;
    Libro libroSpecifico2;
    Libreria(Libro libroSpecifico, Libro libroSpecifico2){
        this.libroSpecifico = libroSpecifico;
        this.libroSpecifico2 = libroSpecifico2;
    }
     Libreria(Libro libroSpecifico){
        this.libroSpecifico = libroSpecifico;
    }
    
     public void stampaDati(){
         System.out.println( mostraDati());
     }
    private String mostraDati(){
        return "Lirbi nella libreria \n Primo libro: "+
                libroSpecifico.nomeLibro+
                " \n Secondo libro: "+ libroSpecifico2.nomeLibro;
                
    }
}

