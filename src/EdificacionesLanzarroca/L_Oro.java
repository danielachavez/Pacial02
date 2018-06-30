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
public class L_Oro implements Lanzarroca{
    
    boolean estado=false;
    int daño;
    public int vida = 200;
    public int costo = 1000;
    int cantidad;
    public Jugador jugador;


    public L_Oro() {
    }

    public L_Oro(Jugador jugador) {
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
    public int recoger(Jugador jugador){
        int num;
        L_Oro x = new  L_Oro(jugador);
        num = x.getCantidad();
        x.getJugador().getC_mando2().setRecurso1(x.getJugador().getC_mando2().getRecurso1()+num);
        return num;
    }

   
    public void construir(Jugador jugador){
        int total, total1;
        AbstractFactory lanzarroca = FactoryP.getFactory("Lanzarroca");
        Lanzarroca or = lanzarroca.getLanzarroca("Almacenamiento de oro");
        L_Oro lo = new L_Oro (jugador);
        if(lo.getJugador().getC_mando2().getRecurso1() >= costo 
           && lo.getJugador().getC_mando2().getRecurso2() >= costo){
            total = lo.getJugador().getC_mando2().getRecurso1()-costo;  
            lo.getJugador().getC_mando2().setRecurso1(total);
            total1 = lo.getJugador().getC_mando2().getRecurso2()-costo;
            lo.getJugador().getC_mando2().setRecurso2(total1);
            System.out.println("Construccion realizada");
            lo.getJugador().getEdi_2().add(or);
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
