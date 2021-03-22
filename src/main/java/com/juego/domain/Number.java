/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juego.domain;

import java.util.Random;

public class Number {
    private int num;
    private int intentos = 5;
    private boolean end = false;

    public Number() {
        this.num =  (int) (Math.random() * (1 - 20)) + 20;
    }

    public int Reinicia(){
        Random random = new Random();
        this.num = random.nextInt(20) + 1;
        return num;
    }
    
    public int getNum() {
        return num;
    }

    public String decrementoDeIntentos(){
        if(intentos == 0){
            return "Te quedastes sin intentos";
        }
        if(intentos == 1){
            return "Tienes un ultimo intento restante.";
        }
        if((this.intentos <= 5)&&(this.intentos > 1)){
            intentos--;
            return "Tienes " + this.intentos + " intentos restantes.";
        }
        return "";
    }
    
   public String CompruebaNum(int num, int num_add){
        
        if((num_add >= 0)&&(num_add <= 20)){
            if(num == num_add){
              this.end = true;
              return "El numero es igual. Felicidades CRACK";
            }
            else{
                return "No es el numero";
            }
        }
        else{
            return "Este numero no es valido. Intente de nuevo";
        }
        
    }

    public String EstadoJuego(){
        if(end == true){
            return "Fin del juego";
        }
        return "";
    }
    
    public int getIntentos() {
        return intentos;
    }
    
    @Override
    public String toString() {
        return "Number{" + num + '}';
    }
   
}
