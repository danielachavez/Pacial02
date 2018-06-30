/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdificacionesLanzarroca;

import AbstracFactory.AbstractFactory;
import AbstracFactory.FactoryP;
import Lanzarroca.Lanzarroca;
import Player.Jugador;

/**
 *
 * @author Daniela Chavez
 */
public class L_Gema implements Lanzarroca{
    
    int daño;
    public int vida = 400;
    public int costo = 1500;
    int cantidad=1000;
    public Jugador jugador;
    boolean estado=false;

    public L_Gema() {
    }

    public L_Gema(Jugador jugador) {
        this.jugador = jugador;
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
    public int recoger(Jugador jugador){
        int num;
        L_Gema x = new L_Gema(jugador);
        num = x.getCantidad();
        x.getJugador().getC_mando().setRecurso2(x.getJugador().getC_mando().getRecurso2()+num);
        return num;
    }

   
    
     public void construir(Jugador jugador){
        int total, total1;
        AbstractFactory lanzarroca = FactoryP.getFactory("Lanzarroca");
        Lanzarroca gm = lanzarroca.getLanzarroca("Almacenamiento de gema");
        L_Gema lg = new L_Gema (jugador);
        if(lg.getJugador().getC_mando2().getRecurso1() >= costo 
           && lg.getJugador().getC_mando2().getRecurso2() >= costo){
            total = lg.getJugador().getC_mando2().getRecurso1()-costo;  
            lg.getJugador().getC_mando2().setRecurso1(total);
            total1 = lg.getJugador().getC_mando2().getRecurso2()-costo;
            lg.getJugador().getC_mando2().setRecurso2(total1);
            System.out.println("Construccion realizada");
            lg.getJugador().getEdi_2().add(gm);
        }else{
            System.out.println("No tiene suficientes recursos ");
        }
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