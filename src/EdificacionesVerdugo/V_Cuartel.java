/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdificacionesVerdugo;

import AbstracFactory.AbstractFactory;
import AbstracFactory.FactoryP;
import Verdugo.Verdugo;
import Player.Jugador;

/**
 *
 * @author Daniela Chavez
 */
public class V_Cuartel implements Verdugo{
    boolean estado=false;
    int daño,
        cantidad;
    public int vida = 200;
    public int costo = 1000;
    public Jugador jugador;

    public V_Cuartel() {
    }

    public V_Cuartel(Jugador jugador) {
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

    public void setVida(int Vida) {
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
        Verdugo ve = verdugo.getVerdugo("Cuartel");
        V_Cuartel lc = new V_Cuartel(jugador);
        if(lc.getJugador().getC_mando().getRecurso1() >= costo 
           && lc.getJugador().getC_mando().getRecurso2() >= costo){
            total = lc.getJugador().getC_mando().getRecurso1()-costo;  
            lc.getJugador().getC_mando().setRecurso1(total);
            total1 = lc.getJugador().getC_mando().getRecurso2()-costo;
            lc.getJugador().getC_mando().setRecurso2(total1);
            System.out.println("Construccion realizada");
            lc.getJugador().getEdi_3().add(ve);
        }else{
            System.out.println("No tiene suficientes recursos ");
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
