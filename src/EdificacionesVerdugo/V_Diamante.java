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
public class V_Diamante implements Verdugo{
    
    int daño;
    public int costo = 1000;
    public int vida = 350;
    int cantidad=1000;
    public Jugador jugador;
    boolean estado=false;

    public V_Diamante() {
    }

    public V_Diamante(Jugador jugador) {
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
        V_Diamante x = new V_Diamante(jugador);
        num = x.getCantidad();
        x.getJugador().getC_mando().setRecurso2(x.getJugador().getC_mando().getRecurso2()+num);
        return num;
    }

   
    @Override
    public void construir(Jugador jugador){
        int total, total1;
        AbstractFactory verdugo = FactoryP.getFactory("Verdugo");
        Verdugo di = verdugo.getVerdugo("Alamacenamiento de Diamantes");
        V_Diamante vd = new V_Diamante(jugador);
        if(vd.getJugador().getC_mando().getRecurso1() >= costo 
           && vd.getJugador().getC_mando().getRecurso2() >= costo){
            total = vd.getJugador().getC_mando().getRecurso1()-costo;  
            vd.getJugador().getC_mando().setRecurso1(total);
            total1 = vd.getJugador().getC_mando().getRecurso2()-costo;
            vd.getJugador().getC_mando().setRecurso2(total1);
            System.out.println("Construccion realizada");
            vd.getJugador().getEdi_3().add(di);
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
    public boolean estado(){
        return estado;
    }
    
     @Override
    public void generar(Jugador jugador){
        
    }
}
    
    
 
