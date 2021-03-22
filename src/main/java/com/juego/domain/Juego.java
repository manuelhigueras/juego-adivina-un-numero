/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juego.domain;

import java.util.Random;

public class Juego {
    
    private int numeroAdivinar;
    private int intentos;
    
    private int INTENTO_PERMITIDOS = 5;
    private int RANGO_SUPERIOR = 20;
    
    private boolean gano = false;

    public Juego(){
        reiniciar();
    }
    
    /*
    public Juego() {
        this.intentos = this.INTENTO_PERMITIDOS;
        //NUEVA MANERA DE PROGRAMAR UN RANDOW
        Random random = new Random();
        this.numeroAdivinar = random.nextInt(RANGO_SUPERIOR)+1;
    }*/
    
    public boolean comprobar(int numero){
        boolean acerto = false;
        if(numero == this.numeroAdivinar){
            acerto = true;
            this.gano = true;
        }
        intentos--;
        return acerto;
    }
    
    public boolean esFinJuego(){
        boolean fin = false;
        if( gano || intentos == 0){
            fin = true;
        }
        return fin;
    }
    
    public String AvisoIntentos(){
        if((this.intentos <= this.INTENTO_PERMITIDOS) && (this.intentos >= 1)){
            return "Te quedan " + this.intentos + " intentos";
        }
        else{
            return "Te quedastes sin intentos";
        }
        
    }
    
    public String ValueComprobar(boolean value){
        if(value == true){
            return "Has ganado";
        }
        else{
            return "Intenta de nuevo";
        }
    }
    
    public void reiniciar(){
        this.intentos = this.INTENTO_PERMITIDOS;
        Random random = new Random();
        this.numeroAdivinar = random.nextInt(RANGO_SUPERIOR) + 1;
        System.out.println("... NUMERO A ADIVINAR ES " + numeroAdivinar);
        this.gano = false;
     }

    public int getNumeroAdivinar() {
        return numeroAdivinar;
    }

    public void setNumeroAdivinar(int numeroAdivinar) {
        this.numeroAdivinar = numeroAdivinar;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public boolean isGano() {
        return gano;
    }

    public void setGano(boolean gano) {
        this.gano = gano;
    }

    public int getINTENTO_PERMITIDOS() {
        return INTENTO_PERMITIDOS;
    }

    public void setINTENTO_PERMITIDOS(int INTENTO_PERMITIDOS) {
        this.INTENTO_PERMITIDOS = INTENTO_PERMITIDOS;
    }

    public int getRANGO_SUPERIOR() {
        return RANGO_SUPERIOR;
    }

    public void setRANGO_SUPERIOR(int RANGO_SUPERIOR) {
        this.RANGO_SUPERIOR = RANGO_SUPERIOR;
    }
  


}
