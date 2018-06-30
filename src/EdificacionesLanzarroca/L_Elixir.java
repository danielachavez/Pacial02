/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdificacionesLanzarroca;

import AbstracFactory.AbstractFactory;
import AbstracFactory.FactoryP;
import Lanzarroca.Lanzarroca;
import EdificacionesVerdugo.V_Acido;
import Player.Jugador;

/**
 *
 * @author Daniela Chavez
 */
public class L_Elixir implements Lanzarroca{
    
    int daño;
    public int vida = 350;
    public int costo = 1000;
    int cantidad;
    public Jugador jugador;
    boolean estado=false;

    public L_Elixir() {
    }

    public L_Elixir(Jugador jugador) {
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

    public void setJugador(Jugador jugador) {
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
    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }


    
    @Override
    public int recoger(Jugador jugador){
        int num;
        L_Elixir x = new L_Elixir(jugador);
        num = x.getCantidad();
        x.getJugador().getC_mando().setRecurso2(x.getJugador().getC_mando().getRecurso2()+num);
        return num;
    }

   
    
    public void construir(Jugador jugador){
        int total, total1;
        AbstractFactory lanzarroca = FactoryP.getFactory("Lanzarroca");
        Lanzarroca gm = lanzarroca.getLanzarroca("Almacenamiento de elixir");
        L_Elixir le = new L_Elixir (jugador);
        if(le.getJugador().getC_mando2().getRecurso1() >= costo 
           && le.getJugador().getC_mando2().getRecurso3() >= costo){
            total = le.getJugador().getC_mando2().getRecurso1()-costo;  
            le.getJugador().getC_mando2().setRecurso1(total);
            total1 = le.getJugador().getC_mando2().getRecurso3()-costo;
            le.getJugador().getC_mando2().setRecurso3(total1);
            System.out.println("Construccion realizada");
            le.getJugador().getEdi_2().add(gm);
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