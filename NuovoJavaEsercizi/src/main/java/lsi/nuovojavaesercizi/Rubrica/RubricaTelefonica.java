/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lsi.nuovojavaesercizi.Rubrica;

import lsi.nuovojavaesercizi.ContattiTelefonici.Contatti;

/**
 *
 * @author lui12
 */
public class RubricaTelefonica {

    public Contatti[] contatti;

    public RubricaTelefonica(){
        contatti = new Contatti[4];
        contatti[0] = new Contatti("Luigi", 555_000_000);
        contatti[1] = new Contatti("Sabrina", 555_555_004);
        contatti[2] = new Contatti("Luca", 333_000_000);
        contatti[3] = new Contatti("Michela", 555_111_555);
    }
    

}
