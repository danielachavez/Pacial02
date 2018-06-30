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
public class V_Camion implements Verdugo{
    
    boolean estado=false;
    int daño,
        cantidad;
    public int vida = 500;
    public int costo = 650;
    public Jugador jugador;

    public V_Camion() {
    }

    public V_Camion(Jugador jugador) {
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
        AbstractFactory camion = FactoryP.getFactory("Verdugo");
        Verdugo cami = camion.getVerdugo("Camion");
        V_Camion vc = new V_Camion(jugador);
        if(vc.getJugador().getC_mando().getRecurso1() >= costo 
           && vc.getJugador().getC_mando().getRecurso2() >= costo){
            total = vc.getJugador().getC_mando().getRecurso1()-costo;  
            vc.getJugador().getC_mando().setRecurso1(total);
            total1 = vc.getJugador().getC_mando().getRecurso2()-costo;
            vc.getJugador().getC_mando().setRecurso2(total1);
            System.out.println("Construccion realizada");
            vc.getJugador().getEdi_3().add(cami);
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
