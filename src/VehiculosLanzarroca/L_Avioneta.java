/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VehiculosLanzarroca;

import AbstracFactory.AbstractFactory;
import AbstracFactory.FactoryP;
import Lanzarroca.Lanzarroca;
import Player.Jugador;

/**
 *
 * @author Daniela Chavez
 */
public class L_Avioneta implements Lanzarroca {
   boolean estado=false;
    int daño,
        cantidad;
    public int vida = 200;
    public int costo = 2000;
    public Jugador jugador;

    public L_Avioneta() {
    }

    public L_Avioneta(Jugador jugador) {
        this.jugador = jugador;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
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

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    @Override
    public void construir(Jugador jugador){
        int total, total1;
        AbstractFactory lanzarroca = FactoryP.getFactory("Lanzarroca");
        Lanzarroca avi = lanzarroca.getLanzarroca("Avioneta");
        L_Avioneta la = new L_Avioneta(jugador);
        if(la.getJugador().getC_mando2().getRecurso1() >= costo 
           && la.getJugador().getC_mando2().getRecurso2() >= costo){
            total = la.getJugador().getC_mando2().getRecurso1()-costo;  
            la.getJugador().getC_mando2().setRecurso1(total);
            total1 = la.getJugador().getC_mando2().getRecurso2()-costo;
            la.getJugador().getC_mando2().setRecurso2(total1);
            System.out.println("Construccion realizada");
            la.getJugador().getTrans_2().add(avi);
        }else{
            System.out.println("No tiene recursos suficientes");
        }
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
