/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TropaLanzarroca;

import Lanzarroca.Lanzarroca;
import Player.Jugador;

/**
 *
 * @author Daniela Chavez
 */
public class T_Lanzarroca implements Lanzarroca{
    
    public int daño =300;
    public int vida = 300;
    public int costo = 1000;
    int cantidad;
    public Jugador jugador;
    boolean estado=false;

    public T_Lanzarroca() {
    }

    public T_Lanzarroca(Jugador jugador) {
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
        T_Lanzarroca tl = new T_Lanzarroca(jugador);
        if(tl.getJugador().getC_mando2().getRecurso1() >= costo 
           && tl.getJugador().getC_mando2().getRecurso3() >= costo && estado==false){
            total = tl.getJugador().getC_mando2().getRecurso1()-costo;  
            tl.getJugador().getC_mando2().setRecurso1(total);
            total1 = tl.getJugador().getC_mando2().getRecurso3()-costo;
            tl.getJugador().getC_mando2().setRecurso3(total1);
            setEstado(true);
            System.out.println("Se entrenaron el Lanzarroca");
        }else{
            System.out.println("No tiene suficientes recursos ");
            setEstado(false);
        }
        return estado;
    }
    
    @Override
    public void generar(Jugador jugador){
    }
    
    @Override
    public boolean estado(){
        return estado;
    }
    
}
