/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juego.domain;

public class GameMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Juego num = new Juego();
        
        int valor = 5;
        boolean acerto = num.comprobar(valor);
        /*
        if(acierto){
            System.out.println("...ACERTASTES CRACK");
        }
        else{
            System.out.println("...NO ACERTO");
        }
        */
    }
    
}
