/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VehiculosVerdugo;

import AbstracFactory.AbstractFactory;
import AbstracFactory.FactoryP;
import Verdugo.Verdugo;
import Player.Jugador;

/**
 *
 * @author Daniela Chavez
 */
public class V_Motocicleta implements Verdugo{
    
    boolean estado=false;
    int daño,
        cantidad;
    public int vida = 300;
    public int costo = 750;
    public Jugador jugador;

    public V_Motocicleta() {
    }

    public V_Motocicleta(Jugador jugador) {
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
        AbstractFactory verdugo = FactoryP.getFactory("Verdugo");
        Verdugo moto = verdugo.getVerdugo("Avioneta");
        V_Motocicleta va = new V_Motocicleta(jugador);
        if(va.getJugador().getC_mando().getRecurso1() >= costo 
           && va.getJugador().getC_mando().getRecurso2() >= costo){
            total = va.getJugador().getC_mando().getRecurso1()-costo;  
            va.getJugador().getC_mando().setRecurso1(total);
            total1 = va.getJugador().getC_mando().getRecurso2()-costo;
            va.getJugador().getC_mando().setRecurso2(total1);
            System.out.println("Construccion realizada");
            va.getJugador().getEdi_3().add(moto);
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
    public boolean estado(){
        return estado;
    }
    
    @Override
    public void generar(Jugador jugador){
        
    }
    
    
}
