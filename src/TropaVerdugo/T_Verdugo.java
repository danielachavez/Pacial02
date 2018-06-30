/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TropaVerdugo;

import Verdugo.Verdugo;
import Player.Jugador;

/**
 *
 * @author Daniela Chavez
 */
public class T_Verdugo implements Verdugo{
    
    public int daño =100;
    public int vida = 100;
    public int costo = 75;
    int cantidad;
    public Jugador jugador;
    boolean estado=false;

    public T_Verdugo() {
    }

    public T_Verdugo(Jugador jugador) {
        this.jugador = jugador;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    @Override
    public void construir(Jugador jugador){
    }
    
    @Override
    public int recoger(Jugador jugador){
        return cantidad;
    }

    @Override
    public int getAtacar(){
        return daño;
    }
    
    @Override
    public boolean entrenar(Jugador jugador){
        int total, total1;
         T_Verdugo tv = new  T_Verdugo(jugador);
        if(tv.getJugador().getC_mando().getRecurso1() >= costo 
           && tv.getJugador().getC_mando().getRecurso3() >= costo && estado==false){
            total = tv.getJugador().getC_mando().getRecurso1()-costo;  
            tv.getJugador().getC_mando().setRecurso1(total);
            total1 = tv.getJugador().getC_mando().getRecurso3()-costo;
            tv.getJugador().getC_mando().setRecurso3(total1);
            setEstado(true);
            System.out.println("Se entreno a Master Chief");
        }else{
            System.out.println("No tiene recursos suficientes");
            setEstado(false);
        }
        return estado;
    }
    
    @Override
    public boolean estado(){
        return estado;
    }
    
    @Override
    public void generar(Jugador jugador){
        
    }
    
}
