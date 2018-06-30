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
public class V_Fichas implements Verdugo{
    
    boolean estado=false;
    int daño,
        cantidad=1000;
    public int vida = 350;
    public int costo = 1000;
    public Jugador jugador;
    

    public V_Fichas() {
    }

    public V_Fichas(Jugador jugador) {
        this.jugador = jugador;
    }


    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
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
    public int recoger(Jugador jugador){
        int num;
        V_Fichas x = new V_Fichas(jugador);
        num = x.getCantidad();
        x.getJugador().getC_mando().setRecurso2(x.getJugador().getC_mando().getRecurso2()+num);
        return num;
    }

   
    
    @Override
    public void construir(Jugador jugador){
        int total, total1;
        AbstractFactory verdugo = FactoryP.getFactory("Verdugo");
        Verdugo fi = verdugo.getVerdugo("Almacenamiento de Fichas");
        V_Fichas vf = new V_Fichas(jugador);
        if(vf.getJugador().getC_mando().getRecurso1() >= costo 
           && vf.getJugador().getC_mando().getRecurso2() >= costo){
            total = vf.getJugador().getC_mando().getRecurso1()-costo;  
            vf.getJugador().getC_mando().setRecurso1(total);
            total1 = vf.getJugador().getC_mando().getRecurso2()-costo;
            vf.getJugador().getC_mando().setRecurso2(total1);
            System.out.println("Construccion realizada");
            vf.getJugador().getEdi_3().add(fi);
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