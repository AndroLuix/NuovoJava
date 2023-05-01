/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lsi.nuovojavaesercizi.Quadrato;

import lsi.nuovojavaesercizi.Quadrato.Quadrato;

/**
 *
 * @author lui12
 */
public class TestQuadrato {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Quadrato quadrato = new Quadrato(4);
        
        quadrato.lato = 5; 
        System.out.println(quadrato.perimetro());
        System.out.println(quadrato.area());
        
        quadrato.singololato();
        System.out.println();
        quadrato.stampaDettagli();
        
        
        
    }
    
}
