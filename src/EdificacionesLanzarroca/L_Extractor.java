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
public class L_Extractor implements Lanzarroca{
    boolean estado=false;
    int daño, 
        cantidad=1000;
    public int vida = 200;
    public int costo = 1000;
    public Jugador jugador;

    public L_Extractor() {
    }

    public L_Extractor(Jugador jugador) {
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
        AbstractFactory play = FactoryP.getFactory("Lanzarroca");
        Lanzarroca re = play.getLanzarroca("Recolector de elixir");
        L_Extractor lr = new L_Extractor(jugador);
        if(lr.getJugador().getC_mando2().getRecurso3() >= costo 
           && lr.getJugador().getC_mando2().getRecurso2() >= costo){
            total = lr.getJugador().getC_mando2().getRecurso3()-costo;  
            lr.getJugador().getC_mando2().setRecurso3(total);
            total1 = lr.getJugador().getC_mando2().getRecurso2()-costo;
            lr.getJugador().getC_mando2().setRecurso2(total1);
            System.out.println("Construccion realizada");
            lr.getJugador().getEdi_2().add(re);
        }else{
            System.out.println("No tiene recursos suficientes");
        }
    }
    
    @Override
    public int recoger(Jugador jugador){
        int num;
        L_Extractor x = new L_Extractor(jugador);
        num = x.getCantidad();
        x.getJugador().getC_mando().setRecurso2(x.getJugador().getC_mando().getRecurso2()+num);
        return num;
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
        L_Extractor m = new L_Extractor(jugador);
        m.getJugador().getC_mando().setRecurso3(m.getJugador().getC_mando().getRecurso3()+1500);
    }
    
    @Override
    public boolean estado(){
        return estado;
    }
}
