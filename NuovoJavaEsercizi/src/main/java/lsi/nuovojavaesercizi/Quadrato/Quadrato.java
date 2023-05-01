/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lsi.nuovojavaesercizi.Quadrato;

import java.util.Random;

/**
 *
 * @author lui12
 */
public class Quadrato {
     Random rand = new Random();
    int lato = (int) rand.nextInt(50);
    final int NUMERI_ALTI = 4;
    
    public Quadrato(int lato){
        this.lato=lato;
    }
      /*********************************
         public int perimetro(){
            int perimetro = lato * NUMERI_ALTI;
            System.out.println("Il perimetro è ");
            return perimetro;
        }
        public int area(){
            int area = lato * lato;
              System.out.println("L'area del quadrato è ");
            return area;
        }
        
        public int singololato(){
            int singololato = lato;
            System.out.println("ogni lato del quadrato è " + singololato);
            return singololato;}
       /*****************************/
    
     public int perimetro(){
            int perimetro = lato * NUMERI_ALTI;
            return perimetro;
        }
        public int area(){
            int area = lato * lato;
            return area;
        }
        
        public int singololato(){
            int singololato = lato;
            return singololato;
        }
         public void stampaDettagli(){
       System.out.println(dammiDettagli());
    }
         public String dammiDettagli(){
            return "ogni lato è: "+ this.lato+
                    "\n L'area del quadrato e: "+ area()+
                    "\n Il perimetro è: "+ perimetro();
         }
    
}
