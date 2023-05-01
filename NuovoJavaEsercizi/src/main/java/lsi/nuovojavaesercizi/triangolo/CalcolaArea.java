/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lsi.nuovojavaesercizi.triangolo;

/**
 *
 * @author lui12
 */
public class CalcolaArea {
    double base;
    double altezza;
    double area = (10 * 10)/ 2;

    /**
     *
     * @param base
     * @param altezza
     */
    public CalcolaArea(double base, double altezza){
        this.base=base;
        this.altezza=altezza;
        area = (base * altezza)/ 2;
    }
    public void stampaDati(){
        System.out.println("l'area del triangolo è: " +area);
    }
}
