/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lsi.nuovojavaesercizi.Rettangolo;

/**
 *
 * @author lui12
 */
public class DatiRettangolo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(20, 40);
        Rettangolo rettangolo2 = new Rettangolo(70, 50);
        /**
         * rettangolo.area();
         * rettangolo.perimetro(); 
         * rettangolo2.area();
         * rettangolo2.perimetro();
         */

        System.out.println();
        System.out.println("Primo rettangolo");
        rettangolo.stampaDettagli();
        System.out.println();
        System.out.println("Secondo rettangolo");
        rettangolo2.stampaDettagli();
    }

}
