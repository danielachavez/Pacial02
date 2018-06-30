/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TropaGigante;

import Gigante.Gigante;
import Player.Jugador;

/**
 *
 * @author Daniela Chavez
 */
public class T_Gigante implements Gigante {
    
    public int vida = 100;
    public int daño = 100;
    public int costo = 1000;
    int cantidad;
    public Jugador jugador;
    boolean estado = false;

    public T_Gigante() {
    }

    public T_Gigante(Jugador jugador) {
        this.jugador = jugador;
    }

    public int getVida() {
        return vida;
    }

    public void setvida(int vida) {
        this.vida = vida;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
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
        //return cantidad;
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
        T_Gigante tg = new T_Gigante(jugador);
        if(tg.getJugador().getC_mando().getRecurso1() >= costo 
           && tg.getJugador().getC_mando().getRecurso2() >= costo && estado==false){
            total = tg.getJugador().getC_mando().getRecurso1()-costo;  
            tg.getJugador().getC_mando().setRecurso1(total);
            total1 = tg.getJugador().getC_mando().getRecurso2()-costo;
            tg.getJugador().getC_mando().setRecurso2(total1);
            setEstado(true);
            System.out.println("Se entreno Gigante");
        }else{
            System.out.println("No tiene suficientes recursos ");
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
