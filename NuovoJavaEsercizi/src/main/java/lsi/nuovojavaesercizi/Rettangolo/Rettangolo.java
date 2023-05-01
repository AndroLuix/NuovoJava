/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lsi.nuovojavaesercizi.Rettangolo;

/**
 *
 * @author lui12
 */
public class Rettangolo {
    int base;
    int altezza;
    int area;
    int parametro;
    final int LATO_PER = 2;
    
    public Rettangolo(int base, int altezza){
        this.base = base;
        this.altezza = altezza;
    }
    
    public  int area(){
        area = base * altezza;
        return area;
    }
    public int perimetro(){
       int perimetro = (altezza+ base) * LATO_PER;
        return perimetro;
    }
    public void stampaDettagli(){
     System.out.println(dammiDettagli());
    }
    
     String dammiDettagli(){ //HO SVOLTO UNA PROVA: anche se non è public, viene utilizzato il metodo getter nel metodo stampaDettagli.
        return "La base è "+this.base +", l'altezza è "+ this.altezza+
                "\n L'area del rettangolo è "+this.area()+
                "\n Il perimetro del rettangolo è "+this.perimetro();
        
    }
    
}
